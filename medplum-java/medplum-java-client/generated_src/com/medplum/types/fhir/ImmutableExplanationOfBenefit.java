package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ExplanationOfBenefit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit.builder()}.
 */
@Generated(from = "ExplanationOfBenefit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit implements ExplanationOfBenefit {
  private final @Nullable List<Period> preAuthRefPeriod;
  private final @Nullable List<ExplanationOfBenefit_Diagnosis> diagnosis;
  private final @Nullable CodeableConcept formCode;
  private final @Nullable List<ExplanationOfBenefit_SupportingInfo> supportingInfo;
  private final @Nullable Reference referral;
  private final @Nullable List<ExplanationOfBenefit_Total> total;
  private final @Nullable List<ExplanationOfBenefit_Item> item;
  private final @Nullable Period billablePeriod;
  private final @Nullable CodeableConcept fundsReserve;
  private final @Nullable List<Identifier> identifier;
  private final Reference patient;
  private final @Nullable CodeableConcept fundsReserveRequested;
  private final @Nullable Period benefitPeriod;
  private final @Nullable ExplanationOfBenefit_Accident accident;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ExplanationOfBenefit_BenefitBalance> benefitBalance;
  private final @Nullable Attachment form;
  private final @Nullable PositiveInt precedence;
  private final @Nullable ExplanationOfBenefit_Payment payment;
  private final @Nullable ExplanationOfBenefit_Payee payee;
  private final @Nullable List<ExplanationOfBenefit_ProcessNote> processNote;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable ExplanationofbenefitStatus status;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<ExplanationOfBenefit_CareTeam> careTeam;
  private final @Nullable String disposition;
  private final Reference provider;
  private final @Nullable Code outcome;
  private final @Nullable Reference claim;
  private final @Nullable CodeableConcept subType;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable Code use;
  private final @Nullable Reference claimResponse;
  private final @Nullable List<String> preAuthRef;
  private final @Nullable List<ExplanationOfBenefit_Procedure> procedure;
  private final @Nullable CodeableConcept priority;
  private final @Nullable Reference prescription;
  private final @Nullable Narrative text;
  private final Reference insurer;
  private final @Nullable Reference enterer;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable List<ExplanationOfBenefit_Related> related;
  private final List<ExplanationOfBenefit_Insurance> insurance;
  private final @Nullable List<ExplanationOfBenefit_AddItem> addItem;
  private final @Nullable DateTime created;
  private final @Nullable Reference originalPrescription;
  private final @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
  private final CodeableConcept type;
  private final @Nullable Reference facility;

  private ImmutableExplanationOfBenefit(
      @Nullable List<Period> preAuthRefPeriod,
      @Nullable List<ExplanationOfBenefit_Diagnosis> diagnosis,
      @Nullable CodeableConcept formCode,
      @Nullable List<ExplanationOfBenefit_SupportingInfo> supportingInfo,
      @Nullable Reference referral,
      @Nullable List<ExplanationOfBenefit_Total> total,
      @Nullable List<ExplanationOfBenefit_Item> item,
      @Nullable Period billablePeriod,
      @Nullable CodeableConcept fundsReserve,
      @Nullable List<Identifier> identifier,
      Reference patient,
      @Nullable CodeableConcept fundsReserveRequested,
      @Nullable Period benefitPeriod,
      @Nullable ExplanationOfBenefit_Accident accident,
      @Nullable Uri implicitRules,
      @Nullable List<ExplanationOfBenefit_BenefitBalance> benefitBalance,
      @Nullable Attachment form,
      @Nullable PositiveInt precedence,
      @Nullable ExplanationOfBenefit_Payment payment,
      @Nullable ExplanationOfBenefit_Payee payee,
      @Nullable List<ExplanationOfBenefit_ProcessNote> processNote,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable ExplanationofbenefitStatus status,
      @Nullable List<ResourceList> contained,
      @Nullable List<ExplanationOfBenefit_CareTeam> careTeam,
      @Nullable String disposition,
      Reference provider,
      @Nullable Code outcome,
      @Nullable Reference claim,
      @Nullable CodeableConcept subType,
      String resourceType,
      @Nullable Meta meta,
      @Nullable Code use,
      @Nullable Reference claimResponse,
      @Nullable List<String> preAuthRef,
      @Nullable List<ExplanationOfBenefit_Procedure> procedure,
      @Nullable CodeableConcept priority,
      @Nullable Reference prescription,
      @Nullable Narrative text,
      Reference insurer,
      @Nullable Reference enterer,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable List<ExplanationOfBenefit_Related> related,
      List<ExplanationOfBenefit_Insurance> insurance,
      @Nullable List<ExplanationOfBenefit_AddItem> addItem,
      @Nullable DateTime created,
      @Nullable Reference originalPrescription,
      @Nullable List<ExplanationOfBenefit_Adjudication> adjudication,
      CodeableConcept type,
      @Nullable Reference facility) {
    this.preAuthRefPeriod = preAuthRefPeriod;
    this.diagnosis = diagnosis;
    this.formCode = formCode;
    this.supportingInfo = supportingInfo;
    this.referral = referral;
    this.total = total;
    this.item = item;
    this.billablePeriod = billablePeriod;
    this.fundsReserve = fundsReserve;
    this.identifier = identifier;
    this.patient = patient;
    this.fundsReserveRequested = fundsReserveRequested;
    this.benefitPeriod = benefitPeriod;
    this.accident = accident;
    this.implicitRules = implicitRules;
    this.benefitBalance = benefitBalance;
    this.form = form;
    this.precedence = precedence;
    this.payment = payment;
    this.payee = payee;
    this.processNote = processNote;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.contained = contained;
    this.careTeam = careTeam;
    this.disposition = disposition;
    this.provider = provider;
    this.outcome = outcome;
    this.claim = claim;
    this.subType = subType;
    this.resourceType = resourceType;
    this.meta = meta;
    this.use = use;
    this.claimResponse = claimResponse;
    this.preAuthRef = preAuthRef;
    this.procedure = procedure;
    this.priority = priority;
    this.prescription = prescription;
    this.text = text;
    this.insurer = insurer;
    this.enterer = enterer;
    this.extension = extension;
    this.language = language;
    this.related = related;
    this.insurance = insurance;
    this.addItem = addItem;
    this.created = created;
    this.originalPrescription = originalPrescription;
    this.adjudication = adjudication;
    this.type = type;
    this.facility = facility;
  }

  /**
   * @return The value of the {@code preAuthRefPeriod} attribute
   */
  @JsonProperty("preAuthRefPeriod")
  @Override
  public Optional<List<Period>> preAuthRefPeriod() {
    return Optional.ofNullable(preAuthRefPeriod);
  }

  /**
   * @return The value of the {@code diagnosis} attribute
   */
  @JsonProperty("diagnosis")
  @Override
  public Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis() {
    return Optional.ofNullable(diagnosis);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code referral} attribute
   */
  @JsonProperty("referral")
  @Override
  public Optional<Reference> referral() {
    return Optional.ofNullable(referral);
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @JsonProperty("total")
  @Override
  public Optional<List<ExplanationOfBenefit_Total>> total() {
    return Optional.ofNullable(total);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<ExplanationOfBenefit_Item>> item() {
    return Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code billablePeriod} attribute
   */
  @JsonProperty("billablePeriod")
  @Override
  public Optional<Period> billablePeriod() {
    return Optional.ofNullable(billablePeriod);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code fundsReserveRequested} attribute
   */
  @JsonProperty("fundsReserveRequested")
  @Override
  public Optional<CodeableConcept> fundsReserveRequested() {
    return Optional.ofNullable(fundsReserveRequested);
  }

  /**
   * @return The value of the {@code benefitPeriod} attribute
   */
  @JsonProperty("benefitPeriod")
  @Override
  public Optional<Period> benefitPeriod() {
    return Optional.ofNullable(benefitPeriod);
  }

  /**
   * @return The value of the {@code accident} attribute
   */
  @JsonProperty("accident")
  @Override
  public Optional<ExplanationOfBenefit_Accident> accident() {
    return Optional.ofNullable(accident);
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
   * @return The value of the {@code benefitBalance} attribute
   */
  @JsonProperty("benefitBalance")
  @Override
  public Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance() {
    return Optional.ofNullable(benefitBalance);
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
   * @return The value of the {@code precedence} attribute
   */
  @JsonProperty("precedence")
  @Override
  public Optional<PositiveInt> precedence() {
    return Optional.ofNullable(precedence);
  }

  /**
   * @return The value of the {@code payment} attribute
   */
  @JsonProperty("payment")
  @Override
  public Optional<ExplanationOfBenefit_Payment> payment() {
    return Optional.ofNullable(payment);
  }

  /**
   * @return The value of the {@code payee} attribute
   */
  @JsonProperty("payee")
  @Override
  public Optional<ExplanationOfBenefit_Payee> payee() {
    return Optional.ofNullable(payee);
  }

  /**
   * @return The value of the {@code processNote} attribute
   */
  @JsonProperty("processNote")
  @Override
  public Optional<List<ExplanationOfBenefit_ProcessNote>> processNote() {
    return Optional.ofNullable(processNote);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ExplanationofbenefitStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code careTeam} attribute
   */
  @JsonProperty("careTeam")
  @Override
  public Optional<List<ExplanationOfBenefit_CareTeam>> careTeam() {
    return Optional.ofNullable(careTeam);
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
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Reference provider() {
    return provider;
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
   * @return The value of the {@code claim} attribute
   */
  @JsonProperty("claim")
  @Override
  public Optional<Reference> claim() {
    return Optional.ofNullable(claim);
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
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<Code> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code claimResponse} attribute
   */
  @JsonProperty("claimResponse")
  @Override
  public Optional<Reference> claimResponse() {
    return Optional.ofNullable(claimResponse);
  }

  /**
   * @return The value of the {@code preAuthRef} attribute
   */
  @JsonProperty("preAuthRef")
  @Override
  public Optional<List<String>> preAuthRef() {
    return Optional.ofNullable(preAuthRef);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @JsonProperty("procedure")
  @Override
  public Optional<List<ExplanationOfBenefit_Procedure>> procedure() {
    return Optional.ofNullable(procedure);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<CodeableConcept> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code prescription} attribute
   */
  @JsonProperty("prescription")
  @Override
  public Optional<Reference> prescription() {
    return Optional.ofNullable(prescription);
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
   * @return The value of the {@code insurer} attribute
   */
  @JsonProperty("insurer")
  @Override
  public Reference insurer() {
    return insurer;
  }

  /**
   * @return The value of the {@code enterer} attribute
   */
  @JsonProperty("enterer")
  @Override
  public Optional<Reference> enterer() {
    return Optional.ofNullable(enterer);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code related} attribute
   */
  @JsonProperty("related")
  @Override
  public Optional<List<ExplanationOfBenefit_Related>> related() {
    return Optional.ofNullable(related);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public List<ExplanationOfBenefit_Insurance> insurance() {
    return insurance;
  }

  /**
   * @return The value of the {@code addItem} attribute
   */
  @JsonProperty("addItem")
  @Override
  public Optional<List<ExplanationOfBenefit_AddItem>> addItem() {
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
   * @return The value of the {@code originalPrescription} attribute
   */
  @JsonProperty("originalPrescription")
  @Override
  public Optional<Reference> originalPrescription() {
    return Optional.ofNullable(originalPrescription);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() {
    return Optional.ofNullable(adjudication);
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
   * @return The value of the {@code facility} attribute
   */
  @JsonProperty("facility")
  @Override
  public Optional<Reference> facility() {
    return Optional.ofNullable(facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} attribute.
   * @param value The value for preAuthRefPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPreAuthRefPeriod(List<Period> value) {
    @Nullable List<Period> newValue = Objects.requireNonNull(value, "preAuthRefPeriod");
    if (this.preAuthRefPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        newValue,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRefPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPreAuthRefPeriod(Optional<? extends List<Period>> optional) {
    @Nullable List<Period> value = optional.orElse(null);
    if (this.preAuthRefPeriod == value) return this;
    return new ImmutableExplanationOfBenefit(
        value,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withDiagnosis(List<ExplanationOfBenefit_Diagnosis> value) {
    @Nullable List<ExplanationOfBenefit_Diagnosis> newValue = Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        newValue,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withDiagnosis(Optional<? extends List<ExplanationOfBenefit_Diagnosis>> optional) {
    @Nullable List<ExplanationOfBenefit_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        value,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#formCode() formCode} attribute.
   * @param value The value for formCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFormCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "formCode");
    if (this.formCode == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        newValue,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#formCode() formCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for formCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFormCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.formCode == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        value,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withSupportingInfo(List<ExplanationOfBenefit_SupportingInfo> value) {
    @Nullable List<ExplanationOfBenefit_SupportingInfo> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        newValue,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withSupportingInfo(Optional<? extends List<ExplanationOfBenefit_SupportingInfo>> optional) {
    @Nullable List<ExplanationOfBenefit_SupportingInfo> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        value,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#referral() referral} attribute.
   * @param value The value for referral
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withReferral(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "referral");
    if (this.referral == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        newValue,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#referral() referral} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referral
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withReferral(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.referral == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        value,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withTotal(List<ExplanationOfBenefit_Total> value) {
    @Nullable List<ExplanationOfBenefit_Total> newValue = Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        newValue,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withTotal(Optional<? extends List<ExplanationOfBenefit_Total>> optional) {
    @Nullable List<ExplanationOfBenefit_Total> value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        value,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withItem(List<ExplanationOfBenefit_Item> value) {
    @Nullable List<ExplanationOfBenefit_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        newValue,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withItem(Optional<? extends List<ExplanationOfBenefit_Item>> optional) {
    @Nullable List<ExplanationOfBenefit_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        value,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#billablePeriod() billablePeriod} attribute.
   * @param value The value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withBillablePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "billablePeriod");
    if (this.billablePeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        newValue,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#billablePeriod() billablePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withBillablePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.billablePeriod == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        value,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#fundsReserve() fundsReserve} attribute.
   * @param value The value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFundsReserve(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fundsReserve");
    if (this.fundsReserve == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        newValue,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#fundsReserve() fundsReserve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFundsReserve(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fundsReserve == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        value,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        newValue,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        value,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        newValue,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} attribute.
   * @param value The value for fundsReserveRequested
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFundsReserveRequested(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fundsReserveRequested");
    if (this.fundsReserveRequested == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        newValue,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserveRequested
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFundsReserveRequested(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fundsReserveRequested == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        value,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} attribute.
   * @param value The value for benefitPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withBenefitPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "benefitPeriod");
    if (this.benefitPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        newValue,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefitPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withBenefitPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.benefitPeriod == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        value,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#accident() accident} attribute.
   * @param value The value for accident
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withAccident(ExplanationOfBenefit_Accident value) {
    @Nullable ExplanationOfBenefit_Accident newValue = Objects.requireNonNull(value, "accident");
    if (this.accident == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        newValue,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#accident() accident} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accident
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withAccident(Optional<? extends ExplanationOfBenefit_Accident> optional) {
    @Nullable ExplanationOfBenefit_Accident value = optional.orElse(null);
    if (this.accident == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        value,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        newValue,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        value,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#benefitBalance() benefitBalance} attribute.
   * @param value The value for benefitBalance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withBenefitBalance(List<ExplanationOfBenefit_BenefitBalance> value) {
    @Nullable List<ExplanationOfBenefit_BenefitBalance> newValue = Objects.requireNonNull(value, "benefitBalance");
    if (this.benefitBalance == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        newValue,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#benefitBalance() benefitBalance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefitBalance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withBenefitBalance(Optional<? extends List<ExplanationOfBenefit_BenefitBalance>> optional) {
    @Nullable List<ExplanationOfBenefit_BenefitBalance> value = optional.orElse(null);
    if (this.benefitBalance == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        value,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withForm(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        newValue,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withForm(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        value,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#precedence() precedence} attribute.
   * @param value The value for precedence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPrecedence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "precedence");
    if (this.precedence == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        newValue,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#precedence() precedence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precedence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPrecedence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.precedence == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        value,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#payment() payment} attribute.
   * @param value The value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPayment(ExplanationOfBenefit_Payment value) {
    @Nullable ExplanationOfBenefit_Payment newValue = Objects.requireNonNull(value, "payment");
    if (this.payment == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        newValue,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#payment() payment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPayment(Optional<? extends ExplanationOfBenefit_Payment> optional) {
    @Nullable ExplanationOfBenefit_Payment value = optional.orElse(null);
    if (this.payment == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        value,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPayee(ExplanationOfBenefit_Payee value) {
    @Nullable ExplanationOfBenefit_Payee newValue = Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        newValue,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPayee(Optional<? extends ExplanationOfBenefit_Payee> optional) {
    @Nullable ExplanationOfBenefit_Payee value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        value,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#processNote() processNote} attribute.
   * @param value The value for processNote
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withProcessNote(List<ExplanationOfBenefit_ProcessNote> value) {
    @Nullable List<ExplanationOfBenefit_ProcessNote> newValue = Objects.requireNonNull(value, "processNote");
    if (this.processNote == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        newValue,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#processNote() processNote} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processNote
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withProcessNote(Optional<? extends List<ExplanationOfBenefit_ProcessNote>> optional) {
    @Nullable List<ExplanationOfBenefit_ProcessNote> value = optional.orElse(null);
    if (this.processNote == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        value,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        newValue,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        value,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        newValue,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        value,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withStatus(ExplanationofbenefitStatus value) {
    @Nullable ExplanationofbenefitStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        newValue,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withStatus(Optional<? extends ExplanationofbenefitStatus> optional) {
    @Nullable ExplanationofbenefitStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        value,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        newValue,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        value,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#careTeam() careTeam} attribute.
   * @param value The value for careTeam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withCareTeam(List<ExplanationOfBenefit_CareTeam> value) {
    @Nullable List<ExplanationOfBenefit_CareTeam> newValue = Objects.requireNonNull(value, "careTeam");
    if (this.careTeam == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        newValue,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#careTeam() careTeam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withCareTeam(Optional<? extends List<ExplanationOfBenefit_CareTeam>> optional) {
    @Nullable List<ExplanationOfBenefit_CareTeam> value = optional.orElse(null);
    if (this.careTeam == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        value,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withDisposition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "disposition");
    if (Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        newValue,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withDisposition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.disposition, value)) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        value,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#provider() provider} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provider
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withProvider(Reference value) {
    if (this.provider == value) return this;
    Reference newValue = Objects.requireNonNull(value, "provider");
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        newValue,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withOutcome(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        newValue,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withOutcome(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        value,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#claim() claim} attribute.
   * @param value The value for claim
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withClaim(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "claim");
    if (this.claim == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        newValue,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#claim() claim} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claim
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withClaim(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.claim == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        value,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withSubType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        newValue,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withSubType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        value,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        newValue,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        newValue,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        value,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withUse(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        newValue,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withUse(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        value,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#claimResponse() claimResponse} attribute.
   * @param value The value for claimResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withClaimResponse(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "claimResponse");
    if (this.claimResponse == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        newValue,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#claimResponse() claimResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claimResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withClaimResponse(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.claimResponse == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        value,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPreAuthRef(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "preAuthRef");
    if (this.preAuthRef == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        newValue,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#preAuthRef() preAuthRef} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPreAuthRef(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.preAuthRef == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        value,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withProcedure(List<ExplanationOfBenefit_Procedure> value) {
    @Nullable List<ExplanationOfBenefit_Procedure> newValue = Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        newValue,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withProcedure(Optional<? extends List<ExplanationOfBenefit_Procedure>> optional) {
    @Nullable List<ExplanationOfBenefit_Procedure> value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        value,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPriority(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        newValue,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPriority(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        value,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#prescription() prescription} attribute.
   * @param value The value for prescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPrescription(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "prescription");
    if (this.prescription == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        newValue,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#prescription() prescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPrescription(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.prescription == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        value,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        newValue,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        value,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withInsurer(Reference value) {
    if (this.insurer == value) return this;
    Reference newValue = Objects.requireNonNull(value, "insurer");
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        newValue,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withEnterer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        newValue,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withEnterer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        value,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        newValue,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        value,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        newValue,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        value,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withRelated(List<ExplanationOfBenefit_Related> value) {
    @Nullable List<ExplanationOfBenefit_Related> newValue = Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        newValue,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withRelated(Optional<? extends List<ExplanationOfBenefit_Related>> optional) {
    @Nullable List<ExplanationOfBenefit_Related> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        value,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ExplanationOfBenefit#insurance() insurance}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withInsurance(ExplanationOfBenefit_Insurance... elements) {
    List<ExplanationOfBenefit_Insurance> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        newValue,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ExplanationOfBenefit#insurance() insurance}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of insurance elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withInsurance(Iterable<? extends ExplanationOfBenefit_Insurance> elements) {
    if (this.insurance == elements) return this;
    List<ExplanationOfBenefit_Insurance> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        newValue,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#addItem() addItem} attribute.
   * @param value The value for addItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withAddItem(List<ExplanationOfBenefit_AddItem> value) {
    @Nullable List<ExplanationOfBenefit_AddItem> newValue = Objects.requireNonNull(value, "addItem");
    if (this.addItem == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        newValue,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#addItem() addItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withAddItem(Optional<? extends List<ExplanationOfBenefit_AddItem>> optional) {
    @Nullable List<ExplanationOfBenefit_AddItem> value = optional.orElse(null);
    if (this.addItem == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        value,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        newValue,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        value,
        this.originalPrescription,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#originalPrescription() originalPrescription} attribute.
   * @param value The value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withOriginalPrescription(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "originalPrescription");
    if (this.originalPrescription == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        newValue,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#originalPrescription() originalPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withOriginalPrescription(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.originalPrescription == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        value,
        this.adjudication,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withAdjudication(List<ExplanationOfBenefit_Adjudication> value) {
    @Nullable List<ExplanationOfBenefit_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        newValue,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withAdjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> optional) {
    @Nullable List<ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        value,
        this.type,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        newValue,
        this.facility);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFacility(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFacility(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.preAuthRefPeriod,
        this.diagnosis,
        this.formCode,
        this.supportingInfo,
        this.referral,
        this.total,
        this.item,
        this.billablePeriod,
        this.fundsReserve,
        this.identifier,
        this.patient,
        this.fundsReserveRequested,
        this.benefitPeriod,
        this.accident,
        this.implicitRules,
        this.benefitBalance,
        this.form,
        this.precedence,
        this.payment,
        this.payee,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.status,
        this.contained,
        this.careTeam,
        this.disposition,
        this.provider,
        this.outcome,
        this.claim,
        this.subType,
        this.resourceType,
        this.meta,
        this.use,
        this.claimResponse,
        this.preAuthRef,
        this.procedure,
        this.priority,
        this.prescription,
        this.text,
        this.insurer,
        this.enterer,
        this.extension,
        this.language,
        this.related,
        this.insurance,
        this.addItem,
        this.created,
        this.originalPrescription,
        this.adjudication,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit
        && equalTo((ImmutableExplanationOfBenefit) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit another) {
    return Objects.equals(preAuthRefPeriod, another.preAuthRefPeriod)
        && Objects.equals(diagnosis, another.diagnosis)
        && Objects.equals(formCode, another.formCode)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(referral, another.referral)
        && Objects.equals(total, another.total)
        && Objects.equals(item, another.item)
        && Objects.equals(billablePeriod, another.billablePeriod)
        && Objects.equals(fundsReserve, another.fundsReserve)
        && Objects.equals(identifier, another.identifier)
        && patient.equals(another.patient)
        && Objects.equals(fundsReserveRequested, another.fundsReserveRequested)
        && Objects.equals(benefitPeriod, another.benefitPeriod)
        && Objects.equals(accident, another.accident)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(benefitBalance, another.benefitBalance)
        && Objects.equals(form, another.form)
        && Objects.equals(precedence, another.precedence)
        && Objects.equals(payment, another.payment)
        && Objects.equals(payee, another.payee)
        && Objects.equals(processNote, another.processNote)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && Objects.equals(contained, another.contained)
        && Objects.equals(careTeam, another.careTeam)
        && Objects.equals(disposition, another.disposition)
        && provider.equals(another.provider)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(claim, another.claim)
        && Objects.equals(subType, another.subType)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(use, another.use)
        && Objects.equals(claimResponse, another.claimResponse)
        && Objects.equals(preAuthRef, another.preAuthRef)
        && Objects.equals(procedure, another.procedure)
        && Objects.equals(priority, another.priority)
        && Objects.equals(prescription, another.prescription)
        && Objects.equals(text, another.text)
        && insurer.equals(another.insurer)
        && Objects.equals(enterer, another.enterer)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(related, another.related)
        && insurance.equals(another.insurance)
        && Objects.equals(addItem, another.addItem)
        && Objects.equals(created, another.created)
        && Objects.equals(originalPrescription, another.originalPrescription)
        && Objects.equals(adjudication, another.adjudication)
        && type.equals(another.type)
        && Objects.equals(facility, another.facility);
  }

  /**
   * Computes a hash code from attributes: {@code preAuthRefPeriod}, {@code diagnosis}, {@code formCode}, {@code supportingInfo}, {@code referral}, {@code total}, {@code item}, {@code billablePeriod}, {@code fundsReserve}, {@code identifier}, {@code patient}, {@code fundsReserveRequested}, {@code benefitPeriod}, {@code accident}, {@code implicitRules}, {@code benefitBalance}, {@code form}, {@code precedence}, {@code payment}, {@code payee}, {@code processNote}, {@code id}, {@code modifierExtension}, {@code status}, {@code contained}, {@code careTeam}, {@code disposition}, {@code provider}, {@code outcome}, {@code claim}, {@code subType}, {@code resourceType}, {@code meta}, {@code use}, {@code claimResponse}, {@code preAuthRef}, {@code procedure}, {@code priority}, {@code prescription}, {@code text}, {@code insurer}, {@code enterer}, {@code extension}, {@code language}, {@code related}, {@code insurance}, {@code addItem}, {@code created}, {@code originalPrescription}, {@code adjudication}, {@code type}, {@code facility}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(preAuthRefPeriod);
    h += (h << 5) + Objects.hashCode(diagnosis);
    h += (h << 5) + Objects.hashCode(formCode);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(referral);
    h += (h << 5) + Objects.hashCode(total);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(billablePeriod);
    h += (h << 5) + Objects.hashCode(fundsReserve);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(fundsReserveRequested);
    h += (h << 5) + Objects.hashCode(benefitPeriod);
    h += (h << 5) + Objects.hashCode(accident);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(benefitBalance);
    h += (h << 5) + Objects.hashCode(form);
    h += (h << 5) + Objects.hashCode(precedence);
    h += (h << 5) + Objects.hashCode(payment);
    h += (h << 5) + Objects.hashCode(payee);
    h += (h << 5) + Objects.hashCode(processNote);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(careTeam);
    h += (h << 5) + Objects.hashCode(disposition);
    h += (h << 5) + provider.hashCode();
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(claim);
    h += (h << 5) + Objects.hashCode(subType);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(claimResponse);
    h += (h << 5) + Objects.hashCode(preAuthRef);
    h += (h << 5) + Objects.hashCode(procedure);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(prescription);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + Objects.hashCode(enterer);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(related);
    h += (h << 5) + insurance.hashCode();
    h += (h << 5) + Objects.hashCode(addItem);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(originalPrescription);
    h += (h << 5) + Objects.hashCode(adjudication);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(facility);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit{");
    if (preAuthRefPeriod != null) {
      builder.append("preAuthRefPeriod=").append(preAuthRefPeriod);
    }
    if (diagnosis != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (formCode != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("formCode=").append(formCode);
    }
    if (supportingInfo != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (referral != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("referral=").append(referral);
    }
    if (total != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("total=").append(total);
    }
    if (item != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (billablePeriod != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("billablePeriod=").append(billablePeriod);
    }
    if (fundsReserve != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("fundsReserve=").append(fundsReserve);
    }
    if (identifier != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("patient=").append(patient);
    if (fundsReserveRequested != null) {
      builder.append(", ");
      builder.append("fundsReserveRequested=").append(fundsReserveRequested);
    }
    if (benefitPeriod != null) {
      builder.append(", ");
      builder.append("benefitPeriod=").append(benefitPeriod);
    }
    if (accident != null) {
      builder.append(", ");
      builder.append("accident=").append(accident);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (benefitBalance != null) {
      builder.append(", ");
      builder.append("benefitBalance=").append(benefitBalance);
    }
    if (form != null) {
      builder.append(", ");
      builder.append("form=").append(form);
    }
    if (precedence != null) {
      builder.append(", ");
      builder.append("precedence=").append(precedence);
    }
    if (payment != null) {
      builder.append(", ");
      builder.append("payment=").append(payment);
    }
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (processNote != null) {
      builder.append(", ");
      builder.append("processNote=").append(processNote);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (careTeam != null) {
      builder.append(", ");
      builder.append("careTeam=").append(careTeam);
    }
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    builder.append(", ");
    builder.append("provider=").append(provider);
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (claim != null) {
      builder.append(", ");
      builder.append("claim=").append(claim);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (use != null) {
      builder.append(", ");
      builder.append("use=").append(use);
    }
    if (claimResponse != null) {
      builder.append(", ");
      builder.append("claimResponse=").append(claimResponse);
    }
    if (preAuthRef != null) {
      builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (procedure != null) {
      builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (prescription != null) {
      builder.append(", ");
      builder.append("prescription=").append(prescription);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (related != null) {
      builder.append(", ");
      builder.append("related=").append(related);
    }
    builder.append(", ");
    builder.append("insurance=").append(insurance);
    if (addItem != null) {
      builder.append(", ");
      builder.append("addItem=").append(addItem);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (originalPrescription != null) {
      builder.append(", ");
      builder.append("originalPrescription=").append(originalPrescription);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (facility != null) {
      builder.append(", ");
      builder.append("facility=").append(facility);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit {
    @Nullable Optional<List<Period>> preAuthRefPeriod = Optional.empty();
    boolean preAuthRefPeriodIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis = Optional.empty();
    boolean diagnosisIsSet;
    @Nullable Optional<CodeableConcept> formCode = Optional.empty();
    boolean formCodeIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<Reference> referral = Optional.empty();
    boolean referralIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Total>> total = Optional.empty();
    boolean totalIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Period> billablePeriod = Optional.empty();
    boolean billablePeriodIsSet;
    @Nullable Optional<CodeableConcept> fundsReserve = Optional.empty();
    boolean fundsReserveIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Reference patient;
    @Nullable Optional<CodeableConcept> fundsReserveRequested = Optional.empty();
    boolean fundsReserveRequestedIsSet;
    @Nullable Optional<Period> benefitPeriod = Optional.empty();
    boolean benefitPeriodIsSet;
    @Nullable Optional<ExplanationOfBenefit_Accident> accident = Optional.empty();
    boolean accidentIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance = Optional.empty();
    boolean benefitBalanceIsSet;
    @Nullable Optional<Attachment> form = Optional.empty();
    boolean formIsSet;
    @Nullable Optional<PositiveInt> precedence = Optional.empty();
    boolean precedenceIsSet;
    @Nullable Optional<ExplanationOfBenefit_Payment> payment = Optional.empty();
    boolean paymentIsSet;
    @Nullable Optional<ExplanationOfBenefit_Payee> payee = Optional.empty();
    boolean payeeIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_ProcessNote>> processNote = Optional.empty();
    boolean processNoteIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<ExplanationofbenefitStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_CareTeam>> careTeam = Optional.empty();
    boolean careTeamIsSet;
    @Nullable Optional<String> disposition = Optional.empty();
    boolean dispositionIsSet;
    @Nullable Reference provider;
    @Nullable Optional<Code> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<Reference> claim = Optional.empty();
    boolean claimIsSet;
    @Nullable Optional<CodeableConcept> subType = Optional.empty();
    boolean subTypeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<Reference> claimResponse = Optional.empty();
    boolean claimResponseIsSet;
    @Nullable Optional<List<String>> preAuthRef = Optional.empty();
    boolean preAuthRefIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Procedure>> procedure = Optional.empty();
    boolean procedureIsSet;
    @Nullable Optional<CodeableConcept> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Reference> prescription = Optional.empty();
    boolean prescriptionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Reference insurer;
    @Nullable Optional<Reference> enterer = Optional.empty();
    boolean entererIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Related>> related = Optional.empty();
    boolean relatedIsSet;
    @Nullable List<ExplanationOfBenefit_Insurance> insurance = Collections.emptyList();
    @Nullable Optional<List<ExplanationOfBenefit_AddItem>> addItem = Optional.empty();
    boolean addItemIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<Reference> originalPrescription = Optional.empty();
    boolean originalPrescriptionIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Reference> facility = Optional.empty();
    boolean facilityIsSet;
    @JsonProperty("preAuthRefPeriod")
    public void setPreAuthRefPeriod(Optional<List<Period>> preAuthRefPeriod) {
      this.preAuthRefPeriod = preAuthRefPeriod;
      this.preAuthRefPeriodIsSet = true;
    }
    @JsonProperty("diagnosis")
    public void setDiagnosis(Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @JsonProperty("formCode")
    public void setFormCode(Optional<CodeableConcept> formCode) {
      this.formCode = formCode;
      this.formCodeIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("referral")
    public void setReferral(Optional<Reference> referral) {
      this.referral = referral;
      this.referralIsSet = true;
    }
    @JsonProperty("total")
    public void setTotal(Optional<List<ExplanationOfBenefit_Total>> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<ExplanationOfBenefit_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("billablePeriod")
    public void setBillablePeriod(Optional<Period> billablePeriod) {
      this.billablePeriod = billablePeriod;
      this.billablePeriodIsSet = true;
    }
    @JsonProperty("fundsReserve")
    public void setFundsReserve(Optional<CodeableConcept> fundsReserve) {
      this.fundsReserve = fundsReserve;
      this.fundsReserveIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("fundsReserveRequested")
    public void setFundsReserveRequested(Optional<CodeableConcept> fundsReserveRequested) {
      this.fundsReserveRequested = fundsReserveRequested;
      this.fundsReserveRequestedIsSet = true;
    }
    @JsonProperty("benefitPeriod")
    public void setBenefitPeriod(Optional<Period> benefitPeriod) {
      this.benefitPeriod = benefitPeriod;
      this.benefitPeriodIsSet = true;
    }
    @JsonProperty("accident")
    public void setAccident(Optional<ExplanationOfBenefit_Accident> accident) {
      this.accident = accident;
      this.accidentIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("benefitBalance")
    public void setBenefitBalance(Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance) {
      this.benefitBalance = benefitBalance;
      this.benefitBalanceIsSet = true;
    }
    @JsonProperty("form")
    public void setForm(Optional<Attachment> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @JsonProperty("precedence")
    public void setPrecedence(Optional<PositiveInt> precedence) {
      this.precedence = precedence;
      this.precedenceIsSet = true;
    }
    @JsonProperty("payment")
    public void setPayment(Optional<ExplanationOfBenefit_Payment> payment) {
      this.payment = payment;
      this.paymentIsSet = true;
    }
    @JsonProperty("payee")
    public void setPayee(Optional<ExplanationOfBenefit_Payee> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @JsonProperty("processNote")
    public void setProcessNote(Optional<List<ExplanationOfBenefit_ProcessNote>> processNote) {
      this.processNote = processNote;
      this.processNoteIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ExplanationofbenefitStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("careTeam")
    public void setCareTeam(Optional<List<ExplanationOfBenefit_CareTeam>> careTeam) {
      this.careTeam = careTeam;
      this.careTeamIsSet = true;
    }
    @JsonProperty("disposition")
    public void setDisposition(Optional<String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
      this.provider = provider;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<Code> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("claim")
    public void setClaim(Optional<Reference> claim) {
      this.claim = claim;
      this.claimIsSet = true;
    }
    @JsonProperty("subType")
    public void setSubType(Optional<CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<Code> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("claimResponse")
    public void setClaimResponse(Optional<Reference> claimResponse) {
      this.claimResponse = claimResponse;
      this.claimResponseIsSet = true;
    }
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(Optional<List<String>> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @JsonProperty("procedure")
    public void setProcedure(Optional<List<ExplanationOfBenefit_Procedure>> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("prescription")
    public void setPrescription(Optional<Reference> prescription) {
      this.prescription = prescription;
      this.prescriptionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
      this.insurer = insurer;
    }
    @JsonProperty("enterer")
    public void setEnterer(Optional<Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("related")
    public void setRelated(Optional<List<ExplanationOfBenefit_Related>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(List<ExplanationOfBenefit_Insurance> insurance) {
      this.insurance = insurance;
    }
    @JsonProperty("addItem")
    public void setAddItem(Optional<List<ExplanationOfBenefit_AddItem>> addItem) {
      this.addItem = addItem;
      this.addItemIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("originalPrescription")
    public void setOriginalPrescription(Optional<Reference> originalPrescription) {
      this.originalPrescription = originalPrescription;
      this.originalPrescriptionIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("facility")
    public void setFacility(Optional<Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
    }
    @Override
    public Optional<List<Period>> preAuthRefPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> formCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> referral() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Total>> total() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> billablePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> fundsReserve() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> fundsReserveRequested() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> benefitPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExplanationOfBenefit_Accident> accident() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> form() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> precedence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExplanationOfBenefit_Payment> payment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExplanationOfBenefit_Payee> payee() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_ProcessNote>> processNote() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExplanationofbenefitStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_CareTeam>> careTeam() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public Reference provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> claim() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> claimResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Procedure>> procedure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> prescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Related>> related() { throw new UnsupportedOperationException(); }
    @Override
    public List<ExplanationOfBenefit_Insurance> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_AddItem>> addItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> originalPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> facility() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit fromJson(Json json) {
    ImmutableExplanationOfBenefit.Builder builder = ((ImmutableExplanationOfBenefit.Builder) ImmutableExplanationOfBenefit.builder());
    if (json.preAuthRefPeriodIsSet) {
      builder.preAuthRefPeriod(json.preAuthRefPeriod);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.formCodeIsSet) {
      builder.formCode(json.formCode);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.referralIsSet) {
      builder.referral(json.referral);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.billablePeriodIsSet) {
      builder.billablePeriod(json.billablePeriod);
    }
    if (json.fundsReserveIsSet) {
      builder.fundsReserve(json.fundsReserve);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.fundsReserveRequestedIsSet) {
      builder.fundsReserveRequested(json.fundsReserveRequested);
    }
    if (json.benefitPeriodIsSet) {
      builder.benefitPeriod(json.benefitPeriod);
    }
    if (json.accidentIsSet) {
      builder.accident(json.accident);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.benefitBalanceIsSet) {
      builder.benefitBalance(json.benefitBalance);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.precedenceIsSet) {
      builder.precedence(json.precedence);
    }
    if (json.paymentIsSet) {
      builder.payment(json.payment);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.processNoteIsSet) {
      builder.processNote(json.processNote);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.careTeamIsSet) {
      builder.careTeam(json.careTeam);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.provider != null) {
      builder.provider(json.provider);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.claimIsSet) {
      builder.claim(json.claim);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.claimResponseIsSet) {
      builder.claimResponse(json.claimResponse);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.prescriptionIsSet) {
      builder.prescription(json.prescription);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.insurance != null) {
      builder.addAllInsurance(json.insurance);
    }
    if (json.addItemIsSet) {
      builder.addItem(json.addItem);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.originalPrescriptionIsSet) {
      builder.originalPrescription(json.originalPrescription);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
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
        .preAuthRefPeriod(instance.preAuthRefPeriod())
        .diagnosis(instance.diagnosis())
        .formCode(instance.formCode())
        .supportingInfo(instance.supportingInfo())
        .referral(instance.referral())
        .total(instance.total())
        .item(instance.item())
        .billablePeriod(instance.billablePeriod())
        .fundsReserve(instance.fundsReserve())
        .identifier(instance.identifier())
        .patient(instance.patient())
        .fundsReserveRequested(instance.fundsReserveRequested())
        .benefitPeriod(instance.benefitPeriod())
        .accident(instance.accident())
        .implicitRules(instance.implicitRules())
        .benefitBalance(instance.benefitBalance())
        .form(instance.form())
        .precedence(instance.precedence())
        .payment(instance.payment())
        .payee(instance.payee())
        .processNote(instance.processNote())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .contained(instance.contained())
        .careTeam(instance.careTeam())
        .disposition(instance.disposition())
        .provider(instance.provider())
        .outcome(instance.outcome())
        .claim(instance.claim())
        .subType(instance.subType())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .use(instance.use())
        .claimResponse(instance.claimResponse())
        .preAuthRef(instance.preAuthRef())
        .procedure(instance.procedure())
        .priority(instance.priority())
        .prescription(instance.prescription())
        .text(instance.text())
        .insurer(instance.insurer())
        .enterer(instance.enterer())
        .extension(instance.extension())
        .language(instance.language())
        .related(instance.related())
        .addAllInsurance(instance.insurance())
        .addItem(instance.addItem())
        .created(instance.created())
        .originalPrescription(instance.originalPrescription())
        .adjudication(instance.adjudication())
        .type(instance.type())
        .facility(instance.facility())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit ExplanationOfBenefit}.
   * <pre>
   * ImmutableExplanationOfBenefit.builder()
   *    .preAuthRefPeriod(List&amp;lt;com.medplum.types.fhir.Period&amp;gt;) // optional {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod}
   *    .diagnosis(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Diagnosis&amp;gt;) // optional {@link ExplanationOfBenefit#diagnosis() diagnosis}
   *    .formCode(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#formCode() formCode}
   *    .supportingInfo(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_SupportingInfo&amp;gt;) // optional {@link ExplanationOfBenefit#supportingInfo() supportingInfo}
   *    .referral(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#referral() referral}
   *    .total(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Total&amp;gt;) // optional {@link ExplanationOfBenefit#total() total}
   *    .item(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Item&amp;gt;) // optional {@link ExplanationOfBenefit#item() item}
   *    .billablePeriod(com.medplum.types.fhir.Period) // optional {@link ExplanationOfBenefit#billablePeriod() billablePeriod}
   *    .fundsReserve(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#fundsReserve() fundsReserve}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ExplanationOfBenefit#identifier() identifier}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link ExplanationOfBenefit#patient() patient}
   *    .fundsReserveRequested(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested}
   *    .benefitPeriod(com.medplum.types.fhir.Period) // optional {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod}
   *    .accident(com.medplum.types.fhir.ExplanationOfBenefit_Accident) // optional {@link ExplanationOfBenefit#accident() accident}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ExplanationOfBenefit#implicitRules() implicitRules}
   *    .benefitBalance(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_BenefitBalance&amp;gt;) // optional {@link ExplanationOfBenefit#benefitBalance() benefitBalance}
   *    .form(com.medplum.types.fhir.Attachment) // optional {@link ExplanationOfBenefit#form() form}
   *    .precedence(com.medplum.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit#precedence() precedence}
   *    .payment(com.medplum.types.fhir.ExplanationOfBenefit_Payment) // optional {@link ExplanationOfBenefit#payment() payment}
   *    .payee(com.medplum.types.fhir.ExplanationOfBenefit_Payee) // optional {@link ExplanationOfBenefit#payee() payee}
   *    .processNote(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_ProcessNote&amp;gt;) // optional {@link ExplanationOfBenefit#processNote() processNote}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ExplanationOfBenefit#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit#modifierExtension() modifierExtension}
   *    .status(com.medplum.types.fhir.ExplanationofbenefitStatus) // optional {@link ExplanationOfBenefit#status() status}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ExplanationOfBenefit#contained() contained}
   *    .careTeam(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_CareTeam&amp;gt;) // optional {@link ExplanationOfBenefit#careTeam() careTeam}
   *    .disposition(String) // optional {@link ExplanationOfBenefit#disposition() disposition}
   *    .provider(com.medplum.types.fhir.Reference) // required {@link ExplanationOfBenefit#provider() provider}
   *    .outcome(com.medplum.types.fhir.Code) // optional {@link ExplanationOfBenefit#outcome() outcome}
   *    .claim(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#claim() claim}
   *    .subType(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#subType() subType}
   *    .resourceType(String) // required {@link ExplanationOfBenefit#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ExplanationOfBenefit#meta() meta}
   *    .use(com.medplum.types.fhir.Code) // optional {@link ExplanationOfBenefit#use() use}
   *    .claimResponse(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#claimResponse() claimResponse}
   *    .preAuthRef(List&amp;lt;String&amp;gt;) // optional {@link ExplanationOfBenefit#preAuthRef() preAuthRef}
   *    .procedure(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Procedure&amp;gt;) // optional {@link ExplanationOfBenefit#procedure() procedure}
   *    .priority(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#priority() priority}
   *    .prescription(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#prescription() prescription}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ExplanationOfBenefit#text() text}
   *    .insurer(com.medplum.types.fhir.Reference) // required {@link ExplanationOfBenefit#insurer() insurer}
   *    .enterer(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#enterer() enterer}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit#extension() extension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ExplanationOfBenefit#language() language}
   *    .related(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Related&amp;gt;) // optional {@link ExplanationOfBenefit#related() related}
   *    .addInsurance|addAllInsurance(com.medplum.types.fhir.ExplanationOfBenefit_Insurance) // {@link ExplanationOfBenefit#insurance() insurance} elements
   *    .addItem(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_AddItem&amp;gt;) // optional {@link ExplanationOfBenefit#addItem() addItem}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link ExplanationOfBenefit#created() created}
   *    .originalPrescription(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#originalPrescription() originalPrescription}
   *    .adjudication(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit#adjudication() adjudication}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit#type() type}
   *    .facility(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit#facility() facility}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit builder
   */
  public static PatientBuildStage builder() {
    return new ImmutableExplanationOfBenefit.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit ExplanationOfBenefit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements PatientBuildStage, ProviderBuildStage, ResourceTypeBuildStage, InsurerBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_PROVIDER = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long INIT_BIT_INSURER = 0x8L;
    private static final long INIT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_PRE_AUTH_REF_PERIOD = 0x1L;
    private static final long OPT_BIT_DIAGNOSIS = 0x2L;
    private static final long OPT_BIT_FORM_CODE = 0x4L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x8L;
    private static final long OPT_BIT_REFERRAL = 0x10L;
    private static final long OPT_BIT_TOTAL = 0x20L;
    private static final long OPT_BIT_ITEM = 0x40L;
    private static final long OPT_BIT_BILLABLE_PERIOD = 0x80L;
    private static final long OPT_BIT_FUNDS_RESERVE = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_FUNDS_RESERVE_REQUESTED = 0x400L;
    private static final long OPT_BIT_BENEFIT_PERIOD = 0x800L;
    private static final long OPT_BIT_ACCIDENT = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_BENEFIT_BALANCE = 0x4000L;
    private static final long OPT_BIT_FORM = 0x8000L;
    private static final long OPT_BIT_PRECEDENCE = 0x10000L;
    private static final long OPT_BIT_PAYMENT = 0x20000L;
    private static final long OPT_BIT_PAYEE = 0x40000L;
    private static final long OPT_BIT_PROCESS_NOTE = 0x80000L;
    private static final long OPT_BIT_ID = 0x100000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_CONTAINED = 0x800000L;
    private static final long OPT_BIT_CARE_TEAM = 0x1000000L;
    private static final long OPT_BIT_DISPOSITION = 0x2000000L;
    private static final long OPT_BIT_OUTCOME = 0x4000000L;
    private static final long OPT_BIT_CLAIM = 0x8000000L;
    private static final long OPT_BIT_SUB_TYPE = 0x10000000L;
    private static final long OPT_BIT_META = 0x20000000L;
    private static final long OPT_BIT_USE = 0x40000000L;
    private static final long OPT_BIT_CLAIM_RESPONSE = 0x80000000L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x100000000L;
    private static final long OPT_BIT_PROCEDURE = 0x200000000L;
    private static final long OPT_BIT_PRIORITY = 0x400000000L;
    private static final long OPT_BIT_PRESCRIPTION = 0x800000000L;
    private static final long OPT_BIT_TEXT = 0x1000000000L;
    private static final long OPT_BIT_ENTERER = 0x2000000000L;
    private static final long OPT_BIT_EXTENSION = 0x4000000000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000000000L;
    private static final long OPT_BIT_RELATED = 0x10000000000L;
    private static final long OPT_BIT_ADD_ITEM = 0x20000000000L;
    private static final long OPT_BIT_CREATED = 0x40000000000L;
    private static final long OPT_BIT_ORIGINAL_PRESCRIPTION = 0x80000000000L;
    private static final long OPT_BIT_ADJUDICATION = 0x100000000000L;
    private static final long OPT_BIT_FACILITY = 0x200000000000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @Nullable List<Period> preAuthRefPeriod;
    private @Nullable List<ExplanationOfBenefit_Diagnosis> diagnosis;
    private @Nullable CodeableConcept formCode;
    private @Nullable List<ExplanationOfBenefit_SupportingInfo> supportingInfo;
    private @Nullable Reference referral;
    private @Nullable List<ExplanationOfBenefit_Total> total;
    private @Nullable List<ExplanationOfBenefit_Item> item;
    private @Nullable Period billablePeriod;
    private @Nullable CodeableConcept fundsReserve;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference patient;
    private @Nullable CodeableConcept fundsReserveRequested;
    private @Nullable Period benefitPeriod;
    private @Nullable ExplanationOfBenefit_Accident accident;
    private @Nullable Uri implicitRules;
    private @Nullable List<ExplanationOfBenefit_BenefitBalance> benefitBalance;
    private @Nullable Attachment form;
    private @Nullable PositiveInt precedence;
    private @Nullable ExplanationOfBenefit_Payment payment;
    private @Nullable ExplanationOfBenefit_Payee payee;
    private @Nullable List<ExplanationOfBenefit_ProcessNote> processNote;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable ExplanationofbenefitStatus status;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<ExplanationOfBenefit_CareTeam> careTeam;
    private @Nullable String disposition;
    private @Nullable Reference provider;
    private @Nullable Code outcome;
    private @Nullable Reference claim;
    private @Nullable CodeableConcept subType;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable Code use;
    private @Nullable Reference claimResponse;
    private @Nullable List<String> preAuthRef;
    private @Nullable List<ExplanationOfBenefit_Procedure> procedure;
    private @Nullable CodeableConcept priority;
    private @Nullable Reference prescription;
    private @Nullable Narrative text;
    private @Nullable Reference insurer;
    private @Nullable Reference enterer;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable List<ExplanationOfBenefit_Related> related;
    private final List<ExplanationOfBenefit_Insurance> insurance = new ArrayList<ExplanationOfBenefit_Insurance>();
    private @Nullable List<ExplanationOfBenefit_AddItem> addItem;
    private @Nullable DateTime created;
    private @Nullable Reference originalPrescription;
    private @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
    private @Nullable CodeableConcept type;
    private @Nullable Reference facility;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRefPeriod(List<Period> preAuthRefPeriod) {
      checkNotIsSet(preAuthRefPeriodIsSet(), "preAuthRefPeriod");
      this.preAuthRefPeriod = Objects.requireNonNull(preAuthRefPeriod, "preAuthRefPeriod");
      optBits |= OPT_BIT_PRE_AUTH_REF_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAuthRefPeriod")
    public final Builder preAuthRefPeriod(Optional<? extends List<Period>> preAuthRefPeriod) {
      checkNotIsSet(preAuthRefPeriodIsSet(), "preAuthRefPeriod");
      this.preAuthRefPeriod = preAuthRefPeriod.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(List<ExplanationOfBenefit_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosis")
    public final Builder diagnosis(Optional<? extends List<ExplanationOfBenefit_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<ExplanationOfBenefit_SupportingInfo> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<ExplanationOfBenefit_SupportingInfo>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for chained invocation
     */
    public final Builder referral(Reference referral) {
      checkNotIsSet(referralIsSet(), "referral");
      this.referral = Objects.requireNonNull(referral, "referral");
      optBits |= OPT_BIT_REFERRAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referral")
    public final Builder referral(Optional<? extends Reference> referral) {
      checkNotIsSet(referralIsSet(), "referral");
      this.referral = referral.orElse(null);
      optBits |= OPT_BIT_REFERRAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(List<ExplanationOfBenefit_Total> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("total")
    public final Builder total(Optional<? extends List<ExplanationOfBenefit_Total>> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<ExplanationOfBenefit_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<ExplanationOfBenefit_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder billablePeriod(Period billablePeriod) {
      checkNotIsSet(billablePeriodIsSet(), "billablePeriod");
      this.billablePeriod = Objects.requireNonNull(billablePeriod, "billablePeriod");
      optBits |= OPT_BIT_BILLABLE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("billablePeriod")
    public final Builder billablePeriod(Optional<? extends Period> billablePeriod) {
      checkNotIsSet(billablePeriodIsSet(), "billablePeriod");
      this.billablePeriod = billablePeriod.orElse(null);
      optBits |= OPT_BIT_BILLABLE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link ExplanationOfBenefit#patient() patient} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for chained invocation
     */
    public final Builder fundsReserveRequested(CodeableConcept fundsReserveRequested) {
      checkNotIsSet(fundsReserveRequestedIsSet(), "fundsReserveRequested");
      this.fundsReserveRequested = Objects.requireNonNull(fundsReserveRequested, "fundsReserveRequested");
      optBits |= OPT_BIT_FUNDS_RESERVE_REQUESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fundsReserveRequested")
    public final Builder fundsReserveRequested(Optional<? extends CodeableConcept> fundsReserveRequested) {
      checkNotIsSet(fundsReserveRequestedIsSet(), "fundsReserveRequested");
      this.fundsReserveRequested = fundsReserveRequested.orElse(null);
      optBits |= OPT_BIT_FUNDS_RESERVE_REQUESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefitPeriod(Period benefitPeriod) {
      checkNotIsSet(benefitPeriodIsSet(), "benefitPeriod");
      this.benefitPeriod = Objects.requireNonNull(benefitPeriod, "benefitPeriod");
      optBits |= OPT_BIT_BENEFIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("benefitPeriod")
    public final Builder benefitPeriod(Optional<? extends Period> benefitPeriod) {
      checkNotIsSet(benefitPeriodIsSet(), "benefitPeriod");
      this.benefitPeriod = benefitPeriod.orElse(null);
      optBits |= OPT_BIT_BENEFIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    public final Builder accident(ExplanationOfBenefit_Accident accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = Objects.requireNonNull(accident, "accident");
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("accident")
    public final Builder accident(Optional<? extends ExplanationOfBenefit_Accident> accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = accident.orElse(null);
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefitBalance(List<ExplanationOfBenefit_BenefitBalance> benefitBalance) {
      checkNotIsSet(benefitBalanceIsSet(), "benefitBalance");
      this.benefitBalance = Objects.requireNonNull(benefitBalance, "benefitBalance");
      optBits |= OPT_BIT_BENEFIT_BALANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("benefitBalance")
    public final Builder benefitBalance(Optional<? extends List<ExplanationOfBenefit_BenefitBalance>> benefitBalance) {
      checkNotIsSet(benefitBalanceIsSet(), "benefitBalance");
      this.benefitBalance = benefitBalance.orElse(null);
      optBits |= OPT_BIT_BENEFIT_BALANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
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
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
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
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for chained invocation
     */
    public final Builder precedence(PositiveInt precedence) {
      checkNotIsSet(precedenceIsSet(), "precedence");
      this.precedence = Objects.requireNonNull(precedence, "precedence");
      optBits |= OPT_BIT_PRECEDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precedence")
    public final Builder precedence(Optional<? extends PositiveInt> precedence) {
      checkNotIsSet(precedenceIsSet(), "precedence");
      this.precedence = precedence.orElse(null);
      optBits |= OPT_BIT_PRECEDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    public final Builder payment(ExplanationOfBenefit_Payment payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = Objects.requireNonNull(payment, "payment");
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payment")
    public final Builder payment(Optional<? extends ExplanationOfBenefit_Payment> payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = payment.orElse(null);
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    public final Builder payee(ExplanationOfBenefit_Payee payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = Objects.requireNonNull(payee, "payee");
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payee")
    public final Builder payee(Optional<? extends ExplanationOfBenefit_Payee> payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = payee.orElse(null);
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    public final Builder processNote(List<ExplanationOfBenefit_ProcessNote> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = Objects.requireNonNull(processNote, "processNote");
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("processNote")
    public final Builder processNote(Optional<? extends List<ExplanationOfBenefit_ProcessNote>> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = processNote.orElse(null);
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ExplanationofbenefitStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ExplanationofbenefitStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
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
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
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
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeam(List<ExplanationOfBenefit_CareTeam> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = Objects.requireNonNull(careTeam, "careTeam");
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("careTeam")
    public final Builder careTeam(Optional<? extends List<ExplanationOfBenefit_CareTeam>> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = careTeam.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
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
     * Initializes the value for the {@link ExplanationOfBenefit#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      initBits &= ~INIT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
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
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
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
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for chained invocation
     */
    public final Builder claim(Reference claim) {
      checkNotIsSet(claimIsSet(), "claim");
      this.claim = Objects.requireNonNull(claim, "claim");
      optBits |= OPT_BIT_CLAIM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("claim")
    public final Builder claim(Optional<? extends Reference> claim) {
      checkNotIsSet(claimIsSet(), "claim");
      this.claim = claim.orElse(null);
      optBits |= OPT_BIT_CLAIM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
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
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
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
     * Initializes the value for the {@link ExplanationOfBenefit#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
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
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
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
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
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
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
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
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder claimResponse(Reference claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = Objects.requireNonNull(claimResponse, "claimResponse");
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("claimResponse")
    public final Builder claimResponse(Optional<? extends Reference> claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = claimResponse.orElse(null);
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(List<String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAuthRef")
    public final Builder preAuthRef(Optional<? extends List<String>> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(List<ExplanationOfBenefit_Procedure> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedure")
    public final Builder procedure(Optional<? extends List<ExplanationOfBenefit_Procedure>> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder prescription(Reference prescription) {
      checkNotIsSet(prescriptionIsSet(), "prescription");
      this.prescription = Objects.requireNonNull(prescription, "prescription");
      optBits |= OPT_BIT_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prescription")
    public final Builder prescription(Optional<? extends Reference> prescription) {
      checkNotIsSet(prescriptionIsSet(), "prescription");
      this.prescription = prescription.orElse(null);
      optBits |= OPT_BIT_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
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
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
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
     * Initializes the value for the {@link ExplanationOfBenefit#insurer() insurer} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    public final Builder enterer(Reference enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = Objects.requireNonNull(enterer, "enterer");
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enterer")
    public final Builder enterer(Optional<? extends Reference> enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = enterer.orElse(null);
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
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
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
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
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(List<ExplanationOfBenefit_Related> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("related")
    public final Builder related(Optional<? extends List<ExplanationOfBenefit_Related>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Adds one element to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(ExplanationOfBenefit_Insurance element) {
      this.insurance.add(Objects.requireNonNull(element, "insurance element"));
      return this;
    }

    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(ExplanationOfBenefit_Insurance... elements) {
      for (ExplanationOfBenefit_Insurance element : elements) {
        this.insurance.add(Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInsurance(Iterable<? extends ExplanationOfBenefit_Insurance> elements) {
      for (ExplanationOfBenefit_Insurance element : elements) {
        this.insurance.add(Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder addItem(List<ExplanationOfBenefit_AddItem> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = Objects.requireNonNull(addItem, "addItem");
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addItem")
    public final Builder addItem(Optional<? extends List<ExplanationOfBenefit_AddItem>> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = addItem.orElse(null);
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
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
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
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
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder originalPrescription(Reference originalPrescription) {
      checkNotIsSet(originalPrescriptionIsSet(), "originalPrescription");
      this.originalPrescription = Objects.requireNonNull(originalPrescription, "originalPrescription");
      optBits |= OPT_BIT_ORIGINAL_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("originalPrescription")
    public final Builder originalPrescription(Optional<? extends Reference> originalPrescription) {
      checkNotIsSet(originalPrescriptionIsSet(), "originalPrescription");
      this.originalPrescription = originalPrescription.orElse(null);
      optBits |= OPT_BIT_ORIGINAL_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(List<ExplanationOfBenefit_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjudication")
    public final Builder adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit#type() type} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    public final Builder facility(Reference facility) {
      checkNotIsSet(facilityIsSet(), "facility");
      this.facility = Objects.requireNonNull(facility, "facility");
      optBits |= OPT_BIT_FACILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("facility")
    public final Builder facility(Optional<? extends Reference> facility) {
      checkNotIsSet(facilityIsSet(), "facility");
      this.facility = facility.orElse(null);
      optBits |= OPT_BIT_FACILITY;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit ExplanationOfBenefit}.
     * @return An immutable instance of ExplanationOfBenefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit(
          preAuthRefPeriod,
          diagnosis,
          formCode,
          supportingInfo,
          referral,
          total,
          item,
          billablePeriod,
          fundsReserve,
          identifier,
          patient,
          fundsReserveRequested,
          benefitPeriod,
          accident,
          implicitRules,
          benefitBalance,
          form,
          precedence,
          payment,
          payee,
          processNote,
          id,
          modifierExtension,
          status,
          contained,
          careTeam,
          disposition,
          provider,
          outcome,
          claim,
          subType,
          resourceType,
          meta,
          use,
          claimResponse,
          preAuthRef,
          procedure,
          priority,
          prescription,
          text,
          insurer,
          enterer,
          extension,
          language,
          related,
          createUnmodifiableList(true, insurance),
          addItem,
          created,
          originalPrescription,
          adjudication,
          type,
          facility);
    }

    private boolean preAuthRefPeriodIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF_PERIOD) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean formCodeIsSet() {
      return (optBits & OPT_BIT_FORM_CODE) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean referralIsSet() {
      return (optBits & OPT_BIT_REFERRAL) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean billablePeriodIsSet() {
      return (optBits & OPT_BIT_BILLABLE_PERIOD) != 0;
    }

    private boolean fundsReserveIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean fundsReserveRequestedIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE_REQUESTED) != 0;
    }

    private boolean benefitPeriodIsSet() {
      return (optBits & OPT_BIT_BENEFIT_PERIOD) != 0;
    }

    private boolean accidentIsSet() {
      return (optBits & OPT_BIT_ACCIDENT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean benefitBalanceIsSet() {
      return (optBits & OPT_BIT_BENEFIT_BALANCE) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean precedenceIsSet() {
      return (optBits & OPT_BIT_PRECEDENCE) != 0;
    }

    private boolean paymentIsSet() {
      return (optBits & OPT_BIT_PAYMENT) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean processNoteIsSet() {
      return (optBits & OPT_BIT_PROCESS_NOTE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean careTeamIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean claimIsSet() {
      return (optBits & OPT_BIT_CLAIM) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean claimResponseIsSet() {
      return (optBits & OPT_BIT_CLAIM_RESPONSE) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean prescriptionIsSet() {
      return (optBits & OPT_BIT_PRESCRIPTION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean addItemIsSet() {
      return (optBits & OPT_BIT_ADD_ITEM) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean originalPrescriptionIsSet() {
      return (optBits & OPT_BIT_ORIGINAL_PRESCRIPTION) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!providerIsSet()) attributes.add("provider");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!insurerIsSet()) attributes.add("insurer");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build ExplanationOfBenefit, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ProviderBuildStage patient(Reference patient);
  }

  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage provider(Reference provider);
  }

  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    InsurerBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage insurer(Reference insurer);
  }

  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRefPeriod(List<Period> preAuthRefPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRefPeriod(Optional<? extends List<Period>> preAuthRefPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(List<ExplanationOfBenefit_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(Optional<? extends List<ExplanationOfBenefit_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal formCode(CodeableConcept formCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal formCode(Optional<? extends CodeableConcept> formCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<ExplanationOfBenefit_SupportingInfo> supportingInfo);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<ExplanationOfBenefit_SupportingInfo>> supportingInfo);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referral(Reference referral);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referral(Optional<? extends Reference> referral);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(List<ExplanationOfBenefit_Total> total);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(Optional<? extends List<ExplanationOfBenefit_Total>> total);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<ExplanationOfBenefit_Item> item);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<ExplanationOfBenefit_Item>> item);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal billablePeriod(Period billablePeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal billablePeriod(Optional<? extends Period> billablePeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserve(CodeableConcept fundsReserve);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserve(Optional<? extends CodeableConcept> fundsReserve);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserveRequested(CodeableConcept fundsReserveRequested);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserveRequested(Optional<? extends CodeableConcept> fundsReserveRequested);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal benefitPeriod(Period benefitPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal benefitPeriod(Optional<? extends Period> benefitPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accident(ExplanationOfBenefit_Accident accident);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accident(Optional<? extends ExplanationOfBenefit_Accident> accident);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal benefitBalance(List<ExplanationOfBenefit_BenefitBalance> benefitBalance);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal benefitBalance(Optional<? extends List<ExplanationOfBenefit_BenefitBalance>> benefitBalance);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(Attachment form);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(Optional<? extends Attachment> form);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal precedence(PositiveInt precedence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal precedence(Optional<? extends PositiveInt> precedence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payment(ExplanationOfBenefit_Payment payment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payment(Optional<? extends ExplanationOfBenefit_Payment> payment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(ExplanationOfBenefit_Payee payee);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(Optional<? extends ExplanationOfBenefit_Payee> payee);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processNote(List<ExplanationOfBenefit_ProcessNote> processNote);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processNote(Optional<? extends List<ExplanationOfBenefit_ProcessNote>> processNote);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ExplanationofbenefitStatus status);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ExplanationofbenefitStatus> status);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeam(List<ExplanationOfBenefit_CareTeam> careTeam);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeam(Optional<? extends List<ExplanationOfBenefit_CareTeam>> careTeam);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(String disposition);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(Optional<String> disposition);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(Code outcome);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends Code> outcome);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claim(Reference claim);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claim(Optional<? extends Reference> claim);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(CodeableConcept subType);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(Optional<? extends CodeableConcept> subType);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(Code use);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(Optional<? extends Code> use);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claimResponse(Reference claimResponse);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claimResponse(Optional<? extends Reference> claimResponse);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(List<String> preAuthRef);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(Optional<? extends List<String>> preAuthRef);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedure(List<ExplanationOfBenefit_Procedure> procedure);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedure(Optional<? extends List<ExplanationOfBenefit_Procedure>> procedure);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(CodeableConcept priority);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends CodeableConcept> priority);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prescription(Reference prescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prescription(Optional<? extends Reference> prescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(Reference enterer);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(Optional<? extends Reference> enterer);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    BuildFinal related(List<ExplanationOfBenefit_Related> related);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal related(Optional<? extends List<ExplanationOfBenefit_Related>> related);

    /**
     * Adds one element to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(ExplanationOfBenefit_Insurance element);

    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(ExplanationOfBenefit_Insurance... elements);

    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllInsurance(Iterable<? extends ExplanationOfBenefit_Insurance> elements);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addItem(List<ExplanationOfBenefit_AddItem> addItem);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(Optional<? extends List<ExplanationOfBenefit_AddItem>> addItem);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal originalPrescription(Reference originalPrescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal originalPrescription(Optional<? extends Reference> originalPrescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(List<ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal facility(Reference facility);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal facility(Optional<? extends Reference> facility);

    /**
     * Builds a new {@link ExplanationOfBenefit ExplanationOfBenefit}.
     * @return An immutable instance of ExplanationOfBenefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
