//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link HealthcareService}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthcareService.builder()}.
 */
@org.immutables.value.Generated(from = "HealthcareService", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableHealthcareService implements com.fhir.HealthcareService {
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.Boolean appointmentRequired;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown extraDetails;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> referralMethod;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable java.lang.String availabilityExceptions;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceProvisionCode;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> coverageArea;
  private final @javax.annotation.Nullable com.fhir.Reference providedBy;
  private final @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_Eligibility> eligibility;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> location;
  private final @javax.annotation.Nullable com.fhir.Attachment photo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_NotAvailable> notAvailable;
  private final @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_AvailableTime> availableTime;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> program;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> characteristic;

  private ImmutableHealthcareService(
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.Boolean appointmentRequired,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communication,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown extraDetails,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> referralMethod,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable java.lang.String availabilityExceptions,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceProvisionCode,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> coverageArea,
      @javax.annotation.Nullable com.fhir.Reference providedBy,
      @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_Eligibility> eligibility,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> location,
      @javax.annotation.Nullable com.fhir.Attachment photo,
      @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_NotAvailable> notAvailable,
      @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_AvailableTime> availableTime,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> program,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> characteristic) {
    this.name = name;
    this.appointmentRequired = appointmentRequired;
    this.endpoint = endpoint;
    this.communication = communication;
    this.specialty = specialty;
    this.modifierExtension = modifierExtension;
    this.extraDetails = extraDetails;
    this.telecom = telecom;
    this.referralMethod = referralMethod;
    this.comment = comment;
    this.meta = meta;
    this.extension = extension;
    this.category = category;
    this.type = type;
    this.availabilityExceptions = availabilityExceptions;
    this.text = text;
    this.contained = contained;
    this.serviceProvisionCode = serviceProvisionCode;
    this.implicitRules = implicitRules;
    this.coverageArea = coverageArea;
    this.providedBy = providedBy;
    this.eligibility = eligibility;
    this.language = language;
    this.location = location;
    this.photo = photo;
    this.notAvailable = notAvailable;
    this.availableTime = availableTime;
    this.active = active;
    this.id = id;
    this.identifier = identifier;
    this.program = program;
    this.resourceType = resourceType;
    this.characteristic = characteristic;
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
   * @return The value of the {@code appointmentRequired} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("appointmentRequired")
  @Override
  public java.util.Optional<java.lang.Boolean> appointmentRequired() {
    return java.util.Optional.ofNullable(appointmentRequired);
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
   * @return The value of the {@code communication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("communication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication() {
    return java.util.Optional.ofNullable(communication);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extraDetails} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extraDetails")
  @Override
  public java.util.Optional<com.fhir.markdown> extraDetails() {
    return java.util.Optional.ofNullable(extraDetails);
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
   * @return The value of the {@code referralMethod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referralMethod")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> referralMethod() {
    return java.util.Optional.ofNullable(referralMethod);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code availabilityExceptions} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
  @Override
  public java.util.Optional<java.lang.String> availabilityExceptions() {
    return java.util.Optional.ofNullable(availabilityExceptions);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code serviceProvisionCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceProvisionCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceProvisionCode() {
    return java.util.Optional.ofNullable(serviceProvisionCode);
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
   * @return The value of the {@code coverageArea} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("coverageArea")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea() {
    return java.util.Optional.ofNullable(coverageArea);
  }

  /**
   * @return The value of the {@code providedBy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("providedBy")
  @Override
  public java.util.Optional<com.fhir.Reference> providedBy() {
    return java.util.Optional.ofNullable(providedBy);
  }

  /**
   * @return The value of the {@code eligibility} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eligibility")
  @Override
  public java.util.Optional<java.util.List<com.fhir.HealthcareService_Eligibility>> eligibility() {
    return java.util.Optional.ofNullable(eligibility);
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
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("photo")
  @Override
  public java.util.Optional<com.fhir.Attachment> photo() {
    return java.util.Optional.ofNullable(photo);
  }

  /**
   * @return The value of the {@code notAvailable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("notAvailable")
  @Override
  public java.util.Optional<java.util.List<com.fhir.HealthcareService_NotAvailable>> notAvailable() {
    return java.util.Optional.ofNullable(notAvailable);
  }

  /**
   * @return The value of the {@code availableTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availableTime")
  @Override
  public java.util.Optional<java.util.List<com.fhir.HealthcareService_AvailableTime>> availableTime() {
    return java.util.Optional.ofNullable(availableTime);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code program} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("program")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> program() {
    return java.util.Optional.ofNullable(program);
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
   * @return The value of the {@code characteristic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> characteristic() {
    return java.util.Optional.ofNullable(characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableHealthcareService(
        newValue,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableHealthcareService(
        value,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#appointmentRequired() appointmentRequired} attribute.
   * @param value The value for appointmentRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAppointmentRequired(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.appointmentRequired, newValue)) return this;
    return new ImmutableHealthcareService(
        this.name,
        newValue,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#appointmentRequired() appointmentRequired} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointmentRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAppointmentRequired(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.appointmentRequired, value)) return this;
    return new ImmutableHealthcareService(
        this.name,
        value,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        newValue,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        value,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCommunication(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        newValue,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCommunication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        value,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withSpecialty(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        newValue,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withSpecialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        value,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        newValue,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        value,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#extraDetails() extraDetails} attribute.
   * @param value The value for extraDetails
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withExtraDetails(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "extraDetails");
    if (this.extraDetails == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        newValue,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#extraDetails() extraDetails} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extraDetails
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withExtraDetails(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.extraDetails == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        value,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        newValue,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        value,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#referralMethod() referralMethod} attribute.
   * @param value The value for referralMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withReferralMethod(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "referralMethod");
    if (this.referralMethod == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        newValue,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#referralMethod() referralMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referralMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withReferralMethod(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.referralMethod == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        value,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        newValue,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        value,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        newValue,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        value,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        newValue,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        value,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        newValue,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        value,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        newValue,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        value,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#availabilityExceptions() availabilityExceptions} attribute.
   * @param value The value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAvailabilityExceptions(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "availabilityExceptions");
    if (java.util.Objects.equals(this.availabilityExceptions, newValue)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        newValue,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#availabilityExceptions() availabilityExceptions} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAvailabilityExceptions(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.availabilityExceptions, value)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        value,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        newValue,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        value,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        newValue,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        value,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} attribute.
   * @param value The value for serviceProvisionCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withServiceProvisionCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceProvisionCode");
    if (this.serviceProvisionCode == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        newValue,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceProvisionCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withServiceProvisionCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceProvisionCode == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        value,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        newValue,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        value,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#coverageArea() coverageArea} attribute.
   * @param value The value for coverageArea
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCoverageArea(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "coverageArea");
    if (this.coverageArea == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        newValue,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#coverageArea() coverageArea} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverageArea
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCoverageArea(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.coverageArea == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        value,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#providedBy() providedBy} attribute.
   * @param value The value for providedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withProvidedBy(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "providedBy");
    if (this.providedBy == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        newValue,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#providedBy() providedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for providedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withProvidedBy(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.providedBy == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        value,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#eligibility() eligibility} attribute.
   * @param value The value for eligibility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withEligibility(java.util.List<com.fhir.HealthcareService_Eligibility> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_Eligibility> newValue = java.util.Objects.requireNonNull(value, "eligibility");
    if (this.eligibility == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        newValue,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#eligibility() eligibility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eligibility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withEligibility(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_Eligibility>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_Eligibility> value = optional.orElse(null);
    if (this.eligibility == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        value,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        newValue,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        value,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withLocation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        newValue,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withLocation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        value,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withPhoto(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        newValue,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withPhoto(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        value,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#notAvailable() notAvailable} attribute.
   * @param value The value for notAvailable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withNotAvailable(java.util.List<com.fhir.HealthcareService_NotAvailable> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_NotAvailable> newValue = java.util.Objects.requireNonNull(value, "notAvailable");
    if (this.notAvailable == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        newValue,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#notAvailable() notAvailable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for notAvailable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withNotAvailable(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_NotAvailable>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_NotAvailable> value = optional.orElse(null);
    if (this.notAvailable == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        value,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#availableTime() availableTime} attribute.
   * @param value The value for availableTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAvailableTime(java.util.List<com.fhir.HealthcareService_AvailableTime> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_AvailableTime> newValue = java.util.Objects.requireNonNull(value, "availableTime");
    if (this.availableTime == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        newValue,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#availableTime() availableTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withAvailableTime(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_AvailableTime>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_AvailableTime> value = optional.orElse(null);
    if (this.availableTime == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        value,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        newValue,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        value,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        newValue,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        value,
        this.identifier,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        newValue,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        value,
        this.program,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#program() program} attribute.
   * @param value The value for program
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withProgram(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "program");
    if (this.program == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        newValue,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#program() program} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for program
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withProgram(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.program == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        value,
        this.resourceType,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthcareService#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthcareService withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        newValue,
        this.characteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#characteristic() characteristic} attribute.
   * @param value The value for characteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCharacteristic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "characteristic");
    if (this.characteristic == newValue) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#characteristic() characteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.characteristic == value) return this;
    return new ImmutableHealthcareService(
        this.name,
        this.appointmentRequired,
        this.endpoint,
        this.communication,
        this.specialty,
        this.modifierExtension,
        this.extraDetails,
        this.telecom,
        this.referralMethod,
        this.comment,
        this.meta,
        this.extension,
        this.category,
        this.type,
        this.availabilityExceptions,
        this.text,
        this.contained,
        this.serviceProvisionCode,
        this.implicitRules,
        this.coverageArea,
        this.providedBy,
        this.eligibility,
        this.language,
        this.location,
        this.photo,
        this.notAvailable,
        this.availableTime,
        this.active,
        this.id,
        this.identifier,
        this.program,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthcareService} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthcareService
        && equalTo((ImmutableHealthcareService) another);
  }

  private boolean equalTo(ImmutableHealthcareService another) {
    return java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(appointmentRequired, another.appointmentRequired)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(communication, another.communication)
        && java.util.Objects.equals(specialty, another.specialty)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extraDetails, another.extraDetails)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(referralMethod, another.referralMethod)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(availabilityExceptions, another.availabilityExceptions)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(serviceProvisionCode, another.serviceProvisionCode)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(coverageArea, another.coverageArea)
        && java.util.Objects.equals(providedBy, another.providedBy)
        && java.util.Objects.equals(eligibility, another.eligibility)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(photo, another.photo)
        && java.util.Objects.equals(notAvailable, another.notAvailable)
        && java.util.Objects.equals(availableTime, another.availableTime)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(program, another.program)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(characteristic, another.characteristic);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code appointmentRequired}, {@code endpoint}, {@code communication}, {@code specialty}, {@code modifierExtension}, {@code extraDetails}, {@code telecom}, {@code referralMethod}, {@code comment}, {@code meta}, {@code extension}, {@code category}, {@code type}, {@code availabilityExceptions}, {@code text}, {@code contained}, {@code serviceProvisionCode}, {@code implicitRules}, {@code coverageArea}, {@code providedBy}, {@code eligibility}, {@code language}, {@code location}, {@code photo}, {@code notAvailable}, {@code availableTime}, {@code active}, {@code id}, {@code identifier}, {@code program}, {@code resourceType}, {@code characteristic}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(appointmentRequired);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(communication);
    h += (h << 5) + java.util.Objects.hashCode(specialty);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extraDetails);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(referralMethod);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(availabilityExceptions);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(serviceProvisionCode);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(coverageArea);
    h += (h << 5) + java.util.Objects.hashCode(providedBy);
    h += (h << 5) + java.util.Objects.hashCode(eligibility);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(photo);
    h += (h << 5) + java.util.Objects.hashCode(notAvailable);
    h += (h << 5) + java.util.Objects.hashCode(availableTime);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(program);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(characteristic);
    return h;
  }

  /**
   * Prints the immutable value {@code HealthcareService} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("HealthcareService{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (appointmentRequired != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("appointmentRequired=").append(appointmentRequired);
    }
    if (endpoint != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (communication != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (specialty != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extraDetails != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extraDetails=").append(extraDetails);
    }
    if (telecom != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (referralMethod != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("referralMethod=").append(referralMethod);
    }
    if (comment != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (category != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (availabilityExceptions != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("availabilityExceptions=").append(availabilityExceptions);
    }
    if (text != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (serviceProvisionCode != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("serviceProvisionCode=").append(serviceProvisionCode);
    }
    if (implicitRules != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (coverageArea != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("coverageArea=").append(coverageArea);
    }
    if (providedBy != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("providedBy=").append(providedBy);
    }
    if (eligibility != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("eligibility=").append(eligibility);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (location != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (photo != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (notAvailable != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("notAvailable=").append(notAvailable);
    }
    if (availableTime != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("availableTime=").append(availableTime);
    }
    if (active != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (program != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("program=").append(program);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (characteristic != null) {
      builder.append(", ");
      builder.append("characteristic=").append(characteristic);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "HealthcareService", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.HealthcareService {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> appointmentRequired = java.util.Optional.empty();
    boolean appointmentRequiredIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication = java.util.Optional.empty();
    boolean communicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty = java.util.Optional.empty();
    boolean specialtyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> extraDetails = java.util.Optional.empty();
    boolean extraDetailsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> referralMethod = java.util.Optional.empty();
    boolean referralMethodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> availabilityExceptions = java.util.Optional.empty();
    boolean availabilityExceptionsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceProvisionCode = java.util.Optional.empty();
    boolean serviceProvisionCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea = java.util.Optional.empty();
    boolean coverageAreaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> providedBy = java.util.Optional.empty();
    boolean providedByIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.HealthcareService_Eligibility>> eligibility = java.util.Optional.empty();
    boolean eligibilityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> photo = java.util.Optional.empty();
    boolean photoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.HealthcareService_NotAvailable>> notAvailable = java.util.Optional.empty();
    boolean notAvailableIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.HealthcareService_AvailableTime>> availableTime = java.util.Optional.empty();
    boolean availableTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> program = java.util.Optional.empty();
    boolean programIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> characteristic = java.util.Optional.empty();
    boolean characteristicIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("appointmentRequired")
    public void setAppointmentRequired(java.util.Optional<java.lang.Boolean> appointmentRequired) {
      this.appointmentRequired = appointmentRequired;
      this.appointmentRequiredIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("communication")
    public void setCommunication(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public void setSpecialty(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extraDetails")
    public void setExtraDetails(java.util.Optional<com.fhir.markdown> extraDetails) {
      this.extraDetails = extraDetails;
      this.extraDetailsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referralMethod")
    public void setReferralMethod(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> referralMethod) {
      this.referralMethod = referralMethod;
      this.referralMethodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions) {
      this.availabilityExceptions = availabilityExceptions;
      this.availabilityExceptionsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProvisionCode")
    public void setServiceProvisionCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceProvisionCode) {
      this.serviceProvisionCode = serviceProvisionCode;
      this.serviceProvisionCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("coverageArea")
    public void setCoverageArea(java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea) {
      this.coverageArea = coverageArea;
      this.coverageAreaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("providedBy")
    public void setProvidedBy(java.util.Optional<com.fhir.Reference> providedBy) {
      this.providedBy = providedBy;
      this.providedByIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eligibility")
    public void setEligibility(java.util.Optional<java.util.List<com.fhir.HealthcareService_Eligibility>> eligibility) {
      this.eligibility = eligibility;
      this.eligibilityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<java.util.List<com.fhir.Reference>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public void setPhoto(java.util.Optional<com.fhir.Attachment> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("notAvailable")
    public void setNotAvailable(java.util.Optional<java.util.List<com.fhir.HealthcareService_NotAvailable>> notAvailable) {
      this.notAvailable = notAvailable;
      this.notAvailableIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("availableTime")
    public void setAvailableTime(java.util.Optional<java.util.List<com.fhir.HealthcareService_AvailableTime>> availableTime) {
      this.availableTime = availableTime;
      this.availableTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("program")
    public void setProgram(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> program) {
      this.program = program;
      this.programIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
    public void setCharacteristic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> characteristic) {
      this.characteristic = characteristic;
      this.characteristicIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> appointmentRequired() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> extraDetails() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> referralMethod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> availabilityExceptions() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceProvisionCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> providedBy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.HealthcareService_Eligibility>> eligibility() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> photo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.HealthcareService_NotAvailable>> notAvailable() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.HealthcareService_AvailableTime>> availableTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> program() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> characteristic() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableHealthcareService fromJson(Json json) {
    ImmutableHealthcareService.Builder builder = ((ImmutableHealthcareService.Builder) ImmutableHealthcareService.builder());
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.appointmentRequiredIsSet) {
      builder.appointmentRequired(json.appointmentRequired);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extraDetailsIsSet) {
      builder.extraDetails(json.extraDetails);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.referralMethodIsSet) {
      builder.referralMethod(json.referralMethod);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.availabilityExceptionsIsSet) {
      builder.availabilityExceptions(json.availabilityExceptions);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.serviceProvisionCodeIsSet) {
      builder.serviceProvisionCode(json.serviceProvisionCode);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.coverageAreaIsSet) {
      builder.coverageArea(json.coverageArea);
    }
    if (json.providedByIsSet) {
      builder.providedBy(json.providedBy);
    }
    if (json.eligibilityIsSet) {
      builder.eligibility(json.eligibility);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.notAvailableIsSet) {
      builder.notAvailable(json.notAvailable);
    }
    if (json.availableTimeIsSet) {
      builder.availableTime(json.availableTime);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.programIsSet) {
      builder.program(json.program);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.characteristicIsSet) {
      builder.characteristic(json.characteristic);
    }
    return (ImmutableHealthcareService) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HealthcareService} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HealthcareService instance
   */
  public static HealthcareService copyOf(HealthcareService instance) {
    if (instance instanceof ImmutableHealthcareService) {
      return (ImmutableHealthcareService) instance;
    }
    return ((ImmutableHealthcareService.Builder) ImmutableHealthcareService.builder())
        .name(instance.name())
        .appointmentRequired(instance.appointmentRequired())
        .endpoint(instance.endpoint())
        .communication(instance.communication())
        .specialty(instance.specialty())
        .modifierExtension(instance.modifierExtension())
        .extraDetails(instance.extraDetails())
        .telecom(instance.telecom())
        .referralMethod(instance.referralMethod())
        .comment(instance.comment())
        .meta(instance.meta())
        .extension(instance.extension())
        .category(instance.category())
        .type(instance.type())
        .availabilityExceptions(instance.availabilityExceptions())
        .text(instance.text())
        .contained(instance.contained())
        .serviceProvisionCode(instance.serviceProvisionCode())
        .implicitRules(instance.implicitRules())
        .coverageArea(instance.coverageArea())
        .providedBy(instance.providedBy())
        .eligibility(instance.eligibility())
        .language(instance.language())
        .location(instance.location())
        .photo(instance.photo())
        .notAvailable(instance.notAvailable())
        .availableTime(instance.availableTime())
        .active(instance.active())
        .id(instance.id())
        .identifier(instance.identifier())
        .program(instance.program())
        .resourceType(instance.resourceType())
        .characteristic(instance.characteristic())
        .build();
  }

  /**
   * Creates a builder for {@link HealthcareService HealthcareService}.
   * <pre>
   * ImmutableHealthcareService.builder()
   *    .name(String) // optional {@link HealthcareService#name() name}
   *    .appointmentRequired(Boolean) // optional {@link HealthcareService#appointmentRequired() appointmentRequired}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link HealthcareService#endpoint() endpoint}
   *    .communication(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#communication() communication}
   *    .specialty(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#specialty() specialty}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link HealthcareService#modifierExtension() modifierExtension}
   *    .extraDetails(com.fhir.markdown) // optional {@link HealthcareService#extraDetails() extraDetails}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link HealthcareService#telecom() telecom}
   *    .referralMethod(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#referralMethod() referralMethod}
   *    .comment(String) // optional {@link HealthcareService#comment() comment}
   *    .meta(com.fhir.Meta) // optional {@link HealthcareService#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link HealthcareService#extension() extension}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#category() category}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#type() type}
   *    .availabilityExceptions(String) // optional {@link HealthcareService#availabilityExceptions() availabilityExceptions}
   *    .text(com.fhir.Narrative) // optional {@link HealthcareService#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link HealthcareService#contained() contained}
   *    .serviceProvisionCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#serviceProvisionCode() serviceProvisionCode}
   *    .implicitRules(com.fhir.uri) // optional {@link HealthcareService#implicitRules() implicitRules}
   *    .coverageArea(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link HealthcareService#coverageArea() coverageArea}
   *    .providedBy(com.fhir.Reference) // optional {@link HealthcareService#providedBy() providedBy}
   *    .eligibility(List&amp;lt;com.fhir.HealthcareService_Eligibility&amp;gt;) // optional {@link HealthcareService#eligibility() eligibility}
   *    .language(com.fhir.code) // optional {@link HealthcareService#language() language}
   *    .location(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link HealthcareService#location() location}
   *    .photo(com.fhir.Attachment) // optional {@link HealthcareService#photo() photo}
   *    .notAvailable(List&amp;lt;com.fhir.HealthcareService_NotAvailable&amp;gt;) // optional {@link HealthcareService#notAvailable() notAvailable}
   *    .availableTime(List&amp;lt;com.fhir.HealthcareService_AvailableTime&amp;gt;) // optional {@link HealthcareService#availableTime() availableTime}
   *    .active(Boolean) // optional {@link HealthcareService#active() active}
   *    .id(com.fhir.id) // optional {@link HealthcareService#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link HealthcareService#identifier() identifier}
   *    .program(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#program() program}
   *    .resourceType(String) // required {@link HealthcareService#resourceType() resourceType}
   *    .characteristic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#characteristic() characteristic}
   *    .build();
   * </pre>
   * @return A new HealthcareService builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableHealthcareService.Builder();
  }

  /**
   * Builds instances of type {@link HealthcareService HealthcareService}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "HealthcareService", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_APPOINTMENT_REQUIRED = 0x2L;
    private static final long OPT_BIT_ENDPOINT = 0x4L;
    private static final long OPT_BIT_COMMUNICATION = 0x8L;
    private static final long OPT_BIT_SPECIALTY = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_EXTRA_DETAILS = 0x40L;
    private static final long OPT_BIT_TELECOM = 0x80L;
    private static final long OPT_BIT_REFERRAL_METHOD = 0x100L;
    private static final long OPT_BIT_COMMENT = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_CATEGORY = 0x1000L;
    private static final long OPT_BIT_TYPE = 0x2000L;
    private static final long OPT_BIT_AVAILABILITY_EXCEPTIONS = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_SERVICE_PROVISION_CODE = 0x20000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40000L;
    private static final long OPT_BIT_COVERAGE_AREA = 0x80000L;
    private static final long OPT_BIT_PROVIDED_BY = 0x100000L;
    private static final long OPT_BIT_ELIGIBILITY = 0x200000L;
    private static final long OPT_BIT_LANGUAGE = 0x400000L;
    private static final long OPT_BIT_LOCATION = 0x800000L;
    private static final long OPT_BIT_PHOTO = 0x1000000L;
    private static final long OPT_BIT_NOT_AVAILABLE = 0x2000000L;
    private static final long OPT_BIT_AVAILABLE_TIME = 0x4000000L;
    private static final long OPT_BIT_ACTIVE = 0x8000000L;
    private static final long OPT_BIT_ID = 0x10000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000000L;
    private static final long OPT_BIT_PROGRAM = 0x40000000L;
    private static final long OPT_BIT_CHARACTERISTIC = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.Boolean appointmentRequired;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communication;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown extraDetails;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> referralMethod;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable java.lang.String availabilityExceptions;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceProvisionCode;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> coverageArea;
    private @javax.annotation.Nullable com.fhir.Reference providedBy;
    private @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_Eligibility> eligibility;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> location;
    private @javax.annotation.Nullable com.fhir.Attachment photo;
    private @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_NotAvailable> notAvailable;
    private @javax.annotation.Nullable java.util.List<com.fhir.HealthcareService_AvailableTime> availableTime;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> program;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> characteristic;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link HealthcareService#name() name} to name.
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
     * Initializes the optional value {@link HealthcareService#name() name} to name.
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
     * Initializes the optional value {@link HealthcareService#appointmentRequired() appointmentRequired} to appointmentRequired.
     * @param appointmentRequired The value for appointmentRequired
     * @return {@code this} builder for chained invocation
     */
    public final Builder appointmentRequired(boolean appointmentRequired) {
      checkNotIsSet(appointmentRequiredIsSet(), "appointmentRequired");
      this.appointmentRequired = appointmentRequired;
      optBits |= OPT_BIT_APPOINTMENT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#appointmentRequired() appointmentRequired} to appointmentRequired.
     * @param appointmentRequired The value for appointmentRequired
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appointmentRequired")
    public final Builder appointmentRequired(java.util.Optional<java.lang.Boolean> appointmentRequired) {
      checkNotIsSet(appointmentRequiredIsSet(), "appointmentRequired");
      this.appointmentRequired = appointmentRequired.orElse(null);
      optBits |= OPT_BIT_APPOINTMENT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(java.util.List<com.fhir.CodeableConcept> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = java.util.Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("communication")
    public final Builder communication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for chained invocation
     */
    public final Builder extraDetails(com.fhir.markdown extraDetails) {
      checkNotIsSet(extraDetailsIsSet(), "extraDetails");
      this.extraDetails = java.util.Objects.requireNonNull(extraDetails, "extraDetails");
      optBits |= OPT_BIT_EXTRA_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraDetails")
    public final Builder extraDetails(java.util.Optional<? extends com.fhir.markdown> extraDetails) {
      checkNotIsSet(extraDetailsIsSet(), "extraDetails");
      this.extraDetails = extraDetails.orElse(null);
      optBits |= OPT_BIT_EXTRA_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder referralMethod(java.util.List<com.fhir.CodeableConcept> referralMethod) {
      checkNotIsSet(referralMethodIsSet(), "referralMethod");
      this.referralMethod = java.util.Objects.requireNonNull(referralMethod, "referralMethod");
      optBits |= OPT_BIT_REFERRAL_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referralMethod")
    public final Builder referralMethod(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> referralMethod) {
      checkNotIsSet(referralMethodIsSet(), "referralMethod");
      this.referralMethod = referralMethod.orElse(null);
      optBits |= OPT_BIT_REFERRAL_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
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
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
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
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#type() type} to type.
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
     * Initializes the optional value {@link HealthcareService#type() type} to type.
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
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link HealthcareService#text() text} to text.
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
     * Initializes the optional value {@link HealthcareService#text() text} to text.
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
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
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
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
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
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceProvisionCode(java.util.List<com.fhir.CodeableConcept> serviceProvisionCode) {
      checkNotIsSet(serviceProvisionCodeIsSet(), "serviceProvisionCode");
      this.serviceProvisionCode = java.util.Objects.requireNonNull(serviceProvisionCode, "serviceProvisionCode");
      optBits |= OPT_BIT_SERVICE_PROVISION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProvisionCode")
    public final Builder serviceProvisionCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceProvisionCode) {
      checkNotIsSet(serviceProvisionCodeIsSet(), "serviceProvisionCode");
      this.serviceProvisionCode = serviceProvisionCode.orElse(null);
      optBits |= OPT_BIT_SERVICE_PROVISION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverageArea(java.util.List<com.fhir.Reference> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = java.util.Objects.requireNonNull(coverageArea, "coverageArea");
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coverageArea")
    public final Builder coverageArea(java.util.Optional<? extends java.util.List<com.fhir.Reference>> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = coverageArea.orElse(null);
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder providedBy(com.fhir.Reference providedBy) {
      checkNotIsSet(providedByIsSet(), "providedBy");
      this.providedBy = java.util.Objects.requireNonNull(providedBy, "providedBy");
      optBits |= OPT_BIT_PROVIDED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providedBy")
    public final Builder providedBy(java.util.Optional<? extends com.fhir.Reference> providedBy) {
      checkNotIsSet(providedByIsSet(), "providedBy");
      this.providedBy = providedBy.orElse(null);
      optBits |= OPT_BIT_PROVIDED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for chained invocation
     */
    public final Builder eligibility(java.util.List<com.fhir.HealthcareService_Eligibility> eligibility) {
      checkNotIsSet(eligibilityIsSet(), "eligibility");
      this.eligibility = java.util.Objects.requireNonNull(eligibility, "eligibility");
      optBits |= OPT_BIT_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eligibility")
    public final Builder eligibility(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_Eligibility>> eligibility) {
      checkNotIsSet(eligibilityIsSet(), "eligibility");
      this.eligibility = eligibility.orElse(null);
      optBits |= OPT_BIT_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#language() language} to language.
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
     * Initializes the optional value {@link HealthcareService#language() language} to language.
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
     * Initializes the optional value {@link HealthcareService#location() location} to location.
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
     * Initializes the optional value {@link HealthcareService#location() location} to location.
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
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(com.fhir.Attachment photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = java.util.Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public final Builder photo(java.util.Optional<? extends com.fhir.Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    public final Builder notAvailable(java.util.List<com.fhir.HealthcareService_NotAvailable> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = java.util.Objects.requireNonNull(notAvailable, "notAvailable");
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notAvailable")
    public final Builder notAvailable(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_NotAvailable>> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = notAvailable.orElse(null);
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableTime(java.util.List<com.fhir.HealthcareService_AvailableTime> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = java.util.Objects.requireNonNull(availableTime, "availableTime");
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableTime")
    public final Builder availableTime(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_AvailableTime>> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = availableTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#active() active} to active.
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
     * Initializes the optional value {@link HealthcareService#active() active} to active.
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
     * Initializes the optional value {@link HealthcareService#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for chained invocation
     */
    public final Builder program(java.util.List<com.fhir.CodeableConcept> program) {
      checkNotIsSet(programIsSet(), "program");
      this.program = java.util.Objects.requireNonNull(program, "program");
      optBits |= OPT_BIT_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("program")
    public final Builder program(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> program) {
      checkNotIsSet(programIsSet(), "program");
      this.program = program.orElse(null);
      optBits |= OPT_BIT_PROGRAM;
      return this;
    }

    /**
     * Initializes the value for the {@link HealthcareService#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristic(java.util.List<com.fhir.CodeableConcept> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = java.util.Objects.requireNonNull(characteristic, "characteristic");
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
    public final Builder characteristic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = characteristic.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Builds a new {@link HealthcareService HealthcareService}.
     * @return An immutable instance of HealthcareService
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.HealthcareService build() {
      checkRequiredAttributes();
      return new ImmutableHealthcareService(
          name,
          appointmentRequired,
          endpoint,
          communication,
          specialty,
          modifierExtension,
          extraDetails,
          telecom,
          referralMethod,
          comment,
          meta,
          extension,
          category,
          type,
          availabilityExceptions,
          text,
          contained,
          serviceProvisionCode,
          implicitRules,
          coverageArea,
          providedBy,
          eligibility,
          language,
          location,
          photo,
          notAvailable,
          availableTime,
          active,
          id,
          identifier,
          program,
          resourceType,
          characteristic);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean appointmentRequiredIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT_REQUIRED) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extraDetailsIsSet() {
      return (optBits & OPT_BIT_EXTRA_DETAILS) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean referralMethodIsSet() {
      return (optBits & OPT_BIT_REFERRAL_METHOD) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean availabilityExceptionsIsSet() {
      return (optBits & OPT_BIT_AVAILABILITY_EXCEPTIONS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean serviceProvisionCodeIsSet() {
      return (optBits & OPT_BIT_SERVICE_PROVISION_CODE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean coverageAreaIsSet() {
      return (optBits & OPT_BIT_COVERAGE_AREA) != 0;
    }

    private boolean providedByIsSet() {
      return (optBits & OPT_BIT_PROVIDED_BY) != 0;
    }

    private boolean eligibilityIsSet() {
      return (optBits & OPT_BIT_ELIGIBILITY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean notAvailableIsSet() {
      return (optBits & OPT_BIT_NOT_AVAILABLE) != 0;
    }

    private boolean availableTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_TIME) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean programIsSet() {
      return (optBits & OPT_BIT_PROGRAM) != 0;
    }

    private boolean characteristicIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTIC) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of HealthcareService is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build HealthcareService, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "HealthcareService", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link HealthcareService#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "HealthcareService", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link HealthcareService#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link HealthcareService#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link HealthcareService#appointmentRequired() appointmentRequired} to appointmentRequired.
     * @param appointmentRequired The value for appointmentRequired
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointmentRequired(boolean appointmentRequired);

    /**
     * Initializes the optional value {@link HealthcareService#appointmentRequired() appointmentRequired} to appointmentRequired.
     * @param appointmentRequired The value for appointmentRequired
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointmentRequired(java.util.Optional<java.lang.Boolean> appointmentRequired);

    /**
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(java.util.List<com.fhir.CodeableConcept> communication);

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> communication);

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(java.util.List<com.fhir.CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extraDetails(com.fhir.markdown extraDetails);

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extraDetails(java.util.Optional<? extends com.fhir.markdown> extraDetails);

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referralMethod(java.util.List<com.fhir.CodeableConcept> referralMethod);

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referralMethod(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> referralMethod);

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link HealthcareService#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link HealthcareService#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availabilityExceptions(java.lang.String availabilityExceptions);

    /**
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availabilityExceptions(java.util.Optional<java.lang.String> availabilityExceptions);

    /**
     * Initializes the optional value {@link HealthcareService#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link HealthcareService#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceProvisionCode(java.util.List<com.fhir.CodeableConcept> serviceProvisionCode);

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceProvisionCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceProvisionCode);

    /**
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverageArea(java.util.List<com.fhir.Reference> coverageArea);

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverageArea(java.util.Optional<? extends java.util.List<com.fhir.Reference>> coverageArea);

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal providedBy(com.fhir.Reference providedBy);

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal providedBy(java.util.Optional<? extends com.fhir.Reference> providedBy);

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eligibility(java.util.List<com.fhir.HealthcareService_Eligibility> eligibility);

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eligibility(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_Eligibility>> eligibility);

    /**
     * Initializes the optional value {@link HealthcareService#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link HealthcareService#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link HealthcareService#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(java.util.List<com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link HealthcareService#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends java.util.List<com.fhir.Reference>> location);

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(com.fhir.Attachment photo);

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(java.util.Optional<? extends com.fhir.Attachment> photo);

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal notAvailable(java.util.List<com.fhir.HealthcareService_NotAvailable> notAvailable);

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal notAvailable(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_NotAvailable>> notAvailable);

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availableTime(java.util.List<com.fhir.HealthcareService_AvailableTime> availableTime);

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availableTime(java.util.Optional<? extends java.util.List<com.fhir.HealthcareService_AvailableTime>> availableTime);

    /**
     * Initializes the optional value {@link HealthcareService#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link HealthcareService#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link HealthcareService#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link HealthcareService#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for chained invocation
     */
    BuildFinal program(java.util.List<com.fhir.CodeableConcept> program);

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal program(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> program);

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal characteristic(java.util.List<com.fhir.CodeableConcept> characteristic);

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal characteristic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> characteristic);

    /**
     * Builds a new {@link HealthcareService HealthcareService}.
     * @return An immutable instance of HealthcareService
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    HealthcareService build();
  }
}
