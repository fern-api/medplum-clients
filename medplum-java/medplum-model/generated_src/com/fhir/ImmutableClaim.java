//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Claim}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim.builder()}.
 */
@org.immutables.value.Generated(from = "Claim", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim implements com.fhir.Claim {
  private final com.fhir.CodeableConcept priority;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.ClaimUse use;
  private final @javax.annotation.Nullable com.fhir.Reference originalPrescription;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_SupportingInfo> supportingInfo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_CareTeam> careTeam;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Claim_Payee payee;
  private final @javax.annotation.Nullable com.fhir.Reference referral;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable com.fhir.Reference facility;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subType;
  private final @javax.annotation.Nullable com.fhir.Reference prescription;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.util.List<com.fhir.Claim_Insurance> insurance;
  private final @javax.annotation.Nullable com.fhir.Claim_Accident accident;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_Related> related;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Money total;
  private final @javax.annotation.Nullable com.fhir.Period billablePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_Procedure> procedure;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable com.fhir.Reference enterer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_Diagnosis> diagnosis;
  private final @javax.annotation.Nullable com.fhir.Reference insurer;
  private final com.fhir.Reference provider;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_Item> item;

  private ImmutableClaim(
      com.fhir.CodeableConcept priority,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.ClaimUse use,
      @javax.annotation.Nullable com.fhir.Reference originalPrescription,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_SupportingInfo> supportingInfo,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_CareTeam> careTeam,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Claim_Payee payee,
      @javax.annotation.Nullable com.fhir.Reference referral,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable com.fhir.Reference facility,
      @javax.annotation.Nullable com.fhir.CodeableConcept subType,
      @javax.annotation.Nullable com.fhir.Reference prescription,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.util.List<com.fhir.Claim_Insurance> insurance,
      @javax.annotation.Nullable com.fhir.Claim_Accident accident,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_Related> related,
      @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Money total,
      @javax.annotation.Nullable com.fhir.Period billablePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_Procedure> procedure,
      com.fhir.Reference patient,
      @javax.annotation.Nullable com.fhir.Reference enterer,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_Diagnosis> diagnosis,
      @javax.annotation.Nullable com.fhir.Reference insurer,
      com.fhir.Reference provider,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_Item> item) {
    this.priority = priority;
    this.id = id;
    this.use = use;
    this.originalPrescription = originalPrescription;
    this.supportingInfo = supportingInfo;
    this.careTeam = careTeam;
    this.resourceType = resourceType;
    this.meta = meta;
    this.payee = payee;
    this.referral = referral;
    this.text = text;
    this.created = created;
    this.facility = facility;
    this.subType = subType;
    this.prescription = prescription;
    this.implicitRules = implicitRules;
    this.insurance = insurance;
    this.accident = accident;
    this.related = related;
    this.fundsReserve = fundsReserve;
    this.identifier = identifier;
    this.status = status;
    this.language = language;
    this.total = total;
    this.billablePeriod = billablePeriod;
    this.contained = contained;
    this.procedure = procedure;
    this.patient = patient;
    this.enterer = enterer;
    this.diagnosis = diagnosis;
    this.insurer = insurer;
    this.provider = provider;
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.item = item;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public com.fhir.CodeableConcept priority() {
    return priority;
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
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.ClaimUse> use() {
    return java.util.Optional.ofNullable(use);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_SupportingInfo>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code careTeam} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_CareTeam>> careTeam() {
    return java.util.Optional.ofNullable(careTeam);
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
   * @return The value of the {@code payee} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payee")
  @Override
  public java.util.Optional<com.fhir.Claim_Payee> payee() {
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
   * @return The value of the {@code facility} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("facility")
  @Override
  public java.util.Optional<com.fhir.Reference> facility() {
    return java.util.Optional.ofNullable(facility);
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
   * @return The value of the {@code prescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prescription")
  @Override
  public java.util.Optional<com.fhir.Reference> prescription() {
    return java.util.Optional.ofNullable(prescription);
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
   * @return The value of the {@code insurance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurance")
  @Override
  public java.util.List<com.fhir.Claim_Insurance> insurance() {
    return insurance;
  }

  /**
   * @return The value of the {@code accident} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("accident")
  @Override
  public java.util.Optional<com.fhir.Claim_Accident> accident() {
    return java.util.Optional.ofNullable(accident);
  }

  /**
   * @return The value of the {@code related} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("related")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_Related>> related() {
    return java.util.Optional.ofNullable(related);
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
  public java.util.Optional<com.fhir.Money> total() {
    return java.util.Optional.ofNullable(total);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedure")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_Procedure>> procedure() {
    return java.util.Optional.ofNullable(procedure);
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
   * @return The value of the {@code enterer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enterer")
  @Override
  public java.util.Optional<com.fhir.Reference> enterer() {
    return java.util.Optional.ofNullable(enterer);
  }

  /**
   * @return The value of the {@code diagnosis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_Diagnosis>> diagnosis() {
    return java.util.Optional.ofNullable(diagnosis);
  }

  /**
   * @return The value of the {@code insurer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurer")
  @Override
  public java.util.Optional<com.fhir.Reference> insurer() {
    return java.util.Optional.ofNullable(insurer);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public com.fhir.CodeableConcept type() {
    return type;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_Item>> item() {
    return java.util.Optional.ofNullable(item);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#priority() priority} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for priority
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withPriority(com.fhir.CodeableConcept value) {
    if (this.priority == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "priority");
    return new ImmutableClaim(
        newValue,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        newValue,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClaim(
        this.priority,
        value,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withUse(com.fhir.ClaimUse value) {
    @javax.annotation.Nullable com.fhir.ClaimUse newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        newValue,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withUse(java.util.Optional<? extends com.fhir.ClaimUse> optional) {
    @javax.annotation.Nullable com.fhir.ClaimUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        value,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#originalPrescription() originalPrescription} attribute.
   * @param value The value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withOriginalPrescription(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "originalPrescription");
    if (this.originalPrescription == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        newValue,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#originalPrescription() originalPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withOriginalPrescription(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.originalPrescription == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        value,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withSupportingInfo(java.util.List<com.fhir.Claim_SupportingInfo> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_SupportingInfo> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        newValue,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Claim_SupportingInfo>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_SupportingInfo> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        value,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#careTeam() careTeam} attribute.
   * @param value The value for careTeam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withCareTeam(java.util.List<com.fhir.Claim_CareTeam> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_CareTeam> newValue = java.util.Objects.requireNonNull(value, "careTeam");
    if (this.careTeam == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        newValue,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#careTeam() careTeam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withCareTeam(java.util.Optional<? extends java.util.List<com.fhir.Claim_CareTeam>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_CareTeam> value = optional.orElse(null);
    if (this.careTeam == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        value,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        newValue,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        newValue,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        value,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withPayee(com.fhir.Claim_Payee value) {
    @javax.annotation.Nullable com.fhir.Claim_Payee newValue = java.util.Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        newValue,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withPayee(java.util.Optional<? extends com.fhir.Claim_Payee> optional) {
    @javax.annotation.Nullable com.fhir.Claim_Payee value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        value,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#referral() referral} attribute.
   * @param value The value for referral
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withReferral(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "referral");
    if (this.referral == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        newValue,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#referral() referral} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referral
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withReferral(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.referral == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        value,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        newValue,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        value,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        newValue,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        value,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withFacility(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        newValue,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withFacility(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        value,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withSubType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        newValue,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withSubType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        value,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#prescription() prescription} attribute.
   * @param value The value for prescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withPrescription(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "prescription");
    if (this.prescription == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        newValue,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#prescription() prescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withPrescription(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.prescription == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        value,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        newValue,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        value,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Claim#insurance() insurance}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withInsurance(com.fhir.Claim_Insurance... elements) {
    java.util.List<com.fhir.Claim_Insurance> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        newValue,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Claim#insurance() insurance}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of insurance elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withInsurance(Iterable<? extends com.fhir.Claim_Insurance> elements) {
    if (this.insurance == elements) return this;
    java.util.List<com.fhir.Claim_Insurance> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        newValue,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#accident() accident} attribute.
   * @param value The value for accident
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withAccident(com.fhir.Claim_Accident value) {
    @javax.annotation.Nullable com.fhir.Claim_Accident newValue = java.util.Objects.requireNonNull(value, "accident");
    if (this.accident == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        newValue,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#accident() accident} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accident
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withAccident(java.util.Optional<? extends com.fhir.Claim_Accident> optional) {
    @javax.annotation.Nullable com.fhir.Claim_Accident value = optional.orElse(null);
    if (this.accident == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        value,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withRelated(java.util.List<com.fhir.Claim_Related> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Related> newValue = java.util.Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        newValue,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withRelated(java.util.Optional<? extends java.util.List<com.fhir.Claim_Related>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Related> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        value,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#fundsReserve() fundsReserve} attribute.
   * @param value The value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withFundsReserve(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "fundsReserve");
    if (this.fundsReserve == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        newValue,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#fundsReserve() fundsReserve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withFundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.fundsReserve == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        value,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        newValue,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        value,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        newValue,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        value,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        newValue,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        value,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withTotal(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        newValue,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withTotal(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        value,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#billablePeriod() billablePeriod} attribute.
   * @param value The value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withBillablePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "billablePeriod");
    if (this.billablePeriod == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        newValue,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#billablePeriod() billablePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withBillablePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.billablePeriod == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        value,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        newValue,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        value,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withProcedure(java.util.List<com.fhir.Claim_Procedure> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Procedure> newValue = java.util.Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        newValue,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withProcedure(java.util.Optional<? extends java.util.List<com.fhir.Claim_Procedure>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Procedure> value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        value,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        newValue,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withEnterer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        newValue,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withEnterer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        value,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withDiagnosis(java.util.List<com.fhir.Claim_Diagnosis> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Diagnosis> newValue = java.util.Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        newValue,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withDiagnosis(java.util.Optional<? extends java.util.List<com.fhir.Claim_Diagnosis>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        value,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#insurer() insurer} attribute.
   * @param value The value for insurer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withInsurer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "insurer");
    if (this.insurer == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        newValue,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#insurer() insurer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withInsurer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.insurer == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        value,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#provider() provider} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provider
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withProvider(com.fhir.Reference value) {
    if (this.provider == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "provider");
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        newValue,
        this.type,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        newValue,
        this.modifierExtension,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        newValue,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        value,
        this.extension,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        newValue,
        this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        value,
        this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim withItem(java.util.List<com.fhir.Claim_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim withItem(java.util.Optional<? extends java.util.List<com.fhir.Claim_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableClaim(
        this.priority,
        this.id,
        this.use,
        this.originalPrescription,
        this.supportingInfo,
        this.careTeam,
        this.resourceType,
        this.meta,
        this.payee,
        this.referral,
        this.text,
        this.created,
        this.facility,
        this.subType,
        this.prescription,
        this.implicitRules,
        this.insurance,
        this.accident,
        this.related,
        this.fundsReserve,
        this.identifier,
        this.status,
        this.language,
        this.total,
        this.billablePeriod,
        this.contained,
        this.procedure,
        this.patient,
        this.enterer,
        this.diagnosis,
        this.insurer,
        this.provider,
        this.type,
        this.modifierExtension,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim
        && equalTo((ImmutableClaim) another);
  }

  private boolean equalTo(ImmutableClaim another) {
    return priority.equals(another.priority)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(originalPrescription, another.originalPrescription)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(careTeam, another.careTeam)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(payee, another.payee)
        && java.util.Objects.equals(referral, another.referral)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(facility, another.facility)
        && java.util.Objects.equals(subType, another.subType)
        && java.util.Objects.equals(prescription, another.prescription)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && insurance.equals(another.insurance)
        && java.util.Objects.equals(accident, another.accident)
        && java.util.Objects.equals(related, another.related)
        && java.util.Objects.equals(fundsReserve, another.fundsReserve)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(total, another.total)
        && java.util.Objects.equals(billablePeriod, another.billablePeriod)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(procedure, another.procedure)
        && patient.equals(another.patient)
        && java.util.Objects.equals(enterer, another.enterer)
        && java.util.Objects.equals(diagnosis, another.diagnosis)
        && java.util.Objects.equals(insurer, another.insurer)
        && provider.equals(another.provider)
        && type.equals(another.type)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(item, another.item);
  }

  /**
   * Computes a hash code from attributes: {@code priority}, {@code id}, {@code use}, {@code originalPrescription}, {@code supportingInfo}, {@code careTeam}, {@code resourceType}, {@code meta}, {@code payee}, {@code referral}, {@code text}, {@code created}, {@code facility}, {@code subType}, {@code prescription}, {@code implicitRules}, {@code insurance}, {@code accident}, {@code related}, {@code fundsReserve}, {@code identifier}, {@code status}, {@code language}, {@code total}, {@code billablePeriod}, {@code contained}, {@code procedure}, {@code patient}, {@code enterer}, {@code diagnosis}, {@code insurer}, {@code provider}, {@code type}, {@code modifierExtension}, {@code extension}, {@code item}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + priority.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(originalPrescription);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(careTeam);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(payee);
    h += (h << 5) + java.util.Objects.hashCode(referral);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(facility);
    h += (h << 5) + java.util.Objects.hashCode(subType);
    h += (h << 5) + java.util.Objects.hashCode(prescription);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + insurance.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(accident);
    h += (h << 5) + java.util.Objects.hashCode(related);
    h += (h << 5) + java.util.Objects.hashCode(fundsReserve);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(total);
    h += (h << 5) + java.util.Objects.hashCode(billablePeriod);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(procedure);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(enterer);
    h += (h << 5) + java.util.Objects.hashCode(diagnosis);
    h += (h << 5) + java.util.Objects.hashCode(insurer);
    h += (h << 5) + provider.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(item);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Claim{");
    builder.append("priority=").append(priority);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (use != null) {
      builder.append(", ");
      builder.append("use=").append(use);
    }
    if (originalPrescription != null) {
      builder.append(", ");
      builder.append("originalPrescription=").append(originalPrescription);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (careTeam != null) {
      builder.append(", ");
      builder.append("careTeam=").append(careTeam);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (referral != null) {
      builder.append(", ");
      builder.append("referral=").append(referral);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (facility != null) {
      builder.append(", ");
      builder.append("facility=").append(facility);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (prescription != null) {
      builder.append(", ");
      builder.append("prescription=").append(prescription);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("insurance=").append(insurance);
    if (accident != null) {
      builder.append(", ");
      builder.append("accident=").append(accident);
    }
    if (related != null) {
      builder.append(", ");
      builder.append("related=").append(related);
    }
    if (fundsReserve != null) {
      builder.append(", ");
      builder.append("fundsReserve=").append(fundsReserve);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (total != null) {
      builder.append(", ");
      builder.append("total=").append(total);
    }
    if (billablePeriod != null) {
      builder.append(", ");
      builder.append("billablePeriod=").append(billablePeriod);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (procedure != null) {
      builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (diagnosis != null) {
      builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (insurer != null) {
      builder.append(", ");
      builder.append("insurer=").append(insurer);
    }
    builder.append(", ");
    builder.append("provider=").append(provider);
    builder.append(", ");
    builder.append("type=").append(type);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Claim {
    @javax.annotation.Nullable com.fhir.CodeableConcept priority;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ClaimUse> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> originalPrescription = java.util.Optional.empty();
    boolean originalPrescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_SupportingInfo>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_CareTeam>> careTeam = java.util.Optional.empty();
    boolean careTeamIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Claim_Payee> payee = java.util.Optional.empty();
    boolean payeeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> referral = java.util.Optional.empty();
    boolean referralIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> facility = java.util.Optional.empty();
    boolean facilityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subType = java.util.Optional.empty();
    boolean subTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> prescription = java.util.Optional.empty();
    boolean prescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Insurance> insurance = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.Claim_Accident> accident = java.util.Optional.empty();
    boolean accidentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_Related>> related = java.util.Optional.empty();
    boolean relatedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> fundsReserve = java.util.Optional.empty();
    boolean fundsReserveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> total = java.util.Optional.empty();
    boolean totalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> billablePeriod = java.util.Optional.empty();
    boolean billablePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_Procedure>> procedure = java.util.Optional.empty();
    boolean procedureIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> enterer = java.util.Optional.empty();
    boolean entererIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_Diagnosis>> diagnosis = java.util.Optional.empty();
    boolean diagnosisIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> insurer = java.util.Optional.empty();
    boolean insurerIsSet;
    @javax.annotation.Nullable com.fhir.Reference provider;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(com.fhir.CodeableConcept priority) {
      this.priority = priority;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.ClaimUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("originalPrescription")
    public void setOriginalPrescription(java.util.Optional<com.fhir.Reference> originalPrescription) {
      this.originalPrescription = originalPrescription;
      this.originalPrescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.Claim_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
    public void setCareTeam(java.util.Optional<java.util.List<com.fhir.Claim_CareTeam>> careTeam) {
      this.careTeam = careTeam;
      this.careTeamIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public void setPayee(java.util.Optional<com.fhir.Claim_Payee> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referral")
    public void setReferral(java.util.Optional<com.fhir.Reference> referral) {
      this.referral = referral;
      this.referralIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("facility")
    public void setFacility(java.util.Optional<com.fhir.Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public void setSubType(java.util.Optional<com.fhir.CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prescription")
    public void setPrescription(java.util.Optional<com.fhir.Reference> prescription) {
      this.prescription = prescription;
      this.prescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.List<com.fhir.Claim_Insurance> insurance) {
      this.insurance = insurance;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("accident")
    public void setAccident(java.util.Optional<com.fhir.Claim_Accident> accident) {
      this.accident = accident;
      this.accidentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("related")
    public void setRelated(java.util.Optional<java.util.List<com.fhir.Claim_Related>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fundsReserve")
    public void setFundsReserve(java.util.Optional<com.fhir.CodeableConcept> fundsReserve) {
      this.fundsReserve = fundsReserve;
      this.fundsReserveIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public void setTotal(java.util.Optional<com.fhir.Money> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("billablePeriod")
    public void setBillablePeriod(java.util.Optional<com.fhir.Period> billablePeriod) {
      this.billablePeriod = billablePeriod;
      this.billablePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedure")
    public void setProcedure(java.util.Optional<java.util.List<com.fhir.Claim_Procedure>> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public void setEnterer(java.util.Optional<com.fhir.Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public void setDiagnosis(java.util.Optional<java.util.List<com.fhir.Claim_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public void setInsurer(java.util.Optional<com.fhir.Reference> insurer) {
      this.insurer = insurer;
      this.insurerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(com.fhir.Reference provider) {
      this.provider = provider;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.Claim_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @Override
    public com.fhir.CodeableConcept priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ClaimUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> originalPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_CareTeam>> careTeam() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Claim_Payee> payee() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> referral() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> prescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Claim_Insurance> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Claim_Accident> accident() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_Related>> related() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> fundsReserve() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> total() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> billablePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_Procedure>> procedure() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> insurer() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference provider() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_Item>> item() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaim fromJson(Json json) {
    ImmutableClaim.Builder builder = ((ImmutableClaim.Builder) ImmutableClaim.builder());
    if (json.priority != null) {
      builder.priority(json.priority);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.originalPrescriptionIsSet) {
      builder.originalPrescription(json.originalPrescription);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.careTeamIsSet) {
      builder.careTeam(json.careTeam);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.referralIsSet) {
      builder.referral(json.referral);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.prescriptionIsSet) {
      builder.prescription(json.prescription);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.insurance != null) {
      builder.addAllInsurance(json.insurance);
    }
    if (json.accidentIsSet) {
      builder.accident(json.accident);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.fundsReserveIsSet) {
      builder.fundsReserve(json.fundsReserve);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.billablePeriodIsSet) {
      builder.billablePeriod(json.billablePeriod);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.insurerIsSet) {
      builder.insurer(json.insurer);
    }
    if (json.provider != null) {
      builder.provider(json.provider);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
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
        .priority(instance.priority())
        .id(instance.id())
        .use(instance.use())
        .originalPrescription(instance.originalPrescription())
        .supportingInfo(instance.supportingInfo())
        .careTeam(instance.careTeam())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .payee(instance.payee())
        .referral(instance.referral())
        .text(instance.text())
        .created(instance.created())
        .facility(instance.facility())
        .subType(instance.subType())
        .prescription(instance.prescription())
        .implicitRules(instance.implicitRules())
        .addAllInsurance(instance.insurance())
        .accident(instance.accident())
        .related(instance.related())
        .fundsReserve(instance.fundsReserve())
        .identifier(instance.identifier())
        .status(instance.status())
        .language(instance.language())
        .total(instance.total())
        .billablePeriod(instance.billablePeriod())
        .contained(instance.contained())
        .procedure(instance.procedure())
        .patient(instance.patient())
        .enterer(instance.enterer())
        .diagnosis(instance.diagnosis())
        .insurer(instance.insurer())
        .provider(instance.provider())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .item(instance.item())
        .build();
  }

  /**
   * Creates a builder for {@link Claim Claim}.
   * <pre>
   * ImmutableClaim.builder()
   *    .priority(com.fhir.CodeableConcept) // required {@link Claim#priority() priority}
   *    .id(com.fhir.id) // optional {@link Claim#id() id}
   *    .use(com.fhir.ClaimUse) // optional {@link Claim#use() use}
   *    .originalPrescription(com.fhir.Reference) // optional {@link Claim#originalPrescription() originalPrescription}
   *    .supportingInfo(List&amp;lt;com.fhir.Claim_SupportingInfo&amp;gt;) // optional {@link Claim#supportingInfo() supportingInfo}
   *    .careTeam(List&amp;lt;com.fhir.Claim_CareTeam&amp;gt;) // optional {@link Claim#careTeam() careTeam}
   *    .resourceType(String) // required {@link Claim#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link Claim#meta() meta}
   *    .payee(com.fhir.Claim_Payee) // optional {@link Claim#payee() payee}
   *    .referral(com.fhir.Reference) // optional {@link Claim#referral() referral}
   *    .text(com.fhir.Narrative) // optional {@link Claim#text() text}
   *    .created(com.fhir.dateTime) // optional {@link Claim#created() created}
   *    .facility(com.fhir.Reference) // optional {@link Claim#facility() facility}
   *    .subType(com.fhir.CodeableConcept) // optional {@link Claim#subType() subType}
   *    .prescription(com.fhir.Reference) // optional {@link Claim#prescription() prescription}
   *    .implicitRules(com.fhir.uri) // optional {@link Claim#implicitRules() implicitRules}
   *    .addInsurance|addAllInsurance(com.fhir.Claim_Insurance) // {@link Claim#insurance() insurance} elements
   *    .accident(com.fhir.Claim_Accident) // optional {@link Claim#accident() accident}
   *    .related(List&amp;lt;com.fhir.Claim_Related&amp;gt;) // optional {@link Claim#related() related}
   *    .fundsReserve(com.fhir.CodeableConcept) // optional {@link Claim#fundsReserve() fundsReserve}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Claim#identifier() identifier}
   *    .status(com.fhir.code) // optional {@link Claim#status() status}
   *    .language(com.fhir.code) // optional {@link Claim#language() language}
   *    .total(com.fhir.Money) // optional {@link Claim#total() total}
   *    .billablePeriod(com.fhir.Period) // optional {@link Claim#billablePeriod() billablePeriod}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Claim#contained() contained}
   *    .procedure(List&amp;lt;com.fhir.Claim_Procedure&amp;gt;) // optional {@link Claim#procedure() procedure}
   *    .patient(com.fhir.Reference) // required {@link Claim#patient() patient}
   *    .enterer(com.fhir.Reference) // optional {@link Claim#enterer() enterer}
   *    .diagnosis(List&amp;lt;com.fhir.Claim_Diagnosis&amp;gt;) // optional {@link Claim#diagnosis() diagnosis}
   *    .insurer(com.fhir.Reference) // optional {@link Claim#insurer() insurer}
   *    .provider(com.fhir.Reference) // required {@link Claim#provider() provider}
   *    .type(com.fhir.CodeableConcept) // required {@link Claim#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim#extension() extension}
   *    .item(List&amp;lt;com.fhir.Claim_Item&amp;gt;) // optional {@link Claim#item() item}
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
  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements PriorityBuildStage, ResourceTypeBuildStage, PatientBuildStage, ProviderBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PRIORITY = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long INIT_BIT_PROVIDER = 0x8L;
    private static final long INIT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_USE = 0x2L;
    private static final long OPT_BIT_ORIGINAL_PRESCRIPTION = 0x4L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x8L;
    private static final long OPT_BIT_CARE_TEAM = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_PAYEE = 0x40L;
    private static final long OPT_BIT_REFERRAL = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_CREATED = 0x200L;
    private static final long OPT_BIT_FACILITY = 0x400L;
    private static final long OPT_BIT_SUB_TYPE = 0x800L;
    private static final long OPT_BIT_PRESCRIPTION = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_ACCIDENT = 0x4000L;
    private static final long OPT_BIT_RELATED = 0x8000L;
    private static final long OPT_BIT_FUNDS_RESERVE = 0x10000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000L;
    private static final long OPT_BIT_STATUS = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_TOTAL = 0x100000L;
    private static final long OPT_BIT_BILLABLE_PERIOD = 0x200000L;
    private static final long OPT_BIT_CONTAINED = 0x400000L;
    private static final long OPT_BIT_PROCEDURE = 0x800000L;
    private static final long OPT_BIT_ENTERER = 0x1000000L;
    private static final long OPT_BIT_DIAGNOSIS = 0x2000000L;
    private static final long OPT_BIT_INSURER = 0x4000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000000L;
    private static final long OPT_BIT_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_ITEM = 0x20000000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept priority;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.ClaimUse use;
    private @javax.annotation.Nullable com.fhir.Reference originalPrescription;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_SupportingInfo> supportingInfo;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_CareTeam> careTeam;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Claim_Payee payee;
    private @javax.annotation.Nullable com.fhir.Reference referral;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable com.fhir.Reference facility;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subType;
    private @javax.annotation.Nullable com.fhir.Reference prescription;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private final java.util.List<com.fhir.Claim_Insurance> insurance = new java.util.ArrayList<com.fhir.Claim_Insurance>();
    private @javax.annotation.Nullable com.fhir.Claim_Accident accident;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_Related> related;
    private @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Money total;
    private @javax.annotation.Nullable com.fhir.Period billablePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_Procedure> procedure;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable com.fhir.Reference enterer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_Diagnosis> diagnosis;
    private @javax.annotation.Nullable com.fhir.Reference insurer;
    private @javax.annotation.Nullable com.fhir.Reference provider;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_Item> item;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Claim#priority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(com.fhir.CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      initBits &= ~INIT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#id() id} to id.
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
     * Initializes the optional value {@link Claim#id() id} to id.
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
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.ClaimUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.ClaimUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
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
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
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
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.Claim_SupportingInfo> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Claim_SupportingInfo>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeam(java.util.List<com.fhir.Claim_CareTeam> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = java.util.Objects.requireNonNull(careTeam, "careTeam");
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
    public final Builder careTeam(java.util.Optional<? extends java.util.List<com.fhir.Claim_CareTeam>> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = careTeam.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the value for the {@link Claim#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Claim#meta() meta} to meta.
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
     * Initializes the optional value {@link Claim#meta() meta} to meta.
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
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    public final Builder payee(com.fhir.Claim_Payee payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = java.util.Objects.requireNonNull(payee, "payee");
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public final Builder payee(java.util.Optional<? extends com.fhir.Claim_Payee> payee) {
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
    public final Builder referral(com.fhir.Reference referral) {
      checkNotIsSet(referralIsSet(), "referral");
      this.referral = java.util.Objects.requireNonNull(referral, "referral");
      optBits |= OPT_BIT_REFERRAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#referral() referral} to referral.
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
     * Initializes the optional value {@link Claim#text() text} to text.
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
     * Initializes the optional value {@link Claim#text() text} to text.
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
     * Initializes the optional value {@link Claim#created() created} to created.
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
     * Initializes the optional value {@link Claim#created() created} to created.
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
     * Initializes the optional value {@link Claim#facility() facility} to facility.
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
     * Initializes the optional value {@link Claim#facility() facility} to facility.
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
     * Initializes the optional value {@link Claim#subType() subType} to subType.
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
     * Initializes the optional value {@link Claim#subType() subType} to subType.
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
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
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
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
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
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
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
     * Adds one element to {@link Claim#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(com.fhir.Claim_Insurance element) {
      this.insurance.add(java.util.Objects.requireNonNull(element, "insurance element"));
      return this;
    }

    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(com.fhir.Claim_Insurance... elements) {
      for (com.fhir.Claim_Insurance element : elements) {
        this.insurance.add(java.util.Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInsurance(Iterable<? extends com.fhir.Claim_Insurance> elements) {
      for (com.fhir.Claim_Insurance element : elements) {
        this.insurance.add(java.util.Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    public final Builder accident(com.fhir.Claim_Accident accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = java.util.Objects.requireNonNull(accident, "accident");
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accident")
    public final Builder accident(java.util.Optional<? extends com.fhir.Claim_Accident> accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = accident.orElse(null);
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(java.util.List<com.fhir.Claim_Related> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = java.util.Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("related")
    public final Builder related(java.util.Optional<? extends java.util.List<com.fhir.Claim_Related>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Claim#status() status} to status.
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
     * Initializes the optional value {@link Claim#status() status} to status.
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
     * Initializes the optional value {@link Claim#language() language} to language.
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
     * Initializes the optional value {@link Claim#language() language} to language.
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
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(com.fhir.Money total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = java.util.Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public final Builder total(java.util.Optional<? extends com.fhir.Money> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
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
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
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
     * Initializes the optional value {@link Claim#contained() contained} to contained.
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
     * Initializes the optional value {@link Claim#contained() contained} to contained.
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
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(java.util.List<com.fhir.Claim_Procedure> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = java.util.Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedure")
    public final Builder procedure(java.util.Optional<? extends java.util.List<com.fhir.Claim_Procedure>> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the value for the {@link Claim#patient() patient} attribute.
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
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(java.util.List<com.fhir.Claim_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = java.util.Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public final Builder diagnosis(java.util.Optional<? extends java.util.List<com.fhir.Claim_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurer(com.fhir.Reference insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = java.util.Objects.requireNonNull(insurer, "insurer");
      optBits |= OPT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public final Builder insurer(java.util.Optional<? extends com.fhir.Reference> insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = insurer.orElse(null);
      optBits |= OPT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the value for the {@link Claim#provider() provider} attribute.
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
     * Initializes the value for the {@link Claim#type() type} attribute.
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
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.Claim_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.Claim_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Builds a new {@link Claim Claim}.
     * @return An immutable instance of Claim
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Claim build() {
      checkRequiredAttributes();
      return new ImmutableClaim(
          priority,
          id,
          use,
          originalPrescription,
          supportingInfo,
          careTeam,
          resourceType,
          meta,
          payee,
          referral,
          text,
          created,
          facility,
          subType,
          prescription,
          implicitRules,
          createUnmodifiableList(true, insurance),
          accident,
          related,
          fundsReserve,
          identifier,
          status,
          language,
          total,
          billablePeriod,
          contained,
          procedure,
          patient,
          enterer,
          diagnosis,
          insurer,
          provider,
          type,
          modifierExtension,
          extension,
          item);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean originalPrescriptionIsSet() {
      return (optBits & OPT_BIT_ORIGINAL_PRESCRIPTION) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean careTeamIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean referralIsSet() {
      return (optBits & OPT_BIT_REFERRAL) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean prescriptionIsSet() {
      return (optBits & OPT_BIT_PRESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean accidentIsSet() {
      return (optBits & OPT_BIT_ACCIDENT) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean fundsReserveIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean billablePeriodIsSet() {
      return (optBits & OPT_BIT_BILLABLE_PERIOD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean insurerIsSet() {
      return (optBits & OPT_BIT_INSURER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean priorityIsSet() {
      return (initBits & INIT_BIT_PRIORITY) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Claim is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!priorityIsSet()) attributes.add("priority");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      if (!providerIsSet()) attributes.add("provider");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build Claim, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  public interface PriorityBuildStage {
    /**
     * Initializes the value for the {@link Claim#priority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage priority(com.fhir.CodeableConcept priority);
  }

  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Claim#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link Claim#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ProviderBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link Claim#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage provider(com.fhir.Reference provider);
  }

  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Claim#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "Claim", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Claim#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(com.fhir.ClaimUse use);

    /**
     * Initializes the optional value {@link Claim#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(java.util.Optional<? extends com.fhir.ClaimUse> use);

    /**
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal originalPrescription(com.fhir.Reference originalPrescription);

    /**
     * Initializes the optional value {@link Claim#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal originalPrescription(java.util.Optional<? extends com.fhir.Reference> originalPrescription);

    /**
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.Claim_SupportingInfo> supportingInfo);

    /**
     * Initializes the optional value {@link Claim#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Claim_SupportingInfo>> supportingInfo);

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeam(java.util.List<com.fhir.Claim_CareTeam> careTeam);

    /**
     * Initializes the optional value {@link Claim#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeam(java.util.Optional<? extends java.util.List<com.fhir.Claim_CareTeam>> careTeam);

    /**
     * Initializes the optional value {@link Claim#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Claim#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(com.fhir.Claim_Payee payee);

    /**
     * Initializes the optional value {@link Claim#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(java.util.Optional<? extends com.fhir.Claim_Payee> payee);

    /**
     * Initializes the optional value {@link Claim#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referral(com.fhir.Reference referral);

    /**
     * Initializes the optional value {@link Claim#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referral(java.util.Optional<? extends com.fhir.Reference> referral);

    /**
     * Initializes the optional value {@link Claim#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Claim#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Claim#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link Claim#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link Claim#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal facility(com.fhir.Reference facility);

    /**
     * Initializes the optional value {@link Claim#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal facility(java.util.Optional<? extends com.fhir.Reference> facility);

    /**
     * Initializes the optional value {@link Claim#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(com.fhir.CodeableConcept subType);

    /**
     * Initializes the optional value {@link Claim#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(java.util.Optional<? extends com.fhir.CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prescription(com.fhir.Reference prescription);

    /**
     * Initializes the optional value {@link Claim#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prescription(java.util.Optional<? extends com.fhir.Reference> prescription);

    /**
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Claim#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Adds one element to {@link Claim#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(com.fhir.Claim_Insurance element);

    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(com.fhir.Claim_Insurance... elements);

    /**
     * Adds elements to {@link Claim#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllInsurance(Iterable<? extends com.fhir.Claim_Insurance> elements);

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accident(com.fhir.Claim_Accident accident);

    /**
     * Initializes the optional value {@link Claim#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accident(java.util.Optional<? extends com.fhir.Claim_Accident> accident);

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    BuildFinal related(java.util.List<com.fhir.Claim_Related> related);

    /**
     * Initializes the optional value {@link Claim#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal related(java.util.Optional<? extends java.util.List<com.fhir.Claim_Related>> related);

    /**
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserve(com.fhir.CodeableConcept fundsReserve);

    /**
     * Initializes the optional value {@link Claim#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> fundsReserve);

    /**
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Claim#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Claim#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Claim#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link Claim#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Claim#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(com.fhir.Money total);

    /**
     * Initializes the optional value {@link Claim#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(java.util.Optional<? extends com.fhir.Money> total);

    /**
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal billablePeriod(com.fhir.Period billablePeriod);

    /**
     * Initializes the optional value {@link Claim#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal billablePeriod(java.util.Optional<? extends com.fhir.Period> billablePeriod);

    /**
     * Initializes the optional value {@link Claim#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Claim#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedure(java.util.List<com.fhir.Claim_Procedure> procedure);

    /**
     * Initializes the optional value {@link Claim#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedure(java.util.Optional<? extends java.util.List<com.fhir.Claim_Procedure>> procedure);

    /**
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(com.fhir.Reference enterer);

    /**
     * Initializes the optional value {@link Claim#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(java.util.Optional<? extends com.fhir.Reference> enterer);

    /**
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(java.util.List<com.fhir.Claim_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link Claim#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(java.util.Optional<? extends java.util.List<com.fhir.Claim_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurer(com.fhir.Reference insurer);

    /**
     * Initializes the optional value {@link Claim#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurer(java.util.Optional<? extends com.fhir.Reference> insurer);

    /**
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Claim#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(java.util.List<com.fhir.Claim_Item> item);

    /**
     * Initializes the optional value {@link Claim#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(java.util.Optional<? extends java.util.List<com.fhir.Claim_Item>> item);

    /**
     * Builds a new {@link Claim Claim}.
     * @return An immutable instance of Claim
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim build();
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
