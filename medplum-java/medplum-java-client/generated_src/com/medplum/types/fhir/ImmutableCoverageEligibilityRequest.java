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
 * Immutable implementation of {@link CoverageEligibilityRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityRequest.builder()}.
 */
@Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityRequest
    implements CoverageEligibilityRequest {
  private final @Nullable Reference enterer;
  private final String resourceType;
  private final @Nullable Reference provider;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable List<CoverageEligibilityRequest_SupportingInfo> supportingInfo;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CoverageEligibilityRequest_Insurance> insurance;
  private final @Nullable Reference facility;
  private final @Nullable String servicedDate;
  private final Reference insurer;
  private final @Nullable List<CoverageEligibilityRequest_Item> item;
  private final @Nullable Period servicedPeriod;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code status;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CoverageeligibilityrequestPurposeItem> purpose;
  private final @Nullable DateTime created;
  private final @Nullable CodeableConcept priority;
  private final Reference patient;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableCoverageEligibilityRequest(
      @Nullable Reference enterer,
      String resourceType,
      @Nullable Reference provider,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable List<CoverageEligibilityRequest_SupportingInfo> supportingInfo,
      @Nullable List<ResourceList> contained,
      @Nullable List<CoverageEligibilityRequest_Insurance> insurance,
      @Nullable Reference facility,
      @Nullable String servicedDate,
      Reference insurer,
      @Nullable List<CoverageEligibilityRequest_Item> item,
      @Nullable Period servicedPeriod,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      @Nullable Code status,
      @Nullable Uri implicitRules,
      @Nullable List<CoverageeligibilityrequestPurposeItem> purpose,
      @Nullable DateTime created,
      @Nullable CodeableConcept priority,
      Reference patient,
      @Nullable List<Identifier> identifier,
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension) {
    this.enterer = enterer;
    this.resourceType = resourceType;
    this.provider = provider;
    this.meta = meta;
    this.text = text;
    this.supportingInfo = supportingInfo;
    this.contained = contained;
    this.insurance = insurance;
    this.facility = facility;
    this.servicedDate = servicedDate;
    this.insurer = insurer;
    this.item = item;
    this.servicedPeriod = servicedPeriod;
    this.id = id;
    this.extension = extension;
    this.status = status;
    this.implicitRules = implicitRules;
    this.purpose = purpose;
    this.created = created;
    this.priority = priority;
    this.patient = patient;
    this.identifier = identifier;
    this.language = language;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<Reference> provider() {
    return Optional.ofNullable(provider);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
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
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public Optional<List<CoverageEligibilityRequest_Insurance>> insurance() {
    return Optional.ofNullable(insurance);
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
   * @return The value of the {@code servicedDate} attribute
   */
  @JsonProperty("servicedDate")
  @Override
  public Optional<String> servicedDate() {
    return Optional.ofNullable(servicedDate);
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
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<CoverageEligibilityRequest_Item>> item() {
    return Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code servicedPeriod} attribute
   */
  @JsonProperty("servicedPeriod")
  @Override
  public Optional<Period> servicedPeriod() {
    return Optional.ofNullable(servicedPeriod);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<List<CoverageeligibilityrequestPurposeItem>> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<CodeableConcept> priority() {
    return Optional.ofNullable(priority);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withEnterer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        newValue,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withEnterer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        value,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        newValue,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        newValue,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        value,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        newValue,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        value,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        newValue,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        value,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withSupportingInfo(List<CoverageEligibilityRequest_SupportingInfo> value) {
    @Nullable List<CoverageEligibilityRequest_SupportingInfo> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        newValue,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withSupportingInfo(Optional<? extends List<CoverageEligibilityRequest_SupportingInfo>> optional) {
    @Nullable List<CoverageEligibilityRequest_SupportingInfo> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        value,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        newValue,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        value,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withInsurance(List<CoverageEligibilityRequest_Insurance> value) {
    @Nullable List<CoverageEligibilityRequest_Insurance> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        newValue,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withInsurance(Optional<? extends List<CoverageEligibilityRequest_Insurance>> optional) {
    @Nullable List<CoverageEligibilityRequest_Insurance> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        value,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withFacility(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        newValue,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withFacility(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        value,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withServicedDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "servicedDate");
    if (Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        newValue,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withServicedDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        value,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withInsurer(Reference value) {
    if (this.insurer == value) return this;
    Reference newValue = Objects.requireNonNull(value, "insurer");
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        newValue,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withItem(List<CoverageEligibilityRequest_Item> value) {
    @Nullable List<CoverageEligibilityRequest_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        newValue,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withItem(Optional<? extends List<CoverageEligibilityRequest_Item>> optional) {
    @Nullable List<CoverageEligibilityRequest_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        value,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withServicedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        newValue,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withServicedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        value,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        newValue,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        value,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        newValue,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        value,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        newValue,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        value,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        newValue,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        value,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withPurpose(List<CoverageeligibilityrequestPurposeItem> value) {
    @Nullable List<CoverageeligibilityrequestPurposeItem> newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        newValue,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withPurpose(Optional<? extends List<CoverageeligibilityrequestPurposeItem>> optional) {
    @Nullable List<CoverageeligibilityrequestPurposeItem> value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        value,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        newValue,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        value,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withPriority(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        newValue,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withPriority(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        value,
        this.patient,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        newValue,
        this.identifier,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        newValue,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        value,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.enterer,
        this.resourceType,
        this.provider,
        this.meta,
        this.text,
        this.supportingInfo,
        this.contained,
        this.insurance,
        this.facility,
        this.servicedDate,
        this.insurer,
        this.item,
        this.servicedPeriod,
        this.id,
        this.extension,
        this.status,
        this.implicitRules,
        this.purpose,
        this.created,
        this.priority,
        this.patient,
        this.identifier,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityRequest
        && equalTo((ImmutableCoverageEligibilityRequest) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityRequest another) {
    return Objects.equals(enterer, another.enterer)
        && resourceType.equals(another.resourceType)
        && Objects.equals(provider, another.provider)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(contained, another.contained)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(facility, another.facility)
        && Objects.equals(servicedDate, another.servicedDate)
        && insurer.equals(another.insurer)
        && Objects.equals(item, another.item)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(status, another.status)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(created, another.created)
        && Objects.equals(priority, another.priority)
        && patient.equals(another.patient)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code enterer}, {@code resourceType}, {@code provider}, {@code meta}, {@code text}, {@code supportingInfo}, {@code contained}, {@code insurance}, {@code facility}, {@code servicedDate}, {@code insurer}, {@code item}, {@code servicedPeriod}, {@code id}, {@code extension}, {@code status}, {@code implicitRules}, {@code purpose}, {@code created}, {@code priority}, {@code patient}, {@code identifier}, {@code language}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(enterer);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(facility);
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityRequest{");
    if (enterer != null) {
      builder.append("enterer=").append(enterer);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (provider != null) {
      builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (facility != null) {
      builder.append(", ");
      builder.append("facility=").append(facility);
    }
    if (servicedDate != null) {
      builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityRequest {
    @Nullable Optional<Reference> enterer = Optional.empty();
    boolean entererIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CoverageEligibilityRequest_Insurance>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<Reference> facility = Optional.empty();
    boolean facilityIsSet;
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Reference insurer;
    @Nullable Optional<List<CoverageEligibilityRequest_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CoverageeligibilityrequestPurposeItem>> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<CodeableConcept> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Reference patient;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("enterer")
    public void setEnterer(Optional<Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<CoverageEligibilityRequest_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("facility")
    public void setFacility(Optional<Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
    }
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
      this.insurer = insurer;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<CoverageEligibilityRequest_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Optional<Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<List<CoverageeligibilityrequestPurposeItem>> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageeligibilityrequestPurposeItem>> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityRequest fromJson(Json json) {
    ImmutableCoverageEligibilityRequest.Builder builder = ((ImmutableCoverageEligibilityRequest.Builder) ImmutableCoverageEligibilityRequest.builder());
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableCoverageEligibilityRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityRequest instance
   */
  public static CoverageEligibilityRequest copyOf(CoverageEligibilityRequest instance) {
    if (instance instanceof ImmutableCoverageEligibilityRequest) {
      return (ImmutableCoverageEligibilityRequest) instance;
    }
    return ((ImmutableCoverageEligibilityRequest.Builder) ImmutableCoverageEligibilityRequest.builder())
        .enterer(instance.enterer())
        .resourceType(instance.resourceType())
        .provider(instance.provider())
        .meta(instance.meta())
        .text(instance.text())
        .supportingInfo(instance.supportingInfo())
        .contained(instance.contained())
        .insurance(instance.insurance())
        .facility(instance.facility())
        .servicedDate(instance.servicedDate())
        .insurer(instance.insurer())
        .item(instance.item())
        .servicedPeriod(instance.servicedPeriod())
        .id(instance.id())
        .extension(instance.extension())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .purpose(instance.purpose())
        .created(instance.created())
        .priority(instance.priority())
        .patient(instance.patient())
        .identifier(instance.identifier())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
   * <pre>
   * ImmutableCoverageEligibilityRequest.builder()
   *    .enterer(com.medplum.types.fhir.Reference) // optional {@link CoverageEligibilityRequest#enterer() enterer}
   *    .resourceType(String) // required {@link CoverageEligibilityRequest#resourceType() resourceType}
   *    .provider(com.medplum.types.fhir.Reference) // optional {@link CoverageEligibilityRequest#provider() provider}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link CoverageEligibilityRequest#meta() meta}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link CoverageEligibilityRequest#text() text}
   *    .supportingInfo(List&amp;lt;com.medplum.types.fhir.CoverageEligibilityRequest_SupportingInfo&amp;gt;) // optional {@link CoverageEligibilityRequest#supportingInfo() supportingInfo}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link CoverageEligibilityRequest#contained() contained}
   *    .insurance(List&amp;lt;com.medplum.types.fhir.CoverageEligibilityRequest_Insurance&amp;gt;) // optional {@link CoverageEligibilityRequest#insurance() insurance}
   *    .facility(com.medplum.types.fhir.Reference) // optional {@link CoverageEligibilityRequest#facility() facility}
   *    .servicedDate(String) // optional {@link CoverageEligibilityRequest#servicedDate() servicedDate}
   *    .insurer(com.medplum.types.fhir.Reference) // required {@link CoverageEligibilityRequest#insurer() insurer}
   *    .item(List&amp;lt;com.medplum.types.fhir.CoverageEligibilityRequest_Item&amp;gt;) // optional {@link CoverageEligibilityRequest#item() item}
   *    .servicedPeriod(com.medplum.types.fhir.Period) // optional {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod}
   *    .id(com.medplum.types.fhir.Id) // optional {@link CoverageEligibilityRequest#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest#extension() extension}
   *    .status(com.medplum.types.fhir.Code) // optional {@link CoverageEligibilityRequest#status() status}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link CoverageEligibilityRequest#implicitRules() implicitRules}
   *    .purpose(List&amp;lt;com.medplum.types.fhir.CoverageeligibilityrequestPurposeItem&amp;gt;) // optional {@link CoverageEligibilityRequest#purpose() purpose}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link CoverageEligibilityRequest#created() created}
   *    .priority(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityRequest#priority() priority}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link CoverageEligibilityRequest#patient() patient}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link CoverageEligibilityRequest#identifier() identifier}
   *    .language(com.medplum.types.fhir.Code) // optional {@link CoverageEligibilityRequest#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityRequest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCoverageEligibilityRequest.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, InsurerBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_INSURER = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long OPT_BIT_ENTERER = 0x1L;
    private static final long OPT_BIT_PROVIDER = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_INSURANCE = 0x40L;
    private static final long OPT_BIT_FACILITY = 0x80L;
    private static final long OPT_BIT_SERVICED_DATE = 0x100L;
    private static final long OPT_BIT_ITEM = 0x200L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_PURPOSE = 0x8000L;
    private static final long OPT_BIT_CREATED = 0x10000L;
    private static final long OPT_BIT_PRIORITY = 0x20000L;
    private static final long OPT_BIT_IDENTIFIER = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable Reference enterer;
    private @Nullable String resourceType;
    private @Nullable Reference provider;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable List<CoverageEligibilityRequest_SupportingInfo> supportingInfo;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CoverageEligibilityRequest_Insurance> insurance;
    private @Nullable Reference facility;
    private @Nullable String servicedDate;
    private @Nullable Reference insurer;
    private @Nullable List<CoverageEligibilityRequest_Item> item;
    private @Nullable Period servicedPeriod;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable Code status;
    private @Nullable Uri implicitRules;
    private @Nullable List<CoverageeligibilityrequestPurposeItem> purpose;
    private @Nullable DateTime created;
    private @Nullable CodeableConcept priority;
    private @Nullable Reference patient;
    private @Nullable List<Identifier> identifier;
    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
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
     * Initializes the value for the {@link CoverageEligibilityRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Optional<? extends Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<CoverageEligibilityRequest_SupportingInfo> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(List<CoverageEligibilityRequest_Insurance> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurance")
    public final Builder insurance(Optional<? extends List<CoverageEligibilityRequest_Insurance>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedDate(String servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = Objects.requireNonNull(servicedDate, "servicedDate");
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("servicedDate")
    public final Builder servicedDate(Optional<String> servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = servicedDate.orElse(null);
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#insurer() insurer} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<CoverageEligibilityRequest_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<CoverageEligibilityRequest_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedPeriod(Period servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = Objects.requireNonNull(servicedPeriod, "servicedPeriod");
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("servicedPeriod")
    public final Builder servicedPeriod(Optional<? extends Period> servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = servicedPeriod.orElse(null);
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(List<CoverageeligibilityrequestPurposeItem> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends List<CoverageeligibilityrequestPurposeItem>> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
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
     * Initializes the value for the {@link CoverageEligibilityRequest#patient() patient} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
     * @return An immutable instance of CoverageEligibilityRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityRequest build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityRequest(
          enterer,
          resourceType,
          provider,
          meta,
          text,
          supportingInfo,
          contained,
          insurance,
          facility,
          servicedDate,
          insurer,
          item,
          servicedPeriod,
          id,
          extension,
          status,
          implicitRules,
          purpose,
          created,
          priority,
          patient,
          identifier,
          language,
          modifierExtension);
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
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

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!insurerIsSet()) attributes.add("insurer");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build CoverageEligibilityRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    InsurerBuildStage resourceType(String resourceType);
  }

  @Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage insurer(Reference insurer);
  }

  @Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(Reference enterer);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(Optional<? extends Reference> enterer);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(Reference provider);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Optional<? extends Reference> provider);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<CoverageEligibilityRequest_SupportingInfo> supportingInfo);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<CoverageEligibilityRequest_Insurance> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<CoverageEligibilityRequest_Insurance>> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal facility(Reference facility);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal facility(Optional<? extends Reference> facility);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(String servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(Optional<String> servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<CoverageEligibilityRequest_Item> item);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<CoverageEligibilityRequest_Item>> item);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(Period servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(Optional<? extends Period> servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(List<CoverageeligibilityrequestPurposeItem> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends List<CoverageeligibilityrequestPurposeItem>> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(CodeableConcept priority);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends CodeableConcept> priority);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
     * @return An immutable instance of CoverageEligibilityRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityRequest build();
  }
}
