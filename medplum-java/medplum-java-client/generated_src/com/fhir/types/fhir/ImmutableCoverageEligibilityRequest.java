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
  private final @Nullable String servicedDate;
  private final @Nullable DateTime created;
  private final @Nullable List<CoverageEligibilityRequest_Insurance> insurance;
  private final @Nullable List<CoverageEligibilityRequest_SupportingInfo> supportingInfo;
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference provider;
  private final @Nullable Reference facility;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable CodeableConcept priority;
  private final @Nullable List<CoverageeligibilityrequestPurposeItem> purpose;
  private final @Nullable Narrative text;
  private final @Nullable Code language;
  private final @Nullable List<CoverageEligibilityRequest_Item> item;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final Reference insurer;
  private final @Nullable Reference enterer;
  private final Reference patient;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period servicedPeriod;
  private final @Nullable Meta meta;
  private final @Nullable Code status;

  private ImmutableCoverageEligibilityRequest(
      @Nullable String servicedDate,
      @Nullable DateTime created,
      @Nullable List<CoverageEligibilityRequest_Insurance> insurance,
      @Nullable List<CoverageEligibilityRequest_SupportingInfo> supportingInfo,
      String resourceType,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable Reference provider,
      @Nullable Reference facility,
      @Nullable List<Identifier> identifier,
      @Nullable CodeableConcept priority,
      @Nullable List<CoverageeligibilityrequestPurposeItem> purpose,
      @Nullable Narrative text,
      @Nullable Code language,
      @Nullable List<CoverageEligibilityRequest_Item> item,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      Reference insurer,
      @Nullable Reference enterer,
      Reference patient,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period servicedPeriod,
      @Nullable Meta meta,
      @Nullable Code status) {
    this.servicedDate = servicedDate;
    this.created = created;
    this.insurance = insurance;
    this.supportingInfo = supportingInfo;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.provider = provider;
    this.facility = facility;
    this.identifier = identifier;
    this.priority = priority;
    this.purpose = purpose;
    this.text = text;
    this.language = language;
    this.item = item;
    this.id = id;
    this.extension = extension;
    this.insurer = insurer;
    this.enterer = enterer;
    this.patient = patient;
    this.modifierExtension = modifierExtension;
    this.servicedPeriod = servicedPeriod;
    this.meta = meta;
    this.status = status;
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
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<Reference> provider() {
    return Optional.ofNullable(provider);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<List<CoverageeligibilityrequestPurposeItem>> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
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
   * @return The value of the {@code servicedPeriod} attribute
   */
  @JsonProperty("servicedPeriod")
  @Override
  public Optional<Period> servicedPeriod() {
    return Optional.ofNullable(servicedPeriod);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
        newValue,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        value,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        newValue,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        value,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        newValue,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        value,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        value,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        newValue,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        newValue,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        value,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        value,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        newValue,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        value,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        newValue,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        value,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        newValue,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        value,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        newValue,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        value,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        newValue,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        value,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        newValue,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        value,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        newValue,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        value,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        newValue,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        value,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        newValue,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        value,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        newValue,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        value,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        newValue,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        newValue,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        value,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        newValue,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        newValue,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        value,
        this.servicedPeriod,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        newValue,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        value,
        this.meta,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        newValue,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        value,
        this.status);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
        newValue);
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
        this.servicedDate,
        this.created,
        this.insurance,
        this.supportingInfo,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.provider,
        this.facility,
        this.identifier,
        this.priority,
        this.purpose,
        this.text,
        this.language,
        this.item,
        this.id,
        this.extension,
        this.insurer,
        this.enterer,
        this.patient,
        this.modifierExtension,
        this.servicedPeriod,
        this.meta,
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
    return Objects.equals(servicedDate, another.servicedDate)
        && Objects.equals(created, another.created)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(provider, another.provider)
        && Objects.equals(facility, another.facility)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(priority, another.priority)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(text, another.text)
        && Objects.equals(language, another.language)
        && Objects.equals(item, another.item)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && insurer.equals(another.insurer)
        && Objects.equals(enterer, another.enterer)
        && patient.equals(another.patient)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(meta, another.meta)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code servicedDate}, {@code created}, {@code insurance}, {@code supportingInfo}, {@code resourceType}, {@code implicitRules}, {@code contained}, {@code provider}, {@code facility}, {@code identifier}, {@code priority}, {@code purpose}, {@code text}, {@code language}, {@code item}, {@code id}, {@code extension}, {@code insurer}, {@code enterer}, {@code patient}, {@code modifierExtension}, {@code servicedPeriod}, {@code meta}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(facility);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + Objects.hashCode(enterer);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityRequest{");
    if (servicedDate != null) {
      builder.append("servicedDate=").append(servicedDate);
    }
    if (created != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("created=").append(created);
    }
    if (insurance != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (supportingInfo != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (provider != null) {
      builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (facility != null) {
      builder.append(", ");
      builder.append("facility=").append(facility);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
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
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<List<CoverageEligibilityRequest_Insurance>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<Reference> facility = Optional.empty();
    boolean facilityIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<List<CoverageeligibilityrequestPurposeItem>> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<CoverageEligibilityRequest_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference insurer;
    @Nullable Optional<Reference> enterer = Optional.empty();
    boolean entererIsSet;
    @Nullable Reference patient;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<CoverageEligibilityRequest_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("facility")
    public void setFacility(Optional<Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<List<CoverageeligibilityrequestPurposeItem>> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<CoverageEligibilityRequest_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
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
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
      this.insurer = insurer;
    }
    @JsonProperty("enterer")
    public void setEnterer(Optional<Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Optional<Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageeligibilityrequestPurposeItem>> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
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
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
        .servicedDate(instance.servicedDate())
        .created(instance.created())
        .insurance(instance.insurance())
        .supportingInfo(instance.supportingInfo())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .provider(instance.provider())
        .facility(instance.facility())
        .identifier(instance.identifier())
        .priority(instance.priority())
        .purpose(instance.purpose())
        .text(instance.text())
        .language(instance.language())
        .item(instance.item())
        .id(instance.id())
        .extension(instance.extension())
        .insurer(instance.insurer())
        .enterer(instance.enterer())
        .patient(instance.patient())
        .modifierExtension(instance.modifierExtension())
        .servicedPeriod(instance.servicedPeriod())
        .meta(instance.meta())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
   * <pre>
   * ImmutableCoverageEligibilityRequest.builder()
   *    .servicedDate(String) // optional {@link CoverageEligibilityRequest#servicedDate() servicedDate}
   *    .created(com.fhir.types.fhir.DateTime) // optional {@link CoverageEligibilityRequest#created() created}
   *    .insurance(List&amp;lt;com.fhir.types.fhir.CoverageEligibilityRequest_Insurance&amp;gt;) // optional {@link CoverageEligibilityRequest#insurance() insurance}
   *    .supportingInfo(List&amp;lt;com.fhir.types.fhir.CoverageEligibilityRequest_SupportingInfo&amp;gt;) // optional {@link CoverageEligibilityRequest#supportingInfo() supportingInfo}
   *    .resourceType(String) // required {@link CoverageEligibilityRequest#resourceType() resourceType}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link CoverageEligibilityRequest#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link CoverageEligibilityRequest#contained() contained}
   *    .provider(com.fhir.types.fhir.Reference) // optional {@link CoverageEligibilityRequest#provider() provider}
   *    .facility(com.fhir.types.fhir.Reference) // optional {@link CoverageEligibilityRequest#facility() facility}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link CoverageEligibilityRequest#identifier() identifier}
   *    .priority(com.fhir.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityRequest#priority() priority}
   *    .purpose(List&amp;lt;com.fhir.types.fhir.CoverageeligibilityrequestPurposeItem&amp;gt;) // optional {@link CoverageEligibilityRequest#purpose() purpose}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link CoverageEligibilityRequest#text() text}
   *    .language(com.fhir.types.fhir.Code) // optional {@link CoverageEligibilityRequest#language() language}
   *    .item(List&amp;lt;com.fhir.types.fhir.CoverageEligibilityRequest_Item&amp;gt;) // optional {@link CoverageEligibilityRequest#item() item}
   *    .id(com.fhir.types.fhir.Id) // optional {@link CoverageEligibilityRequest#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest#extension() extension}
   *    .insurer(com.fhir.types.fhir.Reference) // required {@link CoverageEligibilityRequest#insurer() insurer}
   *    .enterer(com.fhir.types.fhir.Reference) // optional {@link CoverageEligibilityRequest#enterer() enterer}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link CoverageEligibilityRequest#patient() patient}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest#modifierExtension() modifierExtension}
   *    .servicedPeriod(com.fhir.types.fhir.Period) // optional {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link CoverageEligibilityRequest#meta() meta}
   *    .status(com.fhir.types.fhir.Code) // optional {@link CoverageEligibilityRequest#status() status}
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
    private static final long OPT_BIT_SERVICED_DATE = 0x1L;
    private static final long OPT_BIT_CREATED = 0x2L;
    private static final long OPT_BIT_INSURANCE = 0x4L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_PROVIDER = 0x40L;
    private static final long OPT_BIT_FACILITY = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_PRIORITY = 0x200L;
    private static final long OPT_BIT_PURPOSE = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_ITEM = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_ENTERER = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_STATUS = 0x100000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable String servicedDate;
    private @Nullable DateTime created;
    private @Nullable List<CoverageEligibilityRequest_Insurance> insurance;
    private @Nullable List<CoverageEligibilityRequest_SupportingInfo> supportingInfo;
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference provider;
    private @Nullable Reference facility;
    private @Nullable List<Identifier> identifier;
    private @Nullable CodeableConcept priority;
    private @Nullable List<CoverageeligibilityrequestPurposeItem> purpose;
    private @Nullable Narrative text;
    private @Nullable Code language;
    private @Nullable List<CoverageEligibilityRequest_Item> item;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable Reference insurer;
    private @Nullable Reference enterer;
    private @Nullable Reference patient;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period servicedPeriod;
    private @Nullable Meta meta;
    private @Nullable Code status;

    private Builder() {
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
     * Builds a new {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
     * @return An immutable instance of CoverageEligibilityRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityRequest build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityRequest(
          servicedDate,
          created,
          insurance,
          supportingInfo,
          resourceType,
          implicitRules,
          contained,
          provider,
          facility,
          identifier,
          priority,
          purpose,
          text,
          language,
          item,
          id,
          extension,
          insurer,
          enterer,
          patient,
          modifierExtension,
          servicedPeriod,
          meta,
          status);
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
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
     * Builds a new {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
     * @return An immutable instance of CoverageEligibilityRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityRequest build();
  }
}
