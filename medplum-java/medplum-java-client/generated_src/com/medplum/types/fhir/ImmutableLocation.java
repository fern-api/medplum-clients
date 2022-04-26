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
 * Immutable implementation of {@link Location}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation.builder()}.
 */
@Generated(from = "Location", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLocation implements Location {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference partOf;
  private final @Nullable List<Location_HoursOfOperation> hoursOfOperation;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable Reference managingOrganization;
  private final @Nullable String availabilityExceptions;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept physicalType;
  private final @Nullable String name;
  private final @Nullable Id id;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable Address address;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Coding operationalStatus;
  private final @Nullable Code language;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable List<String> alias;
  private final @Nullable String description;
  private final @Nullable LocationMode mode;
  private final String resourceType;
  private final @Nullable Location_Position position;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable LocationStatus status;
  private final @Nullable Narrative text;

  private ImmutableLocation(
      @Nullable List<ResourceList> contained,
      @Nullable Reference partOf,
      @Nullable List<Location_HoursOfOperation> hoursOfOperation,
      @Nullable List<CodeableConcept> type,
      @Nullable Reference managingOrganization,
      @Nullable String availabilityExceptions,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept physicalType,
      @Nullable String name,
      @Nullable Id id,
      @Nullable List<Reference> endpoint,
      @Nullable Address address,
      @Nullable List<Identifier> identifier,
      @Nullable Coding operationalStatus,
      @Nullable Code language,
      @Nullable List<ContactPoint> telecom,
      @Nullable List<String> alias,
      @Nullable String description,
      @Nullable LocationMode mode,
      String resourceType,
      @Nullable Location_Position position,
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable LocationStatus status,
      @Nullable Narrative text) {
    this.contained = contained;
    this.partOf = partOf;
    this.hoursOfOperation = hoursOfOperation;
    this.type = type;
    this.managingOrganization = managingOrganization;
    this.availabilityExceptions = availabilityExceptions;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.physicalType = physicalType;
    this.name = name;
    this.id = id;
    this.endpoint = endpoint;
    this.address = address;
    this.identifier = identifier;
    this.operationalStatus = operationalStatus;
    this.language = language;
    this.telecom = telecom;
    this.alias = alias;
    this.description = description;
    this.mode = mode;
    this.resourceType = resourceType;
    this.position = position;
    this.meta = meta;
    this.extension = extension;
    this.status = status;
    this.text = text;
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
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<Reference> partOf() {
    return Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code hoursOfOperation} attribute
   */
  @JsonProperty("hoursOfOperation")
  @Override
  public Optional<List<Location_HoursOfOperation>> hoursOfOperation() {
    return Optional.ofNullable(hoursOfOperation);
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
   * @return The value of the {@code managingOrganization} attribute
   */
  @JsonProperty("managingOrganization")
  @Override
  public Optional<Reference> managingOrganization() {
    return Optional.ofNullable(managingOrganization);
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
   * @return The value of the {@code physicalType} attribute
   */
  @JsonProperty("physicalType")
  @Override
  public Optional<CodeableConcept> physicalType() {
    return Optional.ofNullable(physicalType);
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<Address> address() {
    return Optional.ofNullable(address);
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
   * @return The value of the {@code operationalStatus} attribute
   */
  @JsonProperty("operationalStatus")
  @Override
  public Optional<Coding> operationalStatus() {
    return Optional.ofNullable(operationalStatus);
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
   * @return The value of the {@code alias} attribute
   */
  @JsonProperty("alias")
  @Override
  public Optional<List<String>> alias() {
    return Optional.ofNullable(alias);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<LocationMode> mode() {
    return Optional.ofNullable(mode);
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
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public Optional<Location_Position> position() {
    return Optional.ofNullable(position);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<LocationStatus> status() {
    return Optional.ofNullable(status);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableLocation(
        newValue,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableLocation(
        value,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withPartOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        newValue,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withPartOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableLocation(
        this.contained,
        value,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#hoursOfOperation() hoursOfOperation} attribute.
   * @param value The value for hoursOfOperation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withHoursOfOperation(List<Location_HoursOfOperation> value) {
    @Nullable List<Location_HoursOfOperation> newValue = Objects.requireNonNull(value, "hoursOfOperation");
    if (this.hoursOfOperation == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        newValue,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#hoursOfOperation() hoursOfOperation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hoursOfOperation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withHoursOfOperation(Optional<? extends List<Location_HoursOfOperation>> optional) {
    @Nullable List<Location_HoursOfOperation> value = optional.orElse(null);
    if (this.hoursOfOperation == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        value,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        newValue,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        value,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withManagingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        newValue,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withManagingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        value,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#availabilityExceptions() availabilityExceptions} attribute.
   * @param value The value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAvailabilityExceptions(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "availabilityExceptions");
    if (Objects.equals(this.availabilityExceptions, newValue)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#availabilityExceptions() availabilityExceptions} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availabilityExceptions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAvailabilityExceptions(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.availabilityExceptions, value)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        newValue,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        value,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        newValue,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        value,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#physicalType() physicalType} attribute.
   * @param value The value for physicalType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withPhysicalType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "physicalType");
    if (this.physicalType == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#physicalType() physicalType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withPhysicalType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.physicalType == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        newValue,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        value,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        newValue,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        value,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        newValue,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        value,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        newValue,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        value,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        newValue,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        value,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#operationalStatus() operationalStatus} attribute.
   * @param value The value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withOperationalStatus(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "operationalStatus");
    if (this.operationalStatus == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        newValue,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#operationalStatus() operationalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withOperationalStatus(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.operationalStatus == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        value,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        newValue,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        value,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        newValue,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        value,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withAlias(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        newValue,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withAlias(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        value,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        newValue,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        value,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withMode(LocationMode value) {
    @Nullable LocationMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        newValue,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withMode(Optional<? extends LocationMode> optional) {
    @Nullable LocationMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        value,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Location#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLocation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        newValue,
        this.position,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#position() position} attribute.
   * @param value The value for position
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withPosition(Location_Position value) {
    @Nullable Location_Position newValue = Objects.requireNonNull(value, "position");
    if (this.position == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        newValue,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#position() position} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for position
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withPosition(Optional<? extends Location_Position> optional) {
    @Nullable Location_Position value = optional.orElse(null);
    if (this.position == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        value,
        this.meta,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        newValue,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        value,
        this.extension,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        newValue,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        value,
        this.status,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withStatus(LocationStatus value) {
    @Nullable LocationStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withStatus(Optional<? extends LocationStatus> optional) {
    @Nullable LocationStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableLocation(
        this.contained,
        this.partOf,
        this.hoursOfOperation,
        this.type,
        this.managingOrganization,
        this.availabilityExceptions,
        this.implicitRules,
        this.modifierExtension,
        this.physicalType,
        this.name,
        this.id,
        this.endpoint,
        this.address,
        this.identifier,
        this.operationalStatus,
        this.language,
        this.telecom,
        this.alias,
        this.description,
        this.mode,
        this.resourceType,
        this.position,
        this.meta,
        this.extension,
        this.status,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation
        && equalTo((ImmutableLocation) another);
  }

  private boolean equalTo(ImmutableLocation another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(hoursOfOperation, another.hoursOfOperation)
        && Objects.equals(type, another.type)
        && Objects.equals(managingOrganization, another.managingOrganization)
        && Objects.equals(availabilityExceptions, another.availabilityExceptions)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(physicalType, another.physicalType)
        && Objects.equals(name, another.name)
        && Objects.equals(id, another.id)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(address, another.address)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(operationalStatus, another.operationalStatus)
        && Objects.equals(language, another.language)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(alias, another.alias)
        && Objects.equals(description, another.description)
        && Objects.equals(mode, another.mode)
        && resourceType.equals(another.resourceType)
        && Objects.equals(position, another.position)
        && Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(status, another.status)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code partOf}, {@code hoursOfOperation}, {@code type}, {@code managingOrganization}, {@code availabilityExceptions}, {@code implicitRules}, {@code modifierExtension}, {@code physicalType}, {@code name}, {@code id}, {@code endpoint}, {@code address}, {@code identifier}, {@code operationalStatus}, {@code language}, {@code telecom}, {@code alias}, {@code description}, {@code mode}, {@code resourceType}, {@code position}, {@code meta}, {@code extension}, {@code status}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(hoursOfOperation);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(managingOrganization);
    h += (h << 5) + Objects.hashCode(availabilityExceptions);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(physicalType);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(operationalStatus);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(alias);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(position);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code Location} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Location{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (partOf != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (hoursOfOperation != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("hoursOfOperation=").append(hoursOfOperation);
    }
    if (type != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (managingOrganization != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (availabilityExceptions != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("availabilityExceptions=").append(availabilityExceptions);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (physicalType != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("physicalType=").append(physicalType);
    }
    if (name != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (endpoint != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (address != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (identifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (operationalStatus != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("operationalStatus=").append(operationalStatus);
    }
    if (language != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (telecom != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (alias != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (description != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (mode != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (position != null) {
      builder.append(", ");
      builder.append("position=").append(position);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
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
  @Generated(from = "Location", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Location {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Location_HoursOfOperation>> hoursOfOperation = Optional.empty();
    boolean hoursOfOperationIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> managingOrganization = Optional.empty();
    boolean managingOrganizationIsSet;
    @Nullable Optional<String> availabilityExceptions = Optional.empty();
    boolean availabilityExceptionsIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> physicalType = Optional.empty();
    boolean physicalTypeIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Address> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Coding> operationalStatus = Optional.empty();
    boolean operationalStatusIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<List<String>> alias = Optional.empty();
    boolean aliasIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<LocationMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Location_Position> position = Optional.empty();
    boolean positionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<LocationStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("hoursOfOperation")
    public void setHoursOfOperation(Optional<List<Location_HoursOfOperation>> hoursOfOperation) {
      this.hoursOfOperation = hoursOfOperation;
      this.hoursOfOperationIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Optional<Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @JsonProperty("availabilityExceptions")
    public void setAvailabilityExceptions(Optional<String> availabilityExceptions) {
      this.availabilityExceptions = availabilityExceptions;
      this.availabilityExceptionsIsSet = true;
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
    @JsonProperty("physicalType")
    public void setPhysicalType(Optional<CodeableConcept> physicalType) {
      this.physicalType = physicalType;
      this.physicalTypeIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
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
    @JsonProperty("address")
    public void setAddress(Optional<Address> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("operationalStatus")
    public void setOperationalStatus(Optional<Coding> operationalStatus) {
      this.operationalStatus = operationalStatus;
      this.operationalStatusIsSet = true;
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
    @JsonProperty("alias")
    public void setAlias(Optional<List<String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<LocationMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("position")
    public void setPosition(Optional<Location_Position> position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<LocationStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Location_HoursOfOperation>> hoursOfOperation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> availabilityExceptions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> physicalType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> address() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> operationalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocationMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Location_Position> position() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocationStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLocation fromJson(Json json) {
    ImmutableLocation.Builder builder = ((ImmutableLocation.Builder) ImmutableLocation.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.hoursOfOperationIsSet) {
      builder.hoursOfOperation(json.hoursOfOperation);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.availabilityExceptionsIsSet) {
      builder.availabilityExceptions(json.availabilityExceptions);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.physicalTypeIsSet) {
      builder.physicalType(json.physicalType);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.operationalStatusIsSet) {
      builder.operationalStatus(json.operationalStatus);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.textIsSet) {
      builder.text(json.text);
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
        .contained(instance.contained())
        .partOf(instance.partOf())
        .hoursOfOperation(instance.hoursOfOperation())
        .type(instance.type())
        .managingOrganization(instance.managingOrganization())
        .availabilityExceptions(instance.availabilityExceptions())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .physicalType(instance.physicalType())
        .name(instance.name())
        .id(instance.id())
        .endpoint(instance.endpoint())
        .address(instance.address())
        .identifier(instance.identifier())
        .operationalStatus(instance.operationalStatus())
        .language(instance.language())
        .telecom(instance.telecom())
        .alias(instance.alias())
        .description(instance.description())
        .mode(instance.mode())
        .resourceType(instance.resourceType())
        .position(instance.position())
        .meta(instance.meta())
        .extension(instance.extension())
        .status(instance.status())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link Location Location}.
   * <pre>
   * ImmutableLocation.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Location#contained() contained}
   *    .partOf(com.medplum.types.fhir.Reference) // optional {@link Location#partOf() partOf}
   *    .hoursOfOperation(List&amp;lt;com.medplum.types.fhir.Location_HoursOfOperation&amp;gt;) // optional {@link Location#hoursOfOperation() hoursOfOperation}
   *    .type(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Location#type() type}
   *    .managingOrganization(com.medplum.types.fhir.Reference) // optional {@link Location#managingOrganization() managingOrganization}
   *    .availabilityExceptions(String) // optional {@link Location#availabilityExceptions() availabilityExceptions}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Location#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Location#modifierExtension() modifierExtension}
   *    .physicalType(com.medplum.types.fhir.CodeableConcept) // optional {@link Location#physicalType() physicalType}
   *    .name(String) // optional {@link Location#name() name}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Location#id() id}
   *    .endpoint(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Location#endpoint() endpoint}
   *    .address(com.medplum.types.fhir.Address) // optional {@link Location#address() address}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Location#identifier() identifier}
   *    .operationalStatus(com.medplum.types.fhir.Coding) // optional {@link Location#operationalStatus() operationalStatus}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Location#language() language}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Location#telecom() telecom}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link Location#alias() alias}
   *    .description(String) // optional {@link Location#description() description}
   *    .mode(com.medplum.types.fhir.LocationMode) // optional {@link Location#mode() mode}
   *    .resourceType(String) // required {@link Location#resourceType() resourceType}
   *    .position(com.medplum.types.fhir.Location_Position) // optional {@link Location#position() position}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Location#meta() meta}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Location#extension() extension}
   *    .status(com.medplum.types.fhir.LocationStatus) // optional {@link Location#status() status}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Location#text() text}
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
  @Generated(from = "Location", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_PART_OF = 0x2L;
    private static final long OPT_BIT_HOURS_OF_OPERATION = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x10L;
    private static final long OPT_BIT_AVAILABILITY_EXCEPTIONS = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_PHYSICAL_TYPE = 0x100L;
    private static final long OPT_BIT_NAME = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_ENDPOINT = 0x800L;
    private static final long OPT_BIT_ADDRESS = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_OPERATIONAL_STATUS = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_TELECOM = 0x10000L;
    private static final long OPT_BIT_ALIAS = 0x20000L;
    private static final long OPT_BIT_DESCRIPTION = 0x40000L;
    private static final long OPT_BIT_MODE = 0x80000L;
    private static final long OPT_BIT_POSITION = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_EXTENSION = 0x400000L;
    private static final long OPT_BIT_STATUS = 0x800000L;
    private static final long OPT_BIT_TEXT = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable Reference partOf;
    private @Nullable List<Location_HoursOfOperation> hoursOfOperation;
    private @Nullable List<CodeableConcept> type;
    private @Nullable Reference managingOrganization;
    private @Nullable String availabilityExceptions;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept physicalType;
    private @Nullable String name;
    private @Nullable Id id;
    private @Nullable List<Reference> endpoint;
    private @Nullable Address address;
    private @Nullable List<Identifier> identifier;
    private @Nullable Coding operationalStatus;
    private @Nullable Code language;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable List<String> alias;
    private @Nullable String description;
    private @Nullable LocationMode mode;
    private @Nullable String resourceType;
    private @Nullable Location_Position position;
    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable LocationStatus status;
    private @Nullable Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Location#contained() contained} to contained.
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
     * Initializes the optional value {@link Location#contained() contained} to contained.
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
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for chained invocation
     */
    public final Builder hoursOfOperation(List<Location_HoursOfOperation> hoursOfOperation) {
      checkNotIsSet(hoursOfOperationIsSet(), "hoursOfOperation");
      this.hoursOfOperation = Objects.requireNonNull(hoursOfOperation, "hoursOfOperation");
      optBits |= OPT_BIT_HOURS_OF_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hoursOfOperation")
    public final Builder hoursOfOperation(Optional<? extends List<Location_HoursOfOperation>> hoursOfOperation) {
      checkNotIsSet(hoursOfOperationIsSet(), "hoursOfOperation");
      this.hoursOfOperation = hoursOfOperation.orElse(null);
      optBits |= OPT_BIT_HOURS_OF_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#type() type} to type.
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
     * Initializes the optional value {@link Location#type() type} to type.
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
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingOrganization(Reference managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = Objects.requireNonNull(managingOrganization, "managingOrganization");
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("managingOrganization")
    public final Builder managingOrganization(Optional<? extends Reference> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = managingOrganization.orElse(null);
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
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
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for chained invocation
     */
    public final Builder physicalType(CodeableConcept physicalType) {
      checkNotIsSet(physicalTypeIsSet(), "physicalType");
      this.physicalType = Objects.requireNonNull(physicalType, "physicalType");
      optBits |= OPT_BIT_PHYSICAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("physicalType")
    public final Builder physicalType(Optional<? extends CodeableConcept> physicalType) {
      checkNotIsSet(physicalTypeIsSet(), "physicalType");
      this.physicalType = physicalType.orElse(null);
      optBits |= OPT_BIT_PHYSICAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#name() name} to name.
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
     * Initializes the optional value {@link Location#name() name} to name.
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
     * Initializes the optional value {@link Location#id() id} to id.
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
     * Initializes the optional value {@link Location#id() id} to id.
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
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(Address address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("address")
    public final Builder address(Optional<? extends Address> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder operationalStatus(Coding operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = Objects.requireNonNull(operationalStatus, "operationalStatus");
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operationalStatus")
    public final Builder operationalStatus(Optional<? extends Coding> operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = operationalStatus.orElse(null);
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#language() language} to language.
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
     * Initializes the optional value {@link Location#language() language} to language.
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
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(List<String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alias")
    public final Builder alias(Optional<? extends List<String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(LocationMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends LocationMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the value for the {@link Location#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for chained invocation
     */
    public final Builder position(Location_Position position) {
      checkNotIsSet(positionIsSet(), "position");
      this.position = Objects.requireNonNull(position, "position");
      optBits |= OPT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(Optional<? extends Location_Position> position) {
      checkNotIsSet(positionIsSet(), "position");
      this.position = position.orElse(null);
      optBits |= OPT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#meta() meta} to meta.
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
     * Initializes the optional value {@link Location#meta() meta} to meta.
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
     * Initializes the optional value {@link Location#extension() extension} to extension.
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
     * Initializes the optional value {@link Location#extension() extension} to extension.
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
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(LocationStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends LocationStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Location#text() text} to text.
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
     * Initializes the optional value {@link Location#text() text} to text.
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
     * Builds a new {@link Location Location}.
     * @return An immutable instance of Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Location build() {
      checkRequiredAttributes();
      return new ImmutableLocation(
          contained,
          partOf,
          hoursOfOperation,
          type,
          managingOrganization,
          availabilityExceptions,
          implicitRules,
          modifierExtension,
          physicalType,
          name,
          id,
          endpoint,
          address,
          identifier,
          operationalStatus,
          language,
          telecom,
          alias,
          description,
          mode,
          resourceType,
          position,
          meta,
          extension,
          status,
          text);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean hoursOfOperationIsSet() {
      return (optBits & OPT_BIT_HOURS_OF_OPERATION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean availabilityExceptionsIsSet() {
      return (optBits & OPT_BIT_AVAILABILITY_EXCEPTIONS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean physicalTypeIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean operationalStatusIsSet() {
      return (optBits & OPT_BIT_OPERATIONAL_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean positionIsSet() {
      return (optBits & OPT_BIT_POSITION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Location is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Location, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Location", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Location#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Location", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Location#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Location#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(Reference partOf);

    /**
     * Initializes the optional value {@link Location#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends Reference> partOf);

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hoursOfOperation(List<Location_HoursOfOperation> hoursOfOperation);

    /**
     * Initializes the optional value {@link Location#hoursOfOperation() hoursOfOperation} to hoursOfOperation.
     * @param hoursOfOperation The value for hoursOfOperation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hoursOfOperation(Optional<? extends List<Location_HoursOfOperation>> hoursOfOperation);

    /**
     * Initializes the optional value {@link Location#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<CodeableConcept> type);

    /**
     * Initializes the optional value {@link Location#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(Reference managingOrganization);

    /**
     * Initializes the optional value {@link Location#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(Optional<? extends Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal availabilityExceptions(String availabilityExceptions);

    /**
     * Initializes the optional value {@link Location#availabilityExceptions() availabilityExceptions} to availabilityExceptions.
     * @param availabilityExceptions The value for availabilityExceptions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal availabilityExceptions(Optional<String> availabilityExceptions);

    /**
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Location#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Location#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalType(CodeableConcept physicalType);

    /**
     * Initializes the optional value {@link Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalType(Optional<? extends CodeableConcept> physicalType);

    /**
     * Initializes the optional value {@link Location#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Location#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Location#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Location#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link Location#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(Address address);

    /**
     * Initializes the optional value {@link Location#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends Address> address);

    /**
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Location#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal operationalStatus(Coding operationalStatus);

    /**
     * Initializes the optional value {@link Location#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operationalStatus(Optional<? extends Coding> operationalStatus);

    /**
     * Initializes the optional value {@link Location#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Location#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Location#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(List<String> alias);

    /**
     * Initializes the optional value {@link Location#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(Optional<? extends List<String>> alias);

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Location#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(LocationMode mode);

    /**
     * Initializes the optional value {@link Location#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(Optional<? extends LocationMode> mode);

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for chained invocation
     */
    BuildFinal position(Location_Position position);

    /**
     * Initializes the optional value {@link Location#position() position} to position.
     * @param position The value for position
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal position(Optional<? extends Location_Position> position);

    /**
     * Initializes the optional value {@link Location#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Location#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Location#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Location#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(LocationStatus status);

    /**
     * Initializes the optional value {@link Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends LocationStatus> status);

    /**
     * Initializes the optional value {@link Location#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Location#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Builds a new {@link Location Location}.
     * @return An immutable instance of Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Location build();
  }
}
