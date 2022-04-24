//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link EnrollmentResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEnrollmentResponse.builder()}.
 */
@org.immutables.value.Generated(from = "EnrollmentResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEnrollmentResponse implements com.fhir.EnrollmentResponse {
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String disposition;
  private final @javax.annotation.Nullable com.fhir.Reference organization;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Reference request;
  private final @javax.annotation.Nullable com.fhir.EnrollmentresponseOutcome outcome;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference requestProvider;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

  private ImmutableEnrollmentResponse(
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String disposition,
      @javax.annotation.Nullable com.fhir.Reference organization,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Reference request,
      @javax.annotation.Nullable com.fhir.EnrollmentresponseOutcome outcome,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference requestProvider,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained) {
    this.id = id;
    this.disposition = disposition;
    this.organization = organization;
    this.language = language;
    this.status = status;
    this.request = request;
    this.outcome = outcome;
    this.meta = meta;
    this.extension = extension;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.created = created;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.requestProvider = requestProvider;
    this.identifier = identifier;
    this.contained = contained;
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
   * @return The value of the {@code disposition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disposition")
  @Override
  public java.util.Optional<java.lang.String> disposition() {
    return java.util.Optional.ofNullable(disposition);
  }

  /**
   * @return The value of the {@code organization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("organization")
  @Override
  public java.util.Optional<com.fhir.Reference> organization() {
    return java.util.Optional.ofNullable(organization);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<com.fhir.Reference> request() {
    return java.util.Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.EnrollmentresponseOutcome> outcome() {
    return java.util.Optional.ofNullable(outcome);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code requestProvider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestProvider")
  @Override
  public java.util.Optional<com.fhir.Reference> requestProvider() {
    return java.util.Optional.ofNullable(requestProvider);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEnrollmentResponse(
        newValue,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEnrollmentResponse(
        value,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withDisposition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "disposition");
    if (java.util.Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        newValue,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withDisposition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.disposition, value)) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        value,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        newValue,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        value,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        newValue,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        value,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        newValue,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        value,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withRequest(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        newValue,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withRequest(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        value,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withOutcome(com.fhir.EnrollmentresponseOutcome value) {
    @javax.annotation.Nullable com.fhir.EnrollmentresponseOutcome newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        newValue,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withOutcome(java.util.Optional<? extends com.fhir.EnrollmentresponseOutcome> optional) {
    @javax.annotation.Nullable com.fhir.EnrollmentresponseOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        value,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        newValue,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        value,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        value,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnrollmentResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnrollmentResponse withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        newValue,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        newValue,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        value,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        value,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        newValue,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        value,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        newValue,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        value,
        this.requestProvider,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#requestProvider() requestProvider} attribute.
   * @param value The value for requestProvider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withRequestProvider(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requestProvider");
    if (this.requestProvider == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#requestProvider() requestProvider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestProvider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withRequestProvider(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requestProvider == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        value,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        newValue,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        value,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEnrollmentResponse(
        this.id,
        this.disposition,
        this.organization,
        this.language,
        this.status,
        this.request,
        this.outcome,
        this.meta,
        this.extension,
        this.resourceType,
        this.implicitRules,
        this.created,
        this.text,
        this.modifierExtension,
        this.requestProvider,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEnrollmentResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEnrollmentResponse
        && equalTo((ImmutableEnrollmentResponse) another);
  }

  private boolean equalTo(ImmutableEnrollmentResponse another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(disposition, another.disposition)
        && java.util.Objects.equals(organization, another.organization)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(requestProvider, another.requestProvider)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(contained, another.contained);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code disposition}, {@code organization}, {@code language}, {@code status}, {@code request}, {@code outcome}, {@code meta}, {@code extension}, {@code resourceType}, {@code implicitRules}, {@code created}, {@code text}, {@code modifierExtension}, {@code requestProvider}, {@code identifier}, {@code contained}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(disposition);
    h += (h << 5) + java.util.Objects.hashCode(organization);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(requestProvider);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    return h;
  }

  /**
   * Prints the immutable value {@code EnrollmentResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("EnrollmentResponse{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (disposition != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (organization != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (request != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("request=").append(request);
    }
    if (outcome != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (requestProvider != null) {
      builder.append(", ");
      builder.append("requestProvider=").append(requestProvider);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "EnrollmentResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.EnrollmentResponse {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> disposition = java.util.Optional.empty();
    boolean dispositionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> organization = java.util.Optional.empty();
    boolean organizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EnrollmentresponseOutcome> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requestProvider = java.util.Optional.empty();
    boolean requestProviderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disposition")
    public void setDisposition(java.util.Optional<java.lang.String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    public void setOrganization(java.util.Optional<com.fhir.Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.EnrollmentresponseOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestProvider")
    public void setRequestProvider(java.util.Optional<com.fhir.Reference> requestProvider) {
      this.requestProvider = requestProvider;
      this.requestProviderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EnrollmentresponseOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requestProvider() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEnrollmentResponse fromJson(Json json) {
    ImmutableEnrollmentResponse.Builder builder = ((ImmutableEnrollmentResponse.Builder) ImmutableEnrollmentResponse.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requestProviderIsSet) {
      builder.requestProvider(json.requestProvider);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    return (ImmutableEnrollmentResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EnrollmentResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EnrollmentResponse instance
   */
  public static EnrollmentResponse copyOf(EnrollmentResponse instance) {
    if (instance instanceof ImmutableEnrollmentResponse) {
      return (ImmutableEnrollmentResponse) instance;
    }
    return ((ImmutableEnrollmentResponse.Builder) ImmutableEnrollmentResponse.builder())
        .id(instance.id())
        .disposition(instance.disposition())
        .organization(instance.organization())
        .language(instance.language())
        .status(instance.status())
        .request(instance.request())
        .outcome(instance.outcome())
        .meta(instance.meta())
        .extension(instance.extension())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .created(instance.created())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .requestProvider(instance.requestProvider())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .build();
  }

  /**
   * Creates a builder for {@link EnrollmentResponse EnrollmentResponse}.
   * <pre>
   * ImmutableEnrollmentResponse.builder()
   *    .id(com.fhir.id) // optional {@link EnrollmentResponse#id() id}
   *    .disposition(String) // optional {@link EnrollmentResponse#disposition() disposition}
   *    .organization(com.fhir.Reference) // optional {@link EnrollmentResponse#organization() organization}
   *    .language(com.fhir.code) // optional {@link EnrollmentResponse#language() language}
   *    .status(com.fhir.code) // optional {@link EnrollmentResponse#status() status}
   *    .request(com.fhir.Reference) // optional {@link EnrollmentResponse#request() request}
   *    .outcome(com.fhir.EnrollmentresponseOutcome) // optional {@link EnrollmentResponse#outcome() outcome}
   *    .meta(com.fhir.Meta) // optional {@link EnrollmentResponse#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EnrollmentResponse#extension() extension}
   *    .resourceType(String) // required {@link EnrollmentResponse#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link EnrollmentResponse#implicitRules() implicitRules}
   *    .created(com.fhir.dateTime) // optional {@link EnrollmentResponse#created() created}
   *    .text(com.fhir.Narrative) // optional {@link EnrollmentResponse#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EnrollmentResponse#modifierExtension() modifierExtension}
   *    .requestProvider(com.fhir.Reference) // optional {@link EnrollmentResponse#requestProvider() requestProvider}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link EnrollmentResponse#identifier() identifier}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link EnrollmentResponse#contained() contained}
   *    .build();
   * </pre>
   * @return A new EnrollmentResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEnrollmentResponse.Builder();
  }

  /**
   * Builds instances of type {@link EnrollmentResponse EnrollmentResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "EnrollmentResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DISPOSITION = 0x2L;
    private static final long OPT_BIT_ORGANIZATION = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_REQUEST = 0x20L;
    private static final long OPT_BIT_OUTCOME = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_CREATED = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_REQUEST_PROVIDER = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String disposition;
    private @javax.annotation.Nullable com.fhir.Reference organization;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable com.fhir.EnrollmentresponseOutcome outcome;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference requestProvider;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
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
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
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
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    public final Builder organization(com.fhir.Reference organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = java.util.Objects.requireNonNull(organization, "organization");
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    public final Builder organization(java.util.Optional<? extends com.fhir.Reference> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = organization.orElse(null);
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
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
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
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
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
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
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
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
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(com.fhir.Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends com.fhir.Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.EnrollmentresponseOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.EnrollmentresponseOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
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
     * Initializes the value for the {@link EnrollmentResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
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
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
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
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
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
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
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
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestProvider(com.fhir.Reference requestProvider) {
      checkNotIsSet(requestProviderIsSet(), "requestProvider");
      this.requestProvider = java.util.Objects.requireNonNull(requestProvider, "requestProvider");
      optBits |= OPT_BIT_REQUEST_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestProvider")
    public final Builder requestProvider(java.util.Optional<? extends com.fhir.Reference> requestProvider) {
      checkNotIsSet(requestProviderIsSet(), "requestProvider");
      this.requestProvider = requestProvider.orElse(null);
      optBits |= OPT_BIT_REQUEST_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
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
     * Builds a new {@link EnrollmentResponse EnrollmentResponse}.
     * @return An immutable instance of EnrollmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.EnrollmentResponse build() {
      checkRequiredAttributes();
      return new ImmutableEnrollmentResponse(
          id,
          disposition,
          organization,
          language,
          status,
          request,
          outcome,
          meta,
          extension,
          resourceType,
          implicitRules,
          created,
          text,
          modifierExtension,
          requestProvider,
          identifier,
          contained);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requestProviderIsSet() {
      return (optBits & OPT_BIT_REQUEST_PROVIDER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of EnrollmentResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build EnrollmentResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "EnrollmentResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EnrollmentResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "EnrollmentResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(java.lang.String disposition);

    /**
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(java.util.Optional<java.lang.String> disposition);

    /**
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(com.fhir.Reference organization);

    /**
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(java.util.Optional<? extends com.fhir.Reference> organization);

    /**
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(com.fhir.Reference request);

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.EnrollmentresponseOutcome outcome);

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.EnrollmentresponseOutcome> outcome);

    /**
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestProvider(com.fhir.Reference requestProvider);

    /**
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestProvider(java.util.Optional<? extends com.fhir.Reference> requestProvider);

    /**
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Builds a new {@link EnrollmentResponse EnrollmentResponse}.
     * @return An immutable instance of EnrollmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EnrollmentResponse build();
  }
}
