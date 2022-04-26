package com.fhir.types.fhir;

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
 * Immutable implementation of {@link EpisodeOfCare}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEpisodeOfCare.builder()}.
 */
@Generated(from = "EpisodeOfCare", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEpisodeOfCare implements EpisodeOfCare {
  private final @Nullable List<Reference> team;
  private final @Nullable List<CodeableConcept> type;
  private final String resourceType;
  private final @Nullable Narrative text;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> referralRequest;
  private final @Nullable Reference careManager;
  private final @Nullable Meta meta;
  private final @Nullable List<EpisodeOfCare_Diagnosis> diagnosis;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Code language;
  private final @Nullable EpisodeofcareStatus status;
  private final @Nullable List<Reference> account;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Period period;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<EpisodeOfCare_StatusHistory> statusHistory;
  private final @Nullable Reference managingOrganization;
  private final Reference patient;

  private ImmutableEpisodeOfCare(
      @Nullable List<Reference> team,
      @Nullable List<CodeableConcept> type,
      String resourceType,
      @Nullable Narrative text,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> referralRequest,
      @Nullable Reference careManager,
      @Nullable Meta meta,
      @Nullable List<EpisodeOfCare_Diagnosis> diagnosis,
      @Nullable Uri implicitRules,
      @Nullable List<Identifier> identifier,
      @Nullable Code language,
      @Nullable EpisodeofcareStatus status,
      @Nullable List<Reference> account,
      @Nullable List<ResourceList> contained,
      @Nullable Period period,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<EpisodeOfCare_StatusHistory> statusHistory,
      @Nullable Reference managingOrganization,
      Reference patient) {
    this.team = team;
    this.type = type;
    this.resourceType = resourceType;
    this.text = text;
    this.id = id;
    this.extension = extension;
    this.referralRequest = referralRequest;
    this.careManager = careManager;
    this.meta = meta;
    this.diagnosis = diagnosis;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
    this.language = language;
    this.status = status;
    this.account = account;
    this.contained = contained;
    this.period = period;
    this.modifierExtension = modifierExtension;
    this.statusHistory = statusHistory;
    this.managingOrganization = managingOrganization;
    this.patient = patient;
  }

  /**
   * @return The value of the {@code team} attribute
   */
  @JsonProperty("team")
  @Override
  public Optional<List<Reference>> team() {
    return Optional.ofNullable(team);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code referralRequest} attribute
   */
  @JsonProperty("referralRequest")
  @Override
  public Optional<List<Reference>> referralRequest() {
    return Optional.ofNullable(referralRequest);
  }

  /**
   * @return The value of the {@code careManager} attribute
   */
  @JsonProperty("careManager")
  @Override
  public Optional<Reference> careManager() {
    return Optional.ofNullable(careManager);
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
   * @return The value of the {@code diagnosis} attribute
   */
  @JsonProperty("diagnosis")
  @Override
  public Optional<List<EpisodeOfCare_Diagnosis>> diagnosis() {
    return Optional.ofNullable(diagnosis);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<EpisodeofcareStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code account} attribute
   */
  @JsonProperty("account")
  @Override
  public Optional<List<Reference>> account() {
    return Optional.ofNullable(account);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
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
   * @return The value of the {@code statusHistory} attribute
   */
  @JsonProperty("statusHistory")
  @Override
  public Optional<List<EpisodeOfCare_StatusHistory>> statusHistory() {
    return Optional.ofNullable(statusHistory);
  }

  /**
   * @return The value of the {@code managingOrganization} attribute
   */
  @JsonProperty("managingOrganization")
  @Override
  public Optional<Reference> managingOrganization() {
    return Optional.ofNullable(managingOrganization);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#team() team} attribute.
   * @param value The value for team
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withTeam(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "team");
    if (this.team == newValue) return this;
    return new ImmutableEpisodeOfCare(
        newValue,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#team() team} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for team
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withTeam(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.team == value) return this;
    return new ImmutableEpisodeOfCare(
        value,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        newValue,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        value,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EpisodeOfCare#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEpisodeOfCare withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        newValue,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        newValue,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        value,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        newValue,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        value,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        newValue,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        value,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#referralRequest() referralRequest} attribute.
   * @param value The value for referralRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withReferralRequest(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "referralRequest");
    if (this.referralRequest == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        newValue,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#referralRequest() referralRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referralRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withReferralRequest(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.referralRequest == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        value,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#careManager() careManager} attribute.
   * @param value The value for careManager
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withCareManager(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "careManager");
    if (this.careManager == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        newValue,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#careManager() careManager} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careManager
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withCareManager(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.careManager == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        value,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        newValue,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        value,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withDiagnosis(List<EpisodeOfCare_Diagnosis> value) {
    @Nullable List<EpisodeOfCare_Diagnosis> newValue = Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        newValue,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withDiagnosis(Optional<? extends List<EpisodeOfCare_Diagnosis>> optional) {
    @Nullable List<EpisodeOfCare_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        value,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        newValue,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        value,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        newValue,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        value,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        newValue,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        value,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withStatus(EpisodeofcareStatus value) {
    @Nullable EpisodeofcareStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        newValue,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withStatus(Optional<? extends EpisodeofcareStatus> optional) {
    @Nullable EpisodeofcareStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        value,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withAccount(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        newValue,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withAccount(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        value,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        newValue,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        value,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        newValue,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        value,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        newValue,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        value,
        this.statusHistory,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#statusHistory() statusHistory} attribute.
   * @param value The value for statusHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withStatusHistory(List<EpisodeOfCare_StatusHistory> value) {
    @Nullable List<EpisodeOfCare_StatusHistory> newValue = Objects.requireNonNull(value, "statusHistory");
    if (this.statusHistory == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        newValue,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#statusHistory() statusHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withStatusHistory(Optional<? extends List<EpisodeOfCare_StatusHistory>> optional) {
    @Nullable List<EpisodeOfCare_StatusHistory> value = optional.orElse(null);
    if (this.statusHistory == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        value,
        this.managingOrganization,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare withManagingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        newValue,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare withManagingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        value,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EpisodeOfCare#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEpisodeOfCare withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableEpisodeOfCare(
        this.team,
        this.type,
        this.resourceType,
        this.text,
        this.id,
        this.extension,
        this.referralRequest,
        this.careManager,
        this.meta,
        this.diagnosis,
        this.implicitRules,
        this.identifier,
        this.language,
        this.status,
        this.account,
        this.contained,
        this.period,
        this.modifierExtension,
        this.statusHistory,
        this.managingOrganization,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEpisodeOfCare} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEpisodeOfCare
        && equalTo((ImmutableEpisodeOfCare) another);
  }

  private boolean equalTo(ImmutableEpisodeOfCare another) {
    return Objects.equals(team, another.team)
        && Objects.equals(type, another.type)
        && resourceType.equals(another.resourceType)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(referralRequest, another.referralRequest)
        && Objects.equals(careManager, another.careManager)
        && Objects.equals(meta, another.meta)
        && Objects.equals(diagnosis, another.diagnosis)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(language, another.language)
        && Objects.equals(status, another.status)
        && Objects.equals(account, another.account)
        && Objects.equals(contained, another.contained)
        && Objects.equals(period, another.period)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(statusHistory, another.statusHistory)
        && Objects.equals(managingOrganization, another.managingOrganization)
        && patient.equals(another.patient);
  }

  /**
   * Computes a hash code from attributes: {@code team}, {@code type}, {@code resourceType}, {@code text}, {@code id}, {@code extension}, {@code referralRequest}, {@code careManager}, {@code meta}, {@code diagnosis}, {@code implicitRules}, {@code identifier}, {@code language}, {@code status}, {@code account}, {@code contained}, {@code period}, {@code modifierExtension}, {@code statusHistory}, {@code managingOrganization}, {@code patient}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(team);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(referralRequest);
    h += (h << 5) + Objects.hashCode(careManager);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(diagnosis);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(account);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(statusHistory);
    h += (h << 5) + Objects.hashCode(managingOrganization);
    h += (h << 5) + patient.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EpisodeOfCare} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EpisodeOfCare{");
    if (team != null) {
      builder.append("team=").append(team);
    }
    if (type != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (referralRequest != null) {
      builder.append(", ");
      builder.append("referralRequest=").append(referralRequest);
    }
    if (careManager != null) {
      builder.append(", ");
      builder.append("careManager=").append(careManager);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (diagnosis != null) {
      builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (account != null) {
      builder.append(", ");
      builder.append("account=").append(account);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (statusHistory != null) {
      builder.append(", ");
      builder.append("statusHistory=").append(statusHistory);
    }
    if (managingOrganization != null) {
      builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EpisodeOfCare", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EpisodeOfCare {
    @Nullable Optional<List<Reference>> team = Optional.empty();
    boolean teamIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> referralRequest = Optional.empty();
    boolean referralRequestIsSet;
    @Nullable Optional<Reference> careManager = Optional.empty();
    boolean careManagerIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<EpisodeOfCare_Diagnosis>> diagnosis = Optional.empty();
    boolean diagnosisIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<EpisodeofcareStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Reference>> account = Optional.empty();
    boolean accountIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<EpisodeOfCare_StatusHistory>> statusHistory = Optional.empty();
    boolean statusHistoryIsSet;
    @Nullable Optional<Reference> managingOrganization = Optional.empty();
    boolean managingOrganizationIsSet;
    @Nullable Reference patient;
    @JsonProperty("team")
    public void setTeam(Optional<List<Reference>> team) {
      this.team = team;
      this.teamIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("referralRequest")
    public void setReferralRequest(Optional<List<Reference>> referralRequest) {
      this.referralRequest = referralRequest;
      this.referralRequestIsSet = true;
    }
    @JsonProperty("careManager")
    public void setCareManager(Optional<Reference> careManager) {
      this.careManager = careManager;
      this.careManagerIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("diagnosis")
    public void setDiagnosis(Optional<List<EpisodeOfCare_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<EpisodeofcareStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("account")
    public void setAccount(Optional<List<Reference>> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("statusHistory")
    public void setStatusHistory(Optional<List<EpisodeOfCare_StatusHistory>> statusHistory) {
      this.statusHistory = statusHistory;
      this.statusHistoryIsSet = true;
    }
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Optional<Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @Override
    public Optional<List<Reference>> team() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> referralRequest() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> careManager() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<EpisodeOfCare_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EpisodeofcareStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> account() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<EpisodeOfCare_StatusHistory>> statusHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEpisodeOfCare fromJson(Json json) {
    ImmutableEpisodeOfCare.Builder builder = ((ImmutableEpisodeOfCare.Builder) ImmutableEpisodeOfCare.builder());
    if (json.teamIsSet) {
      builder.team(json.team);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.referralRequestIsSet) {
      builder.referralRequest(json.referralRequest);
    }
    if (json.careManagerIsSet) {
      builder.careManager(json.careManager);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusHistoryIsSet) {
      builder.statusHistory(json.statusHistory);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
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
        .team(instance.team())
        .type(instance.type())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .id(instance.id())
        .extension(instance.extension())
        .referralRequest(instance.referralRequest())
        .careManager(instance.careManager())
        .meta(instance.meta())
        .diagnosis(instance.diagnosis())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .language(instance.language())
        .status(instance.status())
        .account(instance.account())
        .contained(instance.contained())
        .period(instance.period())
        .modifierExtension(instance.modifierExtension())
        .statusHistory(instance.statusHistory())
        .managingOrganization(instance.managingOrganization())
        .patient(instance.patient())
        .build();
  }

  /**
   * Creates a builder for {@link EpisodeOfCare EpisodeOfCare}.
   * <pre>
   * ImmutableEpisodeOfCare.builder()
   *    .team(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link EpisodeOfCare#team() team}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link EpisodeOfCare#type() type}
   *    .resourceType(String) // required {@link EpisodeOfCare#resourceType() resourceType}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link EpisodeOfCare#text() text}
   *    .id(com.fhir.types.fhir.Id) // optional {@link EpisodeOfCare#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare#extension() extension}
   *    .referralRequest(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link EpisodeOfCare#referralRequest() referralRequest}
   *    .careManager(com.fhir.types.fhir.Reference) // optional {@link EpisodeOfCare#careManager() careManager}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link EpisodeOfCare#meta() meta}
   *    .diagnosis(List&amp;lt;com.fhir.types.fhir.EpisodeOfCare_Diagnosis&amp;gt;) // optional {@link EpisodeOfCare#diagnosis() diagnosis}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link EpisodeOfCare#implicitRules() implicitRules}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link EpisodeOfCare#identifier() identifier}
   *    .language(com.fhir.types.fhir.Code) // optional {@link EpisodeOfCare#language() language}
   *    .status(com.fhir.types.fhir.EpisodeofcareStatus) // optional {@link EpisodeOfCare#status() status}
   *    .account(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link EpisodeOfCare#account() account}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link EpisodeOfCare#contained() contained}
   *    .period(com.fhir.types.fhir.Period) // optional {@link EpisodeOfCare#period() period}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare#modifierExtension() modifierExtension}
   *    .statusHistory(List&amp;lt;com.fhir.types.fhir.EpisodeOfCare_StatusHistory&amp;gt;) // optional {@link EpisodeOfCare#statusHistory() statusHistory}
   *    .managingOrganization(com.fhir.types.fhir.Reference) // optional {@link EpisodeOfCare#managingOrganization() managingOrganization}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link EpisodeOfCare#patient() patient}
   *    .build();
   * </pre>
   * @return A new EpisodeOfCare builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEpisodeOfCare.Builder();
  }

  /**
   * Builds instances of type {@link EpisodeOfCare EpisodeOfCare}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EpisodeOfCare", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long OPT_BIT_TEAM = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_REFERRAL_REQUEST = 0x20L;
    private static final long OPT_BIT_CARE_MANAGER = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_DIAGNOSIS = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_STATUS = 0x1000L;
    private static final long OPT_BIT_ACCOUNT = 0x2000L;
    private static final long OPT_BIT_CONTAINED = 0x4000L;
    private static final long OPT_BIT_PERIOD = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_STATUS_HISTORY = 0x20000L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Reference> team;
    private @Nullable List<CodeableConcept> type;
    private @Nullable String resourceType;
    private @Nullable Narrative text;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> referralRequest;
    private @Nullable Reference careManager;
    private @Nullable Meta meta;
    private @Nullable List<EpisodeOfCare_Diagnosis> diagnosis;
    private @Nullable Uri implicitRules;
    private @Nullable List<Identifier> identifier;
    private @Nullable Code language;
    private @Nullable EpisodeofcareStatus status;
    private @Nullable List<Reference> account;
    private @Nullable List<ResourceList> contained;
    private @Nullable Period period;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<EpisodeOfCare_StatusHistory> statusHistory;
    private @Nullable Reference managingOrganization;
    private @Nullable Reference patient;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for chained invocation
     */
    public final Builder team(List<Reference> team) {
      checkNotIsSet(teamIsSet(), "team");
      this.team = Objects.requireNonNull(team, "team");
      optBits |= OPT_BIT_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("team")
    public final Builder team(Optional<? extends List<Reference>> team) {
      checkNotIsSet(teamIsSet(), "team");
      this.team = team.orElse(null);
      optBits |= OPT_BIT_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link EpisodeOfCare#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
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
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
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
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder referralRequest(List<Reference> referralRequest) {
      checkNotIsSet(referralRequestIsSet(), "referralRequest");
      this.referralRequest = Objects.requireNonNull(referralRequest, "referralRequest");
      optBits |= OPT_BIT_REFERRAL_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referralRequest")
    public final Builder referralRequest(Optional<? extends List<Reference>> referralRequest) {
      checkNotIsSet(referralRequestIsSet(), "referralRequest");
      this.referralRequest = referralRequest.orElse(null);
      optBits |= OPT_BIT_REFERRAL_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for chained invocation
     */
    public final Builder careManager(Reference careManager) {
      checkNotIsSet(careManagerIsSet(), "careManager");
      this.careManager = Objects.requireNonNull(careManager, "careManager");
      optBits |= OPT_BIT_CARE_MANAGER;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("careManager")
    public final Builder careManager(Optional<? extends Reference> careManager) {
      checkNotIsSet(careManagerIsSet(), "careManager");
      this.careManager = careManager.orElse(null);
      optBits |= OPT_BIT_CARE_MANAGER;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
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
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
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
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(List<EpisodeOfCare_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosis")
    public final Builder diagnosis(Optional<? extends List<EpisodeOfCare_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
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
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
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
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(EpisodeofcareStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends EpisodeofcareStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(List<Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("account")
    public final Builder account(Optional<? extends List<Reference>> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
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
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
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
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusHistory(List<EpisodeOfCare_StatusHistory> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = Objects.requireNonNull(statusHistory, "statusHistory");
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusHistory")
    public final Builder statusHistory(Optional<? extends List<EpisodeOfCare_StatusHistory>> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = statusHistory.orElse(null);
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingOrganization(Reference managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = Objects.requireNonNull(managingOrganization, "managingOrganization");
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("managingOrganization")
    public final Builder managingOrganization(Optional<? extends Reference> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = managingOrganization.orElse(null);
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the value for the {@link EpisodeOfCare#patient() patient} attribute.
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
     * Builds a new {@link EpisodeOfCare EpisodeOfCare}.
     * @return An immutable instance of EpisodeOfCare
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EpisodeOfCare build() {
      checkRequiredAttributes();
      return new ImmutableEpisodeOfCare(
          team,
          type,
          resourceType,
          text,
          id,
          extension,
          referralRequest,
          careManager,
          meta,
          diagnosis,
          implicitRules,
          identifier,
          language,
          status,
          account,
          contained,
          period,
          modifierExtension,
          statusHistory,
          managingOrganization,
          patient);
    }

    private boolean teamIsSet() {
      return (optBits & OPT_BIT_TEAM) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean referralRequestIsSet() {
      return (optBits & OPT_BIT_REFERRAL_REQUEST) != 0;
    }

    private boolean careManagerIsSet() {
      return (optBits & OPT_BIT_CARE_MANAGER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusHistoryIsSet() {
      return (optBits & OPT_BIT_STATUS_HISTORY) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EpisodeOfCare is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build EpisodeOfCare, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "EpisodeOfCare", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EpisodeOfCare#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "EpisodeOfCare", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link EpisodeOfCare#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "EpisodeOfCare", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for chained invocation
     */
    BuildFinal team(List<Reference> team);

    /**
     * Initializes the optional value {@link EpisodeOfCare#team() team} to team.
     * @param team The value for team
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal team(Optional<? extends List<Reference>> team);

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<CodeableConcept> type);

    /**
     * Initializes the optional value {@link EpisodeOfCare#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<CodeableConcept>> type);

    /**
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link EpisodeOfCare#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link EpisodeOfCare#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referralRequest(List<Reference> referralRequest);

    /**
     * Initializes the optional value {@link EpisodeOfCare#referralRequest() referralRequest} to referralRequest.
     * @param referralRequest The value for referralRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referralRequest(Optional<? extends List<Reference>> referralRequest);

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careManager(Reference careManager);

    /**
     * Initializes the optional value {@link EpisodeOfCare#careManager() careManager} to careManager.
     * @param careManager The value for careManager
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careManager(Optional<? extends Reference> careManager);

    /**
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link EpisodeOfCare#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(List<EpisodeOfCare_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link EpisodeOfCare#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(Optional<? extends List<EpisodeOfCare_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link EpisodeOfCare#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link EpisodeOfCare#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link EpisodeOfCare#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(EpisodeofcareStatus status);

    /**
     * Initializes the optional value {@link EpisodeOfCare#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends EpisodeofcareStatus> status);

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(List<Reference> account);

    /**
     * Initializes the optional value {@link EpisodeOfCare#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(Optional<? extends List<Reference>> account);

    /**
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link EpisodeOfCare#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link EpisodeOfCare#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusHistory(List<EpisodeOfCare_StatusHistory> statusHistory);

    /**
     * Initializes the optional value {@link EpisodeOfCare#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusHistory(Optional<? extends List<EpisodeOfCare_StatusHistory>> statusHistory);

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(Reference managingOrganization);

    /**
     * Initializes the optional value {@link EpisodeOfCare#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(Optional<? extends Reference> managingOrganization);

    /**
     * Builds a new {@link EpisodeOfCare EpisodeOfCare}.
     * @return An immutable instance of EpisodeOfCare
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EpisodeOfCare build();
  }
}
