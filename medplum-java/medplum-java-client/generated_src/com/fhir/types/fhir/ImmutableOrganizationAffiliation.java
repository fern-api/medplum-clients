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
 * Immutable implementation of {@link OrganizationAffiliation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganizationAffiliation.builder()}.
 */
@Generated(from = "OrganizationAffiliation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOrganizationAffiliation implements OrganizationAffiliation {
  private final @Nullable List<Reference> location;
  private final @Nullable List<Reference> network;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference organization;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable List<Identifier> identifier;
  private final String resourceType;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period period;
  private final @Nullable Boolean active;
  private final @Nullable Reference participatingOrganization;
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable List<Reference> healthcareService;
  private final @Nullable List<CodeableConcept> specialty;

  private ImmutableOrganizationAffiliation(
      @Nullable List<Reference> location,
      @Nullable List<Reference> network,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable Reference organization,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable List<ContactPoint> telecom,
      @Nullable List<Identifier> identifier,
      String resourceType,
      @Nullable Narrative text,
      @Nullable List<Reference> endpoint,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period period,
      @Nullable Boolean active,
      @Nullable Reference participatingOrganization,
      @Nullable List<CodeableConcept> code,
      @Nullable List<Reference> healthcareService,
      @Nullable List<CodeableConcept> specialty) {
    this.location = location;
    this.network = network;
    this.meta = meta;
    this.contained = contained;
    this.extension = extension;
    this.organization = organization;
    this.id = id;
    this.language = language;
    this.telecom = telecom;
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.text = text;
    this.endpoint = endpoint;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.period = period;
    this.active = active;
    this.participatingOrganization = participatingOrganization;
    this.code = code;
    this.healthcareService = healthcareService;
    this.specialty = specialty;
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
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<List<Reference>> network() {
    return Optional.ofNullable(network);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public Optional<Reference> organization() {
    return Optional.ofNullable(organization);
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
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code participatingOrganization} attribute
   */
  @JsonProperty("participatingOrganization")
  @Override
  public Optional<Reference> participatingOrganization() {
    return Optional.ofNullable(participatingOrganization);
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
   * @return The value of the {@code healthcareService} attribute
   */
  @JsonProperty("healthcareService")
  @Override
  public Optional<List<Reference>> healthcareService() {
    return Optional.ofNullable(healthcareService);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withLocation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        newValue,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withLocation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableOrganizationAffiliation(
        value,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withNetwork(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        newValue,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withNetwork(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        value,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        newValue,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        value,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        newValue,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        value,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        newValue,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        value,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        newValue,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        value,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        newValue,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        value,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        newValue,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        value,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        newValue,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        value,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        newValue,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        value,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrganizationAffiliation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganizationAffiliation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        newValue,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        newValue,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        value,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        newValue,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        value,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        newValue,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        value,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        newValue,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        value,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} attribute.
   * @param value The value for participatingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withParticipatingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "participatingOrganization");
    if (this.participatingOrganization == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        newValue,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participatingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withParticipatingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.participatingOrganization == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        value,
        this.code,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        newValue,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        value,
        this.healthcareService,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#healthcareService() healthcareService} attribute.
   * @param value The value for healthcareService
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withHealthcareService(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "healthcareService");
    if (this.healthcareService == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        newValue,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#healthcareService() healthcareService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for healthcareService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withHealthcareService(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.healthcareService == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        value,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganizationAffiliation#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganizationAffiliation withSpecialty(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganizationAffiliation#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganizationAffiliation withSpecialty(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableOrganizationAffiliation(
        this.location,
        this.network,
        this.meta,
        this.contained,
        this.extension,
        this.organization,
        this.id,
        this.language,
        this.telecom,
        this.identifier,
        this.resourceType,
        this.text,
        this.endpoint,
        this.implicitRules,
        this.modifierExtension,
        this.period,
        this.active,
        this.participatingOrganization,
        this.code,
        this.healthcareService,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganizationAffiliation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganizationAffiliation
        && equalTo((ImmutableOrganizationAffiliation) another);
  }

  private boolean equalTo(ImmutableOrganizationAffiliation another) {
    return Objects.equals(location, another.location)
        && Objects.equals(network, another.network)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(organization, another.organization)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(text, another.text)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(period, another.period)
        && Objects.equals(active, another.active)
        && Objects.equals(participatingOrganization, another.participatingOrganization)
        && Objects.equals(code, another.code)
        && Objects.equals(healthcareService, another.healthcareService)
        && Objects.equals(specialty, another.specialty);
  }

  /**
   * Computes a hash code from attributes: {@code location}, {@code network}, {@code meta}, {@code contained}, {@code extension}, {@code organization}, {@code id}, {@code language}, {@code telecom}, {@code identifier}, {@code resourceType}, {@code text}, {@code endpoint}, {@code implicitRules}, {@code modifierExtension}, {@code period}, {@code active}, {@code participatingOrganization}, {@code code}, {@code healthcareService}, {@code specialty}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(organization);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(participatingOrganization);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(healthcareService);
    h += (h << 5) + Objects.hashCode(specialty);
    return h;
  }

  /**
   * Prints the immutable value {@code OrganizationAffiliation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OrganizationAffiliation{");
    if (location != null) {
      builder.append("location=").append(location);
    }
    if (network != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (meta != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (organization != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (telecom != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (identifier != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (participatingOrganization != null) {
      builder.append(", ");
      builder.append("participatingOrganization=").append(participatingOrganization);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (healthcareService != null) {
      builder.append(", ");
      builder.append("healthcareService=").append(healthcareService);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OrganizationAffiliation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OrganizationAffiliation {
    @Nullable Optional<List<Reference>> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<List<Reference>> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> organization = Optional.empty();
    boolean organizationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Reference> participatingOrganization = Optional.empty();
    boolean participatingOrganizationIsSet;
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Reference>> healthcareService = Optional.empty();
    boolean healthcareServiceIsSet;
    @Nullable Optional<List<CodeableConcept>> specialty = Optional.empty();
    boolean specialtyIsSet;
    @JsonProperty("location")
    public void setLocation(Optional<List<Reference>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<List<Reference>> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("organization")
    public void setOrganization(Optional<Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
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
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("participatingOrganization")
    public void setParticipatingOrganization(Optional<Reference> participatingOrganization) {
      this.participatingOrganization = participatingOrganization;
      this.participatingOrganizationIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("healthcareService")
    public void setHealthcareService(Optional<List<Reference>> healthcareService) {
      this.healthcareService = healthcareService;
      this.healthcareServiceIsSet = true;
    }
    @JsonProperty("specialty")
    public void setSpecialty(Optional<List<CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @Override
    public Optional<List<Reference>> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> network() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> participatingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> healthcareService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOrganizationAffiliation fromJson(Json json) {
    ImmutableOrganizationAffiliation.Builder builder = ((ImmutableOrganizationAffiliation.Builder) ImmutableOrganizationAffiliation.builder());
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.participatingOrganizationIsSet) {
      builder.participatingOrganization(json.participatingOrganization);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.healthcareServiceIsSet) {
      builder.healthcareService(json.healthcareService);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
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
        .location(instance.location())
        .network(instance.network())
        .meta(instance.meta())
        .contained(instance.contained())
        .extension(instance.extension())
        .organization(instance.organization())
        .id(instance.id())
        .language(instance.language())
        .telecom(instance.telecom())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .endpoint(instance.endpoint())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .active(instance.active())
        .participatingOrganization(instance.participatingOrganization())
        .code(instance.code())
        .healthcareService(instance.healthcareService())
        .specialty(instance.specialty())
        .build();
  }

  /**
   * Creates a builder for {@link OrganizationAffiliation OrganizationAffiliation}.
   * <pre>
   * ImmutableOrganizationAffiliation.builder()
   *    .location(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#location() location}
   *    .network(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#network() network}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link OrganizationAffiliation#meta() meta}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link OrganizationAffiliation#contained() contained}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link OrganizationAffiliation#extension() extension}
   *    .organization(com.fhir.types.fhir.Reference) // optional {@link OrganizationAffiliation#organization() organization}
   *    .id(com.fhir.types.fhir.Id) // optional {@link OrganizationAffiliation#id() id}
   *    .language(com.fhir.types.fhir.Code) // optional {@link OrganizationAffiliation#language() language}
   *    .telecom(List&amp;lt;com.fhir.types.fhir.ContactPoint&amp;gt;) // optional {@link OrganizationAffiliation#telecom() telecom}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link OrganizationAffiliation#identifier() identifier}
   *    .resourceType(String) // required {@link OrganizationAffiliation#resourceType() resourceType}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link OrganizationAffiliation#text() text}
   *    .endpoint(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#endpoint() endpoint}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link OrganizationAffiliation#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link OrganizationAffiliation#modifierExtension() modifierExtension}
   *    .period(com.fhir.types.fhir.Period) // optional {@link OrganizationAffiliation#period() period}
   *    .active(Boolean) // optional {@link OrganizationAffiliation#active() active}
   *    .participatingOrganization(com.fhir.types.fhir.Reference) // optional {@link OrganizationAffiliation#participatingOrganization() participatingOrganization}
   *    .code(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link OrganizationAffiliation#code() code}
   *    .healthcareService(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link OrganizationAffiliation#healthcareService() healthcareService}
   *    .specialty(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link OrganizationAffiliation#specialty() specialty}
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
  @Generated(from = "OrganizationAffiliation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LOCATION = 0x1L;
    private static final long OPT_BIT_NETWORK = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ORGANIZATION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_TELECOM = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_ENDPOINT = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_PERIOD = 0x4000L;
    private static final long OPT_BIT_ACTIVE = 0x8000L;
    private static final long OPT_BIT_PARTICIPATING_ORGANIZATION = 0x10000L;
    private static final long OPT_BIT_CODE = 0x20000L;
    private static final long OPT_BIT_HEALTHCARE_SERVICE = 0x40000L;
    private static final long OPT_BIT_SPECIALTY = 0x80000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Reference> location;
    private @Nullable List<Reference> network;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable Reference organization;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable List<Identifier> identifier;
    private @Nullable String resourceType;
    private @Nullable Narrative text;
    private @Nullable List<Reference> endpoint;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period period;
    private @Nullable Boolean active;
    private @Nullable Reference participatingOrganization;
    private @Nullable List<CodeableConcept> code;
    private @Nullable List<Reference> healthcareService;
    private @Nullable List<CodeableConcept> specialty;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
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
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
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
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(List<Reference> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends List<Reference>> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
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
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
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
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
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
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
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
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
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
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
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
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
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
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
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
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
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
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
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
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
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
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
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
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link OrganizationAffiliation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
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
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
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
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
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
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder participatingOrganization(Reference participatingOrganization) {
      checkNotIsSet(participatingOrganizationIsSet(), "participatingOrganization");
      this.participatingOrganization = Objects.requireNonNull(participatingOrganization, "participatingOrganization");
      optBits |= OPT_BIT_PARTICIPATING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participatingOrganization")
    public final Builder participatingOrganization(Optional<? extends Reference> participatingOrganization) {
      checkNotIsSet(participatingOrganizationIsSet(), "participatingOrganization");
      this.participatingOrganization = participatingOrganization.orElse(null);
      optBits |= OPT_BIT_PARTICIPATING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
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
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
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
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
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
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
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
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
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
     * Builds a new {@link OrganizationAffiliation OrganizationAffiliation}.
     * @return An immutable instance of OrganizationAffiliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OrganizationAffiliation build() {
      checkRequiredAttributes();
      return new ImmutableOrganizationAffiliation(
          location,
          network,
          meta,
          contained,
          extension,
          organization,
          id,
          language,
          telecom,
          identifier,
          resourceType,
          text,
          endpoint,
          implicitRules,
          modifierExtension,
          period,
          active,
          participatingOrganization,
          code,
          healthcareService,
          specialty);
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
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

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean participatingOrganizationIsSet() {
      return (optBits & OPT_BIT_PARTICIPATING_ORGANIZATION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean healthcareServiceIsSet() {
      return (optBits & OPT_BIT_HEALTHCARE_SERVICE) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OrganizationAffiliation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build OrganizationAffiliation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "OrganizationAffiliation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link OrganizationAffiliation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "OrganizationAffiliation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(List<Reference> location);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends List<Reference>> location);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(List<Reference> network);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(Optional<? extends List<Reference>> network);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(Reference organization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(Optional<? extends Reference> organization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participatingOrganization(Reference participatingOrganization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#participatingOrganization() participatingOrganization} to participatingOrganization.
     * @param participatingOrganization The value for participatingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participatingOrganization(Optional<? extends Reference> participatingOrganization);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(List<CodeableConcept> code);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends List<CodeableConcept>> code);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for chained invocation
     */
    BuildFinal healthcareService(List<Reference> healthcareService);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#healthcareService() healthcareService} to healthcareService.
     * @param healthcareService The value for healthcareService
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal healthcareService(Optional<? extends List<Reference>> healthcareService);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(List<CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link OrganizationAffiliation#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(Optional<? extends List<CodeableConcept>> specialty);

    /**
     * Builds a new {@link OrganizationAffiliation OrganizationAffiliation}.
     * @return An immutable instance of OrganizationAffiliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OrganizationAffiliation build();
  }
}
