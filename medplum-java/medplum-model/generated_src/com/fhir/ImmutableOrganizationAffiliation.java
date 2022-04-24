//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link OrganizationAffiliation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganizationAffiliation.builder()}.
 */
@org.immutables.value.Generated(from = "OrganizationAffiliation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOrganizationAffiliation implements com.fhir.OrganizationAffiliation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> network;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference organization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> healthcareService;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference participatingOrganization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

  private ImmutableOrganizationAffiliation(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Period period,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> location,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> network,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference organization,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> healthcareService,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference participatingOrganization,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier) {
    this.contained = contained;
    this.period = period;
    this.resourceType = resourceType;
    this.location = location;
    this.telecom = telecom;
    this.network = network;
    this.specialty = specialty;
    this.endpoint = endpoint;
    this.extension = extension;
    this.organization = organization;
    this.healthcareService = healthcareService;
    this.language = language;
    this.code = code;
    this.active = active;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.text = text;
    this.id = id;
    this.participatingOrganization = participatingOrganization;
    this.identifier = identifier;
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
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> location() {
    return java.util.Optional.ofNullable(location);
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
   * @return The value of the {@code network} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("network")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> network() {
    return java.util.Optional.ofNullable(network);
  }

  /**
   * @return The value of the {@code specialty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialty")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() {
    return java.util.Optional.ofNullable(specialty);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code healthcareService} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("healthcareService")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService() {
    return java.util.Optional.ofNullable(healthcareService);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code participatingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participatingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> participatingOrganization() {
    return java.util.Optional.ofNullable(participatingOrganization);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        newValue,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOrganizationAffiliation(
        value,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        newValue,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        value,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrganizationAffiliation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganizationAffiliation withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        newValue,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withLocation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        newValue,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withLocation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        value,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        newValue,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        value,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withNetwork(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        newValue,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withNetwork(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        value,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withSpecialty(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        newValue,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withSpecialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        value,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        newValue,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        value,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        newValue,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        value,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        newValue,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        value,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#healthcareService() healthcareService} attribute.
   * @param value The value for healthcareService
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withHealthcareService(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "healthcareService");
    if (this.healthcareService == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        newValue,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#healthcareService() healthcareService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for healthcareService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withHealthcareService(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.healthcareService == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        value,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        newValue,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        value,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        newValue,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        value,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        newValue,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        value,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        newValue,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        value,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        newValue,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        value,
        this.text,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.id,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        newValue,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        value,
        this.participatingOrganization,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} attribute.
   * @param value The value for participatingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withParticipatingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "participatingOrganization");
    if (this.participatingOrganization == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participatingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withParticipatingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.participatingOrganization == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.contained,
        this.period,
        this.resourceType,
        this.location,
        this.telecom,
        this.network,
        this.specialty,
        this.endpoint,
        this.extension,
        this.organization,
        this.healthcareService,
        this.language,
        this.code,
        this.active,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.id,
        this.participatingOrganization,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganizationAffiliation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganizationAffiliation
        && equalTo((ImmutableOrganizationAffiliation) another);
  }

  private boolean equalTo(ImmutableOrganizationAffiliation another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(period, another.period)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(network, another.network)
        && java.util.Objects.equals(specialty, another.specialty)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(organization, another.organization)
        && java.util.Objects.equals(healthcareService, another.healthcareService)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(participatingOrganization, another.participatingOrganization)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code period}, {@code resourceType}, {@code location}, {@code telecom}, {@code network}, {@code specialty}, {@code endpoint}, {@code extension}, {@code organization}, {@code healthcareService}, {@code language}, {@code code}, {@code active}, {@code meta}, {@code modifierExtension}, {@code implicitRules}, {@code text}, {@code id}, {@code participatingOrganization}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(network);
    h += (h << 5) + java.util.Objects.hashCode(specialty);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(organization);
    h += (h << 5) + java.util.Objects.hashCode(healthcareService);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(participatingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code OrganizationAffiliation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("OrganizationAffiliation{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (period != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (telecom != null) {
      builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (network != null) {
      builder.append(", ");
      builder.append("network=").append(network);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (organization != null) {
      builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (healthcareService != null) {
      builder.append(", ");
      builder.append("healthcareService=").append(healthcareService);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (participatingOrganization != null) {
      builder.append(", ");
      builder.append("participatingOrganization=").append(participatingOrganization);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "OrganizationAffiliation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.OrganizationAffiliation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> network = java.util.Optional.empty();
    boolean networkIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty = java.util.Optional.empty();
    boolean specialtyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> organization = java.util.Optional.empty();
    boolean organizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService = java.util.Optional.empty();
    boolean healthcareServiceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> participatingOrganization = java.util.Optional.empty();
    boolean participatingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<java.util.List<com.fhir.Reference>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public void setNetwork(java.util.Optional<java.util.List<com.fhir.Reference>> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public void setSpecialty(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    public void setOrganization(java.util.Optional<com.fhir.Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("healthcareService")
    public void setHealthcareService(java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService) {
      this.healthcareService = healthcareService;
      this.healthcareServiceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participatingOrganization")
    public void setParticipatingOrganization(java.util.Optional<com.fhir.Reference> participatingOrganization) {
      this.participatingOrganization = participatingOrganization;
      this.participatingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> network() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> participatingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableOrganizationAffiliation fromJson(Json json) {
    ImmutableOrganizationAffiliation.Builder builder = ((ImmutableOrganizationAffiliation.Builder) ImmutableOrganizationAffiliation.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.healthcareServiceIsSet) {
      builder.healthcareService(json.healthcareService);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.participatingOrganizationIsSet) {
      builder.participatingOrganization(json.participatingOrganization);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableOrganizationAffiliation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OrganizationAffiliation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OrganizationAffiliation instance
   */
  public static OrganizationAffiliation copyOf(OrganizationAffiliation instance) {
    if (instance instanceof ImmutableOrganizationAffiliation) {
      return (ImmutableOrganizationAffiliation) instance;
    }
    return ((ImmutableOrganizationAffiliation.Builder) ImmutableOrganizationAffiliation.builder())
        .contained(instance.contained())
        .period(instance.period())
        .resourceType(instance.resourceType())
        .location(instance.location())
        .telecom(instance.telecom())
        .network(instance.network())
        .specialty(instance.specialty())
        .endpoint(instance.endpoint())
        .extension(instance.extension())
        .organization(instance.organization())
        .healthcareService(instance.healthcareService())
        .language(instance.language())
        .code(instance.code())
        .active(instance.active())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .id(instance.id())
        .participatingOrganization(instance.participatingOrganization())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link OrganizationAffiliation OrganizationAffiliation}.
   * <pre>
   * ImmutableOrganizationAffiliation.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link OrganizationAffiliation#contained() contained}
   *    .period(com.fhir.Period) // optional {@link OrganizationAffiliation#period() period}
   *    .resourceType(String) // required {@link OrganizationAffiliation#resourceType() resourceType}
   *    .location(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#location() location}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link OrganizationAffiliation#telecom() telecom}
   *    .network(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#network() network}
   *    .specialty(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link OrganizationAffiliation#specialty() specialty}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#endpoint() endpoint}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OrganizationAffiliation#extension() extension}
   *    .organization(com.fhir.Reference) // optional {@link OrganizationAffiliation#organization() organization}
   *    .healthcareService(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#healthcareService() healthcareService}
   *    .language(com.fhir.code) // optional {@link OrganizationAffiliation#language() language}
   *    .code(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link OrganizationAffiliation#code() code}
   *    .active(Boolean) // optional {@link OrganizationAffiliation#active() active}
   *    .meta(com.fhir.Meta) // optional {@link OrganizationAffiliation#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OrganizationAffiliation#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link OrganizationAffiliation#implicitRules() implicitRules}
   *    .text(com.fhir.Narrative) // optional {@link OrganizationAffiliation#text() text}
   *    .id(com.fhir.id) // optional {@link OrganizationAffiliation#id() id}
   *    .participatingOrganization(com.fhir.Reference) // optional {@link OrganizationAffiliation#participatingOrganization() participatingOrganization}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link OrganizationAffiliation#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new OrganizationAffiliation builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableOrganizationAffiliation.Builder();
  }

  /**
   * Builds instances of type {@link OrganizationAffiliation OrganizationAffiliation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "OrganizationAffiliation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_PERIOD = 0x2L;
    private static final long OPT_BIT_LOCATION = 0x4L;
    private static final long OPT_BIT_TELECOM = 0x8L;
    private static final long OPT_BIT_NETWORK = 0x10L;
    private static final long OPT_BIT_SPECIALTY = 0x20L;
    private static final long OPT_BIT_ENDPOINT = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ORGANIZATION = 0x100L;
    private static final long OPT_BIT_HEALTHCARE_SERVICE = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_CODE = 0x800L;
    private static final long OPT_BIT_ACTIVE = 0x1000L;
    private static final long OPT_BIT_META = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_PARTICIPATING_ORGANIZATION = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> location;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> network;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference organization;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> healthcareService;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference participatingOrganization;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
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
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
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
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
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
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
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
     * Initializes the value for the {@link OrganizationAffiliation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(java.util.List<com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends java.util.List<com.fhir.Reference>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(java.util.List<com.fhir.Reference> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = java.util.Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public final Builder network(java.util.Optional<? extends java.util.List<com.fhir.Reference>> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialty(java.util.List<com.fhir.CodeableConcept> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = java.util.Objects.requireNonNull(specialty, "specialty");
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public final Builder specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = specialty.orElse(null);
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
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
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
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
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
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
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
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
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for chained invocation
     */
    public final Builder healthcareService(java.util.List<com.fhir.Reference> healthcareService) {
      checkNotIsSet(healthcareServiceIsSet(), "healthcareService");
      this.healthcareService = java.util.Objects.requireNonNull(healthcareService, "healthcareService");
      optBits |= OPT_BIT_HEALTHCARE_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("healthcareService")
    public final Builder healthcareService(java.util.Optional<? extends java.util.List<com.fhir.Reference>> healthcareService) {
      checkNotIsSet(healthcareServiceIsSet(), "healthcareService");
      this.healthcareService = healthcareService.orElse(null);
      optBits |= OPT_BIT_HEALTHCARE_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
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
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
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
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.util.List<com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
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
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
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
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
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
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
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
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
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
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
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
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder participatingOrganization(com.fhir.Reference participatingOrganization) {
      checkNotIsSet(participatingOrganizationIsSet(), "participatingOrganization");
      this.participatingOrganization = java.util.Objects.requireNonNull(participatingOrganization, "participatingOrganization");
      optBits |= OPT_BIT_PARTICIPATING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participatingOrganization")
    public final Builder participatingOrganization(java.util.Optional<? extends com.fhir.Reference> participatingOrganization) {
      checkNotIsSet(participatingOrganizationIsSet(), "participatingOrganization");
      this.participatingOrganization = participatingOrganization.orElse(null);
      optBits |= OPT_BIT_PARTICIPATING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
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
     * Builds a new {@link OrganizationAffiliation OrganizationAffiliation}.
     * @return An immutable instance of OrganizationAffiliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.OrganizationAffiliation build() {
      checkRequiredAttributes();
      return new ImmutableOrganizationAffiliation(
          contained,
          period,
          resourceType,
          location,
          telecom,
          network,
          specialty,
          endpoint,
          extension,
          organization,
          healthcareService,
          language,
          code,
          active,
          meta,
          modifierExtension,
          implicitRules,
          text,
          id,
          participatingOrganization,
          identifier);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean healthcareServiceIsSet() {
      return (optBits & OPT_BIT_HEALTHCARE_SERVICE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean participatingOrganizationIsSet() {
      return (optBits & OPT_BIT_PARTICIPATING_ORGANIZATION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of OrganizationAffiliation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build OrganizationAffiliation, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "OrganizationAffiliation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link OrganizationAffiliation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "OrganizationAffiliation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(java.util.List<com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends java.util.List<com.fhir.Reference>> location);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(java.util.List<com.fhir.Reference> network);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(java.util.Optional<? extends java.util.List<com.fhir.Reference>> network);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(java.util.List<com.fhir.CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(com.fhir.Reference organization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(java.util.Optional<? extends com.fhir.Reference> organization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for chained invocation
     */
    BuildFinal healthcareService(java.util.List<com.fhir.Reference> healthcareService);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal healthcareService(java.util.Optional<? extends java.util.List<com.fhir.Reference>> healthcareService);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(java.util.List<com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> code);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participatingOrganization(com.fhir.Reference participatingOrganization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participatingOrganization(java.util.Optional<? extends com.fhir.Reference> participatingOrganization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Builds a new {@link OrganizationAffiliation OrganizationAffiliation}.
     * @return An immutable instance of OrganizationAffiliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OrganizationAffiliation build();
  }
}
