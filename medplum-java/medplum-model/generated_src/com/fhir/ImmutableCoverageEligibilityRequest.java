//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CoverageEligibilityRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityRequest.builder()}.
 */
@org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityRequest implements com.fhir.CoverageEligibilityRequest {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept priority;
  private final @javax.annotation.Nullable java.lang.String servicedDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> purpose;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> supportingInfo;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> insurance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Item> item;
  private final @javax.annotation.Nullable com.fhir.Reference enterer;
  private final @javax.annotation.Nullable com.fhir.Reference provider;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.Reference insurer;
  private final @javax.annotation.Nullable com.fhir.Period servicedPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable com.fhir.Reference facility;
  private final com.fhir.Reference patient;

  private ImmutableCoverageEligibilityRequest(
      @javax.annotation.Nullable com.fhir.CodeableConcept priority,
      @javax.annotation.Nullable java.lang.String servicedDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> purpose,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> supportingInfo,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> insurance,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Item> item,
      @javax.annotation.Nullable com.fhir.Reference enterer,
      @javax.annotation.Nullable com.fhir.Reference provider,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.Reference insurer,
      @javax.annotation.Nullable com.fhir.Period servicedPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable com.fhir.Reference facility,
      com.fhir.Reference patient) {
    this.priority = priority;
    this.servicedDate = servicedDate;
    this.identifier = identifier;
    this.id = id;
    this.purpose = purpose;
    this.text = text;
    this.supportingInfo = supportingInfo;
    this.status = status;
    this.implicitRules = implicitRules;
    this.insurance = insurance;
    this.item = item;
    this.enterer = enterer;
    this.provider = provider;
    this.language = language;
    this.insurer = insurer;
    this.servicedPeriod = servicedPeriod;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.meta = meta;
    this.resourceType = resourceType;
    this.created = created;
    this.facility = facility;
    this.patient = patient;
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
   * @return The value of the {@code servicedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
  @Override
  public java.util.Optional<java.lang.String> servicedDate() {
    return java.util.Optional.ofNullable(servicedDate);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> purpose() {
    return java.util.Optional.ofNullable(purpose);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
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
  public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> insurance() {
    return java.util.Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Item>> item() {
    return java.util.Optional.ofNullable(item);
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
   * @return The value of the {@code provider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provider")
  @Override
  public java.util.Optional<com.fhir.Reference> provider() {
    return java.util.Optional.ofNullable(provider);
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
   * @return The value of the {@code insurer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurer")
  @Override
  public com.fhir.Reference insurer() {
    return insurer;
  }

  /**
   * @return The value of the {@code servicedPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> servicedPeriod() {
    return java.util.Optional.ofNullable(servicedPeriod);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withPriority(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        newValue,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withPriority(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        value,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withServicedDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "servicedDate");
    if (java.util.Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        newValue,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withServicedDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        value,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        newValue,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        value,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        newValue,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        value,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withPurpose(java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        newValue,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withPurpose(java.util.Optional<? extends java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        value,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        newValue,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        value,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withSupportingInfo(java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        newValue,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        value,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        newValue,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        value,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        newValue,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        value,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withInsurance(java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        newValue,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withInsurance(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        value,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withItem(java.util.List<com.fhir.CoverageEligibilityRequest_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        newValue,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withItem(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        value,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withEnterer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        newValue,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withEnterer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        value,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withProvider(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        newValue,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withProvider(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        value,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        newValue,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        value,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withInsurer(com.fhir.Reference value) {
    if (this.insurer == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "insurer");
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        newValue,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withServicedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        newValue,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withServicedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        value,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        newValue,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        value,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        newValue,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        value,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        newValue,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        value,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        newValue,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        value,
        this.resourceType,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        newValue,
        this.created,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        newValue,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        value,
        this.facility,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withFacility(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        newValue,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest withFacility(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        value,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableCoverageEligibilityRequest(
        this.priority,
        this.servicedDate,
        this.identifier,
        this.id,
        this.purpose,
        this.text,
        this.supportingInfo,
        this.status,
        this.implicitRules,
        this.insurance,
        this.item,
        this.enterer,
        this.provider,
        this.language,
        this.insurer,
        this.servicedPeriod,
        this.contained,
        this.modifierExtension,
        this.extension,
        this.meta,
        this.resourceType,
        this.created,
        this.facility,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityRequest
        && equalTo((ImmutableCoverageEligibilityRequest) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityRequest another) {
    return java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(servicedDate, another.servicedDate)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(enterer, another.enterer)
        && java.util.Objects.equals(provider, another.provider)
        && java.util.Objects.equals(language, another.language)
        && insurer.equals(another.insurer)
        && java.util.Objects.equals(servicedPeriod, another.servicedPeriod)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(facility, another.facility)
        && patient.equals(another.patient);
  }

  /**
   * Computes a hash code from attributes: {@code priority}, {@code servicedDate}, {@code identifier}, {@code id}, {@code purpose}, {@code text}, {@code supportingInfo}, {@code status}, {@code implicitRules}, {@code insurance}, {@code item}, {@code enterer}, {@code provider}, {@code language}, {@code insurer}, {@code servicedPeriod}, {@code contained}, {@code modifierExtension}, {@code extension}, {@code meta}, {@code resourceType}, {@code created}, {@code facility}, {@code patient}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(servicedDate);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(enterer);
    h += (h << 5) + java.util.Objects.hashCode(provider);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(servicedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(facility);
    h += (h << 5) + patient.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CoverageEligibilityRequest{");
    if (priority != null) {
      builder.append("priority=").append(priority);
    }
    if (servicedDate != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (identifier != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (purpose != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (supportingInfo != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (status != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (insurance != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (item != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (enterer != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (provider != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (language != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (facility != null) {
      builder.append(", ");
      builder.append("facility=").append(facility);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CoverageEligibilityRequest {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> servicedDate = java.util.Optional.empty();
    boolean servicedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> enterer = java.util.Optional.empty();
    boolean entererIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> provider = java.util.Optional.empty();
    boolean providerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.Reference insurer;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> servicedPeriod = java.util.Optional.empty();
    boolean servicedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> facility = java.util.Optional.empty();
    boolean facilityIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
    public void setServicedDate(java.util.Optional<java.lang.String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public void setEnterer(java.util.Optional<com.fhir.Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(java.util.Optional<com.fhir.Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public void setInsurer(com.fhir.Reference insurer) {
      this.insurer = insurer;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
    public void setServicedPeriod(java.util.Optional<com.fhir.Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
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
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityRequest_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityRequest fromJson(Json json) {
    ImmutableCoverageEligibilityRequest.Builder builder = ((ImmutableCoverageEligibilityRequest.Builder) ImmutableCoverageEligibilityRequest.builder());
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
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
        .priority(instance.priority())
        .servicedDate(instance.servicedDate())
        .identifier(instance.identifier())
        .id(instance.id())
        .purpose(instance.purpose())
        .text(instance.text())
        .supportingInfo(instance.supportingInfo())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .insurance(instance.insurance())
        .item(instance.item())
        .enterer(instance.enterer())
        .provider(instance.provider())
        .language(instance.language())
        .insurer(instance.insurer())
        .servicedPeriod(instance.servicedPeriod())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .created(instance.created())
        .facility(instance.facility())
        .patient(instance.patient())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
   * <pre>
   * ImmutableCoverageEligibilityRequest.builder()
   *    .priority(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityRequest#priority() priority}
   *    .servicedDate(String) // optional {@link CoverageEligibilityRequest#servicedDate() servicedDate}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CoverageEligibilityRequest#identifier() identifier}
   *    .id(com.fhir.id) // optional {@link CoverageEligibilityRequest#id() id}
   *    .purpose(List&amp;lt;com.fhir.CoverageeligibilityrequestPurposeItem&amp;gt;) // optional {@link CoverageEligibilityRequest#purpose() purpose}
   *    .text(com.fhir.Narrative) // optional {@link CoverageEligibilityRequest#text() text}
   *    .supportingInfo(List&amp;lt;com.fhir.CoverageEligibilityRequest_SupportingInfo&amp;gt;) // optional {@link CoverageEligibilityRequest#supportingInfo() supportingInfo}
   *    .status(com.fhir.code) // optional {@link CoverageEligibilityRequest#status() status}
   *    .implicitRules(com.fhir.uri) // optional {@link CoverageEligibilityRequest#implicitRules() implicitRules}
   *    .insurance(List&amp;lt;com.fhir.CoverageEligibilityRequest_Insurance&amp;gt;) // optional {@link CoverageEligibilityRequest#insurance() insurance}
   *    .item(List&amp;lt;com.fhir.CoverageEligibilityRequest_Item&amp;gt;) // optional {@link CoverageEligibilityRequest#item() item}
   *    .enterer(com.fhir.Reference) // optional {@link CoverageEligibilityRequest#enterer() enterer}
   *    .provider(com.fhir.Reference) // optional {@link CoverageEligibilityRequest#provider() provider}
   *    .language(com.fhir.code) // optional {@link CoverageEligibilityRequest#language() language}
   *    .insurer(com.fhir.Reference) // required {@link CoverageEligibilityRequest#insurer() insurer}
   *    .servicedPeriod(com.fhir.Period) // optional {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CoverageEligibilityRequest#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest#extension() extension}
   *    .meta(com.fhir.Meta) // optional {@link CoverageEligibilityRequest#meta() meta}
   *    .resourceType(String) // required {@link CoverageEligibilityRequest#resourceType() resourceType}
   *    .created(com.fhir.dateTime) // optional {@link CoverageEligibilityRequest#created() created}
   *    .facility(com.fhir.Reference) // optional {@link CoverageEligibilityRequest#facility() facility}
   *    .patient(com.fhir.Reference) // required {@link CoverageEligibilityRequest#patient() patient}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityRequest builder
   */
  public static InsurerBuildStage builder() {
    return new ImmutableCoverageEligibilityRequest.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements InsurerBuildStage, ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_INSURER = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long OPT_BIT_PRIORITY = 0x1L;
    private static final long OPT_BIT_SERVICED_DATE = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_PURPOSE = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x40L;
    private static final long OPT_BIT_STATUS = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_INSURANCE = 0x200L;
    private static final long OPT_BIT_ITEM = 0x400L;
    private static final long OPT_BIT_ENTERER = 0x800L;
    private static final long OPT_BIT_PROVIDER = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_CREATED = 0x80000L;
    private static final long OPT_BIT_FACILITY = 0x100000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept priority;
    private @javax.annotation.Nullable java.lang.String servicedDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> purpose;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> supportingInfo;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> insurance;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityRequest_Item> item;
    private @javax.annotation.Nullable com.fhir.Reference enterer;
    private @javax.annotation.Nullable com.fhir.Reference provider;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference insurer;
    private @javax.annotation.Nullable com.fhir.Period servicedPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable com.fhir.Reference facility;
    private @javax.annotation.Nullable com.fhir.Reference patient;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedDate(java.lang.String servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = java.util.Objects.requireNonNull(servicedDate, "servicedDate");
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
    public final Builder servicedDate(java.util.Optional<java.lang.String> servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = servicedDate.orElse(null);
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = java.util.Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public final Builder purpose(java.util.Optional<? extends java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> purpose) {
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
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = java.util.Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public final Builder insurance(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.CoverageEligibilityRequest_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(com.fhir.Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = java.util.Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public final Builder provider(java.util.Optional<? extends com.fhir.Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
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
     * Initializes the value for the {@link CoverageEligibilityRequest#insurer() insurer} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedPeriod(com.fhir.Period servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = java.util.Objects.requireNonNull(servicedPeriod, "servicedPeriod");
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
    public final Builder servicedPeriod(java.util.Optional<? extends com.fhir.Period> servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = servicedPeriod.orElse(null);
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
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
     * Initializes the value for the {@link CoverageEligibilityRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
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
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
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
     * Initializes the value for the {@link CoverageEligibilityRequest#patient() patient} attribute.
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
     * Builds a new {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
     * @return An immutable instance of CoverageEligibilityRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CoverageEligibilityRequest build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityRequest(
          priority,
          servicedDate,
          identifier,
          id,
          purpose,
          text,
          supportingInfo,
          status,
          implicitRules,
          insurance,
          item,
          enterer,
          provider,
          language,
          insurer,
          servicedPeriod,
          contained,
          modifierExtension,
          extension,
          meta,
          resourceType,
          created,
          facility,
          patient);
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CoverageEligibilityRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!insurerIsSet()) attributes.add("insurer");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build CoverageEligibilityRequest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage insurer(com.fhir.Reference insurer);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.CodeableConcept priority);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(java.lang.String servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(java.util.Optional<java.lang.String> servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends java.util.List<com.fhir.CoverageeligibilityrequestPurposeItem>> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo> supportingInfo);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_SupportingInfo>> supportingInfo);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.CoverageEligibilityRequest_Insurance> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_Insurance>> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(java.util.List<com.fhir.CoverageEligibilityRequest_Item> item);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityRequest_Item>> item);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(com.fhir.Reference enterer);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(java.util.Optional<? extends com.fhir.Reference> enterer);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(com.fhir.Reference provider);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(java.util.Optional<? extends com.fhir.Reference> provider);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(com.fhir.Period servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(java.util.Optional<? extends com.fhir.Period> servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal facility(com.fhir.Reference facility);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal facility(java.util.Optional<? extends com.fhir.Reference> facility);

    /**
     * Builds a new {@link CoverageEligibilityRequest CoverageEligibilityRequest}.
     * @return An immutable instance of CoverageEligibilityRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityRequest build();
  }
}
