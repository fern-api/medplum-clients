//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PractitionerRole}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePractitionerRole.builder()}.
 */
@org.immutables.value.Generated(from = "PractitionerRole", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePractitionerRole implements com.fhir.PractitionerRole {
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference practitioner;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference organization;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.String availabilityExceptions;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> healthcareService;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_AvailableTime> availableTime;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_NotAvailable> notAvailable;
  private final @javax.annotation.Nullable com.fhir.Narrative text;

  private ImmutablePractitionerRole(
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference practitioner,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference organization,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.String availabilityExceptions,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> location,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> healthcareService,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_AvailableTime> availableTime,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code,
      @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_NotAvailable> notAvailable,
      @javax.annotation.Nullable com.fhir.Narrative text) {
    this.id = id;
    this.practitioner = practitioner;
    this.specialty = specialty;
    this.endpoint = endpoint;
    this.language = language;
    this.organization = organization;
    this.active = active;
    this.extension = extension;
    this.resourceType = resourceType;
    this.availabilityExceptions = availabilityExceptions;
    this.modifierExtension = modifierExtension;
    this.location = location;
    this.healthcareService = healthcareService;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.period = period;
    this.availableTime = availableTime;
    this.meta = meta;
    this.telecom = telecom;
    this.code = code;
    this.notAvailable = notAvailable;
    this.text = text;
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
   * @return The value of the {@code practitioner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("practitioner")
  @Override
  public java.util.Optional<com.fhir.Reference> practitioner() {
    return java.util.Optional.ofNullable(practitioner);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
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
   * @return The value of the {@code availabilityExceptions} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
  @Override
  public java.util.Optional<java.lang.String> availabilityExceptions() {
    return java.util.Optional.ofNullable(availabilityExceptions);
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
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> location() {
    return java.util.Optional.ofNullable(location);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code availableTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availableTime")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PractitionerRole_AvailableTime>> availableTime() {
    return java.util.Optional.ofNullable(availableTime);
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
   * @return The value of the {@code telecom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("telecom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() {
    return java.util.Optional.ofNullable(telecom);
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
   * @return The value of the {@code notAvailable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("notAvailable")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PractitionerRole_NotAvailable>> notAvailable() {
    return java.util.Optional.ofNullable(notAvailable);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePractitionerRole(
        newValue,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePractitionerRole(
        value,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#practitioner() practitioner} attribute.
   * @param value The value for practitioner
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withPractitioner(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "practitioner");
    if (this.practitioner == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        newValue,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#practitioner() practitioner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for practitioner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withPractitioner(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.practitioner == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        value,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withSpecialty(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        newValue,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withSpecialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        value,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        newValue,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        value,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        newValue,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        value,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        newValue,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        value,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        newValue,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        value,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        newValue,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        value,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PractitionerRole#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePractitionerRole withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        newValue,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#availabilityExceptions() availabilityExceptions} attribute.
   * @param value The value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withAvailabilityExceptions(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "availabilityExceptions");
    if (java.util.Objects.equals(this.availabilityExceptions, newValue)) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        newValue,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#availabilityExceptions() availabilityExceptions} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withAvailabilityExceptions(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.availabilityExceptions, value)) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        value,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        newValue,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        value,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withLocation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        newValue,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withLocation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        value,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#healthcareService() healthcareService} attribute.
   * @param value The value for healthcareService
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withHealthcareService(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "healthcareService");
    if (this.healthcareService == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        newValue,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#healthcareService() healthcareService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for healthcareService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withHealthcareService(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.healthcareService == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        value,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        newValue,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        value,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        newValue,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        value,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        newValue,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        value,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        newValue,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        value,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#availableTime() availableTime} attribute.
   * @param value The value for availableTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withAvailableTime(java.util.List<com.fhir.PractitionerRole_AvailableTime> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_AvailableTime> newValue = java.util.Objects.requireNonNull(value, "availableTime");
    if (this.availableTime == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        newValue,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#availableTime() availableTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withAvailableTime(java.util.Optional<? extends java.util.List<com.fhir.PractitionerRole_AvailableTime>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_AvailableTime> value = optional.orElse(null);
    if (this.availableTime == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        value,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        newValue,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        value,
        this.telecom,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        newValue,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        value,
        this.code,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        newValue,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        value,
        this.notAvailable,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#notAvailable() notAvailable} attribute.
   * @param value The value for notAvailable
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withNotAvailable(java.util.List<com.fhir.PractitionerRole_NotAvailable> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_NotAvailable> newValue = java.util.Objects.requireNonNull(value, "notAvailable");
    if (this.notAvailable == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#notAvailable() notAvailable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for notAvailable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withNotAvailable(java.util.Optional<? extends java.util.List<com.fhir.PractitionerRole_NotAvailable>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_NotAvailable> value = optional.orElse(null);
    if (this.notAvailable == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePractitionerRole(
        this.id,
        this.practitioner,
        this.specialty,
        this.endpoint,
        this.language,
        this.organization,
        this.active,
        this.extension,
        this.resourceType,
        this.availabilityExceptions,
        this.modifierExtension,
        this.location,
        this.healthcareService,
        this.identifier,
        this.implicitRules,
        this.contained,
        this.period,
        this.availableTime,
        this.meta,
        this.telecom,
        this.code,
        this.notAvailable,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePractitionerRole} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePractitionerRole
        && equalTo((ImmutablePractitionerRole) another);
  }

  private boolean equalTo(ImmutablePractitionerRole another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(practitioner, another.practitioner)
        && java.util.Objects.equals(specialty, another.specialty)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(organization, another.organization)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(extension, another.extension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(availabilityExceptions, another.availabilityExceptions)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(healthcareService, another.healthcareService)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(availableTime, another.availableTime)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(notAvailable, another.notAvailable)
        && java.util.Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code practitioner}, {@code specialty}, {@code endpoint}, {@code language}, {@code organization}, {@code active}, {@code extension}, {@code resourceType}, {@code availabilityExceptions}, {@code modifierExtension}, {@code location}, {@code healthcareService}, {@code identifier}, {@code implicitRules}, {@code contained}, {@code period}, {@code availableTime}, {@code meta}, {@code telecom}, {@code code}, {@code notAvailable}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(practitioner);
    h += (h << 5) + java.util.Objects.hashCode(specialty);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(organization);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(availabilityExceptions);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(healthcareService);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(availableTime);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(notAvailable);
    h += (h << 5) + java.util.Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code PractitionerRole} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PractitionerRole{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (practitioner != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("practitioner=").append(practitioner);
    }
    if (specialty != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (endpoint != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (language != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (organization != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (active != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (availabilityExceptions != null) {
      builder.append(", ");
      builder.append("availabilityExceptions=").append(availabilityExceptions);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (healthcareService != null) {
      builder.append(", ");
      builder.append("healthcareService=").append(healthcareService);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (availableTime != null) {
      builder.append(", ");
      builder.append("availableTime=").append(availableTime);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (telecom != null) {
      builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (notAvailable != null) {
      builder.append(", ");
      builder.append("notAvailable=").append(notAvailable);
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
  @org.immutables.value.Generated(from = "PractitionerRole", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PractitionerRole {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> practitioner = java.util.Optional.empty();
    boolean practitionerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty = java.util.Optional.empty();
    boolean specialtyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> organization = java.util.Optional.empty();
    boolean organizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> availabilityExceptions = java.util.Optional.empty();
    boolean availabilityExceptionsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService = java.util.Optional.empty();
    boolean healthcareServiceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PractitionerRole_AvailableTime>> availableTime = java.util.Optional.empty();
    boolean availableTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PractitionerRole_NotAvailable>> notAvailable = java.util.Optional.empty();
    boolean notAvailableIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("practitioner")
    public void setPractitioner(java.util.Optional<com.fhir.Reference> practitioner) {
      this.practitioner = practitioner;
      this.practitionerIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    public void setOrganization(java.util.Optional<com.fhir.Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions) {
      this.availabilityExceptions = availabilityExceptions;
      this.availabilityExceptionsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<java.util.List<com.fhir.Reference>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("healthcareService")
    public void setHealthcareService(java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService) {
      this.healthcareService = healthcareService;
      this.healthcareServiceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("availableTime")
    public void setAvailableTime(java.util.Optional<java.util.List<com.fhir.PractitionerRole_AvailableTime>> availableTime) {
      this.availableTime = availableTime;
      this.availableTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("notAvailable")
    public void setNotAvailable(java.util.Optional<java.util.List<com.fhir.PractitionerRole_NotAvailable>> notAvailable) {
      this.notAvailable = notAvailable;
      this.notAvailableIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> practitioner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> availabilityExceptions() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> healthcareService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PractitionerRole_AvailableTime>> availableTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PractitionerRole_NotAvailable>> notAvailable() { throw new UnsupportedOperationException(); }
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
  static ImmutablePractitionerRole fromJson(Json json) {
    ImmutablePractitionerRole.Builder builder = ((ImmutablePractitionerRole.Builder) ImmutablePractitionerRole.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.practitionerIsSet) {
      builder.practitioner(json.practitioner);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.availabilityExceptionsIsSet) {
      builder.availabilityExceptions(json.availabilityExceptions);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.healthcareServiceIsSet) {
      builder.healthcareService(json.healthcareService);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.availableTimeIsSet) {
      builder.availableTime(json.availableTime);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.notAvailableIsSet) {
      builder.notAvailable(json.notAvailable);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutablePractitionerRole) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PractitionerRole} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PractitionerRole instance
   */
  public static PractitionerRole copyOf(PractitionerRole instance) {
    if (instance instanceof ImmutablePractitionerRole) {
      return (ImmutablePractitionerRole) instance;
    }
    return ((ImmutablePractitionerRole.Builder) ImmutablePractitionerRole.builder())
        .id(instance.id())
        .practitioner(instance.practitioner())
        .specialty(instance.specialty())
        .endpoint(instance.endpoint())
        .language(instance.language())
        .organization(instance.organization())
        .active(instance.active())
        .extension(instance.extension())
        .resourceType(instance.resourceType())
        .availabilityExceptions(instance.availabilityExceptions())
        .modifierExtension(instance.modifierExtension())
        .location(instance.location())
        .healthcareService(instance.healthcareService())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .period(instance.period())
        .availableTime(instance.availableTime())
        .meta(instance.meta())
        .telecom(instance.telecom())
        .code(instance.code())
        .notAvailable(instance.notAvailable())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link PractitionerRole PractitionerRole}.
   * <pre>
   * ImmutablePractitionerRole.builder()
   *    .id(com.fhir.id) // optional {@link PractitionerRole#id() id}
   *    .practitioner(com.fhir.Reference) // optional {@link PractitionerRole#practitioner() practitioner}
   *    .specialty(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link PractitionerRole#specialty() specialty}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link PractitionerRole#endpoint() endpoint}
   *    .language(com.fhir.code) // optional {@link PractitionerRole#language() language}
   *    .organization(com.fhir.Reference) // optional {@link PractitionerRole#organization() organization}
   *    .active(Boolean) // optional {@link PractitionerRole#active() active}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PractitionerRole#extension() extension}
   *    .resourceType(String) // required {@link PractitionerRole#resourceType() resourceType}
   *    .availabilityExceptions(String) // optional {@link PractitionerRole#availabilityExceptions() availabilityExceptions}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PractitionerRole#modifierExtension() modifierExtension}
   *    .location(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link PractitionerRole#location() location}
   *    .healthcareService(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link PractitionerRole#healthcareService() healthcareService}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link PractitionerRole#identifier() identifier}
   *    .implicitRules(com.fhir.uri) // optional {@link PractitionerRole#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link PractitionerRole#contained() contained}
   *    .period(com.fhir.Period) // optional {@link PractitionerRole#period() period}
   *    .availableTime(List&amp;lt;com.fhir.PractitionerRole_AvailableTime&amp;gt;) // optional {@link PractitionerRole#availableTime() availableTime}
   *    .meta(com.fhir.Meta) // optional {@link PractitionerRole#meta() meta}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link PractitionerRole#telecom() telecom}
   *    .code(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link PractitionerRole#code() code}
   *    .notAvailable(List&amp;lt;com.fhir.PractitionerRole_NotAvailable&amp;gt;) // optional {@link PractitionerRole#notAvailable() notAvailable}
   *    .text(com.fhir.Narrative) // optional {@link PractitionerRole#text() text}
   *    .build();
   * </pre>
   * @return A new PractitionerRole builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePractitionerRole.Builder();
  }

  /**
   * Builds instances of type {@link PractitionerRole PractitionerRole}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PractitionerRole", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_PRACTITIONER = 0x2L;
    private static final long OPT_BIT_SPECIALTY = 0x4L;
    private static final long OPT_BIT_ENDPOINT = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_ORGANIZATION = 0x20L;
    private static final long OPT_BIT_ACTIVE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_AVAILABILITY_EXCEPTIONS = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_LOCATION = 0x400L;
    private static final long OPT_BIT_HEALTHCARE_SERVICE = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_CONTAINED = 0x4000L;
    private static final long OPT_BIT_PERIOD = 0x8000L;
    private static final long OPT_BIT_AVAILABLE_TIME = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_TELECOM = 0x40000L;
    private static final long OPT_BIT_CODE = 0x80000L;
    private static final long OPT_BIT_NOT_AVAILABLE = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference practitioner;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference organization;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.String availabilityExceptions;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> location;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> healthcareService;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_AvailableTime> availableTime;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
    private @javax.annotation.Nullable java.util.List<com.fhir.PractitionerRole_NotAvailable> notAvailable;
    private @javax.annotation.Nullable com.fhir.Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for chained invocation
     */
    public final Builder practitioner(com.fhir.Reference practitioner) {
      checkNotIsSet(practitionerIsSet(), "practitioner");
      this.practitioner = java.util.Objects.requireNonNull(practitioner, "practitioner");
      optBits |= OPT_BIT_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("practitioner")
    public final Builder practitioner(java.util.Optional<? extends com.fhir.Reference> practitioner) {
      checkNotIsSet(practitionerIsSet(), "practitioner");
      this.practitioner = practitioner.orElse(null);
      optBits |= OPT_BIT_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
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
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
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
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
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
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
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
     * Initializes the optional value {@link PractitionerRole#active() active} to active.
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
     * Initializes the optional value {@link PractitionerRole#active() active} to active.
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
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
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
     * Initializes the value for the {@link PractitionerRole#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
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
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
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
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
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
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
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
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
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
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
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
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
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
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
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
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableTime(java.util.List<com.fhir.PractitionerRole_AvailableTime> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = java.util.Objects.requireNonNull(availableTime, "availableTime");
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableTime")
    public final Builder availableTime(java.util.Optional<? extends java.util.List<com.fhir.PractitionerRole_AvailableTime>> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = availableTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
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
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
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
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
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
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
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
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    public final Builder notAvailable(java.util.List<com.fhir.PractitionerRole_NotAvailable> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = java.util.Objects.requireNonNull(notAvailable, "notAvailable");
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notAvailable")
    public final Builder notAvailable(java.util.Optional<? extends java.util.List<com.fhir.PractitionerRole_NotAvailable>> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = notAvailable.orElse(null);
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
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
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
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
     * Builds a new {@link PractitionerRole PractitionerRole}.
     * @return An immutable instance of PractitionerRole
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PractitionerRole build() {
      checkRequiredAttributes();
      return new ImmutablePractitionerRole(
          id,
          practitioner,
          specialty,
          endpoint,
          language,
          organization,
          active,
          extension,
          resourceType,
          availabilityExceptions,
          modifierExtension,
          location,
          healthcareService,
          identifier,
          implicitRules,
          contained,
          period,
          availableTime,
          meta,
          telecom,
          code,
          notAvailable,
          text);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean practitionerIsSet() {
      return (optBits & OPT_BIT_PRACTITIONER) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean availabilityExceptionsIsSet() {
      return (optBits & OPT_BIT_AVAILABILITY_EXCEPTIONS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean healthcareServiceIsSet() {
      return (optBits & OPT_BIT_HEALTHCARE_SERVICE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean availableTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_TIME) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean notAvailableIsSet() {
      return (optBits & OPT_BIT_NOT_AVAILABLE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PractitionerRole is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build PractitionerRole, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "PractitionerRole", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PractitionerRole#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "PractitionerRole", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal practitioner(com.fhir.Reference practitioner);

    /**
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal practitioner(java.util.Optional<? extends com.fhir.Reference> practitioner);

    /**
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(java.util.List<com.fhir.CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(com.fhir.Reference organization);

    /**
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(java.util.Optional<? extends com.fhir.Reference> organization);

    /**
     * Initializes the optional value {@link PractitionerRole#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link PractitionerRole#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availabilityExceptions(java.lang.String availabilityExceptions);

    /**
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions);

    /**
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(java.util.List<com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends java.util.List<com.fhir.Reference>> location);

    /**
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for chained invocation
     */
    BuildFinal healthcareService(java.util.List<com.fhir.Reference> healthcareService);

    /**
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal healthcareService(java.util.Optional<? extends java.util.List<com.fhir.Reference>> healthcareService);

    /**
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availableTime(java.util.List<com.fhir.PractitionerRole_AvailableTime> availableTime);

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availableTime(java.util.Optional<? extends java.util.List<com.fhir.PractitionerRole_AvailableTime>> availableTime);

    /**
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(java.util.List<com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> code);

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal notAvailable(java.util.List<com.fhir.PractitionerRole_NotAvailable> notAvailable);

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal notAvailable(java.util.Optional<? extends java.util.List<com.fhir.PractitionerRole_NotAvailable>> notAvailable);

    /**
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Builds a new {@link PractitionerRole PractitionerRole}.
     * @return An immutable instance of PractitionerRole
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PractitionerRole build();
  }
}
