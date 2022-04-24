//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CoverageEligibilityResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityResponse.builder()}.
 */
@org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityResponse implements com.fhir.CoverageEligibilityResponse {
  private final @javax.annotation.Nullable com.fhir.CoverageeligibilityresponseOutcome outcome;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.Reference request;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable java.lang.String preAuthRef;
  private final @javax.annotation.Nullable com.fhir.Period servicedPeriod;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final com.fhir.Reference insurer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.String servicedDate;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> insurance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Error> error;
  private final @javax.annotation.Nullable com.fhir.Reference requestor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String disposition;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept form;
  private final java.lang.String resourceType;

  private ImmutableCoverageEligibilityResponse(
      @javax.annotation.Nullable com.fhir.CoverageeligibilityresponseOutcome outcome,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.Reference request,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable java.lang.String preAuthRef,
      @javax.annotation.Nullable com.fhir.Period servicedPeriod,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Meta meta,
      com.fhir.Reference insurer,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.String servicedDate,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> insurance,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Error> error,
      @javax.annotation.Nullable com.fhir.Reference requestor,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String disposition,
      @javax.annotation.Nullable com.fhir.CodeableConcept form,
      java.lang.String resourceType) {
    this.outcome = outcome;
    this.extension = extension;
    this.request = request;
    this.text = text;
    this.created = created;
    this.preAuthRef = preAuthRef;
    this.servicedPeriod = servicedPeriod;
    this.implicitRules = implicitRules;
    this.patient = patient;
    this.contained = contained;
    this.meta = meta;
    this.insurer = insurer;
    this.identifier = identifier;
    this.servicedDate = servicedDate;
    this.id = id;
    this.status = status;
    this.purpose = purpose;
    this.insurance = insurance;
    this.error = error;
    this.requestor = requestor;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.disposition = disposition;
    this.form = form;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.CoverageeligibilityresponseOutcome> outcome() {
    return java.util.Optional.ofNullable(outcome);
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
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public com.fhir.Reference request() {
    return request;
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
   * @return The value of the {@code preAuthRef} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
  @Override
  public java.util.Optional<java.lang.String> preAuthRef() {
    return java.util.Optional.ofNullable(preAuthRef);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code insurer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurer")
  @Override
  public com.fhir.Reference insurer() {
    return insurer;
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
   * @return The value of the {@code servicedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
  @Override
  public java.util.Optional<java.lang.String> servicedDate() {
    return java.util.Optional.ofNullable(servicedDate);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> purpose() {
    return java.util.Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> insurance() {
    return java.util.Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("error")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Error>> error() {
    return java.util.Optional.ofNullable(error);
  }

  /**
   * @return The value of the {@code requestor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestor")
  @Override
  public java.util.Optional<com.fhir.Reference> requestor() {
    return java.util.Optional.ofNullable(requestor);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code form} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("form")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> form() {
    return java.util.Optional.ofNullable(form);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withOutcome(com.fhir.CoverageeligibilityresponseOutcome value) {
    @javax.annotation.Nullable com.fhir.CoverageeligibilityresponseOutcome newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        newValue,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withOutcome(java.util.Optional<? extends com.fhir.CoverageeligibilityresponseOutcome> optional) {
    @javax.annotation.Nullable com.fhir.CoverageeligibilityresponseOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        value,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        newValue,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        value,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#request() request} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for request
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withRequest(com.fhir.Reference value) {
    if (this.request == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        newValue,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        newValue,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        value,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        newValue,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        value,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPreAuthRef(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "preAuthRef");
    if (java.util.Objects.equals(this.preAuthRef, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        newValue,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPreAuthRef(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.preAuthRef, value)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        value,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withServicedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        newValue,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withServicedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        value,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        newValue,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        value,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        newValue,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        newValue,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        value,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        newValue,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        value,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withInsurer(com.fhir.Reference value) {
    if (this.insurer == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "insurer");
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        newValue,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        newValue,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        value,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withServicedDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "servicedDate");
    if (java.util.Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        newValue,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withServicedDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        value,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        newValue,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        value,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        newValue,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        value,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPurpose(java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        newValue,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withPurpose(java.util.Optional<? extends java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        value,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withInsurance(java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        newValue,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withInsurance(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        value,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#error() error} attribute.
   * @param value The value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withError(java.util.List<com.fhir.CoverageEligibilityResponse_Error> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Error> newValue = java.util.Objects.requireNonNull(value, "error");
    if (this.error == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        newValue,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#error() error} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for error
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withError(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Error>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Error> value = optional.orElse(null);
    if (this.error == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        value,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withRequestor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requestor");
    if (this.requestor == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        newValue,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#requestor() requestor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withRequestor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requestor == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        value,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        newValue,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        value,
        this.language,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        newValue,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        value,
        this.disposition,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withDisposition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "disposition");
    if (java.util.Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        newValue,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withDisposition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.disposition, value)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        value,
        this.form,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withForm(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withForm(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.outcome,
        this.extension,
        this.request,
        this.text,
        this.created,
        this.preAuthRef,
        this.servicedPeriod,
        this.implicitRules,
        this.patient,
        this.contained,
        this.meta,
        this.insurer,
        this.identifier,
        this.servicedDate,
        this.id,
        this.status,
        this.purpose,
        this.insurance,
        this.error,
        this.requestor,
        this.modifierExtension,
        this.language,
        this.disposition,
        this.form,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityResponse
        && equalTo((ImmutableCoverageEligibilityResponse) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityResponse another) {
    return java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(extension, another.extension)
        && request.equals(another.request)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(preAuthRef, another.preAuthRef)
        && java.util.Objects.equals(servicedPeriod, another.servicedPeriod)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && patient.equals(another.patient)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(meta, another.meta)
        && insurer.equals(another.insurer)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(servicedDate, another.servicedDate)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(error, another.error)
        && java.util.Objects.equals(requestor, another.requestor)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(disposition, another.disposition)
        && java.util.Objects.equals(form, another.form)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code outcome}, {@code extension}, {@code request}, {@code text}, {@code created}, {@code preAuthRef}, {@code servicedPeriod}, {@code implicitRules}, {@code patient}, {@code contained}, {@code meta}, {@code insurer}, {@code identifier}, {@code servicedDate}, {@code id}, {@code status}, {@code purpose}, {@code insurance}, {@code error}, {@code requestor}, {@code modifierExtension}, {@code language}, {@code disposition}, {@code form}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + request.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(preAuthRef);
    h += (h << 5) + java.util.Objects.hashCode(servicedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(servicedDate);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(error);
    h += (h << 5) + java.util.Objects.hashCode(requestor);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(disposition);
    h += (h << 5) + java.util.Objects.hashCode(form);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CoverageEligibilityResponse{");
    if (outcome != null) {
      builder.append("outcome=").append(outcome);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("request=").append(request);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (preAuthRef != null) {
      builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (servicedDate != null) {
      builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (error != null) {
      builder.append(", ");
      builder.append("error=").append(error);
    }
    if (requestor != null) {
      builder.append(", ");
      builder.append("requestor=").append(requestor);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (form != null) {
      builder.append(", ");
      builder.append("form=").append(form);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CoverageEligibilityResponse {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CoverageeligibilityresponseOutcome> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.Reference request;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> preAuthRef = java.util.Optional.empty();
    boolean preAuthRefIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> servicedPeriod = java.util.Optional.empty();
    boolean servicedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable com.fhir.Reference insurer;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> servicedDate = java.util.Optional.empty();
    boolean servicedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Error>> error = java.util.Optional.empty();
    boolean errorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requestor = java.util.Optional.empty();
    boolean requestorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> disposition = java.util.Optional.empty();
    boolean dispositionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> form = java.util.Optional.empty();
    boolean formIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.CoverageeligibilityresponseOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(com.fhir.Reference request) {
      this.request = request;
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
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public void setPreAuthRef(java.util.Optional<java.lang.String> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
    public void setServicedPeriod(java.util.Optional<com.fhir.Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public void setInsurer(com.fhir.Reference insurer) {
      this.insurer = insurer;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
    public void setServicedDate(java.util.Optional<java.lang.String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Error>> error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestor")
    public void setRequestor(java.util.Optional<com.fhir.Reference> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disposition")
    public void setDisposition(java.util.Optional<java.lang.String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("form")
    public void setForm(java.util.Optional<com.fhir.CodeableConcept> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public java.util.Optional<com.fhir.CoverageeligibilityresponseOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Error>> error() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requestor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> form() { throw new UnsupportedOperationException(); }
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
  static ImmutableCoverageEligibilityResponse fromJson(Json json) {
    ImmutableCoverageEligibilityResponse.Builder builder = ((ImmutableCoverageEligibilityResponse.Builder) ImmutableCoverageEligibilityResponse.builder());
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.request != null) {
      builder.request(json.request);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableCoverageEligibilityResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityResponse instance
   */
  public static CoverageEligibilityResponse copyOf(CoverageEligibilityResponse instance) {
    if (instance instanceof ImmutableCoverageEligibilityResponse) {
      return (ImmutableCoverageEligibilityResponse) instance;
    }
    return ((ImmutableCoverageEligibilityResponse.Builder) ImmutableCoverageEligibilityResponse.builder())
        .outcome(instance.outcome())
        .extension(instance.extension())
        .request(instance.request())
        .text(instance.text())
        .created(instance.created())
        .preAuthRef(instance.preAuthRef())
        .servicedPeriod(instance.servicedPeriod())
        .implicitRules(instance.implicitRules())
        .patient(instance.patient())
        .contained(instance.contained())
        .meta(instance.meta())
        .insurer(instance.insurer())
        .identifier(instance.identifier())
        .servicedDate(instance.servicedDate())
        .id(instance.id())
        .status(instance.status())
        .purpose(instance.purpose())
        .insurance(instance.insurance())
        .error(instance.error())
        .requestor(instance.requestor())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .disposition(instance.disposition())
        .form(instance.form())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
   * <pre>
   * ImmutableCoverageEligibilityResponse.builder()
   *    .outcome(com.fhir.CoverageeligibilityresponseOutcome) // optional {@link CoverageEligibilityResponse#outcome() outcome}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse#extension() extension}
   *    .request(com.fhir.Reference) // required {@link CoverageEligibilityResponse#request() request}
   *    .text(com.fhir.Narrative) // optional {@link CoverageEligibilityResponse#text() text}
   *    .created(com.fhir.dateTime) // optional {@link CoverageEligibilityResponse#created() created}
   *    .preAuthRef(String) // optional {@link CoverageEligibilityResponse#preAuthRef() preAuthRef}
   *    .servicedPeriod(com.fhir.Period) // optional {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod}
   *    .implicitRules(com.fhir.uri) // optional {@link CoverageEligibilityResponse#implicitRules() implicitRules}
   *    .patient(com.fhir.Reference) // required {@link CoverageEligibilityResponse#patient() patient}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CoverageEligibilityResponse#contained() contained}
   *    .meta(com.fhir.Meta) // optional {@link CoverageEligibilityResponse#meta() meta}
   *    .insurer(com.fhir.Reference) // required {@link CoverageEligibilityResponse#insurer() insurer}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CoverageEligibilityResponse#identifier() identifier}
   *    .servicedDate(String) // optional {@link CoverageEligibilityResponse#servicedDate() servicedDate}
   *    .id(com.fhir.id) // optional {@link CoverageEligibilityResponse#id() id}
   *    .status(com.fhir.code) // optional {@link CoverageEligibilityResponse#status() status}
   *    .purpose(List&amp;lt;com.fhir.CoverageeligibilityresponsePurposeItem&amp;gt;) // optional {@link CoverageEligibilityResponse#purpose() purpose}
   *    .insurance(List&amp;lt;com.fhir.CoverageEligibilityResponse_Insurance&amp;gt;) // optional {@link CoverageEligibilityResponse#insurance() insurance}
   *    .error(List&amp;lt;com.fhir.CoverageEligibilityResponse_Error&amp;gt;) // optional {@link CoverageEligibilityResponse#error() error}
   *    .requestor(com.fhir.Reference) // optional {@link CoverageEligibilityResponse#requestor() requestor}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse#modifierExtension() modifierExtension}
   *    .language(com.fhir.code) // optional {@link CoverageEligibilityResponse#language() language}
   *    .disposition(String) // optional {@link CoverageEligibilityResponse#disposition() disposition}
   *    .form(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse#form() form}
   *    .resourceType(String) // required {@link CoverageEligibilityResponse#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityResponse builder
   */
  public static RequestBuildStage builder() {
    return new ImmutableCoverageEligibilityResponse.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements RequestBuildStage, PatientBuildStage, InsurerBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_REQUEST = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long INIT_BIT_INSURER = 0x4L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long OPT_BIT_OUTCOME = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_CREATED = 0x8L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x10L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_SERVICED_DATE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_STATUS = 0x1000L;
    private static final long OPT_BIT_PURPOSE = 0x2000L;
    private static final long OPT_BIT_INSURANCE = 0x4000L;
    private static final long OPT_BIT_ERROR = 0x8000L;
    private static final long OPT_BIT_REQUESTOR = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_DISPOSITION = 0x80000L;
    private static final long OPT_BIT_FORM = 0x100000L;
    private long initBits = 0xfL;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CoverageeligibilityresponseOutcome outcome;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable java.lang.String preAuthRef;
    private @javax.annotation.Nullable com.fhir.Period servicedPeriod;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference insurer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.String servicedDate;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> insurance;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Error> error;
    private @javax.annotation.Nullable com.fhir.Reference requestor;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String disposition;
    private @javax.annotation.Nullable com.fhir.CodeableConcept form;
    private @javax.annotation.Nullable java.lang.String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.CoverageeligibilityresponseOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.CoverageeligibilityresponseOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
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
     * Initializes the value for the {@link CoverageEligibilityResponse#request() request} attribute.
     * @param request The value for request 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(com.fhir.Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      initBits &= ~INIT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(java.lang.String preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = java.util.Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public final Builder preAuthRef(java.util.Optional<java.lang.String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link CoverageEligibilityResponse#patient() patient} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
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
     * Initializes the value for the {@link CoverageEligibilityResponse#insurer() insurer} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = java.util.Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public final Builder purpose(java.util.Optional<? extends java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = java.util.Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public final Builder insurance(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    public final Builder error(java.util.List<com.fhir.CoverageEligibilityResponse_Error> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = java.util.Objects.requireNonNull(error, "error");
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public final Builder error(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Error>> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = error.orElse(null);
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestor(com.fhir.Reference requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = java.util.Objects.requireNonNull(requestor, "requestor");
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestor")
    public final Builder requestor(java.util.Optional<? extends com.fhir.Reference> requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor.orElse(null);
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    public final Builder form(com.fhir.CodeableConcept form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = java.util.Objects.requireNonNull(form, "form");
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("form")
    public final Builder form(java.util.Optional<? extends com.fhir.CodeableConcept> form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = form.orElse(null);
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#resourceType() resourceType} attribute.
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
     * Builds a new {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
     * @return An immutable instance of CoverageEligibilityResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CoverageEligibilityResponse build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityResponse(
          outcome,
          extension,
          request,
          text,
          created,
          preAuthRef,
          servicedPeriod,
          implicitRules,
          patient,
          contained,
          meta,
          insurer,
          identifier,
          servicedDate,
          id,
          status,
          purpose,
          insurance,
          error,
          requestor,
          modifierExtension,
          language,
          disposition,
          form,
          resourceType);
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean errorIsSet() {
      return (optBits & OPT_BIT_ERROR) != 0;
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean requestIsSet() {
      return (initBits & INIT_BIT_REQUEST) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CoverageEligibilityResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!requestIsSet()) attributes.add("request");
      if (!patientIsSet()) attributes.add("patient");
      if (!insurerIsSet()) attributes.add("insurer");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CoverageEligibilityResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface RequestBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#request() request} attribute.
     * @param request The value for request 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage request(com.fhir.Reference request);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    InsurerBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage insurer(com.fhir.Reference insurer);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.CoverageeligibilityresponseOutcome outcome);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.CoverageeligibilityresponseOutcome> outcome);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(java.lang.String preAuthRef);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(java.util.Optional<java.lang.String> preAuthRef);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(com.fhir.Period servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(java.util.Optional<? extends com.fhir.Period> servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(java.lang.String servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(java.util.Optional<java.lang.String> servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends java.util.List<com.fhir.CoverageeligibilityresponsePurposeItem>> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.CoverageEligibilityResponse_Insurance> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Insurance>> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    BuildFinal error(java.util.List<com.fhir.CoverageEligibilityResponse_Error> error);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal error(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Error>> error);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestor(com.fhir.Reference requestor);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestor(java.util.Optional<? extends com.fhir.Reference> requestor);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(java.lang.String disposition);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(java.util.Optional<java.lang.String> disposition);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(com.fhir.CodeableConcept form);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(java.util.Optional<? extends com.fhir.CodeableConcept> form);

    /**
     * Builds a new {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
     * @return An immutable instance of CoverageEligibilityResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityResponse build();
  }
}
