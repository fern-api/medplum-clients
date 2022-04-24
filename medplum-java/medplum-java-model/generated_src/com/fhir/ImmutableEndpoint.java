//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Endpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEndpoint.builder()}.
 */
@org.immutables.value.Generated(from = "Endpoint", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEndpoint implements com.fhir.Endpoint {
  private final @javax.annotation.Nullable com.fhir.url address;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.Coding connectionType;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> payloadMimeType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference managingOrganization;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.EndpointStatus status;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> header;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.util.List<com.fhir.CodeableConcept> payloadType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;

  private ImmutableEndpoint(
      @javax.annotation.Nullable com.fhir.url address,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.Coding connectionType,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.code> payloadMimeType,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference managingOrganization,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.EndpointStatus status,
      @javax.annotation.Nullable java.util.List<java.lang.String> header,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.util.List<com.fhir.CodeableConcept> payloadType,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Narrative text) {
    this.address = address;
    this.extension = extension;
    this.connectionType = connectionType;
    this.name = name;
    this.period = period;
    this.id = id;
    this.implicitRules = implicitRules;
    this.payloadMimeType = payloadMimeType;
    this.language = language;
    this.managingOrganization = managingOrganization;
    this.resourceType = resourceType;
    this.status = status;
    this.header = header;
    this.contained = contained;
    this.meta = meta;
    this.payloadType = payloadType;
    this.contact = contact;
    this.identifier = identifier;
    this.modifierExtension = modifierExtension;
    this.text = text;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  @Override
  public java.util.Optional<com.fhir.url> address() {
    return java.util.Optional.ofNullable(address);
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
   * @return The value of the {@code connectionType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
  @Override
  public com.fhir.Coding connectionType() {
    return connectionType;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code payloadMimeType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payloadMimeType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> payloadMimeType() {
    return java.util.Optional.ofNullable(payloadMimeType);
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
   * @return The value of the {@code managingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> managingOrganization() {
    return java.util.Optional.ofNullable(managingOrganization);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.EndpointStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code header} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("header")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> header() {
    return java.util.Optional.ofNullable(header);
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
   * @return The value of the {@code payloadType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payloadType")
  @Override
  public java.util.List<com.fhir.CodeableConcept> payloadType() {
    return payloadType;
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withAddress(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableEndpoint(
        newValue,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withAddress(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableEndpoint(
        value,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        newValue,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEndpoint(
        this.address,
        value,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Endpoint#connectionType() connectionType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for connectionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndpoint withConnectionType(com.fhir.Coding value) {
    if (this.connectionType == value) return this;
    com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "connectionType");
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        newValue,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        newValue,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        value,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        newValue,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        value,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        newValue,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        value,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        newValue,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        value,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#payloadMimeType() payloadMimeType} attribute.
   * @param value The value for payloadMimeType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPayloadMimeType(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "payloadMimeType");
    if (this.payloadMimeType == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        newValue,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#payloadMimeType() payloadMimeType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payloadMimeType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withPayloadMimeType(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.payloadMimeType == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        value,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        newValue,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        value,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withManagingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        newValue,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withManagingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        value,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Endpoint#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndpoint withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        newValue,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withStatus(com.fhir.EndpointStatus value) {
    @javax.annotation.Nullable com.fhir.EndpointStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        newValue,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withStatus(java.util.Optional<? extends com.fhir.EndpointStatus> optional) {
    @javax.annotation.Nullable com.fhir.EndpointStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        value,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#header() header} attribute.
   * @param value The value for header
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withHeader(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "header");
    if (this.header == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        newValue,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#header() header} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for header
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withHeader(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.header == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        value,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        newValue,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        value,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        newValue,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        value,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Endpoint#payloadType() payloadType}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPayloadType(com.fhir.CodeableConcept... elements) {
    java.util.List<com.fhir.CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        newValue,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Endpoint#payloadType() payloadType}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of payloadType elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPayloadType(Iterable<? extends com.fhir.CodeableConcept> elements) {
    if (this.payloadType == elements) return this;
    java.util.List<com.fhir.CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        newValue,
        this.contact,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withContact(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        newValue,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        value,
        this.identifier,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        newValue,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        value,
        this.modifierExtension,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEndpoint(
        this.address,
        this.extension,
        this.connectionType,
        this.name,
        this.period,
        this.id,
        this.implicitRules,
        this.payloadMimeType,
        this.language,
        this.managingOrganization,
        this.resourceType,
        this.status,
        this.header,
        this.contained,
        this.meta,
        this.payloadType,
        this.contact,
        this.identifier,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEndpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEndpoint
        && equalTo((ImmutableEndpoint) another);
  }

  private boolean equalTo(ImmutableEndpoint another) {
    return java.util.Objects.equals(address, another.address)
        && java.util.Objects.equals(extension, another.extension)
        && connectionType.equals(another.connectionType)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(payloadMimeType, another.payloadMimeType)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(managingOrganization, another.managingOrganization)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(header, another.header)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(meta, another.meta)
        && payloadType.equals(another.payloadType)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code address}, {@code extension}, {@code connectionType}, {@code name}, {@code period}, {@code id}, {@code implicitRules}, {@code payloadMimeType}, {@code language}, {@code managingOrganization}, {@code resourceType}, {@code status}, {@code header}, {@code contained}, {@code meta}, {@code payloadType}, {@code contact}, {@code identifier}, {@code modifierExtension}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(address);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + connectionType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(payloadMimeType);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(managingOrganization);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(header);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + payloadType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code Endpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Endpoint{");
    if (address != null) {
      builder.append("address=").append(address);
    }
    if (extension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("connectionType=").append(connectionType);
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (payloadMimeType != null) {
      builder.append(", ");
      builder.append("payloadMimeType=").append(payloadMimeType);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (managingOrganization != null) {
      builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (header != null) {
      builder.append(", ");
      builder.append("header=").append(header);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("payloadType=").append(payloadType);
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Endpoint", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Endpoint {
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> address = java.util.Optional.empty();
    boolean addressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.Coding connectionType;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> payloadMimeType = java.util.Optional.empty();
    boolean payloadMimeTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> managingOrganization = java.util.Optional.empty();
    boolean managingOrganizationIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EndpointStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> header = java.util.Optional.empty();
    boolean headerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> payloadType = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<com.fhir.url> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
    public void setConnectionType(com.fhir.Coding connectionType) {
      this.connectionType = connectionType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payloadMimeType")
    public void setPayloadMimeType(java.util.Optional<java.util.List<com.fhir.code>> payloadMimeType) {
      this.payloadMimeType = payloadMimeType;
      this.payloadMimeTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public void setManagingOrganization(java.util.Optional<com.fhir.Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.EndpointStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    public void setHeader(java.util.Optional<java.util.List<java.lang.String>> header) {
      this.header = header;
      this.headerIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("payloadType")
    public void setPayloadType(java.util.List<com.fhir.CodeableConcept> payloadType) {
      this.payloadType = payloadType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.url> address() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Coding connectionType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> payloadMimeType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EndpointStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> header() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.CodeableConcept> payloadType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEndpoint fromJson(Json json) {
    ImmutableEndpoint.Builder builder = ((ImmutableEndpoint.Builder) ImmutableEndpoint.builder());
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.connectionType != null) {
      builder.connectionType(json.connectionType);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.payloadMimeTypeIsSet) {
      builder.payloadMimeType(json.payloadMimeType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.headerIsSet) {
      builder.header(json.header);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.payloadType != null) {
      builder.addAllPayloadType(json.payloadType);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutableEndpoint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Endpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Endpoint instance
   */
  public static Endpoint copyOf(Endpoint instance) {
    if (instance instanceof ImmutableEndpoint) {
      return (ImmutableEndpoint) instance;
    }
    return ((ImmutableEndpoint.Builder) ImmutableEndpoint.builder())
        .address(instance.address())
        .extension(instance.extension())
        .connectionType(instance.connectionType())
        .name(instance.name())
        .period(instance.period())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .payloadMimeType(instance.payloadMimeType())
        .language(instance.language())
        .managingOrganization(instance.managingOrganization())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .header(instance.header())
        .contained(instance.contained())
        .meta(instance.meta())
        .addAllPayloadType(instance.payloadType())
        .contact(instance.contact())
        .identifier(instance.identifier())
        .modifierExtension(instance.modifierExtension())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link Endpoint Endpoint}.
   * <pre>
   * ImmutableEndpoint.builder()
   *    .address(com.fhir.url) // optional {@link Endpoint#address() address}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Endpoint#extension() extension}
   *    .connectionType(com.fhir.Coding) // required {@link Endpoint#connectionType() connectionType}
   *    .name(String) // optional {@link Endpoint#name() name}
   *    .period(com.fhir.Period) // optional {@link Endpoint#period() period}
   *    .id(com.fhir.id) // optional {@link Endpoint#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link Endpoint#implicitRules() implicitRules}
   *    .payloadMimeType(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link Endpoint#payloadMimeType() payloadMimeType}
   *    .language(com.fhir.code) // optional {@link Endpoint#language() language}
   *    .managingOrganization(com.fhir.Reference) // optional {@link Endpoint#managingOrganization() managingOrganization}
   *    .resourceType(String) // required {@link Endpoint#resourceType() resourceType}
   *    .status(com.fhir.EndpointStatus) // optional {@link Endpoint#status() status}
   *    .header(List&amp;lt;String&amp;gt;) // optional {@link Endpoint#header() header}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Endpoint#contained() contained}
   *    .meta(com.fhir.Meta) // optional {@link Endpoint#meta() meta}
   *    .addPayloadType|addAllPayloadType(com.fhir.CodeableConcept) // {@link Endpoint#payloadType() payloadType} elements
   *    .contact(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Endpoint#contact() contact}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Endpoint#identifier() identifier}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Endpoint#modifierExtension() modifierExtension}
   *    .text(com.fhir.Narrative) // optional {@link Endpoint#text() text}
   *    .build();
   * </pre>
   * @return A new Endpoint builder
   */
  public static ConnectionTypeBuildStage builder() {
    return new ImmutableEndpoint.Builder();
  }

  /**
   * Builds instances of type {@link Endpoint Endpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Endpoint", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ConnectionTypeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CONNECTION_TYPE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_ADDRESS = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_PERIOD = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_PAYLOAD_MIME_TYPE = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_HEADER = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_CONTACT = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.url address;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Coding connectionType;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> payloadMimeType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference managingOrganization;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.EndpointStatus status;
    private @javax.annotation.Nullable java.util.List<java.lang.String> header;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private final java.util.List<com.fhir.CodeableConcept> payloadType = new java.util.ArrayList<com.fhir.CodeableConcept>();
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(com.fhir.url address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = java.util.Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public final Builder address(java.util.Optional<? extends com.fhir.url> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
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
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
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
     * Initializes the value for the {@link Endpoint#connectionType() connectionType} attribute.
     * @param connectionType The value for connectionType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
    public final Builder connectionType(com.fhir.Coding connectionType) {
      checkNotIsSet(connectionTypeIsSet(), "connectionType");
      this.connectionType = java.util.Objects.requireNonNull(connectionType, "connectionType");
      initBits &= ~INIT_BIT_CONNECTION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#period() period} to period.
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
     * Initializes the optional value {@link Endpoint#period() period} to period.
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
     * Initializes the optional value {@link Endpoint#id() id} to id.
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
     * Initializes the optional value {@link Endpoint#id() id} to id.
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
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for chained invocation
     */
    public final Builder payloadMimeType(java.util.List<com.fhir.code> payloadMimeType) {
      checkNotIsSet(payloadMimeTypeIsSet(), "payloadMimeType");
      this.payloadMimeType = java.util.Objects.requireNonNull(payloadMimeType, "payloadMimeType");
      optBits |= OPT_BIT_PAYLOAD_MIME_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payloadMimeType")
    public final Builder payloadMimeType(java.util.Optional<? extends java.util.List<com.fhir.code>> payloadMimeType) {
      checkNotIsSet(payloadMimeTypeIsSet(), "payloadMimeType");
      this.payloadMimeType = payloadMimeType.orElse(null);
      optBits |= OPT_BIT_PAYLOAD_MIME_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#language() language} to language.
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
     * Initializes the optional value {@link Endpoint#language() language} to language.
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
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the value for the {@link Endpoint#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.EndpointStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.EndpointStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for chained invocation
     */
    public final Builder header(java.util.List<java.lang.String> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = java.util.Objects.requireNonNull(header, "header");
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    public final Builder header(java.util.Optional<? extends java.util.List<java.lang.String>> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = header.orElse(null);
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
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
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
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
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
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
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
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
     * Adds one element to {@link Endpoint#payloadType() payloadType} list.
     * @param element A payloadType element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayloadType(com.fhir.CodeableConcept element) {
      this.payloadType.add(java.util.Objects.requireNonNull(element, "payloadType element"));
      return this;
    }

    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An array of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayloadType(com.fhir.CodeableConcept... elements) {
      for (com.fhir.CodeableConcept element : elements) {
        this.payloadType.add(java.util.Objects.requireNonNull(element, "payloadType element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An iterable of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPayloadType(Iterable<? extends com.fhir.CodeableConcept> elements) {
      for (com.fhir.CodeableConcept element : elements) {
        this.payloadType.add(java.util.Objects.requireNonNull(element, "payloadType element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Endpoint#text() text} to text.
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
     * Initializes the optional value {@link Endpoint#text() text} to text.
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
     * Builds a new {@link Endpoint Endpoint}.
     * @return An immutable instance of Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Endpoint build() {
      checkRequiredAttributes();
      return new ImmutableEndpoint(
          address,
          extension,
          connectionType,
          name,
          period,
          id,
          implicitRules,
          payloadMimeType,
          language,
          managingOrganization,
          resourceType,
          status,
          header,
          contained,
          meta,
          createUnmodifiableList(true, payloadType),
          contact,
          identifier,
          modifierExtension,
          text);
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean payloadMimeTypeIsSet() {
      return (optBits & OPT_BIT_PAYLOAD_MIME_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean headerIsSet() {
      return (optBits & OPT_BIT_HEADER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean connectionTypeIsSet() {
      return (initBits & INIT_BIT_CONNECTION_TYPE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Endpoint is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!connectionTypeIsSet()) attributes.add("connectionType");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Endpoint, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Endpoint", generator = "Immutables")
  public interface ConnectionTypeBuildStage {
    /**
     * Initializes the value for the {@link Endpoint#connectionType() connectionType} attribute.
     * @param connectionType The value for connectionType 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage connectionType(com.fhir.Coding connectionType);
  }

  @org.immutables.value.Generated(from = "Endpoint", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Endpoint#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Endpoint", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(com.fhir.url address);

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends com.fhir.url> address);

    /**
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Endpoint#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Endpoint#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Endpoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link Endpoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payloadMimeType(java.util.List<com.fhir.code> payloadMimeType);

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payloadMimeType(java.util.Optional<? extends java.util.List<com.fhir.code>> payloadMimeType);

    /**
     * Initializes the optional value {@link Endpoint#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Endpoint#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(com.fhir.Reference managingOrganization);

    /**
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.EndpointStatus status);

    /**
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.EndpointStatus> status);

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for chained invocation
     */
    BuildFinal header(java.util.List<java.lang.String> header);

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal header(java.util.Optional<? extends java.util.List<java.lang.String>> header);

    /**
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Adds one element to {@link Endpoint#payloadType() payloadType} list.
     * @param element A payloadType element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayloadType(com.fhir.CodeableConcept element);

    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An array of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayloadType(com.fhir.CodeableConcept... elements);

    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An iterable of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllPayloadType(Iterable<? extends com.fhir.CodeableConcept> elements);

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactPoint> contact);

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact);

    /**
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Endpoint#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Endpoint#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Builds a new {@link Endpoint Endpoint}.
     * @return An immutable instance of Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Endpoint build();
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
