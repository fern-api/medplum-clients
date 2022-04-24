//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Location}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation.builder()}.
 */
@org.immutables.value.Generated(from = "Location", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLocation implements com.fhir.Location {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable com.fhir.LocationMode mode;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept physicalType;
  private final @javax.annotation.Nullable com.fhir.Location_Position position;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> alias;
  private final @javax.annotation.Nullable com.fhir.Address address;
  private final @javax.annotation.Nullable com.fhir.Reference managingOrganization;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.LocationStatus status;
  private final @javax.annotation.Nullable com.fhir.Coding operationalStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Location_HoursOfOperation> hoursOfOperation;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String availabilityExceptions;
  private final @javax.annotation.Nullable com.fhir.Reference partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final java.lang.String resourceType;

  private ImmutableLocation(
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable com.fhir.LocationMode mode,
      @javax.annotation.Nullable com.fhir.CodeableConcept physicalType,
      @javax.annotation.Nullable com.fhir.Location_Position position,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<java.lang.String> alias,
      @javax.annotation.Nullable com.fhir.Address address,
      @javax.annotation.Nullable com.fhir.Reference managingOrganization,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.LocationStatus status,
      @javax.annotation.Nullable com.fhir.Coding operationalStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Location_HoursOfOperation> hoursOfOperation,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String availabilityExceptions,
      @javax.annotation.Nullable com.fhir.Reference partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      java.lang.String resourceType) {
    this.identifier = identifier;
    this.endpoint = endpoint;
    this.mode = mode;
    this.physicalType = physicalType;
    this.position = position;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.name = name;
    this.description = description;
    this.id = id;
    this.alias = alias;
    this.address = address;
    this.managingOrganization = managingOrganization;
    this.text = text;
    this.status = status;
    this.operationalStatus = operationalStatus;
    this.extension = extension;
    this.language = language;
    this.contained = contained;
    this.implicitRules = implicitRules;
    this.hoursOfOperation = hoursOfOperation;
    this.meta = meta;
    this.availabilityExceptions = availabilityExceptions;
    this.partOf = partOf;
    this.telecom = telecom;
    this.resourceType = resourceType;
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
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mode")
  @Override
  public java.util.Optional<com.fhir.LocationMode> mode() {
    return java.util.Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code physicalType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("physicalType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> physicalType() {
    return java.util.Optional.ofNullable(physicalType);
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("position")
  @Override
  public java.util.Optional<com.fhir.Location_Position> position() {
    return java.util.Optional.ofNullable(position);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code alias} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("alias")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> alias() {
    return java.util.Optional.ofNullable(alias);
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  @Override
  public java.util.Optional<com.fhir.Address> address() {
    return java.util.Optional.ofNullable(address);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.LocationStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code operationalStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operationalStatus")
  @Override
  public java.util.Optional<com.fhir.Coding> operationalStatus() {
    return java.util.Optional.ofNullable(operationalStatus);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code hoursOfOperation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hoursOfOperation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Location_HoursOfOperation>> hoursOfOperation() {
    return java.util.Optional.ofNullable(hoursOfOperation);
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
   * @return The value of the {@code availabilityExceptions} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
  @Override
  public java.util.Optional<java.lang.String> availabilityExceptions() {
    return java.util.Optional.ofNullable(availabilityExceptions);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<com.fhir.Reference> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code telecom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("telecom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() {
    return java.util.Optional.ofNullable(telecom);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableLocation(
        newValue,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableLocation(
        value,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        newValue,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableLocation(
        this.identifier,
        value,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withMode(com.fhir.LocationMode value) {
    @javax.annotation.Nullable com.fhir.LocationMode newValue = java.util.Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        newValue,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withMode(java.util.Optional<? extends com.fhir.LocationMode> optional) {
    @javax.annotation.Nullable com.fhir.LocationMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        value,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#physicalType() physicalType} attribute.
   * @param value The value for physicalType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withPhysicalType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "physicalType");
    if (this.physicalType == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        newValue,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#physicalType() physicalType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withPhysicalType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.physicalType == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        value,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#position() position} attribute.
   * @param value The value for position
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withPosition(com.fhir.Location_Position value) {
    @javax.annotation.Nullable com.fhir.Location_Position newValue = java.util.Objects.requireNonNull(value, "position");
    if (this.position == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        newValue,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#position() position} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for position
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withPosition(java.util.Optional<? extends com.fhir.Location_Position> optional) {
    @javax.annotation.Nullable com.fhir.Location_Position value = optional.orElse(null);
    if (this.position == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        value,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        newValue,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        value,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        newValue,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        value,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        newValue,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        value,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        newValue,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        value,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        newValue,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        value,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAlias(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        newValue,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withAlias(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        value,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAddress(com.fhir.Address value) {
    @javax.annotation.Nullable com.fhir.Address newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        newValue,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withAddress(java.util.Optional<? extends com.fhir.Address> optional) {
    @javax.annotation.Nullable com.fhir.Address value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        value,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withManagingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        newValue,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withManagingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        value,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        newValue,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        value,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withStatus(com.fhir.LocationStatus value) {
    @javax.annotation.Nullable com.fhir.LocationStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        newValue,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withStatus(java.util.Optional<? extends com.fhir.LocationStatus> optional) {
    @javax.annotation.Nullable com.fhir.LocationStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        value,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#operationalStatus() operationalStatus} attribute.
   * @param value The value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withOperationalStatus(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "operationalStatus");
    if (this.operationalStatus == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        newValue,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#operationalStatus() operationalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withOperationalStatus(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.operationalStatus == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        value,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        newValue,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        value,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        newValue,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        value,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        newValue,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        value,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        newValue,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        value,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#hoursOfOperation() hoursOfOperation} attribute.
   * @param value The value for hoursOfOperation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withHoursOfOperation(java.util.List<com.fhir.Location_HoursOfOperation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Location_HoursOfOperation> newValue = java.util.Objects.requireNonNull(value, "hoursOfOperation");
    if (this.hoursOfOperation == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        newValue,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#hoursOfOperation() hoursOfOperation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hoursOfOperation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withHoursOfOperation(java.util.Optional<? extends java.util.List<com.fhir.Location_HoursOfOperation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Location_HoursOfOperation> value = optional.orElse(null);
    if (this.hoursOfOperation == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        value,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        newValue,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        value,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#availabilityExceptions() availabilityExceptions} attribute.
   * @param value The value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAvailabilityExceptions(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "availabilityExceptions");
    if (java.util.Objects.equals(this.availabilityExceptions, newValue)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        newValue,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#availabilityExceptions() availabilityExceptions} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAvailabilityExceptions(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.availabilityExceptions, value)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        value,
        this.partOf,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withPartOf(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        newValue,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withPartOf(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        value,
        this.telecom,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Location#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLocation withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableLocation(
        this.identifier,
        this.endpoint,
        this.mode,
        this.physicalType,
        this.position,
        this.modifierExtension,
        this.type,
        this.name,
        this.description,
        this.id,
        this.alias,
        this.address,
        this.managingOrganization,
        this.text,
        this.status,
        this.operationalStatus,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.hoursOfOperation,
        this.meta,
        this.availabilityExceptions,
        this.partOf,
        this.telecom,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation
        && equalTo((ImmutableLocation) another);
  }

  private boolean equalTo(ImmutableLocation another) {
    return java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(mode, another.mode)
        && java.util.Objects.equals(physicalType, another.physicalType)
        && java.util.Objects.equals(position, another.position)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(alias, another.alias)
        && java.util.Objects.equals(address, another.address)
        && java.util.Objects.equals(managingOrganization, another.managingOrganization)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(operationalStatus, another.operationalStatus)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(hoursOfOperation, another.hoursOfOperation)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(availabilityExceptions, another.availabilityExceptions)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(telecom, another.telecom)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code endpoint}, {@code mode}, {@code physicalType}, {@code position}, {@code modifierExtension}, {@code type}, {@code name}, {@code description}, {@code id}, {@code alias}, {@code address}, {@code managingOrganization}, {@code text}, {@code status}, {@code operationalStatus}, {@code extension}, {@code language}, {@code contained}, {@code implicitRules}, {@code hoursOfOperation}, {@code meta}, {@code availabilityExceptions}, {@code partOf}, {@code telecom}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(mode);
    h += (h << 5) + java.util.Objects.hashCode(physicalType);
    h += (h << 5) + java.util.Objects.hashCode(position);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(alias);
    h += (h << 5) + java.util.Objects.hashCode(address);
    h += (h << 5) + java.util.Objects.hashCode(managingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(operationalStatus);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(hoursOfOperation);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(availabilityExceptions);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Location} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Location{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (endpoint != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (mode != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (physicalType != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("physicalType=").append(physicalType);
    }
    if (position != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("position=").append(position);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (name != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (alias != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (address != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (managingOrganization != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (text != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (operationalStatus != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("operationalStatus=").append(operationalStatus);
    }
    if (extension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (hoursOfOperation != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("hoursOfOperation=").append(hoursOfOperation);
    }
    if (meta != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (availabilityExceptions != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("availabilityExceptions=").append(availabilityExceptions);
    }
    if (partOf != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (telecom != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Location", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Location {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.LocationMode> mode = java.util.Optional.empty();
    boolean modeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> physicalType = java.util.Optional.empty();
    boolean physicalTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Location_Position> position = java.util.Optional.empty();
    boolean positionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> alias = java.util.Optional.empty();
    boolean aliasIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Address> address = java.util.Optional.empty();
    boolean addressIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> managingOrganization = java.util.Optional.empty();
    boolean managingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.LocationStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> operationalStatus = java.util.Optional.empty();
    boolean operationalStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Location_HoursOfOperation>> hoursOfOperation = java.util.Optional.empty();
    boolean hoursOfOperationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> availabilityExceptions = java.util.Optional.empty();
    boolean availabilityExceptionsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public void setMode(java.util.Optional<com.fhir.LocationMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("physicalType")
    public void setPhysicalType(java.util.Optional<com.fhir.CodeableConcept> physicalType) {
      this.physicalType = physicalType;
      this.physicalTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    public void setPosition(java.util.Optional<com.fhir.Location_Position> position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public void setAlias(java.util.Optional<java.util.List<java.lang.String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<com.fhir.Address> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public void setManagingOrganization(java.util.Optional<com.fhir.Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.LocationStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operationalStatus")
    public void setOperationalStatus(java.util.Optional<com.fhir.Coding> operationalStatus) {
      this.operationalStatus = operationalStatus;
      this.operationalStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hoursOfOperation")
    public void setHoursOfOperation(java.util.Optional<java.util.List<com.fhir.Location_HoursOfOperation>> hoursOfOperation) {
      this.hoursOfOperation = hoursOfOperation;
      this.hoursOfOperationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions) {
      this.availabilityExceptions = availabilityExceptions;
      this.availabilityExceptionsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<com.fhir.Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.LocationMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> physicalType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Location_Position> position() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Address> address() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.LocationStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> operationalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Location_HoursOfOperation>> hoursOfOperation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> availabilityExceptions() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
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
  static ImmutableLocation fromJson(Json json) {
    ImmutableLocation.Builder builder = ((ImmutableLocation.Builder) ImmutableLocation.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.physicalTypeIsSet) {
      builder.physicalType(json.physicalType);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.operationalStatusIsSet) {
      builder.operationalStatus(json.operationalStatus);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.hoursOfOperationIsSet) {
      builder.hoursOfOperation(json.hoursOfOperation);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.availabilityExceptionsIsSet) {
      builder.availabilityExceptions(json.availabilityExceptions);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableLocation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Location} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Location instance
   */
  public static Location copyOf(Location instance) {
    if (instance instanceof ImmutableLocation) {
      return (ImmutableLocation) instance;
    }
    return ((ImmutableLocation.Builder) ImmutableLocation.builder())
        .identifier(instance.identifier())
        .endpoint(instance.endpoint())
        .mode(instance.mode())
        .physicalType(instance.physicalType())
        .position(instance.position())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .name(instance.name())
        .description(instance.description())
        .id(instance.id())
        .alias(instance.alias())
        .address(instance.address())
        .managingOrganization(instance.managingOrganization())
        .text(instance.text())
        .status(instance.status())
        .operationalStatus(instance.operationalStatus())
        .extension(instance.extension())
        .language(instance.language())
        .contained(instance.contained())
        .implicitRules(instance.implicitRules())
        .hoursOfOperation(instance.hoursOfOperation())
        .meta(instance.meta())
        .availabilityExceptions(instance.availabilityExceptions())
        .partOf(instance.partOf())
        .telecom(instance.telecom())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link Location Location}.
   * <pre>
   * ImmutableLocation.builder()
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Location#identifier() identifier}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Location#endpoint() endpoint}
   *    .mode(com.fhir.LocationMode) // optional {@link Location#mode() mode}
   *    .physicalType(com.fhir.CodeableConcept) // optional {@link Location#physicalType() physicalType}
   *    .position(com.fhir.Location_Position) // optional {@link Location#position() position}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Location#modifierExtension() modifierExtension}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Location#type() type}
   *    .name(String) // optional {@link Location#name() name}
   *    .description(String) // optional {@link Location#description() description}
   *    .id(com.fhir.id) // optional {@link Location#id() id}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link Location#alias() alias}
   *    .address(com.fhir.Address) // optional {@link Location#address() address}
   *    .managingOrganization(com.fhir.Reference) // optional {@link Location#managingOrganization() managingOrganization}
   *    .text(com.fhir.Narrative) // optional {@link Location#text() text}
   *    .status(com.fhir.LocationStatus) // optional {@link Location#status() status}
   *    .operationalStatus(com.fhir.Coding) // optional {@link Location#operationalStatus() operationalStatus}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Location#extension() extension}
   *    .language(com.fhir.code) // optional {@link Location#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Location#contained() contained}
   *    .implicitRules(com.fhir.uri) // optional {@link Location#implicitRules() implicitRules}
   *    .hoursOfOperation(List&amp;lt;com.fhir.Location_HoursOfOperation&amp;gt;) // optional {@link Location#hoursOfOperation() hoursOfOperation}
   *    .meta(com.fhir.Meta) // optional {@link Location#meta() meta}
   *    .availabilityExceptions(String) // optional {@link Location#availabilityExceptions() availabilityExceptions}
   *    .partOf(com.fhir.Reference) // optional {@link Location#partOf() partOf}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Location#telecom() telecom}
   *    .resourceType(String) // required {@link Location#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new Location builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableLocation.Builder();
  }

  /**
   * Builds instances of type {@link Location Location}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Location", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_ENDPOINT = 0x2L;
    private static final long OPT_BIT_MODE = 0x4L;
    private static final long OPT_BIT_PHYSICAL_TYPE = 0x8L;
    private static final long OPT_BIT_POSITION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_NAME = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_ALIAS = 0x400L;
    private static final long OPT_BIT_ADDRESS = 0x800L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_STATUS = 0x4000L;
    private static final long OPT_BIT_OPERATIONAL_STATUS = 0x8000L;
    private static final long OPT_BIT_EXTENSION = 0x10000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80000L;
    private static final long OPT_BIT_HOURS_OF_OPERATION = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_AVAILABILITY_EXCEPTIONS = 0x400000L;
    private static final long OPT_BIT_PART_OF = 0x800000L;
    private static final long OPT_BIT_TELECOM = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable com.fhir.LocationMode mode;
    private @javax.annotation.Nullable com.fhir.CodeableConcept physicalType;
    private @javax.annotation.Nullable com.fhir.Location_Position position;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<java.lang.String> alias;
    private @javax.annotation.Nullable com.fhir.Address address;
    private @javax.annotation.Nullable com.fhir.Reference managingOrganization;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.LocationStatus status;
    private @javax.annotation.Nullable com.fhir.Coding operationalStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Location_HoursOfOperation> hoursOfOperation;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String availabilityExceptions;
    private @javax.annotation.Nullable com.fhir.Reference partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable java.lang.String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(java.util.List<com.fhir.Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(com.fhir.LocationMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = java.util.Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public final Builder mode(java.util.Optional<? extends com.fhir.LocationMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for chained invocation
     */
    public final Builder physicalType(com.fhir.CodeableConcept physicalType) {
      checkNotIsSet(physicalTypeIsSet(), "physicalType");
      this.physicalType = java.util.Objects.requireNonNull(physicalType, "physicalType");
      optBits |= OPT_BIT_PHYSICAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("physicalType")
    public final Builder physicalType(java.util.Optional<? extends com.fhir.CodeableConcept> physicalType) {
      checkNotIsSet(physicalTypeIsSet(), "physicalType");
      this.physicalType = physicalType.orElse(null);
      optBits |= OPT_BIT_PHYSICAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for chained invocation
     */
    public final Builder position(com.fhir.Location_Position position) {
      checkNotIsSet(positionIsSet(), "position");
      this.position = java.util.Objects.requireNonNull(position, "position");
      optBits |= OPT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    public final Builder position(java.util.Optional<? extends com.fhir.Location_Position> position) {
      checkNotIsSet(positionIsSet(), "position");
      this.position = position.orElse(null);
      optBits |= OPT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location#type() type} to type.
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
     * Initializes the optional value {@link Location#type() type} to type.
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
     * Initializes the optional value {@link Location#name() name} to name.
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
     * Initializes the optional value {@link Location#name() name} to name.
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
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#id() id} to id.
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
     * Initializes the optional value {@link Location#id() id} to id.
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
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(java.util.List<java.lang.String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = java.util.Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public final Builder alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(com.fhir.Address address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = java.util.Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public final Builder address(java.util.Optional<? extends com.fhir.Address> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Location#text() text} to text.
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
     * Initializes the optional value {@link Location#text() text} to text.
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
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.LocationStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.LocationStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder operationalStatus(com.fhir.Coding operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = java.util.Objects.requireNonNull(operationalStatus, "operationalStatus");
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationalStatus")
    public final Builder operationalStatus(java.util.Optional<? extends com.fhir.Coding> operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = operationalStatus.orElse(null);
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#extension() extension} to extension.
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
     * Initializes the optional value {@link Location#extension() extension} to extension.
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
     * Initializes the optional value {@link Location#language() language} to language.
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
     * Initializes the optional value {@link Location#language() language} to language.
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
     * Initializes the optional value {@link Location#contained() contained} to contained.
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
     * Initializes the optional value {@link Location#contained() contained} to contained.
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
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for chained invocation
     */
    public final Builder hoursOfOperation(java.util.List<com.fhir.Location_HoursOfOperation> hoursOfOperation) {
      checkNotIsSet(hoursOfOperationIsSet(), "hoursOfOperation");
      this.hoursOfOperation = java.util.Objects.requireNonNull(hoursOfOperation, "hoursOfOperation");
      optBits |= OPT_BIT_HOURS_OF_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hoursOfOperation")
    public final Builder hoursOfOperation(java.util.Optional<? extends java.util.List<com.fhir.Location_HoursOfOperation>> hoursOfOperation) {
      checkNotIsSet(hoursOfOperationIsSet(), "hoursOfOperation");
      this.hoursOfOperation = hoursOfOperation.orElse(null);
      optBits |= OPT_BIT_HOURS_OF_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#meta() meta} to meta.
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
     * Initializes the optional value {@link Location#meta() meta} to meta.
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
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    public final Builder availabilityExceptions(java.lang.String availabilityExceptions) {
      checkNotIsSet(availabilityExceptionsIsSet(), "availabilityExceptions");
      this.availabilityExceptions = java.util.Objects.requireNonNull(availabilityExceptions, "availabilityExceptions");
      optBits |= OPT_BIT_AVAILABILITY_EXCEPTIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
    public final Builder availabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions) {
      checkNotIsSet(availabilityExceptionsIsSet(), "availabilityExceptions");
      this.availabilityExceptions = availabilityExceptions.orElse(null);
      optBits |= OPT_BIT_AVAILABILITY_EXCEPTIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(com.fhir.Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    public final Builder telecom(java.util.List<com.fhir.ContactPoint> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = java.util.Objects.requireNonNull(telecom, "telecom");
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public final Builder telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = telecom.orElse(null);
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the value for the {@link Location#resourceType() resourceType} attribute.
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
     * Builds a new {@link Location Location}.
     * @return An immutable instance of Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Location build() {
      checkRequiredAttributes();
      return new ImmutableLocation(
          identifier,
          endpoint,
          mode,
          physicalType,
          position,
          modifierExtension,
          type,
          name,
          description,
          id,
          alias,
          address,
          managingOrganization,
          text,
          status,
          operationalStatus,
          extension,
          language,
          contained,
          implicitRules,
          hoursOfOperation,
          meta,
          availabilityExceptions,
          partOf,
          telecom,
          resourceType);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean physicalTypeIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_TYPE) != 0;
    }

    private boolean positionIsSet() {
      return (optBits & OPT_BIT_POSITION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean operationalStatusIsSet() {
      return (optBits & OPT_BIT_OPERATIONAL_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean hoursOfOperationIsSet() {
      return (optBits & OPT_BIT_HOURS_OF_OPERATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean availabilityExceptionsIsSet() {
      return (optBits & OPT_BIT_AVAILABILITY_EXCEPTIONS) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Location is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Location, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Location", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Location#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Location", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(com.fhir.LocationMode mode);

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(java.util.Optional<? extends com.fhir.LocationMode> mode);

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalType(com.fhir.CodeableConcept physicalType);

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalType(java.util.Optional<? extends com.fhir.CodeableConcept> physicalType);

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for chained invocation
     */
    BuildFinal position(com.fhir.Location_Position position);

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal position(java.util.Optional<? extends com.fhir.Location_Position> position);

    /**
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Location#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Location#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Location#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Location#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link Location#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Location#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(java.util.List<java.lang.String> alias);

    /**
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias);

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(com.fhir.Address address);

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends com.fhir.Address> address);

    /**
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(com.fhir.Reference managingOrganization);

    /**
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Location#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Location#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.LocationStatus status);

    /**
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.LocationStatus> status);

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal operationalStatus(com.fhir.Coding operationalStatus);

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operationalStatus(java.util.Optional<? extends com.fhir.Coding> operationalStatus);

    /**
     * Initializes the optional value {@link Location#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Location#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Location#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Location#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Location#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Location#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hoursOfOperation(java.util.List<com.fhir.Location_HoursOfOperation> hoursOfOperation);

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hoursOfOperation(java.util.Optional<? extends java.util.List<com.fhir.Location_HoursOfOperation>> hoursOfOperation);

    /**
     * Initializes the optional value {@link Location#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Location#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availabilityExceptions(java.lang.String availabilityExceptions);

    /**
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions);

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(com.fhir.Reference partOf);

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Builds a new {@link Location Location}.
     * @return An immutable instance of Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Location build();
  }
}
