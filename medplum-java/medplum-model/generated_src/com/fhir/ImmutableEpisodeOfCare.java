//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link EpisodeOfCare}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEpisodeOfCare.builder()}.
 */
@org.immutables.value.Generated(from = "EpisodeOfCare", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEpisodeOfCare implements com.fhir.EpisodeOfCare {
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> account;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> referralRequest;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_Diagnosis> diagnosis;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference careManager;
  private final @javax.annotation.Nullable com.fhir.EpisodeofcareStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_StatusHistory> statusHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference managingOrganization;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> team;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final java.lang.String resourceType;

  private ImmutableEpisodeOfCare(
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> account,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> referralRequest,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_Diagnosis> diagnosis,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference careManager,
      @javax.annotation.Nullable com.fhir.EpisodeofcareStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_StatusHistory> statusHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference managingOrganization,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> team,
      @javax.annotation.Nullable com.fhir.Period period,
      java.lang.String resourceType) {
    this.patient = patient;
    this.account = account;
    this.meta = meta;
    this.id = id;
    this.type = type;
    this.referralRequest = referralRequest;
    this.language = language;
    this.diagnosis = diagnosis;
    this.modifierExtension = modifierExtension;
    this.careManager = careManager;
    this.status = status;
    this.statusHistory = statusHistory;
    this.contained = contained;
    this.extension = extension;
    this.managingOrganization = managingOrganization;
    this.implicitRules = implicitRules;
    this.text = text;
    this.identifier = identifier;
    this.team = team;
    this.period = period;
    this.resourceType = resourceType;
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
   * @return The value of the {@code account} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("account")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> account() {
    return java.util.Optional.ofNullable(account);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code referralRequest} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referralRequest")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> referralRequest() {
    return java.util.Optional.ofNullable(referralRequest);
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
   * @return The value of the {@code diagnosis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
  @Override
  public java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> diagnosis() {
    return java.util.Optional.ofNullable(diagnosis);
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
   * @return The value of the {@code careManager} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("careManager")
  @Override
  public java.util.Optional<com.fhir.Reference> careManager() {
    return java.util.Optional.ofNullable(careManager);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.EpisodeofcareStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code statusHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> statusHistory() {
    return java.util.Optional.ofNullable(statusHistory);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code managingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> managingOrganization() {
    return java.util.Optional.ofNullable(managingOrganization);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code team} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("team")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> team() {
    return java.util.Optional.ofNullable(team);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EpisodeOfCare#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEpisodeOfCare withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableEpisodeOfCare(
        newValue,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withAccount(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        newValue,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withAccount(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        value,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        newValue,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        value,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        newValue,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        value,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        newValue,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        value,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#referralRequest() referralRequest} attribute.
   * @param value The value for referralRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withReferralRequest(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "referralRequest");
    if (this.referralRequest == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        newValue,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#referralRequest() referralRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referralRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withReferralRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.referralRequest == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        value,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        newValue,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        value,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withDiagnosis(java.util.List<com.fhir.EpisodeOfCare_Diagnosis> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_Diagnosis> newValue = java.util.Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        newValue,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withDiagnosis(java.util.Optional<? extends java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        value,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        newValue,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        value,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#careManager() careManager} attribute.
   * @param value The value for careManager
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withCareManager(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "careManager");
    if (this.careManager == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        newValue,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#careManager() careManager} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careManager
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withCareManager(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.careManager == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        value,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withStatus(com.fhir.EpisodeofcareStatus value) {
    @javax.annotation.Nullable com.fhir.EpisodeofcareStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        newValue,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withStatus(java.util.Optional<? extends com.fhir.EpisodeofcareStatus> optional) {
    @javax.annotation.Nullable com.fhir.EpisodeofcareStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        value,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#statusHistory() statusHistory} attribute.
   * @param value The value for statusHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withStatusHistory(java.util.List<com.fhir.EpisodeOfCare_StatusHistory> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_StatusHistory> newValue = java.util.Objects.requireNonNull(value, "statusHistory");
    if (this.statusHistory == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        newValue,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#statusHistory() statusHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withStatusHistory(java.util.Optional<? extends java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_StatusHistory> value = optional.orElse(null);
    if (this.statusHistory == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        value,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        newValue,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        value,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        newValue,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        value,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withManagingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        newValue,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withManagingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        value,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        newValue,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        value,
        this.text,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        newValue,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        value,
        this.identifier,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        newValue,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        value,
        this.team,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#team() team} attribute.
   * @param value The value for team
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withTeam(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "team");
    if (this.team == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        newValue,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#team() team} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for team
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withTeam(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.team == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        value,
        this.period,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EpisodeOfCare#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEpisodeOfCare withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEpisodeOfCare(
        this.patient,
        this.account,
        this.meta,
        this.id,
        this.type,
        this.referralRequest,
        this.language,
        this.diagnosis,
        this.modifierExtension,
        this.careManager,
        this.status,
        this.statusHistory,
        this.contained,
        this.extension,
        this.managingOrganization,
        this.implicitRules,
        this.text,
        this.identifier,
        this.team,
        this.period,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEpisodeOfCare} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEpisodeOfCare
        && equalTo((ImmutableEpisodeOfCare) another);
  }

  private boolean equalTo(ImmutableEpisodeOfCare another) {
    return patient.equals(another.patient)
        && java.util.Objects.equals(account, another.account)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(referralRequest, another.referralRequest)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(diagnosis, another.diagnosis)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(careManager, another.careManager)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(statusHistory, another.statusHistory)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(managingOrganization, another.managingOrganization)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(team, another.team)
        && java.util.Objects.equals(period, another.period)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code patient}, {@code account}, {@code meta}, {@code id}, {@code type}, {@code referralRequest}, {@code language}, {@code diagnosis}, {@code modifierExtension}, {@code careManager}, {@code status}, {@code statusHistory}, {@code contained}, {@code extension}, {@code managingOrganization}, {@code implicitRules}, {@code text}, {@code identifier}, {@code team}, {@code period}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(account);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(referralRequest);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(diagnosis);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(careManager);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(statusHistory);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(managingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(team);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EpisodeOfCare} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("EpisodeOfCare{");
    builder.append("patient=").append(patient);
    if (account != null) {
      builder.append(", ");
      builder.append("account=").append(account);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (referralRequest != null) {
      builder.append(", ");
      builder.append("referralRequest=").append(referralRequest);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (diagnosis != null) {
      builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (careManager != null) {
      builder.append(", ");
      builder.append("careManager=").append(careManager);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (statusHistory != null) {
      builder.append(", ");
      builder.append("statusHistory=").append(statusHistory);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (managingOrganization != null) {
      builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (team != null) {
      builder.append(", ");
      builder.append("team=").append(team);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "EpisodeOfCare", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.EpisodeOfCare {
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> account = java.util.Optional.empty();
    boolean accountIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> referralRequest = java.util.Optional.empty();
    boolean referralRequestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> diagnosis = java.util.Optional.empty();
    boolean diagnosisIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> careManager = java.util.Optional.empty();
    boolean careManagerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EpisodeofcareStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> statusHistory = java.util.Optional.empty();
    boolean statusHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> managingOrganization = java.util.Optional.empty();
    boolean managingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> team = java.util.Optional.empty();
    boolean teamIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public void setAccount(java.util.Optional<java.util.List<com.fhir.Reference>> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referralRequest")
    public void setReferralRequest(java.util.Optional<java.util.List<com.fhir.Reference>> referralRequest) {
      this.referralRequest = referralRequest;
      this.referralRequestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public void setDiagnosis(java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("careManager")
    public void setCareManager(java.util.Optional<com.fhir.Reference> careManager) {
      this.careManager = careManager;
      this.careManagerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.EpisodeofcareStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusHistory")
    public void setStatusHistory(java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> statusHistory) {
      this.statusHistory = statusHistory;
      this.statusHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public void setManagingOrganization(java.util.Optional<com.fhir.Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("team")
    public void setTeam(java.util.Optional<java.util.List<com.fhir.Reference>> team) {
      this.team = team;
      this.teamIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> account() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> referralRequest() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> careManager() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EpisodeofcareStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> statusHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> team() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEpisodeOfCare fromJson(Json json) {
    ImmutableEpisodeOfCare.Builder builder = ((ImmutableEpisodeOfCare.Builder) ImmutableEpisodeOfCare.builder());
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.referralRequestIsSet) {
      builder.referralRequest(json.referralRequest);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.careManagerIsSet) {
      builder.careManager(json.careManager);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.statusHistoryIsSet) {
      builder.statusHistory(json.statusHistory);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.teamIsSet) {
      builder.team(json.team);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableEpisodeOfCare) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EpisodeOfCare} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EpisodeOfCare instance
   */
  public static EpisodeOfCare copyOf(EpisodeOfCare instance) {
    if (instance instanceof ImmutableEpisodeOfCare) {
      return (ImmutableEpisodeOfCare) instance;
    }
    return ((ImmutableEpisodeOfCare.Builder) ImmutableEpisodeOfCare.builder())
        .patient(instance.patient())
        .account(instance.account())
        .meta(instance.meta())
        .id(instance.id())
        .type(instance.type())
        .referralRequest(instance.referralRequest())
        .language(instance.language())
        .diagnosis(instance.diagnosis())
        .modifierExtension(instance.modifierExtension())
        .careManager(instance.careManager())
        .status(instance.status())
        .statusHistory(instance.statusHistory())
        .contained(instance.contained())
        .extension(instance.extension())
        .managingOrganization(instance.managingOrganization())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .identifier(instance.identifier())
        .team(instance.team())
        .period(instance.period())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link EpisodeOfCare EpisodeOfCare}.
   * <pre>
   * ImmutableEpisodeOfCare.builder()
   *    .patient(com.fhir.Reference) // required {@link EpisodeOfCare#patient() patient}
   *    .account(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link EpisodeOfCare#account() account}
   *    .meta(com.fhir.Meta) // optional {@link EpisodeOfCare#meta() meta}
   *    .id(com.fhir.id) // optional {@link EpisodeOfCare#id() id}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link EpisodeOfCare#type() type}
   *    .referralRequest(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link EpisodeOfCare#referralRequest() referralRequest}
   *    .language(com.fhir.code) // optional {@link EpisodeOfCare#language() language}
   *    .diagnosis(List&amp;lt;com.fhir.EpisodeOfCare_Diagnosis&amp;gt;) // optional {@link EpisodeOfCare#diagnosis() diagnosis}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare#modifierExtension() modifierExtension}
   *    .careManager(com.fhir.Reference) // optional {@link EpisodeOfCare#careManager() careManager}
   *    .status(com.fhir.EpisodeofcareStatus) // optional {@link EpisodeOfCare#status() status}
   *    .statusHistory(List&amp;lt;com.fhir.EpisodeOfCare_StatusHistory&amp;gt;) // optional {@link EpisodeOfCare#statusHistory() statusHistory}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link EpisodeOfCare#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare#extension() extension}
   *    .managingOrganization(com.fhir.Reference) // optional {@link EpisodeOfCare#managingOrganization() managingOrganization}
   *    .implicitRules(com.fhir.uri) // optional {@link EpisodeOfCare#implicitRules() implicitRules}
   *    .text(com.fhir.Narrative) // optional {@link EpisodeOfCare#text() text}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link EpisodeOfCare#identifier() identifier}
   *    .team(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link EpisodeOfCare#team() team}
   *    .period(com.fhir.Period) // optional {@link EpisodeOfCare#period() period}
   *    .resourceType(String) // required {@link EpisodeOfCare#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new EpisodeOfCare builder
   */
  public static PatientBuildStage builder() {
    return new ImmutableEpisodeOfCare.Builder();
  }

  /**
   * Builds instances of type {@link EpisodeOfCare EpisodeOfCare}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "EpisodeOfCare", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PatientBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_ACCOUNT = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_REFERRAL_REQUEST = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_DIAGNOSIS = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_CARE_MANAGER = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_STATUS_HISTORY = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_TEAM = 0x20000L;
    private static final long OPT_BIT_PERIOD = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> account;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> referralRequest;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_Diagnosis> diagnosis;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference careManager;
    private @javax.annotation.Nullable com.fhir.EpisodeofcareStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.EpisodeOfCare_StatusHistory> statusHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference managingOrganization;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> team;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable java.lang.String resourceType;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link EpisodeOfCare#patient() patient} attribute.
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
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(java.util.List<com.fhir.Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = java.util.Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public final Builder account(java.util.Optional<? extends java.util.List<com.fhir.Reference>> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
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
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
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
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder referralRequest(java.util.List<com.fhir.Reference> referralRequest) {
      checkNotIsSet(referralRequestIsSet(), "referralRequest");
      this.referralRequest = java.util.Objects.requireNonNull(referralRequest, "referralRequest");
      optBits |= OPT_BIT_REFERRAL_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referralRequest")
    public final Builder referralRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> referralRequest) {
      checkNotIsSet(referralRequestIsSet(), "referralRequest");
      this.referralRequest = referralRequest.orElse(null);
      optBits |= OPT_BIT_REFERRAL_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
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
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
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
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(java.util.List<com.fhir.EpisodeOfCare_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = java.util.Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public final Builder diagnosis(java.util.Optional<? extends java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for chained invocation
     */
    public final Builder careManager(com.fhir.Reference careManager) {
      checkNotIsSet(careManagerIsSet(), "careManager");
      this.careManager = java.util.Objects.requireNonNull(careManager, "careManager");
      optBits |= OPT_BIT_CARE_MANAGER;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("careManager")
    public final Builder careManager(java.util.Optional<? extends com.fhir.Reference> careManager) {
      checkNotIsSet(careManagerIsSet(), "careManager");
      this.careManager = careManager.orElse(null);
      optBits |= OPT_BIT_CARE_MANAGER;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.EpisodeofcareStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.EpisodeofcareStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusHistory(java.util.List<com.fhir.EpisodeOfCare_StatusHistory> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = java.util.Objects.requireNonNull(statusHistory, "statusHistory");
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusHistory")
    public final Builder statusHistory(java.util.Optional<? extends java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = statusHistory.orElse(null);
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
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
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
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
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingOrganization(com.fhir.Reference managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = java.util.Objects.requireNonNull(managingOrganization, "managingOrganization");
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public final Builder managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = managingOrganization.orElse(null);
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
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
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
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
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for chained invocation
     */
    public final Builder team(java.util.List<com.fhir.Reference> team) {
      checkNotIsSet(teamIsSet(), "team");
      this.team = java.util.Objects.requireNonNull(team, "team");
      optBits |= OPT_BIT_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("team")
    public final Builder team(java.util.Optional<? extends java.util.List<com.fhir.Reference>> team) {
      checkNotIsSet(teamIsSet(), "team");
      this.team = team.orElse(null);
      optBits |= OPT_BIT_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
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
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
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
     * Initializes the value for the {@link EpisodeOfCare#resourceType() resourceType} attribute.
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
     * Builds a new {@link EpisodeOfCare EpisodeOfCare}.
     * @return An immutable instance of EpisodeOfCare
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.EpisodeOfCare build() {
      checkRequiredAttributes();
      return new ImmutableEpisodeOfCare(
          patient,
          account,
          meta,
          id,
          type,
          referralRequest,
          language,
          diagnosis,
          modifierExtension,
          careManager,
          status,
          statusHistory,
          contained,
          extension,
          managingOrganization,
          implicitRules,
          text,
          identifier,
          team,
          period,
          resourceType);
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean referralRequestIsSet() {
      return (optBits & OPT_BIT_REFERRAL_REQUEST) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean careManagerIsSet() {
      return (optBits & OPT_BIT_CARE_MANAGER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean statusHistoryIsSet() {
      return (optBits & OPT_BIT_STATUS_HISTORY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean teamIsSet() {
      return (optBits & OPT_BIT_TEAM) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of EpisodeOfCare is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build EpisodeOfCare, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "EpisodeOfCare", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link EpisodeOfCare#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "EpisodeOfCare", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EpisodeOfCare#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "EpisodeOfCare", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(java.util.List<com.fhir.Reference> account);

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(java.util.Optional<? extends java.util.List<com.fhir.Reference>> account);

    /**
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referralRequest(java.util.List<com.fhir.Reference> referralRequest);

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referralRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> referralRequest);

    /**
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(java.util.List<com.fhir.EpisodeOfCare_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(java.util.Optional<? extends java.util.List<com.fhir.EpisodeOfCare_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careManager(com.fhir.Reference careManager);

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careManager(java.util.Optional<? extends com.fhir.Reference> careManager);

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.EpisodeofcareStatus status);

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.EpisodeofcareStatus> status);

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusHistory(java.util.List<com.fhir.EpisodeOfCare_StatusHistory> statusHistory);

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusHistory(java.util.Optional<? extends java.util.List<com.fhir.EpisodeOfCare_StatusHistory>> statusHistory);

    /**
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(com.fhir.Reference managingOrganization);

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization);

    /**
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for chained invocation
     */
    BuildFinal team(java.util.List<com.fhir.Reference> team);

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal team(java.util.Optional<? extends java.util.List<com.fhir.Reference>> team);

    /**
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Builds a new {@link EpisodeOfCare EpisodeOfCare}.
     * @return An immutable instance of EpisodeOfCare
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EpisodeOfCare build();
  }
}
