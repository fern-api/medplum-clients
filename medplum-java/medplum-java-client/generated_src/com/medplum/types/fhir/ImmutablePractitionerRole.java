package com.medplum.types.fhir;

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
 * Immutable implementation of {@link PractitionerRole}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePractitionerRole.builder()}.
 */
@Generated(from = "PractitionerRole", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePractitionerRole implements PractitionerRole {
  private final @Nullable List<CodeableConcept> specialty;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable Reference practitioner;
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final @Nullable Meta meta;
  private final @Nullable Period period;
  private final @Nullable Reference organization;
  private final @Nullable List<PractitionerRole_NotAvailable> notAvailable;
  private final @Nullable String availabilityExceptions;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable Code language;
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable List<Reference> location;
  private final @Nullable List<Reference> healthcareService;
  private final @Nullable List<PractitionerRole_AvailableTime> availableTime;
  private final @Nullable Boolean active;

  private ImmutablePractitionerRole(
      @Nullable List<CodeableConcept> specialty,
      @Nullable List<ContactPoint> telecom,
      @Nullable Reference practitioner,
      String resourceType,
      @Nullable Uri implicitRules,
      @Nullable Meta meta,
      @Nullable Period period,
      @Nullable Reference organization,
      @Nullable List<PractitionerRole_NotAvailable> notAvailable,
      @Nullable String availabilityExceptions,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Id id,
      @Nullable List<Reference> endpoint,
      @Nullable Code language,
      @Nullable List<CodeableConcept> code,
      @Nullable List<Reference> location,
      @Nullable List<Reference> healthcareService,
      @Nullable List<PractitionerRole_AvailableTime> availableTime,
      @Nullable Boolean active) {
    this.specialty = specialty;
    this.telecom = telecom;
    this.practitioner = practitioner;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.period = period;
    this.organization = organization;
    this.notAvailable = notAvailable;
    this.availabilityExceptions = availabilityExceptions;
    this.contained = contained;
    this.identifier = identifier;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.endpoint = endpoint;
    this.language = language;
    this.code = code;
    this.location = location;
    this.healthcareService = healthcareService;
    this.availableTime = availableTime;
    this.active = active;
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
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
  }

  /**
   * @return The value of the {@code practitioner} attribute
   */
  @JsonProperty("practitioner")
  @Override
  public Optional<Reference> practitioner() {
    return Optional.ofNullable(practitioner);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public Optional<Reference> organization() {
    return Optional.ofNullable(organization);
  }

  /**
   * @return The value of the {@code notAvailable} attribute
   */
  @JsonProperty("notAvailable")
  @Override
  public Optional<List<PractitionerRole_NotAvailable>> notAvailable() {
    return Optional.ofNullable(notAvailable);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<Reference>> endpoint() {
    return Optional.ofNullable(endpoint);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<CodeableConcept>> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code healthcareService} attribute
   */
  @JsonProperty("healthcareService")
  @Override
  public Optional<List<Reference>> healthcareService() {
    return Optional.ofNullable(healthcareService);
  }

  /**
   * @return The value of the {@code availableTime} attribute
   */
  @JsonProperty("availableTime")
  @Override
  public Optional<List<PractitionerRole_AvailableTime>> availableTime() {
    return Optional.ofNullable(availableTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withSpecialty(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutablePractitionerRole(
        newValue,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withSpecialty(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutablePractitionerRole(
        value,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        newValue,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        value,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#practitioner() practitioner} attribute.
   * @param value The value for practitioner
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withPractitioner(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "practitioner");
    if (this.practitioner == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#practitioner() practitioner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for practitioner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withPractitioner(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.practitioner == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        value,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PractitionerRole#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePractitionerRole withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        newValue,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        newValue,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        value,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        value,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        newValue,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        value,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        newValue,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        value,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#notAvailable() notAvailable} attribute.
   * @param value The value for notAvailable
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withNotAvailable(List<PractitionerRole_NotAvailable> value) {
    @Nullable List<PractitionerRole_NotAvailable> newValue = Objects.requireNonNull(value, "notAvailable");
    if (this.notAvailable == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        newValue,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#notAvailable() notAvailable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for notAvailable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withNotAvailable(Optional<? extends List<PractitionerRole_NotAvailable>> optional) {
    @Nullable List<PractitionerRole_NotAvailable> value = optional.orElse(null);
    if (this.notAvailable == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        value,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#availabilityExceptions() availabilityExceptions} attribute.
   * @param value The value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withAvailabilityExceptions(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "availabilityExceptions");
    if (Objects.equals(this.availabilityExceptions, newValue)) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        newValue,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#availabilityExceptions() availabilityExceptions} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withAvailabilityExceptions(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.availabilityExceptions, value)) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        value,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        newValue,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        value,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        newValue,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        value,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        value,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        newValue,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        value,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        newValue,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        value,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        newValue,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        value,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        value,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        newValue,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        value,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        newValue,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        value,
        this.location,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withLocation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        newValue,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withLocation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        value,
        this.healthcareService,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#healthcareService() healthcareService} attribute.
   * @param value The value for healthcareService
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withHealthcareService(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "healthcareService");
    if (this.healthcareService == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        newValue,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#healthcareService() healthcareService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for healthcareService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withHealthcareService(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.healthcareService == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        value,
        this.availableTime,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#availableTime() availableTime} attribute.
   * @param value The value for availableTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withAvailableTime(List<PractitionerRole_AvailableTime> value) {
    @Nullable List<PractitionerRole_AvailableTime> newValue = Objects.requireNonNull(value, "availableTime");
    if (this.availableTime == newValue) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        newValue,
        this.active);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#availableTime() availableTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole withAvailableTime(Optional<? extends List<PractitionerRole_AvailableTime>> optional) {
    @Nullable List<PractitionerRole_AvailableTime> value = optional.orElse(null);
    if (this.availableTime == value) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        value,
        this.active);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutablePractitionerRole(
        this.specialty,
        this.telecom,
        this.practitioner,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.period,
        this.organization,
        this.notAvailable,
        this.availabilityExceptions,
        this.contained,
        this.identifier,
        this.text,
        this.modifierExtension,
        this.extension,
        this.id,
        this.endpoint,
        this.language,
        this.code,
        this.location,
        this.healthcareService,
        this.availableTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePractitionerRole} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePractitionerRole
        && equalTo((ImmutablePractitionerRole) another);
  }

  private boolean equalTo(ImmutablePractitionerRole another) {
    return Objects.equals(specialty, another.specialty)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(practitioner, another.practitioner)
        && resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(meta, another.meta)
        && Objects.equals(period, another.period)
        && Objects.equals(organization, another.organization)
        && Objects.equals(notAvailable, another.notAvailable)
        && Objects.equals(availabilityExceptions, another.availabilityExceptions)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(language, another.language)
        && Objects.equals(code, another.code)
        && Objects.equals(location, another.location)
        && Objects.equals(healthcareService, another.healthcareService)
        && Objects.equals(availableTime, another.availableTime)
        && Objects.equals(active, another.active);
  }

  /**
   * Computes a hash code from attributes: {@code specialty}, {@code telecom}, {@code practitioner}, {@code resourceType}, {@code implicitRules}, {@code meta}, {@code period}, {@code organization}, {@code notAvailable}, {@code availabilityExceptions}, {@code contained}, {@code identifier}, {@code text}, {@code modifierExtension}, {@code extension}, {@code id}, {@code endpoint}, {@code language}, {@code code}, {@code location}, {@code healthcareService}, {@code availableTime}, {@code active}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(specialty);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(practitioner);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(organization);
    h += (h << 5) + Objects.hashCode(notAvailable);
    h += (h << 5) + Objects.hashCode(availabilityExceptions);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(healthcareService);
    h += (h << 5) + Objects.hashCode(availableTime);
    h += (h << 5) + Objects.hashCode(active);
    return h;
  }

  /**
   * Prints the immutable value {@code PractitionerRole} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PractitionerRole{");
    if (specialty != null) {
      builder.append("specialty=").append(specialty);
    }
    if (telecom != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (practitioner != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("practitioner=").append(practitioner);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (organization != null) {
      builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (notAvailable != null) {
      builder.append(", ");
      builder.append("notAvailable=").append(notAvailable);
    }
    if (availabilityExceptions != null) {
      builder.append(", ");
      builder.append("availabilityExceptions=").append(availabilityExceptions);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (healthcareService != null) {
      builder.append(", ");
      builder.append("healthcareService=").append(healthcareService);
    }
    if (availableTime != null) {
      builder.append(", ");
      builder.append("availableTime=").append(availableTime);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PractitionerRole", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PractitionerRole {
    @Nullable Optional<List<CodeableConcept>> specialty = Optional.empty();
    boolean specialtyIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<Reference> practitioner = Optional.empty();
    boolean practitionerIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Reference> organization = Optional.empty();
    boolean organizationIsSet;
    @Nullable Optional<List<PractitionerRole_NotAvailable>> notAvailable = Optional.empty();
    boolean notAvailableIsSet;
    @Nullable Optional<String> availabilityExceptions = Optional.empty();
    boolean availabilityExceptionsIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Reference>> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<List<Reference>> healthcareService = Optional.empty();
    boolean healthcareServiceIsSet;
    @Nullable Optional<List<PractitionerRole_AvailableTime>> availableTime = Optional.empty();
    boolean availableTimeIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @JsonProperty("specialty")
    public void setSpecialty(Optional<List<CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("practitioner")
    public void setPractitioner(Optional<Reference> practitioner) {
      this.practitioner = practitioner;
      this.practitionerIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("organization")
    public void setOrganization(Optional<Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @JsonProperty("notAvailable")
    public void setNotAvailable(Optional<List<PractitionerRole_NotAvailable>> notAvailable) {
      this.notAvailable = notAvailable;
      this.notAvailableIsSet = true;
    }
    @JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(Optional<String> availabilityExceptions) {
      this.availabilityExceptions = availabilityExceptions;
      this.availabilityExceptionsIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<List<Reference>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("healthcareService")
    public void setHealthcareService(Optional<List<Reference>> healthcareService) {
      this.healthcareService = healthcareService;
      this.healthcareServiceIsSet = true;
    }
    @JsonProperty("availableTime")
    public void setAvailableTime(Optional<List<PractitionerRole_AvailableTime>> availableTime) {
      this.availableTime = availableTime;
      this.availableTimeIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> practitioner() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PractitionerRole_NotAvailable>> notAvailable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> availabilityExceptions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> healthcareService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PractitionerRole_AvailableTime>> availableTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePractitionerRole fromJson(Json json) {
    ImmutablePractitionerRole.Builder builder = ((ImmutablePractitionerRole.Builder) ImmutablePractitionerRole.builder());
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.practitionerIsSet) {
      builder.practitioner(json.practitioner);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.notAvailableIsSet) {
      builder.notAvailable(json.notAvailable);
    }
    if (json.availabilityExceptionsIsSet) {
      builder.availabilityExceptions(json.availabilityExceptions);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.healthcareServiceIsSet) {
      builder.healthcareService(json.healthcareService);
    }
    if (json.availableTimeIsSet) {
      builder.availableTime(json.availableTime);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
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
        .specialty(instance.specialty())
        .telecom(instance.telecom())
        .practitioner(instance.practitioner())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .period(instance.period())
        .organization(instance.organization())
        .notAvailable(instance.notAvailable())
        .availabilityExceptions(instance.availabilityExceptions())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .endpoint(instance.endpoint())
        .language(instance.language())
        .code(instance.code())
        .location(instance.location())
        .healthcareService(instance.healthcareService())
        .availableTime(instance.availableTime())
        .active(instance.active())
        .build();
  }

  /**
   * Creates a builder for {@link PractitionerRole PractitionerRole}.
   * <pre>
   * ImmutablePractitionerRole.builder()
   *    .specialty(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PractitionerRole#specialty() specialty}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link PractitionerRole#telecom() telecom}
   *    .practitioner(com.medplum.types.fhir.Reference) // optional {@link PractitionerRole#practitioner() practitioner}
   *    .resourceType(String) // required {@link PractitionerRole#resourceType() resourceType}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link PractitionerRole#implicitRules() implicitRules}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link PractitionerRole#meta() meta}
   *    .period(com.medplum.types.fhir.Period) // optional {@link PractitionerRole#period() period}
   *    .organization(com.medplum.types.fhir.Reference) // optional {@link PractitionerRole#organization() organization}
   *    .notAvailable(List&amp;lt;com.medplum.types.fhir.PractitionerRole_NotAvailable&amp;gt;) // optional {@link PractitionerRole#notAvailable() notAvailable}
   *    .availabilityExceptions(String) // optional {@link PractitionerRole#availabilityExceptions() availabilityExceptions}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link PractitionerRole#contained() contained}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link PractitionerRole#identifier() identifier}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link PractitionerRole#text() text}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PractitionerRole#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PractitionerRole#extension() extension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link PractitionerRole#id() id}
   *    .endpoint(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link PractitionerRole#endpoint() endpoint}
   *    .language(com.medplum.types.fhir.Code) // optional {@link PractitionerRole#language() language}
   *    .code(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PractitionerRole#code() code}
   *    .location(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link PractitionerRole#location() location}
   *    .healthcareService(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link PractitionerRole#healthcareService() healthcareService}
   *    .availableTime(List&amp;lt;com.medplum.types.fhir.PractitionerRole_AvailableTime&amp;gt;) // optional {@link PractitionerRole#availableTime() availableTime}
   *    .active(Boolean) // optional {@link PractitionerRole#active() active}
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
  @Generated(from = "PractitionerRole", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SPECIALTY = 0x1L;
    private static final long OPT_BIT_TELECOM = 0x2L;
    private static final long OPT_BIT_PRACTITIONER = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_PERIOD = 0x20L;
    private static final long OPT_BIT_ORGANIZATION = 0x40L;
    private static final long OPT_BIT_NOT_AVAILABLE = 0x80L;
    private static final long OPT_BIT_AVAILABILITY_EXCEPTIONS = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_ENDPOINT = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_CODE = 0x20000L;
    private static final long OPT_BIT_LOCATION = 0x40000L;
    private static final long OPT_BIT_HEALTHCARE_SERVICE = 0x80000L;
    private static final long OPT_BIT_AVAILABLE_TIME = 0x100000L;
    private static final long OPT_BIT_ACTIVE = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<CodeableConcept> specialty;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable Reference practitioner;
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable Meta meta;
    private @Nullable Period period;
    private @Nullable Reference organization;
    private @Nullable List<PractitionerRole_NotAvailable> notAvailable;
    private @Nullable String availabilityExceptions;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;
    private @Nullable List<Reference> endpoint;
    private @Nullable Code language;
    private @Nullable List<CodeableConcept> code;
    private @Nullable List<Reference> location;
    private @Nullable List<Reference> healthcareService;
    private @Nullable List<PractitionerRole_AvailableTime> availableTime;
    private @Nullable Boolean active;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for chained invocation
     */
    public final Builder practitioner(Reference practitioner) {
      checkNotIsSet(practitionerIsSet(), "practitioner");
      this.practitioner = Objects.requireNonNull(practitioner, "practitioner");
      optBits |= OPT_BIT_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("practitioner")
    public final Builder practitioner(Optional<? extends Reference> practitioner) {
      checkNotIsSet(practitionerIsSet(), "practitioner");
      this.practitioner = practitioner.orElse(null);
      optBits |= OPT_BIT_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the value for the {@link PractitionerRole#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
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
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
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
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    public final Builder organization(Reference organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = Objects.requireNonNull(organization, "organization");
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organization")
    public final Builder organization(Optional<? extends Reference> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = organization.orElse(null);
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    public final Builder notAvailable(List<PractitionerRole_NotAvailable> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = Objects.requireNonNull(notAvailable, "notAvailable");
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("notAvailable")
    public final Builder notAvailable(Optional<? extends List<PractitionerRole_NotAvailable>> notAvailable) {
      checkNotIsSet(notAvailableIsSet(), "notAvailable");
      this.notAvailable = notAvailable.orElse(null);
      optBits |= OPT_BIT_NOT_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
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
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
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
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
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
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
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
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
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
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
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
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<CodeableConcept>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
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
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
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
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for chained invocation
     */
    public final Builder healthcareService(List<Reference> healthcareService) {
      checkNotIsSet(healthcareServiceIsSet(), "healthcareService");
      this.healthcareService = Objects.requireNonNull(healthcareService, "healthcareService");
      optBits |= OPT_BIT_HEALTHCARE_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("healthcareService")
    public final Builder healthcareService(Optional<? extends List<Reference>> healthcareService) {
      checkNotIsSet(healthcareServiceIsSet(), "healthcareService");
      this.healthcareService = healthcareService.orElse(null);
      optBits |= OPT_BIT_HEALTHCARE_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableTime(List<PractitionerRole_AvailableTime> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = Objects.requireNonNull(availableTime, "availableTime");
      optBits |= OPT_BIT_AVAILABLE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("availableTime")
    public final Builder availableTime(Optional<? extends List<PractitionerRole_AvailableTime>> availableTime) {
      checkNotIsSet(availableTimeIsSet(), "availableTime");
      this.availableTime = availableTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_TIME;
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Builds a new {@link PractitionerRole PractitionerRole}.
     * @return An immutable instance of PractitionerRole
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PractitionerRole build() {
      checkRequiredAttributes();
      return new ImmutablePractitionerRole(
          specialty,
          telecom,
          practitioner,
          resourceType,
          implicitRules,
          meta,
          period,
          organization,
          notAvailable,
          availabilityExceptions,
          contained,
          identifier,
          text,
          modifierExtension,
          extension,
          id,
          endpoint,
          language,
          code,
          location,
          healthcareService,
          availableTime,
          active);
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean practitionerIsSet() {
      return (optBits & OPT_BIT_PRACTITIONER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean notAvailableIsSet() {
      return (optBits & OPT_BIT_NOT_AVAILABLE) != 0;
    }

    private boolean availabilityExceptionsIsSet() {
      return (optBits & OPT_BIT_AVAILABILITY_EXCEPTIONS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean healthcareServiceIsSet() {
      return (optBits & OPT_BIT_HEALTHCARE_SERVICE) != 0;
    }

    private boolean availableTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_TIME) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PractitionerRole is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build PractitionerRole, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PractitionerRole", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PractitionerRole#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "PractitionerRole", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(List<CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link PractitionerRole#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(Optional<? extends List<CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link PractitionerRole#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal practitioner(Reference practitioner);

    /**
     * Initializes the optional value {@link PractitionerRole#practitioner() practitioner} to practitioner.
     * @param practitioner The value for practitioner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal practitioner(Optional<? extends Reference> practitioner);

    /**
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link PractitionerRole#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link PractitionerRole#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link PractitionerRole#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(Reference organization);

    /**
     * Initializes the optional value {@link PractitionerRole#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(Optional<? extends Reference> organization);

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal notAvailable(List<PractitionerRole_NotAvailable> notAvailable);

    /**
     * Initializes the optional value {@link PractitionerRole#notAvailable() notAvailable} to notAvailable.
     * @param notAvailable The value for notAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal notAvailable(Optional<? extends List<PractitionerRole_NotAvailable>> notAvailable);

    /**
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availabilityExceptions(String availabilityExceptions);

    /**
     * Initializes the optional value {@link PractitionerRole#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availabilityExceptions(Optional<String> availabilityExceptions);

    /**
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link PractitionerRole#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link PractitionerRole#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link PractitionerRole#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PractitionerRole#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link PractitionerRole#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link PractitionerRole#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link PractitionerRole#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link PractitionerRole#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(List<CodeableConcept> code);

    /**
     * Initializes the optional value {@link PractitionerRole#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends List<CodeableConcept>> code);

    /**
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(List<Reference> location);

    /**
     * Initializes the optional value {@link PractitionerRole#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends List<Reference>> location);

    /**
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for chained invocation
     */
    BuildFinal healthcareService(List<Reference> healthcareService);

    /**
     * Initializes the optional value {@link PractitionerRole#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal healthcareService(Optional<? extends List<Reference>> healthcareService);

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availableTime(List<PractitionerRole_AvailableTime> availableTime);

    /**
     * Initializes the optional value {@link PractitionerRole#availableTime() availableTime} to availableTime.
     * @param availableTime The value for availableTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availableTime(Optional<? extends List<PractitionerRole_AvailableTime>> availableTime);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Builds a new {@link PractitionerRole PractitionerRole}.
     * @return An immutable instance of PractitionerRole
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PractitionerRole build();
  }
}
