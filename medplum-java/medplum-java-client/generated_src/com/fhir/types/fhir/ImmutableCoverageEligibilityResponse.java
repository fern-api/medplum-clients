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
 * Immutable implementation of {@link CoverageEligibilityResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityResponse.builder()}.
 */
@Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityResponse
    implements CoverageEligibilityResponse {
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable List<CoverageEligibilityResponse_Error> error;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable String preAuthRef;
  private final @Nullable String disposition;
  private final Reference request;
  private final @Nullable DateTime created;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String servicedDate;
  private final @Nullable CoverageeligibilityresponseOutcome outcome;
  private final @Nullable List<CoverageeligibilityresponsePurposeItem> purpose;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<CoverageEligibilityResponse_Insurance> insurance;
  private final Reference insurer;
  private final Reference patient;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable Period servicedPeriod;
  private final @Nullable CodeableConcept form;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference requestor;
  private final @Nullable Code status;

  private ImmutableCoverageEligibilityResponse(
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable List<CoverageEligibilityResponse_Error> error,
      @Nullable List<Identifier> identifier,
      @Nullable String preAuthRef,
      @Nullable String disposition,
      Reference request,
      @Nullable DateTime created,
      @Nullable List<ResourceList> contained,
      @Nullable String servicedDate,
      @Nullable CoverageeligibilityresponseOutcome outcome,
      @Nullable List<CoverageeligibilityresponsePurposeItem> purpose,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<CoverageEligibilityResponse_Insurance> insurance,
      Reference insurer,
      Reference patient,
      String resourceType,
      @Nullable Meta meta,
      @Nullable Period servicedPeriod,
      @Nullable CodeableConcept form,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference requestor,
      @Nullable Code status) {
    this.id = id;
    this.text = text;
    this.error = error;
    this.identifier = identifier;
    this.preAuthRef = preAuthRef;
    this.disposition = disposition;
    this.request = request;
    this.created = created;
    this.contained = contained;
    this.servicedDate = servicedDate;
    this.outcome = outcome;
    this.purpose = purpose;
    this.implicitRules = implicitRules;
    this.language = language;
    this.insurance = insurance;
    this.insurer = insurer;
    this.patient = patient;
    this.resourceType = resourceType;
    this.meta = meta;
    this.servicedPeriod = servicedPeriod;
    this.form = form;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.requestor = requestor;
    this.status = status;
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @JsonProperty("error")
  @Override
  public Optional<List<CoverageEligibilityResponse_Error>> error() {
    return Optional.ofNullable(error);
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
   * @return The value of the {@code preAuthRef} attribute
   */
  @JsonProperty("preAuthRef")
  @Override
  public Optional<String> preAuthRef() {
    return Optional.ofNullable(preAuthRef);
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
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Reference request() {
    return request;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<CoverageeligibilityresponseOutcome> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<List<CoverageeligibilityresponsePurposeItem>> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public Optional<List<CoverageEligibilityResponse_Insurance>> insurance() {
    return Optional.ofNullable(insurance);
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
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
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
   * @return The value of the {@code servicedPeriod} attribute
   */
  @JsonProperty("servicedPeriod")
  @Override
  public Optional<Period> servicedPeriod() {
    return Optional.ofNullable(servicedPeriod);
  }

  /**
   * @return The value of the {@code form} attribute
   */
  @JsonProperty("form")
  @Override
  public Optional<CodeableConcept> form() {
    return Optional.ofNullable(form);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code requestor} attribute
   */
  @JsonProperty("requestor")
  @Override
  public Optional<Reference> requestor() {
    return Optional.ofNullable(requestor);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        newValue,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        value,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        newValue,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        value,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#error() error} attribute.
   * @param value The value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withError(List<CoverageEligibilityResponse_Error> value) {
    @Nullable List<CoverageEligibilityResponse_Error> newValue = Objects.requireNonNull(value, "error");
    if (this.error == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        newValue,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#error() error} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for error
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withError(Optional<? extends List<CoverageEligibilityResponse_Error>> optional) {
    @Nullable List<CoverageEligibilityResponse_Error> value = optional.orElse(null);
    if (this.error == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        value,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        newValue,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        value,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPreAuthRef(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "preAuthRef");
    if (Objects.equals(this.preAuthRef, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        newValue,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPreAuthRef(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.preAuthRef, value)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        value,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withDisposition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "disposition");
    if (Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        newValue,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withDisposition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.disposition, value)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        value,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#request() request} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for request
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withRequest(Reference value) {
    if (this.request == value) return this;
    Reference newValue = Objects.requireNonNull(value, "request");
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        newValue,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        newValue,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        value,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        newValue,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        value,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withServicedDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "servicedDate");
    if (Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        newValue,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withServicedDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        value,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withOutcome(CoverageeligibilityresponseOutcome value) {
    @Nullable CoverageeligibilityresponseOutcome newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        newValue,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withOutcome(Optional<? extends CoverageeligibilityresponseOutcome> optional) {
    @Nullable CoverageeligibilityresponseOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        value,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPurpose(List<CoverageeligibilityresponsePurposeItem> value) {
    @Nullable List<CoverageeligibilityresponsePurposeItem> newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        newValue,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withPurpose(Optional<? extends List<CoverageeligibilityresponsePurposeItem>> optional) {
    @Nullable List<CoverageeligibilityresponsePurposeItem> value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        value,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        newValue,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        value,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        newValue,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        value,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withInsurance(List<CoverageEligibilityResponse_Insurance> value) {
    @Nullable List<CoverageEligibilityResponse_Insurance> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        newValue,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withInsurance(Optional<? extends List<CoverageEligibilityResponse_Insurance>> optional) {
    @Nullable List<CoverageEligibilityResponse_Insurance> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        value,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withInsurer(Reference value) {
    if (this.insurer == value) return this;
    Reference newValue = Objects.requireNonNull(value, "insurer");
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        newValue,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        newValue,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        newValue,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        newValue,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        value,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withServicedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        newValue,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withServicedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        value,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withForm(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        newValue,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withForm(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        value,
        this.extension,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        newValue,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        value,
        this.modifierExtension,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        newValue,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        value,
        this.requestor,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withRequestor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requestor");
    if (this.requestor == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#requestor() requestor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withRequestor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requestor == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCoverageEligibilityResponse(
        this.id,
        this.text,
        this.error,
        this.identifier,
        this.preAuthRef,
        this.disposition,
        this.request,
        this.created,
        this.contained,
        this.servicedDate,
        this.outcome,
        this.purpose,
        this.implicitRules,
        this.language,
        this.insurance,
        this.insurer,
        this.patient,
        this.resourceType,
        this.meta,
        this.servicedPeriod,
        this.form,
        this.extension,
        this.modifierExtension,
        this.requestor,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityResponse
        && equalTo((ImmutableCoverageEligibilityResponse) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityResponse another) {
    return Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(error, another.error)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(preAuthRef, another.preAuthRef)
        && Objects.equals(disposition, another.disposition)
        && request.equals(another.request)
        && Objects.equals(created, another.created)
        && Objects.equals(contained, another.contained)
        && Objects.equals(servicedDate, another.servicedDate)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(insurance, another.insurance)
        && insurer.equals(another.insurer)
        && patient.equals(another.patient)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(form, another.form)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(requestor, another.requestor)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code text}, {@code error}, {@code identifier}, {@code preAuthRef}, {@code disposition}, {@code request}, {@code created}, {@code contained}, {@code servicedDate}, {@code outcome}, {@code purpose}, {@code implicitRules}, {@code language}, {@code insurance}, {@code insurer}, {@code patient}, {@code resourceType}, {@code meta}, {@code servicedPeriod}, {@code form}, {@code extension}, {@code modifierExtension}, {@code requestor}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(error);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(preAuthRef);
    h += (h << 5) + Objects.hashCode(disposition);
    h += (h << 5) + request.hashCode();
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(form);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(requestor);
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityResponse{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (error != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("error=").append(error);
    }
    if (identifier != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (preAuthRef != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (disposition != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("request=").append(request);
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (servicedDate != null) {
      builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    builder.append(", ");
    builder.append("patient=").append(patient);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (form != null) {
      builder.append(", ");
      builder.append("form=").append(form);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (requestor != null) {
      builder.append(", ");
      builder.append("requestor=").append(requestor);
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
  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityResponse {
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<CoverageEligibilityResponse_Error>> error = Optional.empty();
    boolean errorIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> preAuthRef = Optional.empty();
    boolean preAuthRefIsSet;
    @Nullable Optional<String> disposition = Optional.empty();
    boolean dispositionIsSet;
    @Nullable Reference request;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Optional<CoverageeligibilityresponseOutcome> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<List<CoverageeligibilityresponsePurposeItem>> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<CoverageEligibilityResponse_Insurance>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Reference insurer;
    @Nullable Reference patient;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<CodeableConcept> form = Optional.empty();
    boolean formIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> requestor = Optional.empty();
    boolean requestorIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("error")
    public void setError(Optional<List<CoverageEligibilityResponse_Error>> error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(Optional<String> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @JsonProperty("disposition")
    public void setDisposition(Optional<String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Reference request) {
      this.request = request;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<CoverageeligibilityresponseOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<List<CoverageeligibilityresponsePurposeItem>> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<CoverageEligibilityResponse_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
      this.insurer = insurer;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
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
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Optional<Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @JsonProperty("form")
    public void setForm(Optional<CodeableConcept> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("requestor")
    public void setRequestor(Optional<Reference> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityResponse_Error>> error() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public Reference request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CoverageeligibilityresponseOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageeligibilityresponsePurposeItem>> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityResponse_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> form() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requestor() { throw new UnsupportedOperationException(); }
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
  static ImmutableCoverageEligibilityResponse fromJson(Json json) {
    ImmutableCoverageEligibilityResponse.Builder builder = ((ImmutableCoverageEligibilityResponse.Builder) ImmutableCoverageEligibilityResponse.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.request != null) {
      builder.request(json.request);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
        .id(instance.id())
        .text(instance.text())
        .error(instance.error())
        .identifier(instance.identifier())
        .preAuthRef(instance.preAuthRef())
        .disposition(instance.disposition())
        .request(instance.request())
        .created(instance.created())
        .contained(instance.contained())
        .servicedDate(instance.servicedDate())
        .outcome(instance.outcome())
        .purpose(instance.purpose())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .insurance(instance.insurance())
        .insurer(instance.insurer())
        .patient(instance.patient())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .servicedPeriod(instance.servicedPeriod())
        .form(instance.form())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .requestor(instance.requestor())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
   * <pre>
   * ImmutableCoverageEligibilityResponse.builder()
   *    .id(com.fhir.types.fhir.Id) // optional {@link CoverageEligibilityResponse#id() id}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link CoverageEligibilityResponse#text() text}
   *    .error(List&amp;lt;com.fhir.types.fhir.CoverageEligibilityResponse_Error&amp;gt;) // optional {@link CoverageEligibilityResponse#error() error}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link CoverageEligibilityResponse#identifier() identifier}
   *    .preAuthRef(String) // optional {@link CoverageEligibilityResponse#preAuthRef() preAuthRef}
   *    .disposition(String) // optional {@link CoverageEligibilityResponse#disposition() disposition}
   *    .request(com.fhir.types.fhir.Reference) // required {@link CoverageEligibilityResponse#request() request}
   *    .created(com.fhir.types.fhir.DateTime) // optional {@link CoverageEligibilityResponse#created() created}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link CoverageEligibilityResponse#contained() contained}
   *    .servicedDate(String) // optional {@link CoverageEligibilityResponse#servicedDate() servicedDate}
   *    .outcome(com.fhir.types.fhir.CoverageeligibilityresponseOutcome) // optional {@link CoverageEligibilityResponse#outcome() outcome}
   *    .purpose(List&amp;lt;com.fhir.types.fhir.CoverageeligibilityresponsePurposeItem&amp;gt;) // optional {@link CoverageEligibilityResponse#purpose() purpose}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link CoverageEligibilityResponse#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link CoverageEligibilityResponse#language() language}
   *    .insurance(List&amp;lt;com.fhir.types.fhir.CoverageEligibilityResponse_Insurance&amp;gt;) // optional {@link CoverageEligibilityResponse#insurance() insurance}
   *    .insurer(com.fhir.types.fhir.Reference) // required {@link CoverageEligibilityResponse#insurer() insurer}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link CoverageEligibilityResponse#patient() patient}
   *    .resourceType(String) // required {@link CoverageEligibilityResponse#resourceType() resourceType}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link CoverageEligibilityResponse#meta() meta}
   *    .servicedPeriod(com.fhir.types.fhir.Period) // optional {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod}
   *    .form(com.fhir.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse#form() form}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse#modifierExtension() modifierExtension}
   *    .requestor(com.fhir.types.fhir.Reference) // optional {@link CoverageEligibilityResponse#requestor() requestor}
   *    .status(com.fhir.types.fhir.Code) // optional {@link CoverageEligibilityResponse#status() status}
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
  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements RequestBuildStage, InsurerBuildStage, PatientBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_REQUEST = 0x1L;
    private static final long INIT_BIT_INSURER = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_ERROR = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x10L;
    private static final long OPT_BIT_DISPOSITION = 0x20L;
    private static final long OPT_BIT_CREATED = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_SERVICED_DATE = 0x100L;
    private static final long OPT_BIT_OUTCOME = 0x200L;
    private static final long OPT_BIT_PURPOSE = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_INSURANCE = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x8000L;
    private static final long OPT_BIT_FORM = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_REQUESTOR = 0x80000L;
    private static final long OPT_BIT_STATUS = 0x100000L;
    private long initBits = 0xfL;
    private long optBits;

    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable List<CoverageEligibilityResponse_Error> error;
    private @Nullable List<Identifier> identifier;
    private @Nullable String preAuthRef;
    private @Nullable String disposition;
    private @Nullable Reference request;
    private @Nullable DateTime created;
    private @Nullable List<ResourceList> contained;
    private @Nullable String servicedDate;
    private @Nullable CoverageeligibilityresponseOutcome outcome;
    private @Nullable List<CoverageeligibilityresponsePurposeItem> purpose;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<CoverageEligibilityResponse_Insurance> insurance;
    private @Nullable Reference insurer;
    private @Nullable Reference patient;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable Period servicedPeriod;
    private @Nullable CodeableConcept form;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference requestor;
    private @Nullable Code status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    public final Builder error(List<CoverageEligibilityResponse_Error> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = Objects.requireNonNull(error, "error");
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("error")
    public final Builder error(Optional<? extends List<CoverageEligibilityResponse_Error>> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = error.orElse(null);
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(String preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAuthRef")
    public final Builder preAuthRef(Optional<String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
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
     * Initializes the value for the {@link CoverageEligibilityResponse#request() request} attribute.
     * @param request The value for request 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      initBits &= ~INIT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(CoverageeligibilityresponseOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends CoverageeligibilityresponseOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(List<CoverageeligibilityresponsePurposeItem> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends List<CoverageeligibilityresponsePurposeItem>> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(List<CoverageEligibilityResponse_Insurance> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurance")
    public final Builder insurance(Optional<? extends List<CoverageEligibilityResponse_Insurance>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#insurer() insurer} attribute.
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
     * Initializes the value for the {@link CoverageEligibilityResponse#patient() patient} attribute.
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
     * Initializes the value for the {@link CoverageEligibilityResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    public final Builder form(CodeableConcept form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = Objects.requireNonNull(form, "form");
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("form")
    public final Builder form(Optional<? extends CodeableConcept> form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = form.orElse(null);
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestor(Reference requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = Objects.requireNonNull(requestor, "requestor");
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestor")
    public final Builder requestor(Optional<? extends Reference> requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor.orElse(null);
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
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
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
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
     * Builds a new {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
     * @return An immutable instance of CoverageEligibilityResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityResponse build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityResponse(
          id,
          text,
          error,
          identifier,
          preAuthRef,
          disposition,
          request,
          created,
          contained,
          servicedDate,
          outcome,
          purpose,
          implicitRules,
          language,
          insurance,
          insurer,
          patient,
          resourceType,
          meta,
          servicedPeriod,
          form,
          extension,
          modifierExtension,
          requestor,
          status);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean errorIsSet() {
      return (optBits & OPT_BIT_ERROR) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean requestIsSet() {
      return (initBits & INIT_BIT_REQUEST) == 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!requestIsSet()) attributes.add("request");
      if (!insurerIsSet()) attributes.add("insurer");
      if (!patientIsSet()) attributes.add("patient");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CoverageEligibilityResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface RequestBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#request() request} attribute.
     * @param request The value for request 
     * @return {@code this} builder for use in a chained invocation
     */
    InsurerBuildStage request(Reference request);
  }

  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage insurer(Reference insurer);
  }

  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage patient(Reference patient);
  }

  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "CoverageEligibilityResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    BuildFinal error(List<CoverageEligibilityResponse_Error> error);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal error(Optional<? extends List<CoverageEligibilityResponse_Error>> error);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(String preAuthRef);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(Optional<String> preAuthRef);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(String disposition);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(Optional<String> disposition);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(String servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(Optional<String> servicedDate);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(CoverageeligibilityresponseOutcome outcome);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends CoverageeligibilityresponseOutcome> outcome);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(List<CoverageeligibilityresponsePurposeItem> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends List<CoverageeligibilityresponsePurposeItem>> purpose);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<CoverageEligibilityResponse_Insurance> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<CoverageEligibilityResponse_Insurance>> insurance);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(Period servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(Optional<? extends Period> servicedPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(CodeableConcept form);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(Optional<? extends CodeableConcept> form);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestor(Reference requestor);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestor(Optional<? extends Reference> requestor);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Builds a new {@link CoverageEligibilityResponse CoverageEligibilityResponse}.
     * @return An immutable instance of CoverageEligibilityResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityResponse build();
  }
}
