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
 * Immutable implementation of {@link Claim}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim.builder()}.
 */
@Generated(from = "Claim", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim implements Claim {
  private final @Nullable Reference prescription;
  private final @Nullable Money total;
  private final @Nullable DateTime created;
  private final @Nullable List<Claim_SupportingInfo> supportingInfo;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept fundsReserve;
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Period billablePeriod;
  private final @Nullable List<Claim_Diagnosis> diagnosis;
  private final @Nullable Code status;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Claim_Item> item;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference facility;
  private final @Nullable ClaimUse use;
  private final @Nullable Claim_Accident accident;
  private final @Nullable List<Claim_CareTeam> careTeam;
  private final @Nullable Code language;
  private final @Nullable List<Claim_Related> related;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept priority;
  private final @Nullable Claim_Payee payee;
  private final @Nullable Reference referral;
  private final CodeableConcept type;
  private final @Nullable Reference enterer;
  private final @Nullable CodeableConcept subType;
  private final Reference provider;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable Reference originalPrescription;
  private final List<Claim_Insurance> insurance;
  private final @Nullable Meta meta;
  private final Reference patient;
  private final @Nullable Reference insurer;
  private final @Nullable List<Claim_Procedure> procedure;

  private ImmutableClaim(
      @Nullable Reference prescription,
      @Nullable Money total,
      @Nullable DateTime created,
      @Nullable List<Claim_SupportingInfo> supportingInfo,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept fundsReserve,
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      @Nullable Period billablePeriod,
      @Nullable List<Claim_Diagnosis> diagnosis,
      @Nullable Code status,
      @Nullable List<Identifier> identifier,
      @Nullable List<Claim_Item> item,
      @Nullable Uri implicitRules,
      @Nullable Reference facility,
      @Nullable ClaimUse use,
      @Nullable Claim_Accident accident,
      @Nullable List<Claim_CareTeam> careTeam,
      @Nullable Code language,
      @Nullable List<Claim_Related> related,
      @Nullable List<Extension> extension,
      CodeableConcept priority,
      @Nullable Claim_Payee payee,
      @Nullable Reference referral,
      CodeableConcept type,
      @Nullable Reference enterer,
      @Nullable CodeableConcept subType,
      Reference provider,
      String resourceType,
      @Nullable Id id,
      @Nullable Reference originalPrescription,
      List<Claim_Insurance> insurance,
      @Nullable Meta meta,
      Reference patient,
      @Nullable Reference insurer,
      @Nullable List<Claim_Procedure> procedure) {
    this.prescription = prescription;
    this.total = total;
    this.created = created;
    this.supportingInfo = supportingInfo;
    this.modifierExtension = modifierExtension;
    this.fundsReserve = fundsReserve;
    this.text = text;
    this.contained = contained;
    this.billablePeriod = billablePeriod;
    this.diagnosis = diagnosis;
    this.status = status;
    this.identifier = identifier;
    this.item = item;
    this.implicitRules = implicitRules;
    this.facility = facility;
    this.use = use;
    this.accident = accident;
    this.careTeam = careTeam;
    this.language = language;
    this.related = related;
    this.extension = extension;
    this.priority = priority;
    this.payee = payee;
    this.referral = referral;
    this.type = type;
    this.enterer = enterer;
    this.subType = subType;
    this.provider = provider;
    this.resourceType = resourceType;
    this.id = id;
    this.originalPrescription = originalPrescription;
    this.insurance = insurance;
    this.meta = meta;
    this.patient = patient;
    this.insurer = insurer;
    this.procedure = procedure;
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
   * @return The value of the {@code total} attribute
   */
  @JsonProperty("total")
  @Override
  public Optional<Money> total() {
    return Optional.ofNullable(total);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<Claim_SupportingInfo>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
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
   * @return The value of the {@code fundsReserve} attribute
   */
  @JsonProperty("fundsReserve")
  @Override
  public Optional<CodeableConcept> fundsReserve() {
    return Optional.ofNullable(fundsReserve);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code diagnosis} attribute
   */
  @JsonProperty("diagnosis")
  @Override
  public Optional<List<Claim_Diagnosis>> diagnosis() {
    return Optional.ofNullable(diagnosis);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<Claim_Item>> item() {
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
   * @return The value of the {@code facility} attribute
   */
  @JsonProperty("facility")
  @Override
  public Optional<Reference> facility() {
    return Optional.ofNullable(facility);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<ClaimUse> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code accident} attribute
   */
  @JsonProperty("accident")
  @Override
  public Optional<Claim_Accident> accident() {
    return Optional.ofNullable(accident);
  }

  /**
   * @return The value of the {@code careTeam} attribute
   */
  @JsonProperty("careTeam")
  @Override
  public Optional<List<Claim_CareTeam>> careTeam() {
    return Optional.ofNullable(careTeam);
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
  public Optional<List<Claim_Related>> related() {
    return Optional.ofNullable(related);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public CodeableConcept priority() {
    return priority;
  }

  /**
   * @return The value of the {@code payee} attribute
   */
  @JsonProperty("payee")
  @Override
  public Optional<Claim_Payee> payee() {
    return Optional.ofNullable(payee);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code subType} attribute
   */
  @JsonProperty("subType")
  @Override
  public Optional<CodeableConcept> subType() {
    return Optional.ofNullable(subType);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code originalPrescription} attribute
   */
  @JsonProperty("originalPrescription")
  @Override
  public Optional<Reference> originalPrescription() {
    return Optional.ofNullable(originalPrescription);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public List<Claim_Insurance> insurance() {
    return insurance;
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
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code insurer} attribute
   */
  @JsonProperty("insurer")
  @Override
  public Optional<Reference> insurer() {
    return Optional.ofNullable(insurer);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @JsonProperty("procedure")
  @Override
  public Optional<List<Claim_Procedure>> procedure() {
    return Optional.ofNullable(procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#prescription() prescription} attribute.
   * @param value The value for prescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withPrescription(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "prescription");
    if (this.prescription == newValue) return this;
    return new ImmutableClaim(
        newValue,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#prescription() prescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withPrescription(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.prescription == value) return this;
    return new ImmutableClaim(
        value,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withTotal(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        newValue,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withTotal(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableClaim(
        this.prescription,
        value,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        newValue,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        value,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withSupportingInfo(List<Claim_SupportingInfo> value) {
    @Nullable List<Claim_SupportingInfo> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        newValue,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withSupportingInfo(Optional<? extends List<Claim_SupportingInfo>> optional) {
    @Nullable List<Claim_SupportingInfo> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        value,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        newValue,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        value,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#fundsReserve() fundsReserve} attribute.
   * @param value The value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withFundsReserve(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fundsReserve");
    if (this.fundsReserve == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        newValue,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#fundsReserve() fundsReserve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withFundsReserve(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fundsReserve == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        value,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        newValue,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        value,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        newValue,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        value,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#billablePeriod() billablePeriod} attribute.
   * @param value The value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withBillablePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "billablePeriod");
    if (this.billablePeriod == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        newValue,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#billablePeriod() billablePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withBillablePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.billablePeriod == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        value,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withDiagnosis(List<Claim_Diagnosis> value) {
    @Nullable List<Claim_Diagnosis> newValue = Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        newValue,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withDiagnosis(Optional<? extends List<Claim_Diagnosis>> optional) {
    @Nullable List<Claim_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        value,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        newValue,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        value,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        newValue,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        value,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withItem(List<Claim_Item> value) {
    @Nullable List<Claim_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        newValue,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withItem(Optional<? extends List<Claim_Item>> optional) {
    @Nullable List<Claim_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        value,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        newValue,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        value,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withFacility(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        newValue,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withFacility(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        value,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withUse(ClaimUse value) {
    @Nullable ClaimUse newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        newValue,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withUse(Optional<? extends ClaimUse> optional) {
    @Nullable ClaimUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        value,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#accident() accident} attribute.
   * @param value The value for accident
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withAccident(Claim_Accident value) {
    @Nullable Claim_Accident newValue = Objects.requireNonNull(value, "accident");
    if (this.accident == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        newValue,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#accident() accident} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accident
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withAccident(Optional<? extends Claim_Accident> optional) {
    @Nullable Claim_Accident value = optional.orElse(null);
    if (this.accident == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        value,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#careTeam() careTeam} attribute.
   * @param value The value for careTeam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withCareTeam(List<Claim_CareTeam> value) {
    @Nullable List<Claim_CareTeam> newValue = Objects.requireNonNull(value, "careTeam");
    if (this.careTeam == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        newValue,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#careTeam() careTeam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withCareTeam(Optional<? extends List<Claim_CareTeam>> optional) {
    @Nullable List<Claim_CareTeam> value = optional.orElse(null);
    if (this.careTeam == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        value,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        newValue,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        value,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withRelated(List<Claim_Related> value) {
    @Nullable List<Claim_Related> newValue = Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        newValue,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withRelated(Optional<? extends List<Claim_Related>> optional) {
    @Nullable List<Claim_Related> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        value,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        newValue,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        value,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#priority() priority} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for priority
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withPriority(CodeableConcept value) {
    if (this.priority == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "priority");
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        newValue,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withPayee(Claim_Payee value) {
    @Nullable Claim_Payee newValue = Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        newValue,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withPayee(Optional<? extends Claim_Payee> optional) {
    @Nullable Claim_Payee value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        value,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#referral() referral} attribute.
   * @param value The value for referral
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withReferral(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "referral");
    if (this.referral == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        newValue,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#referral() referral} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referral
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withReferral(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.referral == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        value,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        newValue,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withEnterer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        newValue,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withEnterer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        value,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withSubType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        newValue,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withSubType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        value,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#provider() provider} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provider
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withProvider(Reference value) {
    if (this.provider == value) return this;
    Reference newValue = Objects.requireNonNull(value, "provider");
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        newValue,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        newValue,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        newValue,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        value,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#originalPrescription() originalPrescription} attribute.
   * @param value The value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withOriginalPrescription(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "originalPrescription");
    if (this.originalPrescription == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        newValue,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#originalPrescription() originalPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withOriginalPrescription(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.originalPrescription == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        value,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Claim#insurance() insurance}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withInsurance(Claim_Insurance... elements) {
    List<Claim_Insurance> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        newValue,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Claim#insurance() insurance}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of insurance elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withInsurance(Iterable<? extends Claim_Insurance> elements) {
    if (this.insurance == elements) return this;
    List<Claim_Insurance> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        newValue,
        this.meta,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        newValue,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        value,
        this.patient,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        newValue,
        this.insurer,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#insurer() insurer} attribute.
   * @param value The value for insurer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withInsurer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "insurer");
    if (this.insurer == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        newValue,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#insurer() insurer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withInsurer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.insurer == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        value,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withProcedure(List<Claim_Procedure> value) {
    @Nullable List<Claim_Procedure> newValue = Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withProcedure(Optional<? extends List<Claim_Procedure>> optional) {
    @Nullable List<Claim_Procedure> value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableClaim(
        this.prescription,
        this.total,
        this.created,
        this.supportingInfo,
        this.modifierExtension,
        this.fundsReserve,
        this.text,
        this.contained,
        this.billablePeriod,
        this.diagnosis,
        this.status,
        this.identifier,
        this.item,
        this.implicitRules,
        this.facility,
        this.use,
        this.accident,
        this.careTeam,
        this.language,
        this.related,
        this.extension,
        this.priority,
        this.payee,
        this.referral,
        this.type,
        this.enterer,
        this.subType,
        this.provider,
        this.resourceType,
        this.id,
        this.originalPrescription,
        this.insurance,
        this.meta,
        this.patient,
        this.insurer,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim
        && equalTo((ImmutableClaim) another);
  }

  private boolean equalTo(ImmutableClaim another) {
    return Objects.equals(prescription, another.prescription)
        && Objects.equals(total, another.total)
        && Objects.equals(created, another.created)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(fundsReserve, another.fundsReserve)
        && Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && Objects.equals(billablePeriod, another.billablePeriod)
        && Objects.equals(diagnosis, another.diagnosis)
        && Objects.equals(status, another.status)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(item, another.item)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(facility, another.facility)
        && Objects.equals(use, another.use)
        && Objects.equals(accident, another.accident)
        && Objects.equals(careTeam, another.careTeam)
        && Objects.equals(language, another.language)
        && Objects.equals(related, another.related)
        && Objects.equals(extension, another.extension)
        && priority.equals(another.priority)
        && Objects.equals(payee, another.payee)
        && Objects.equals(referral, another.referral)
        && type.equals(another.type)
        && Objects.equals(enterer, another.enterer)
        && Objects.equals(subType, another.subType)
        && provider.equals(another.provider)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(originalPrescription, another.originalPrescription)
        && insurance.equals(another.insurance)
        && Objects.equals(meta, another.meta)
        && patient.equals(another.patient)
        && Objects.equals(insurer, another.insurer)
        && Objects.equals(procedure, another.procedure);
  }

  /**
   * Computes a hash code from attributes: {@code prescription}, {@code total}, {@code created}, {@code supportingInfo}, {@code modifierExtension}, {@code fundsReserve}, {@code text}, {@code contained}, {@code billablePeriod}, {@code diagnosis}, {@code status}, {@code identifier}, {@code item}, {@code implicitRules}, {@code facility}, {@code use}, {@code accident}, {@code careTeam}, {@code language}, {@code related}, {@code extension}, {@code priority}, {@code payee}, {@code referral}, {@code type}, {@code enterer}, {@code subType}, {@code provider}, {@code resourceType}, {@code id}, {@code originalPrescription}, {@code insurance}, {@code meta}, {@code patient}, {@code insurer}, {@code procedure}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(prescription);
    h += (h << 5) + Objects.hashCode(total);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(fundsReserve);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(billablePeriod);
    h += (h << 5) + Objects.hashCode(diagnosis);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(facility);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(accident);
    h += (h << 5) + Objects.hashCode(careTeam);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(related);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + priority.hashCode();
    h += (h << 5) + Objects.hashCode(payee);
    h += (h << 5) + Objects.hashCode(referral);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(enterer);
    h += (h << 5) + Objects.hashCode(subType);
    h += (h << 5) + provider.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(originalPrescription);
    h += (h << 5) + insurance.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(insurer);
    h += (h << 5) + Objects.hashCode(procedure);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim{");
    if (prescription != null) {
      builder.append("prescription=").append(prescription);
    }
    if (total != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("total=").append(total);
    }
    if (created != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("created=").append(created);
    }
    if (supportingInfo != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (modifierExtension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (fundsReserve != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("fundsReserve=").append(fundsReserve);
    }
    if (text != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (billablePeriod != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("billablePeriod=").append(billablePeriod);
    }
    if (diagnosis != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (status != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifier != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (item != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (implicitRules != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (facility != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("facility=").append(facility);
    }
    if (use != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (accident != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("accident=").append(accident);
    }
    if (careTeam != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("careTeam=").append(careTeam);
    }
    if (language != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (related != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("related=").append(related);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 6) builder.append(", ");
    builder.append("priority=").append(priority);
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (referral != null) {
      builder.append(", ");
      builder.append("referral=").append(referral);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    builder.append(", ");
    builder.append("provider=").append(provider);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (originalPrescription != null) {
      builder.append(", ");
      builder.append("originalPrescription=").append(originalPrescription);
    }
    builder.append(", ");
    builder.append("insurance=").append(insurance);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (insurer != null) {
      builder.append(", ");
      builder.append("insurer=").append(insurer);
    }
    if (procedure != null) {
      builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim {
    @Nullable Optional<Reference> prescription = Optional.empty();
    boolean prescriptionIsSet;
    @Nullable Optional<Money> total = Optional.empty();
    boolean totalIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<List<Claim_SupportingInfo>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> fundsReserve = Optional.empty();
    boolean fundsReserveIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Period> billablePeriod = Optional.empty();
    boolean billablePeriodIsSet;
    @Nullable Optional<List<Claim_Diagnosis>> diagnosis = Optional.empty();
    boolean diagnosisIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Claim_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> facility = Optional.empty();
    boolean facilityIsSet;
    @Nullable Optional<ClaimUse> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<Claim_Accident> accident = Optional.empty();
    boolean accidentIsSet;
    @Nullable Optional<List<Claim_CareTeam>> careTeam = Optional.empty();
    boolean careTeamIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Claim_Related>> related = Optional.empty();
    boolean relatedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept priority;
    @Nullable Optional<Claim_Payee> payee = Optional.empty();
    boolean payeeIsSet;
    @Nullable Optional<Reference> referral = Optional.empty();
    boolean referralIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Reference> enterer = Optional.empty();
    boolean entererIsSet;
    @Nullable Optional<CodeableConcept> subType = Optional.empty();
    boolean subTypeIsSet;
    @Nullable Reference provider;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> originalPrescription = Optional.empty();
    boolean originalPrescriptionIsSet;
    @Nullable List<Claim_Insurance> insurance = Collections.emptyList();
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Reference patient;
    @Nullable Optional<Reference> insurer = Optional.empty();
    boolean insurerIsSet;
    @Nullable Optional<List<Claim_Procedure>> procedure = Optional.empty();
    boolean procedureIsSet;
    @JsonProperty("prescription")
    public void setPrescription(Optional<Reference> prescription) {
      this.prescription = prescription;
      this.prescriptionIsSet = true;
    }
    @JsonProperty("total")
    public void setTotal(Optional<Money> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<Claim_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("fundsReserve")
    public void setFundsReserve(Optional<CodeableConcept> fundsReserve) {
      this.fundsReserve = fundsReserve;
      this.fundsReserveIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("billablePeriod")
    public void setBillablePeriod(Optional<Period> billablePeriod) {
      this.billablePeriod = billablePeriod;
      this.billablePeriodIsSet = true;
    }
    @JsonProperty("diagnosis")
    public void setDiagnosis(Optional<List<Claim_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<Claim_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("facility")
    public void setFacility(Optional<Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<ClaimUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("accident")
    public void setAccident(Optional<Claim_Accident> accident) {
      this.accident = accident;
      this.accidentIsSet = true;
    }
    @JsonProperty("careTeam")
    public void setCareTeam(Optional<List<Claim_CareTeam>> careTeam) {
      this.careTeam = careTeam;
      this.careTeamIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("related")
    public void setRelated(Optional<List<Claim_Related>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(CodeableConcept priority) {
      this.priority = priority;
    }
    @JsonProperty("payee")
    public void setPayee(Optional<Claim_Payee> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @JsonProperty("referral")
    public void setReferral(Optional<Reference> referral) {
      this.referral = referral;
      this.referralIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("enterer")
    public void setEnterer(Optional<Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @JsonProperty("subType")
    public void setSubType(Optional<CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
      this.provider = provider;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("originalPrescription")
    public void setOriginalPrescription(Optional<Reference> originalPrescription) {
      this.originalPrescription = originalPrescription;
      this.originalPrescriptionIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(List<Claim_Insurance> insurance) {
      this.insurance = insurance;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("insurer")
    public void setInsurer(Optional<Reference> insurer) {
      this.insurer = insurer;
      this.insurerIsSet = true;
    }
    @JsonProperty("procedure")
    public void setProcedure(Optional<List<Claim_Procedure>> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @Override
    public Optional<Reference> prescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> total() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Claim_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> fundsReserve() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> billablePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Claim_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Claim_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ClaimUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Claim_Accident> accident() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Claim_CareTeam>> careTeam() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Claim_Related>> related() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Claim_Payee> payee() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> referral() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public Reference provider() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> originalPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public List<Claim_Insurance> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Claim_Procedure>> procedure() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaim fromJson(Json json) {
    ImmutableClaim.Builder builder = ((ImmutableClaim.Builder) ImmutableClaim.builder());
    if (json.prescriptionIsSet) {
      builder.prescription(json.prescription);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.fundsReserveIsSet) {
      builder.fundsReserve(json.fundsReserve);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.billablePeriodIsSet) {
      builder.billablePeriod(json.billablePeriod);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.accidentIsSet) {
      builder.accident(json.accident);
    }
    if (json.careTeamIsSet) {
      builder.careTeam(json.careTeam);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.priority != null) {
      builder.priority(json.priority);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.referralIsSet) {
      builder.referral(json.referral);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.provider != null) {
      builder.provider(json.provider);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.originalPrescriptionIsSet) {
      builder.originalPrescription(json.originalPrescription);
    }
    if (json.insurance != null) {
      builder.addAllInsurance(json.insurance);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.insurerIsSet) {
      builder.insurer(json.insurer);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    return (ImmutableClaim) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim instance
   */
  public static Claim copyOf(Claim instance) {
    if (instance instanceof ImmutableClaim) {
      return (ImmutableClaim) instance;
    }
    return ((ImmutableClaim.Builder) ImmutableClaim.builder())
        .prescription(instance.prescription())
        .total(instance.total())
        .created(instance.created())
        .supportingInfo(instance.supportingInfo())
        .modifierExtension(instance.modifierExtension())
        .fundsReserve(instance.fundsReserve())
        .text(instance.text())
        .contained(instance.contained())
        .billablePeriod(instance.billablePeriod())
        .diagnosis(instance.diagnosis())
        .status(instance.status())
        .identifier(instance.identifier())
        .item(instance.item())
        .implicitRules(instance.implicitRules())
        .facility(instance.facility())
        .use(instance.use())
        .accident(instance.accident())
        .careTeam(instance.careTeam())
        .language(instance.language())
        .related(instance.related())
        .extension(instance.extension())
        .priority(instance.priority())
        .payee(instance.payee())
        .referral(instance.referral())
        .type(instance.type())
        .enterer(instance.enterer())
        .subType(instance.subType())
        .provider(instance.provider())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .originalPrescription(instance.originalPrescription())
        .addAllInsurance(instance.insurance())
        .meta(instance.meta())
        .patient(instance.patient())
        .insurer(instance.insurer())
        .procedure(instance.procedure())
        .build();
  }

  /**
   * Creates a builder for {@link Claim Claim}.
   * <pre>
   * ImmutableClaim.builder()
   *    .prescription(com.medplum.types.fhir.Reference) // optional {@link Claim#prescription() prescription}
   *    .total(com.medplum.types.fhir.Money) // optional {@link Claim#total() total}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link Claim#created() created}
   *    .supportingInfo(List&amp;lt;com.medplum.types.fhir.Claim_SupportingInfo&amp;gt;) // optional {@link Claim#supportingInfo() supportingInfo}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Claim#modifierExtension() modifierExtension}
   *    .fundsReserve(com.medplum.types.fhir.CodeableConcept) // optional {@link Claim#fundsReserve() fundsReserve}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Claim#text() text}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Claim#contained() contained}
   *    .billablePeriod(com.medplum.types.fhir.Period) // optional {@link Claim#billablePeriod() billablePeriod}
   *    .diagnosis(List&amp;lt;com.medplum.types.fhir.Claim_Diagnosis&amp;gt;) // optional {@link Claim#diagnosis() diagnosis}
   *    .status(com.medplum.types.fhir.Code) // optional {@link Claim#status() status}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Claim#identifier() identifier}
   *    .item(List&amp;lt;com.medplum.types.fhir.Claim_Item&amp;gt;) // optional {@link Claim#item() item}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Claim#implicitRules() implicitRules}
   *    .facility(com.medplum.types.fhir.Reference) // optional {@link Claim#facility() facility}
   *    .use(com.medplum.types.fhir.ClaimUse) // optional {@link Claim#use() use}
   *    .accident(com.medplum.types.fhir.Claim_Accident) // optional {@link Claim#accident() accident}
   *    .careTeam(List&amp;lt;com.medplum.types.fhir.Claim_CareTeam&amp;gt;) // optional {@link Claim#careTeam() careTeam}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Claim#language() language}
   *    .related(List&amp;lt;com.medplum.types.fhir.Claim_Related&amp;gt;) // optional {@link Claim#related() related}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Claim#extension() extension}
   *    .priority(com.medplum.types.fhir.CodeableConcept) // required {@link Claim#priority() priority}
   *    .payee(com.medplum.types.fhir.Claim_Payee) // optional {@link Claim#payee() payee}
   *    .referral(com.medplum.types.fhir.Reference) // optional {@link Claim#referral() referral}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link Claim#type() type}
   *    .enterer(com.medplum.types.fhir.Reference) // optional {@link Claim#enterer() enterer}
   *    .subType(com.medplum.types.fhir.CodeableConcept) // optional {@link Claim#subType() subType}
   *    .provider(com.medplum.types.fhir.Reference) // required {@link Claim#provider() provider}
   *    .resourceType(String) // required {@link Claim#resourceType() resourceType}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Claim#id() id}
   *    .originalPrescription(com.medplum.types.fhir.Reference) // optional {@link Claim#originalPrescription() originalPrescription}
   *    .addInsurance|addAllInsurance(com.medplum.types.fhir.Claim_Insurance) // {@link Claim#insurance() insurance} elements
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Claim#meta() meta}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link Claim#patient() patient}
   *    .insurer(com.medplum.types.fhir.Reference) // optional {@link Claim#insurer() insurer}
   *    .procedure(List&amp;lt;com.medplum.types.fhir.Claim_Procedure&amp;gt;) // optional {@link Claim#procedure() procedure}
   *    .build();
   * </pre>
   * @return A new Claim builder
   */
  public static PriorityBuildStage builder() {
    return new ImmutableClaim.Builder();
  }

  /**
   * Builds instances of type {@link Claim Claim}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements PriorityBuildStage, TypeBuildStage, ProviderBuildStage, ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_PRIORITY = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_PROVIDER = 0x4L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long INIT_BIT_PATIENT = 0x10L;
    private static final long OPT_BIT_PRESCRIPTION = 0x1L;
    private static final long OPT_BIT_TOTAL = 0x2L;
    private static final long OPT_BIT_CREATED = 0x4L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_FUNDS_RESERVE = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_BILLABLE_PERIOD = 0x100L;
    private static final long OPT_BIT_DIAGNOSIS = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_ITEM = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_FACILITY = 0x4000L;
    private static final long OPT_BIT_USE = 0x8000L;
    private static final long OPT_BIT_ACCIDENT = 0x10000L;
    private static final long OPT_BIT_CARE_TEAM = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_RELATED = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_PAYEE = 0x200000L;
    private static final long OPT_BIT_REFERRAL = 0x400000L;
    private static final long OPT_BIT_ENTERER = 0x800000L;
    private static final long OPT_BIT_SUB_TYPE = 0x1000000L;
    private static final long OPT_BIT_ID = 0x2000000L;
    private static final long OPT_BIT_ORIGINAL_PRESCRIPTION = 0x4000000L;
    private static final long OPT_BIT_META = 0x8000000L;
    private static final long OPT_BIT_INSURER = 0x10000000L;
    private static final long OPT_BIT_PROCEDURE = 0x20000000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @Nullable Reference prescription;
    private @Nullable Money total;
    private @Nullable DateTime created;
    private @Nullable List<Claim_SupportingInfo> supportingInfo;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept fundsReserve;
    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable Period billablePeriod;
    private @Nullable List<Claim_Diagnosis> diagnosis;
    private @Nullable Code status;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Claim_Item> item;
    private @Nullable Uri implicitRules;
    private @Nullable Reference facility;
    private @Nullable ClaimUse use;
    private @Nullable Claim_Accident accident;
    private @Nullable List<Claim_CareTeam> careTeam;
    private @Nullable Code language;
    private @Nullable List<Claim_Related> related;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept priority;
    private @Nullable Claim_Payee payee;
    private @Nullable Reference referral;
    private @Nullable CodeableConcept type;
    private @Nullable Reference enterer;
    private @Nullable CodeableConcept subType;
    private @Nullable Reference provider;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable Reference originalPrescription;
    private final List<Claim_Insurance> insurance = new ArrayList<Claim_Insurance>();
    private @Nullable Meta meta;
    private @Nullable Reference patient;
    private @Nullable Reference insurer;
    private @Nullable List<Claim_Procedure> procedure;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
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
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
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
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(Money total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("total")
    public final Builder total(Optional<? extends Money> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#created() created} to created.
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
     * Initializes the optional value {@link Claim#created() created} to created.
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
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<Claim_SupportingInfo> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<Claim_SupportingInfo>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link Claim#text() text} to text.
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
     * Initializes the optional value {@link Claim#text() text} to text.
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
     * Initializes the optional value {@link Claim#contained() contained} to contained.
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
     * Initializes the optional value {@link Claim#contained() contained} to contained.
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
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
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
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
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
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(List<Claim_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosis")
    public final Builder diagnosis(Optional<? extends List<Claim_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#status() status} to status.
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
     * Initializes the optional value {@link Claim#status() status} to status.
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
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<Claim_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<Claim_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Claim#facility() facility} to facility.
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
     * Initializes the optional value {@link Claim#facility() facility} to facility.
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
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(ClaimUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends ClaimUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    public final Builder accident(Claim_Accident accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = Objects.requireNonNull(accident, "accident");
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("accident")
    public final Builder accident(Optional<? extends Claim_Accident> accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = accident.orElse(null);
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeam(List<Claim_CareTeam> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = Objects.requireNonNull(careTeam, "careTeam");
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("careTeam")
    public final Builder careTeam(Optional<? extends List<Claim_CareTeam>> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = careTeam.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#language() language} to language.
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
     * Initializes the optional value {@link Claim#language() language} to language.
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
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(List<Claim_Related> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("related")
    public final Builder related(Optional<? extends List<Claim_Related>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim#extension() extension} to extension.
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
     * Initializes the value for the {@link Claim#priority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      initBits &= ~INIT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    public final Builder payee(Claim_Payee payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = Objects.requireNonNull(payee, "payee");
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payee")
    public final Builder payee(Optional<? extends Claim_Payee> payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = payee.orElse(null);
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#referral() referral} to referral.
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
     * Initializes the optional value {@link Claim#referral() referral} to referral.
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
     * Initializes the value for the {@link Claim#type() type} attribute.
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
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link Claim#subType() subType} to subType.
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
     * Initializes the optional value {@link Claim#subType() subType} to subType.
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
     * Initializes the value for the {@link Claim#provider() provider} attribute.
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
     * Initializes the value for the {@link Claim#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Claim#id() id} to id.
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
     * Initializes the optional value {@link Claim#id() id} to id.
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
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
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
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
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
     * Adds one element to {@link Claim#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(Claim_Insurance element) {
      this.insurance.add(Objects.requireNonNull(element, "insurance element"));
      return this;
    }

    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(Claim_Insurance... elements) {
      for (Claim_Insurance element : elements) {
        this.insurance.add(Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInsurance(Iterable<? extends Claim_Insurance> elements) {
      for (Claim_Insurance element : elements) {
        this.insurance.add(Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#meta() meta} to meta.
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
     * Initializes the optional value {@link Claim#meta() meta} to meta.
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
     * Initializes the value for the {@link Claim#patient() patient} attribute.
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
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurer(Reference insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = Objects.requireNonNull(insurer, "insurer");
      optBits |= OPT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurer")
    public final Builder insurer(Optional<? extends Reference> insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = insurer.orElse(null);
      optBits |= OPT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(List<Claim_Procedure> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedure")
    public final Builder procedure(Optional<? extends List<Claim_Procedure>> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Builds a new {@link Claim Claim}.
     * @return An immutable instance of Claim
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim build() {
      checkRequiredAttributes();
      return new ImmutableClaim(
          prescription,
          total,
          created,
          supportingInfo,
          modifierExtension,
          fundsReserve,
          text,
          contained,
          billablePeriod,
          diagnosis,
          status,
          identifier,
          item,
          implicitRules,
          facility,
          use,
          accident,
          careTeam,
          language,
          related,
          extension,
          priority,
          payee,
          referral,
          type,
          enterer,
          subType,
          provider,
          resourceType,
          id,
          originalPrescription,
          createUnmodifiableList(true, insurance),
          meta,
          patient,
          insurer,
          procedure);
    }

    private boolean prescriptionIsSet() {
      return (optBits & OPT_BIT_PRESCRIPTION) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean fundsReserveIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean billablePeriodIsSet() {
      return (optBits & OPT_BIT_BILLABLE_PERIOD) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean accidentIsSet() {
      return (optBits & OPT_BIT_ACCIDENT) != 0;
    }

    private boolean careTeamIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean referralIsSet() {
      return (optBits & OPT_BIT_REFERRAL) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean originalPrescriptionIsSet() {
      return (optBits & OPT_BIT_ORIGINAL_PRESCRIPTION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean insurerIsSet() {
      return (optBits & OPT_BIT_INSURER) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private boolean priorityIsSet() {
      return (initBits & INIT_BIT_PRIORITY) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!priorityIsSet()) attributes.add("priority");
      if (!typeIsSet()) attributes.add("type");
      if (!providerIsSet()) attributes.add("provider");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build Claim, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Claim", generator = "Immutables")
  public interface PriorityBuildStage {
    /**
     * Initializes the value for the {@link Claim#priority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage priority(CodeableConcept priority);
  }

  @Generated(from = "Claim", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Claim#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    ProviderBuildStage type(CodeableConcept type);
  }

  @Generated(from = "Claim", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link Claim#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage provider(Reference provider);
  }

  @Generated(from = "Claim", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Claim#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Claim", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link Claim#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "Claim", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prescription(Reference prescription);

    /**
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prescription(Optional<? extends Reference> prescription);

    /**
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(Money total);

    /**
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(Optional<? extends Money> total);

    /**
     * Initializes the optional value {@link Claim#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link Claim#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<Claim_SupportingInfo> supportingInfo);

    /**
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<Claim_SupportingInfo>> supportingInfo);

    /**
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserve(CodeableConcept fundsReserve);

    /**
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserve(Optional<? extends CodeableConcept> fundsReserve);

    /**
     * Initializes the optional value {@link Claim#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Claim#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Claim#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Claim#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal billablePeriod(Period billablePeriod);

    /**
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal billablePeriod(Optional<? extends Period> billablePeriod);

    /**
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(List<Claim_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(Optional<? extends List<Claim_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link Claim#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Claim#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<Claim_Item> item);

    /**
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<Claim_Item>> item);

    /**
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Claim#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal facility(Reference facility);

    /**
     * Initializes the optional value {@link Claim#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal facility(Optional<? extends Reference> facility);

    /**
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(ClaimUse use);

    /**
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(Optional<? extends ClaimUse> use);

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accident(Claim_Accident accident);

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accident(Optional<? extends Claim_Accident> accident);

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeam(List<Claim_CareTeam> careTeam);

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeam(Optional<? extends List<Claim_CareTeam>> careTeam);

    /**
     * Initializes the optional value {@link Claim#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Claim#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    BuildFinal related(List<Claim_Related> related);

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal related(Optional<? extends List<Claim_Related>> related);

    /**
     * Initializes the optional value {@link Claim#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Claim#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(Claim_Payee payee);

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(Optional<? extends Claim_Payee> payee);

    /**
     * Initializes the optional value {@link Claim#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referral(Reference referral);

    /**
     * Initializes the optional value {@link Claim#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referral(Optional<? extends Reference> referral);

    /**
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(Reference enterer);

    /**
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(Optional<? extends Reference> enterer);

    /**
     * Initializes the optional value {@link Claim#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(CodeableConcept subType);

    /**
     * Initializes the optional value {@link Claim#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(Optional<? extends CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Claim#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Claim#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal originalPrescription(Reference originalPrescription);

    /**
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal originalPrescription(Optional<? extends Reference> originalPrescription);

    /**
     * Adds one element to {@link Claim#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(Claim_Insurance element);

    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(Claim_Insurance... elements);

    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllInsurance(Iterable<? extends Claim_Insurance> elements);

    /**
     * Initializes the optional value {@link Claim#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Claim#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurer(Reference insurer);

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurer(Optional<? extends Reference> insurer);

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedure(List<Claim_Procedure> procedure);

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedure(Optional<? extends List<Claim_Procedure>> procedure);

    /**
     * Builds a new {@link Claim Claim}.
     * @return An immutable instance of Claim
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim build();
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