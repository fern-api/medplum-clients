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
 * Immutable implementation of {@link HealthcareService}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthcareService.builder()}.
 */
@Generated(from = "HealthcareService", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableHealthcareService implements HealthcareService {
  private final @Nullable Meta meta;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<CodeableConcept> characteristic;
  private final @Nullable List<CodeableConcept> communication;
  private final @Nullable List<CodeableConcept> referralMethod;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable List<HealthcareService_NotAvailable> notAvailable;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String name;
  private final @Nullable List<CodeableConcept> program;
  private final @Nullable List<Extension> extension;
  private final @Nullable String availabilityExceptions;
  private final @Nullable Boolean active;
  private final @Nullable Attachment photo;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable Reference providedBy;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> location;
  private final @Nullable List<ContactPoint> telecom;
  private final String resourceType;
  private final @Nullable List<HealthcareService_AvailableTime> availableTime;
  private final @Nullable String comment;
  private final @Nullable Markdown extraDetails;
  private final @Nullable List<CodeableConcept> serviceProvisionCode;
  private final @Nullable List<HealthcareService_Eligibility> eligibility;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Boolean appointmentRequired;
  private final @Nullable List<CodeableConcept> specialty;
  private final @Nullable List<Reference> coverageArea;

  private ImmutableHealthcareService(
      @Nullable Meta meta,
      @Nullable List<CodeableConcept> type,
      @Nullable List<CodeableConcept> characteristic,
      @Nullable List<CodeableConcept> communication,
      @Nullable List<CodeableConcept> referralMethod,
      @Nullable Narrative text,
      @Nullable List<Reference> endpoint,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> category,
      @Nullable List<HealthcareService_NotAvailable> notAvailable,
      @Nullable List<Extension> modifierExtension,
      @Nullable String name,
      @Nullable List<CodeableConcept> program,
      @Nullable List<Extension> extension,
      @Nullable String availabilityExceptions,
      @Nullable Boolean active,
      @Nullable Attachment photo,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable Reference providedBy,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> location,
      @Nullable List<ContactPoint> telecom,
      String resourceType,
      @Nullable List<HealthcareService_AvailableTime> availableTime,
      @Nullable String comment,
      @Nullable Markdown extraDetails,
      @Nullable List<CodeableConcept> serviceProvisionCode,
      @Nullable List<HealthcareService_Eligibility> eligibility,
      @Nullable List<ResourceList> contained,
      @Nullable Boolean appointmentRequired,
      @Nullable List<CodeableConcept> specialty,
      @Nullable List<Reference> coverageArea) {
    this.meta = meta;
    this.type = type;
    this.characteristic = characteristic;
    this.communication = communication;
    this.referralMethod = referralMethod;
    this.text = text;
    this.endpoint = endpoint;
    this.implicitRules = implicitRules;
    this.category = category;
    this.notAvailable = notAvailable;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.program = program;
    this.extension = extension;
    this.availabilityExceptions = availabilityExceptions;
    this.active = active;
    this.photo = photo;
    this.id = id;
    this.language = language;
    this.providedBy = providedBy;
    this.identifier = identifier;
    this.location = location;
    this.telecom = telecom;
    this.resourceType = resourceType;
    this.availableTime = availableTime;
    this.comment = comment;
    this.extraDetails = extraDetails;
    this.serviceProvisionCode = serviceProvisionCode;
    this.eligibility = eligibility;
    this.contained = contained;
    this.appointmentRequired = appointmentRequired;
    this.specialty = specialty;
    this.coverageArea = coverageArea;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code characteristic} attribute
   */
  @JsonProperty("characteristic")
  @Override
  public Optional<List<CodeableConcept>> characteristic() {
    return Optional.ofNullable(characteristic);
  }

  /**
   * @return The value of the {@code communication} attribute
   */
  @JsonProperty("communication")
  @Override
  public Optional<List<CodeableConcept>> communication() {
    return Optional.ofNullable(communication);
  }

  /**
   * @return The value of the {@code referralMethod} attribute
   */
  @JsonProperty("referralMethod")
  @Override
  public Optional<List<CodeableConcept>> referralMethod() {
    return Optional.ofNullable(referralMethod);
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
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<Reference>> endpoint() {
    return Optional.ofNullable(endpoint);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code notAvailable} attribute
   */
  @JsonProperty("notAvailable")
  @Override
  public Optional<List<HealthcareService_NotAvailable>> notAvailable() {
    return Optional.ofNullable(notAvailable);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code program} attribute
   */
  @JsonProperty("program")
  @Override
  public Optional<List<CodeableConcept>> program() {
    return Optional.ofNullable(program);
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
   * @return The value of the {@code availabilityExceptions} attribute
   */
  @JsonProperty("availabilityExceptions")
  @Override
  public Optional<String> availabilityExceptions() {
    return Optional.ofNullable(availabilityExceptions);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @JsonProperty("photo")
  @Override
  public Optional<Attachment> photo() {
    return Optional.ofNullable(photo);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code providedBy} attribute
   */
  @JsonProperty("providedBy")
  @Override
  public Optional<Reference> providedBy() {
    return Optional.ofNullable(providedBy);
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
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<List<Reference>> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
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
   * @return The value of the {@code availableTime} attribute
   */
  @JsonProperty("availableTime")
  @Override
  public Optional<List<HealthcareService_AvailableTime>> availableTime() {
    return Optional.ofNullable(availableTime);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code extraDetails} attribute
   */
  @JsonProperty("extraDetails")
  @Override
  public Optional<Markdown> extraDetails() {
    return Optional.ofNullable(extraDetails);
  }

  /**
   * @return The value of the {@code serviceProvisionCode} attribute
   */
  @JsonProperty("serviceProvisionCode")
  @Override
  public Optional<List<CodeableConcept>> serviceProvisionCode() {
    return Optional.ofNullable(serviceProvisionCode);
  }

  /**
   * @return The value of the {@code eligibility} attribute
   */
  @JsonProperty("eligibility")
  @Override
  public Optional<List<HealthcareService_Eligibility>> eligibility() {
    return Optional.ofNullable(eligibility);
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
   * @return The value of the {@code appointmentRequired} attribute
   */
  @JsonProperty("appointmentRequired")
  @Override
  public Optional<Boolean> appointmentRequired() {
    return Optional.ofNullable(appointmentRequired);
  }

  /**
   * @return The value of the {@code specialty} attribute
   */
  @JsonProperty("specialty")
  @Override
  public Optional<List<CodeableConcept>> specialty() {
    return Optional.ofNullable(specialty);
  }

  /**
   * @return The value of the {@code coverageArea} attribute
   */
  @JsonProperty("coverageArea")
  @Override
  public Optional<List<Reference>> coverageArea() {
    return Optional.ofNullable(coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableHealthcareService(
        newValue,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableHealthcareService(
        value,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        newValue,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        value,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#characteristic() characteristic} attribute.
   * @param value The value for characteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCharacteristic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "characteristic");
    if (this.characteristic == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        newValue,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#characteristic() characteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCharacteristic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.characteristic == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        value,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCommunication(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        newValue,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCommunication(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        value,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#referralMethod() referralMethod} attribute.
   * @param value The value for referralMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withReferralMethod(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "referralMethod");
    if (this.referralMethod == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        newValue,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#referralMethod() referralMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referralMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withReferralMethod(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.referralMethod == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        value,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        newValue,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        value,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        newValue,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        value,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        newValue,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        value,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        newValue,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        value,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#notAvailable() notAvailable} attribute.
   * @param value The value for notAvailable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withNotAvailable(List<HealthcareService_NotAvailable> value) {
    @Nullable List<HealthcareService_NotAvailable> newValue = Objects.requireNonNull(value, "notAvailable");
    if (this.notAvailable == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        newValue,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#notAvailable() notAvailable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for notAvailable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withNotAvailable(Optional<? extends List<HealthcareService_NotAvailable>> optional) {
    @Nullable List<HealthcareService_NotAvailable> value = optional.orElse(null);
    if (this.notAvailable == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        value,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        newValue,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        value,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        newValue,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        value,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#program() program} attribute.
   * @param value The value for program
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withProgram(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "program");
    if (this.program == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        newValue,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#program() program} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for program
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withProgram(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.program == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        value,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        newValue,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        value,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#availabilityExceptions() availabilityExceptions} attribute.
   * @param value The value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAvailabilityExceptions(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "availabilityExceptions");
    if (Objects.equals(this.availabilityExceptions, newValue)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        newValue,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#availabilityExceptions() availabilityExceptions} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAvailabilityExceptions(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.availabilityExceptions, value)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        value,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        newValue,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        value,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withPhoto(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        newValue,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withPhoto(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        value,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        newValue,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        value,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        newValue,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        value,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#providedBy() providedBy} attribute.
   * @param value The value for providedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withProvidedBy(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "providedBy");
    if (this.providedBy == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        newValue,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#providedBy() providedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for providedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withProvidedBy(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.providedBy == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        value,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        newValue,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        value,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withLocation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        newValue,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withLocation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        value,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        newValue,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        value,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthcareService#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthcareService withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        newValue,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#availableTime() availableTime} attribute.
   * @param value The value for availableTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAvailableTime(List<HealthcareService_AvailableTime> value) {
    @Nullable List<HealthcareService_AvailableTime> newValue = Objects.requireNonNull(value, "availableTime");
    if (this.availableTime == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        newValue,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#availableTime() availableTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withAvailableTime(Optional<? extends List<HealthcareService_AvailableTime>> optional) {
    @Nullable List<HealthcareService_AvailableTime> value = optional.orElse(null);
    if (this.availableTime == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        value,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        newValue,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        value,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#extraDetails() extraDetails} attribute.
   * @param value The value for extraDetails
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withExtraDetails(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "extraDetails");
    if (this.extraDetails == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        newValue,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#extraDetails() extraDetails} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extraDetails
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withExtraDetails(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.extraDetails == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        value,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} attribute.
   * @param value The value for serviceProvisionCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withServiceProvisionCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceProvisionCode");
    if (this.serviceProvisionCode == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        newValue,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceProvisionCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withServiceProvisionCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceProvisionCode == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        value,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#eligibility() eligibility} attribute.
   * @param value The value for eligibility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withEligibility(List<HealthcareService_Eligibility> value) {
    @Nullable List<HealthcareService_Eligibility> newValue = Objects.requireNonNull(value, "eligibility");
    if (this.eligibility == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        newValue,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#eligibility() eligibility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eligibility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withEligibility(Optional<? extends List<HealthcareService_Eligibility>> optional) {
    @Nullable List<HealthcareService_Eligibility> value = optional.orElse(null);
    if (this.eligibility == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        value,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        newValue,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        value,
        this.appointmentRequired,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#appointmentRequired() appointmentRequired} attribute.
   * @param value The value for appointmentRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAppointmentRequired(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.appointmentRequired, newValue)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        newValue,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#appointmentRequired() appointmentRequired} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointmentRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withAppointmentRequired(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.appointmentRequired, value)) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        value,
        this.specialty,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withSpecialty(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        newValue,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withSpecialty(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        value,
        this.coverageArea);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService#coverageArea() coverageArea} attribute.
   * @param value The value for coverageArea
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService withCoverageArea(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "coverageArea");
    if (this.coverageArea == newValue) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService#coverageArea() coverageArea} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverageArea
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService withCoverageArea(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.coverageArea == value) return this;
    return new ImmutableHealthcareService(
        this.meta,
        this.type,
        this.characteristic,
        this.communication,
        this.referralMethod,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.category,
        this.notAvailable,
        this.modifierExtension,
        this.name,
        this.program,
        this.extension,
        this.availabilityExceptions,
        this.active,
        this.photo,
        this.id,
        this.language,
        this.providedBy,
        this.identifier,
        this.location,
        this.telecom,
        this.resourceType,
        this.availableTime,
        this.comment,
        this.extraDetails,
        this.serviceProvisionCode,
        this.eligibility,
        this.contained,
        this.appointmentRequired,
        this.specialty,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthcareService} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthcareService
        && equalTo((ImmutableHealthcareService) another);
  }

  private boolean equalTo(ImmutableHealthcareService another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(type, another.type)
        && Objects.equals(characteristic, another.characteristic)
        && Objects.equals(communication, another.communication)
        && Objects.equals(referralMethod, another.referralMethod)
        && Objects.equals(text, another.text)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(category, another.category)
        && Objects.equals(notAvailable, another.notAvailable)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && Objects.equals(program, another.program)
        && Objects.equals(extension, another.extension)
        && Objects.equals(availabilityExceptions, another.availabilityExceptions)
        && Objects.equals(active, another.active)
        && Objects.equals(photo, another.photo)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(providedBy, another.providedBy)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(location, another.location)
        && Objects.equals(telecom, another.telecom)
        && resourceType.equals(another.resourceType)
        && Objects.equals(availableTime, another.availableTime)
        && Objects.equals(comment, another.comment)
        && Objects.equals(extraDetails, another.extraDetails)
        && Objects.equals(serviceProvisionCode, another.serviceProvisionCode)
        && Objects.equals(eligibility, another.eligibility)
        && Objects.equals(contained, another.contained)
        && Objects.equals(appointmentRequired, another.appointmentRequired)
        && Objects.equals(specialty, another.specialty)
        && Objects.equals(coverageArea, another.coverageArea);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code type}, {@code characteristic}, {@code communication}, {@code referralMethod}, {@code text}, {@code endpoint}, {@code implicitRules}, {@code category}, {@code notAvailable}, {@code modifierExtension}, {@code name}, {@code program}, {@code extension}, {@code availabilityExceptions}, {@code active}, {@code photo}, {@code id}, {@code language}, {@code providedBy}, {@code identifier}, {@code location}, {@code telecom}, {@code resourceType}, {@code availableTime}, {@code comment}, {@code extraDetails}, {@code serviceProvisionCode}, {@code eligibility}, {@code contained}, {@code appointmentRequired}, {@code specialty}, {@code coverageArea}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(characteristic);
    h += (h << 5) + Objects.hashCode(communication);
    h += (h << 5) + Objects.hashCode(referralMethod);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(notAvailable);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(program);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(availabilityExceptions);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(photo);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(providedBy);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(availableTime);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(extraDetails);
    h += (h << 5) + Objects.hashCode(serviceProvisionCode);
    h += (h << 5) + Objects.hashCode(eligibility);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(appointmentRequired);
    h += (h << 5) + Objects.hashCode(specialty);
    h += (h << 5) + Objects.hashCode(coverageArea);
    return h;
  }

  /**
   * Prints the immutable value {@code HealthcareService} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("HealthcareService{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (characteristic != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("characteristic=").append(characteristic);
    }
    if (communication != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (referralMethod != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("referralMethod=").append(referralMethod);
    }
    if (text != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (endpoint != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (implicitRules != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (category != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (notAvailable != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("notAvailable=").append(notAvailable);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (program != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("program=").append(program);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (availabilityExceptions != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("availabilityExceptions=").append(availabilityExceptions);
    }
    if (active != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (photo != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (providedBy != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("providedBy=").append(providedBy);
    }
    if (identifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (location != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (telecom != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (availableTime != null) {
      builder.append(", ");
      builder.append("availableTime=").append(availableTime);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (extraDetails != null) {
      builder.append(", ");
      builder.append("extraDetails=").append(extraDetails);
    }
    if (serviceProvisionCode != null) {
      builder.append(", ");
      builder.append("serviceProvisionCode=").append(serviceProvisionCode);
    }
    if (eligibility != null) {
      builder.append(", ");
      builder.append("eligibility=").append(eligibility);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (appointmentRequired != null) {
      builder.append(", ");
      builder.append("appointmentRequired=").append(appointmentRequired);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (coverageArea != null) {
      builder.append(", ");
      builder.append("coverageArea=").append(coverageArea);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "HealthcareService", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements HealthcareService {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<CodeableConcept>> characteristic = Optional.empty();
    boolean characteristicIsSet;
    @Nullable Optional<List<CodeableConcept>> communication = Optional.empty();
    boolean communicationIsSet;
    @Nullable Optional<List<CodeableConcept>> referralMethod = Optional.empty();
    boolean referralMethodIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<HealthcareService_NotAvailable>> notAvailable = Optional.empty();
    boolean notAvailableIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<CodeableConcept>> program = Optional.empty();
    boolean programIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> availabilityExceptions = Optional.empty();
    boolean availabilityExceptionsIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Attachment> photo = Optional.empty();
    boolean photoIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> providedBy = Optional.empty();
    boolean providedByIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<HealthcareService_AvailableTime>> availableTime = Optional.empty();
    boolean availableTimeIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<Markdown> extraDetails = Optional.empty();
    boolean extraDetailsIsSet;
    @Nullable Optional<List<CodeableConcept>> serviceProvisionCode = Optional.empty();
    boolean serviceProvisionCodeIsSet;
    @Nullable Optional<List<HealthcareService_Eligibility>> eligibility = Optional.empty();
    boolean eligibilityIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Boolean> appointmentRequired = Optional.empty();
    boolean appointmentRequiredIsSet;
    @Nullable Optional<List<CodeableConcept>> specialty = Optional.empty();
    boolean specialtyIsSet;
    @Nullable Optional<List<Reference>> coverageArea = Optional.empty();
    boolean coverageAreaIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("characteristic")
    public void setCharacteristic(Optional<List<CodeableConcept>> characteristic) {
      this.characteristic = characteristic;
      this.characteristicIsSet = true;
    }
    @JsonProperty("communication")
    public void setCommunication(Optional<List<CodeableConcept>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @JsonProperty("referralMethod")
    public void setReferralMethod(Optional<List<CodeableConcept>> referralMethod) {
      this.referralMethod = referralMethod;
      this.referralMethodIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("notAvailable")
    public void setNotAvailable(Optional<List<HealthcareService_NotAvailable>> notAvailable) {
      this.notAvailable = notAvailable;
      this.notAvailableIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("program")
    public void setProgram(Optional<List<CodeableConcept>> program) {
      this.program = program;
      this.programIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(Optional<String> availabilityExceptions) {
      this.availabilityExceptions = availabilityExceptions;
      this.availabilityExceptionsIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("photo")
    public void setPhoto(Optional<Attachment> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("providedBy")
    public void setProvidedBy(Optional<Reference> providedBy) {
      this.providedBy = providedBy;
      this.providedByIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<List<Reference>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("availableTime")
    public void setAvailableTime(Optional<List<HealthcareService_AvailableTime>> availableTime) {
      this.availableTime = availableTime;
      this.availableTimeIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("extraDetails")
    public void setExtraDetails(Optional<Markdown> extraDetails) {
      this.extraDetails = extraDetails;
      this.extraDetailsIsSet = true;
    }
    @JsonProperty("serviceProvisionCode")
    public void setServiceProvisionCode(Optional<List<CodeableConcept>> serviceProvisionCode) {
      this.serviceProvisionCode = serviceProvisionCode;
      this.serviceProvisionCodeIsSet = true;
    }
    @JsonProperty("eligibility")
    public void setEligibility(Optional<List<HealthcareService_Eligibility>> eligibility) {
      this.eligibility = eligibility;
      this.eligibilityIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("appointmentRequired")
    public void setAppointmentRequired(Optional<Boolean> appointmentRequired) {
      this.appointmentRequired = appointmentRequired;
      this.appointmentRequiredIsSet = true;
    }
    @JsonProperty("specialty")
    public void setSpecialty(Optional<List<CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @JsonProperty("coverageArea")
    public void setCoverageArea(Optional<List<Reference>> coverageArea) {
      this.coverageArea = coverageArea;
      this.coverageAreaIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> characteristic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> referralMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HealthcareService_NotAvailable>> notAvailable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> program() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> availabilityExceptions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> photo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> providedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HealthcareService_AvailableTime>> availableTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> extraDetails() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceProvisionCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HealthcareService_Eligibility>> eligibility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> appointmentRequired() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> coverageArea() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHealthcareService fromJson(Json json) {
    ImmutableHealthcareService.Builder builder = ((ImmutableHealthcareService.Builder) ImmutableHealthcareService.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.characteristicIsSet) {
      builder.characteristic(json.characteristic);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.referralMethodIsSet) {
      builder.referralMethod(json.referralMethod);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.notAvailableIsSet) {
      builder.notAvailable(json.notAvailable);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.programIsSet) {
      builder.program(json.program);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.availabilityExceptionsIsSet) {
      builder.availabilityExceptions(json.availabilityExceptions);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.providedByIsSet) {
      builder.providedBy(json.providedBy);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.availableTimeIsSet) {
      builder.availableTime(json.availableTime);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.extraDetailsIsSet) {
      builder.extraDetails(json.extraDetails);
    }
    if (json.serviceProvisionCodeIsSet) {
      builder.serviceProvisionCode(json.serviceProvisionCode);
    }
    if (json.eligibilityIsSet) {
      builder.eligibility(json.eligibility);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.appointmentRequiredIsSet) {
      builder.appointmentRequired(json.appointmentRequired);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.coverageAreaIsSet) {
      builder.coverageArea(json.coverageArea);
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
        .meta(instance.meta())
        .type(instance.type())
        .characteristic(instance.characteristic())
        .communication(instance.communication())
        .referralMethod(instance.referralMethod())
        .text(instance.text())
        .endpoint(instance.endpoint())
        .implicitRules(instance.implicitRules())
        .category(instance.category())
        .notAvailable(instance.notAvailable())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .program(instance.program())
        .extension(instance.extension())
        .availabilityExceptions(instance.availabilityExceptions())
        .active(instance.active())
        .photo(instance.photo())
        .id(instance.id())
        .language(instance.language())
        .providedBy(instance.providedBy())
        .identifier(instance.identifier())
        .location(instance.location())
        .telecom(instance.telecom())
        .resourceType(instance.resourceType())
        .availableTime(instance.availableTime())
        .comment(instance.comment())
        .extraDetails(instance.extraDetails())
        .serviceProvisionCode(instance.serviceProvisionCode())
        .eligibility(instance.eligibility())
        .contained(instance.contained())
        .appointmentRequired(instance.appointmentRequired())
        .specialty(instance.specialty())
        .coverageArea(instance.coverageArea())
        .build();
  }

  /**
   * Creates a builder for {@link HealthcareService HealthcareService}.
   * <pre>
   * ImmutableHealthcareService.builder()
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link HealthcareService#meta() meta}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#type() type}
   *    .characteristic(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#characteristic() characteristic}
   *    .communication(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#communication() communication}
   *    .referralMethod(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#referralMethod() referralMethod}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link HealthcareService#text() text}
   *    .endpoint(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link HealthcareService#endpoint() endpoint}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link HealthcareService#implicitRules() implicitRules}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#category() category}
   *    .notAvailable(List&amp;lt;com.fhir.types.fhir.HealthcareService_NotAvailable&amp;gt;) // optional {@link HealthcareService#notAvailable() notAvailable}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link HealthcareService#modifierExtension() modifierExtension}
   *    .name(String) // optional {@link HealthcareService#name() name}
   *    .program(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#program() program}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link HealthcareService#extension() extension}
   *    .availabilityExceptions(String) // optional {@link HealthcareService#availabilityExceptions() availabilityExceptions}
   *    .active(Boolean) // optional {@link HealthcareService#active() active}
   *    .photo(com.fhir.types.fhir.Attachment) // optional {@link HealthcareService#photo() photo}
   *    .id(com.fhir.types.fhir.Id) // optional {@link HealthcareService#id() id}
   *    .language(com.fhir.types.fhir.Code) // optional {@link HealthcareService#language() language}
   *    .providedBy(com.fhir.types.fhir.Reference) // optional {@link HealthcareService#providedBy() providedBy}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link HealthcareService#identifier() identifier}
   *    .location(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link HealthcareService#location() location}
   *    .telecom(List&amp;lt;com.fhir.types.fhir.ContactPoint&amp;gt;) // optional {@link HealthcareService#telecom() telecom}
   *    .resourceType(String) // required {@link HealthcareService#resourceType() resourceType}
   *    .availableTime(List&amp;lt;com.fhir.types.fhir.HealthcareService_AvailableTime&amp;gt;) // optional {@link HealthcareService#availableTime() availableTime}
   *    .comment(String) // optional {@link HealthcareService#comment() comment}
   *    .extraDetails(com.fhir.types.fhir.Markdown) // optional {@link HealthcareService#extraDetails() extraDetails}
   *    .serviceProvisionCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#serviceProvisionCode() serviceProvisionCode}
   *    .eligibility(List&amp;lt;com.fhir.types.fhir.HealthcareService_Eligibility&amp;gt;) // optional {@link HealthcareService#eligibility() eligibility}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link HealthcareService#contained() contained}
   *    .appointmentRequired(Boolean) // optional {@link HealthcareService#appointmentRequired() appointmentRequired}
   *    .specialty(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link HealthcareService#specialty() specialty}
   *    .coverageArea(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link HealthcareService#coverageArea() coverageArea}
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
  @Generated(from = "HealthcareService", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_CHARACTERISTIC = 0x4L;
    private static final long OPT_BIT_COMMUNICATION = 0x8L;
    private static final long OPT_BIT_REFERRAL_METHOD = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_ENDPOINT = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_CATEGORY = 0x100L;
    private static final long OPT_BIT_NOT_AVAILABLE = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_PROGRAM = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_AVAILABILITY_EXCEPTIONS = 0x4000L;
    private static final long OPT_BIT_ACTIVE = 0x8000L;
    private static final long OPT_BIT_PHOTO = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_PROVIDED_BY = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_LOCATION = 0x200000L;
    private static final long OPT_BIT_TELECOM = 0x400000L;
    private static final long OPT_BIT_AVAILABLE_TIME = 0x800000L;
    private static final long OPT_BIT_COMMENT = 0x1000000L;
    private static final long OPT_BIT_EXTRA_DETAILS = 0x2000000L;
    private static final long OPT_BIT_SERVICE_PROVISION_CODE = 0x4000000L;
    private static final long OPT_BIT_ELIGIBILITY = 0x8000000L;
    private static final long OPT_BIT_CONTAINED = 0x10000000L;
    private static final long OPT_BIT_APPOINTMENT_REQUIRED = 0x20000000L;
    private static final long OPT_BIT_SPECIALTY = 0x40000000L;
    private static final long OPT_BIT_COVERAGE_AREA = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable List<CodeableConcept> type;
    private @Nullable List<CodeableConcept> characteristic;
    private @Nullable List<CodeableConcept> communication;
    private @Nullable List<CodeableConcept> referralMethod;
    private @Nullable Narrative text;
    private @Nullable List<Reference> endpoint;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> category;
    private @Nullable List<HealthcareService_NotAvailable> notAvailable;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String name;
    private @Nullable List<CodeableConcept> program;
    private @Nullable List<Extension> extension;
    private @Nullable String availabilityExceptions;
    private @Nullable Boolean active;
    private @Nullable Attachment photo;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable Reference providedBy;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> location;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable String resourceType;
    private @Nullable List<HealthcareService_AvailableTime> availableTime;
    private @Nullable String comment;
    private @Nullable Markdown extraDetails;
    private @Nullable List<CodeableConcept> serviceProvisionCode;
    private @Nullable List<HealthcareService_Eligibility> eligibility;
    private @Nullable List<ResourceList> contained;
    private @Nullable Boolean appointmentRequired;
    private @Nullable List<CodeableConcept> specialty;
    private @Nullable List<Reference> coverageArea;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
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
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
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
     * Initializes the optional value {@link HealthcareService#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristic(List<CodeableConcept> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = Objects.requireNonNull(characteristic, "characteristic");
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("characteristic")
    public final Builder characteristic(Optional<? extends List<CodeableConcept>> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = characteristic.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(List<CodeableConcept> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communication")
    public final Builder communication(Optional<? extends List<CodeableConcept>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder referralMethod(List<CodeableConcept> referralMethod) {
      checkNotIsSet(referralMethodIsSet(), "referralMethod");
      this.referralMethod = Objects.requireNonNull(referralMethod, "referralMethod");
      optBits |= OPT_BIT_REFERRAL_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referralMethod")
    public final Builder referralMethod(Optional<? extends List<CodeableConcept>> referralMethod) {
      checkNotIsSet(referralMethodIsSet(), "referralMethod");
      this.referralMethod = referralMethod.orElse(null);
      optBits |= OPT_BIT_REFERRAL_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#text() text} to text.
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
     * Initializes the optional value {@link HealthcareService#text() text} to text.
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
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(List<Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends List<Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    public final Builder notAvailable(List<HealthcareService_NotAvailable> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = Objects.requireNonNull(notAvailable, "notAvailable");
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("notAvailable")
    public final Builder notAvailable(Optional<? extends List<HealthcareService_NotAvailable>> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = notAvailable.orElse(null);
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for chained invocation
     */
    public final Builder program(List<CodeableConcept> program) {
      checkNotIsSet(programIsSet(), "program");
      this.program = Objects.requireNonNull(program, "program");
      optBits |= OPT_BIT_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("program")
    public final Builder program(Optional<? extends List<CodeableConcept>> program) {
      checkNotIsSet(programIsSet(), "program");
      this.program = program.orElse(null);
      optBits |= OPT_BIT_PROGRAM;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    public final Builder availabilityExceptions(String availabilityExceptions) {
      checkNotIsSet(availabilityExceptionsIsSet(), "availabilityExceptions");
      this.availabilityExceptions = Objects.requireNonNull(availabilityExceptions, "availabilityExceptions");
      optBits |= OPT_BIT_AVAILABILITY_EXCEPTIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("availabilityExceptions")
    public final Builder availabilityExceptions(Optional<String> availabilityExceptions) {
      checkNotIsSet(availabilityExceptionsIsSet(), "availabilityExceptions");
      this.availabilityExceptions = availabilityExceptions.orElse(null);
      optBits |= OPT_BIT_AVAILABILITY_EXCEPTIONS;
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(Attachment photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("photo")
    public final Builder photo(Optional<? extends Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService#language() language} to language.
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
     * Initializes the optional value {@link HealthcareService#language() language} to language.
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
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder providedBy(Reference providedBy) {
      checkNotIsSet(providedByIsSet(), "providedBy");
      this.providedBy = Objects.requireNonNull(providedBy, "providedBy");
      optBits |= OPT_BIT_PROVIDED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("providedBy")
    public final Builder providedBy(Optional<? extends Reference> providedBy) {
      checkNotIsSet(providedByIsSet(), "providedBy");
      this.providedBy = providedBy.orElse(null);
      optBits |= OPT_BIT_PROVIDED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link HealthcareService#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(List<Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends List<Reference>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    public final Builder telecom(List<ContactPoint> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = Objects.requireNonNull(telecom, "telecom");
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("telecom")
    public final Builder telecom(Optional<? extends List<ContactPoint>> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = telecom.orElse(null);
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the value for the {@link HealthcareService#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableTime(List<HealthcareService_AvailableTime> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = Objects.requireNonNull(availableTime, "availableTime");
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("availableTime")
    public final Builder availableTime(Optional<? extends List<HealthcareService_AvailableTime>> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = availableTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for chained invocation
     */
    public final Builder extraDetails(Markdown extraDetails) {
      checkNotIsSet(extraDetailsIsSet(), "extraDetails");
      this.extraDetails = Objects.requireNonNull(extraDetails, "extraDetails");
      optBits |= OPT_BIT_EXTRA_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extraDetails")
    public final Builder extraDetails(Optional<? extends Markdown> extraDetails) {
      checkNotIsSet(extraDetailsIsSet(), "extraDetails");
      this.extraDetails = extraDetails.orElse(null);
      optBits |= OPT_BIT_EXTRA_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceProvisionCode(List<CodeableConcept> serviceProvisionCode) {
      checkNotIsSet(serviceProvisionCodeIsSet(), "serviceProvisionCode");
      this.serviceProvisionCode = Objects.requireNonNull(serviceProvisionCode, "serviceProvisionCode");
      optBits |= OPT_BIT_SERVICE_PROVISION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceProvisionCode")
    public final Builder serviceProvisionCode(Optional<? extends List<CodeableConcept>> serviceProvisionCode) {
      checkNotIsSet(serviceProvisionCodeIsSet(), "serviceProvisionCode");
      this.serviceProvisionCode = serviceProvisionCode.orElse(null);
      optBits |= OPT_BIT_SERVICE_PROVISION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for chained invocation
     */
    public final Builder eligibility(List<HealthcareService_Eligibility> eligibility) {
      checkNotIsSet(eligibilityIsSet(), "eligibility");
      this.eligibility = Objects.requireNonNull(eligibility, "eligibility");
      optBits |= OPT_BIT_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eligibility")
    public final Builder eligibility(Optional<? extends List<HealthcareService_Eligibility>> eligibility) {
      checkNotIsSet(eligibilityIsSet(), "eligibility");
      this.eligibility = eligibility.orElse(null);
      optBits |= OPT_BIT_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
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
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
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
    @JsonProperty("appointmentRequired")
    public final Builder appointmentRequired(Optional<Boolean> appointmentRequired) {
      checkNotIsSet(appointmentRequiredIsSet(), "appointmentRequired");
      this.appointmentRequired = appointmentRequired.orElse(null);
      optBits |= OPT_BIT_APPOINTMENT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialty(List<CodeableConcept> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = Objects.requireNonNull(specialty, "specialty");
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialty")
    public final Builder specialty(Optional<? extends List<CodeableConcept>> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = specialty.orElse(null);
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverageArea(List<Reference> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = Objects.requireNonNull(coverageArea, "coverageArea");
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverageArea")
    public final Builder coverageArea(Optional<? extends List<Reference>> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = coverageArea.orElse(null);
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Builds a new {@link HealthcareService HealthcareService}.
     * @return An immutable instance of HealthcareService
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public HealthcareService build() {
      checkRequiredAttributes();
      return new ImmutableHealthcareService(
          meta,
          type,
          characteristic,
          communication,
          referralMethod,
          text,
          endpoint,
          implicitRules,
          category,
          notAvailable,
          modifierExtension,
          name,
          program,
          extension,
          availabilityExceptions,
          active,
          photo,
          id,
          language,
          providedBy,
          identifier,
          location,
          telecom,
          resourceType,
          availableTime,
          comment,
          extraDetails,
          serviceProvisionCode,
          eligibility,
          contained,
          appointmentRequired,
          specialty,
          coverageArea);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean characteristicIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTIC) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean referralMethodIsSet() {
      return (optBits & OPT_BIT_REFERRAL_METHOD) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean notAvailableIsSet() {
      return (optBits & OPT_BIT_NOT_AVAILABLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean programIsSet() {
      return (optBits & OPT_BIT_PROGRAM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean availabilityExceptionsIsSet() {
      return (optBits & OPT_BIT_AVAILABILITY_EXCEPTIONS) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean providedByIsSet() {
      return (optBits & OPT_BIT_PROVIDED_BY) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean availableTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_TIME) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean extraDetailsIsSet() {
      return (optBits & OPT_BIT_EXTRA_DETAILS) != 0;
    }

    private boolean serviceProvisionCodeIsSet() {
      return (optBits & OPT_BIT_SERVICE_PROVISION_CODE) != 0;
    }

    private boolean eligibilityIsSet() {
      return (optBits & OPT_BIT_ELIGIBILITY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean appointmentRequiredIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT_REQUIRED) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean coverageAreaIsSet() {
      return (optBits & OPT_BIT_COVERAGE_AREA) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of HealthcareService is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build HealthcareService, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "HealthcareService", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link HealthcareService#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "HealthcareService", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link HealthcareService#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link HealthcareService#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<CodeableConcept> type);

    /**
     * Initializes the optional value {@link HealthcareService#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<CodeableConcept>> type);

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal characteristic(List<CodeableConcept> characteristic);

    /**
     * Initializes the optional value {@link HealthcareService#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal characteristic(Optional<? extends List<CodeableConcept>> characteristic);

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(List<CodeableConcept> communication);

    /**
     * Initializes the optional value {@link HealthcareService#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(Optional<? extends List<CodeableConcept>> communication);

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referralMethod(List<CodeableConcept> referralMethod);

    /**
     * Initializes the optional value {@link HealthcareService#referralMethod() referralMethod} to referralMethod.
     * @param referralMethod The value for referralMethod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referralMethod(Optional<? extends List<CodeableConcept>> referralMethod);

    /**
     * Initializes the optional value {@link HealthcareService#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link HealthcareService#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link HealthcareService#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link HealthcareService#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link HealthcareService#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal notAvailable(List<HealthcareService_NotAvailable> notAvailable);

    /**
     * Initializes the optional value {@link HealthcareService#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal notAvailable(Optional<? extends List<HealthcareService_NotAvailable>> notAvailable);

    /**
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link HealthcareService#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link HealthcareService#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link HealthcareService#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for chained invocation
     */
    BuildFinal program(List<CodeableConcept> program);

    /**
     * Initializes the optional value {@link HealthcareService#program() program} to program.
     * @param program The value for program
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal program(Optional<? extends List<CodeableConcept>> program);

    /**
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link HealthcareService#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availabilityExceptions(String availabilityExceptions);

    /**
     * Initializes the optional value {@link HealthcareService#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availabilityExceptions(Optional<String> availabilityExceptions);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(Attachment photo);

    /**
     * Initializes the optional value {@link HealthcareService#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(Optional<? extends Attachment> photo);

    /**
     * Initializes the optional value {@link HealthcareService#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link HealthcareService#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link HealthcareService#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link HealthcareService#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal providedBy(Reference providedBy);

    /**
     * Initializes the optional value {@link HealthcareService#providedBy() providedBy} to providedBy.
     * @param providedBy The value for providedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal providedBy(Optional<? extends Reference> providedBy);

    /**
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link HealthcareService#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link HealthcareService#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(List<Reference> location);

    /**
     * Initializes the optional value {@link HealthcareService#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends List<Reference>> location);

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link HealthcareService#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availableTime(List<HealthcareService_AvailableTime> availableTime);

    /**
     * Initializes the optional value {@link HealthcareService#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availableTime(Optional<? extends List<HealthcareService_AvailableTime>> availableTime);

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link HealthcareService#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extraDetails(Markdown extraDetails);

    /**
     * Initializes the optional value {@link HealthcareService#extraDetails() extraDetails} to extraDetails.
     * @param extraDetails The value for extraDetails
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extraDetails(Optional<? extends Markdown> extraDetails);

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceProvisionCode(List<CodeableConcept> serviceProvisionCode);

    /**
     * Initializes the optional value {@link HealthcareService#serviceProvisionCode() serviceProvisionCode} to serviceProvisionCode.
     * @param serviceProvisionCode The value for serviceProvisionCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceProvisionCode(Optional<? extends List<CodeableConcept>> serviceProvisionCode);

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eligibility(List<HealthcareService_Eligibility> eligibility);

    /**
     * Initializes the optional value {@link HealthcareService#eligibility() eligibility} to eligibility.
     * @param eligibility The value for eligibility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eligibility(Optional<? extends List<HealthcareService_Eligibility>> eligibility);

    /**
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link HealthcareService#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

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
    BuildFinal appointmentRequired(Optional<Boolean> appointmentRequired);

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(List<CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link HealthcareService#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(Optional<? extends List<CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverageArea(List<Reference> coverageArea);

    /**
     * Initializes the optional value {@link HealthcareService#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverageArea(Optional<? extends List<Reference>> coverageArea);

    /**
     * Builds a new {@link HealthcareService HealthcareService}.
     * @return An immutable instance of HealthcareService
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    HealthcareService build();
  }
}
