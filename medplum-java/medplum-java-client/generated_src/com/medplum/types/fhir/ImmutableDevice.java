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
 * Immutable implementation of {@link Device}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDevice.builder()}.
 */
@Generated(from = "Device", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDevice implements Device {
  private final @Nullable List<Device_DeviceName> deviceName;
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable Reference location;
  private final @Nullable Reference definition;
  private final @Nullable String lotNumber;
  private final String resourceType;
  private final @Nullable Narrative text;
  private final @Nullable String manufacturer;
  private final @Nullable Uri url;
  private final @Nullable DeviceStatus status;
  private final @Nullable String serialNumber;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String partNumber;
  private final @Nullable Reference parent;
  private final @Nullable List<Device_Property> property;
  private final @Nullable String modelNumber;
  private final @Nullable List<Device_UdiCarrier> udiCarrier;
  private final @Nullable List<CodeableConcept> statusReason;
  private final @Nullable CodeableConcept type;
  private final @Nullable String distinctIdentifier;
  private final @Nullable Uri implicitRules;
  private final @Nullable DateTime expirationDate;
  private final @Nullable Reference owner;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ContactPoint> contact;
  private final @Nullable Reference patient;
  private final @Nullable List<CodeableConcept> safety;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Device_Specialization> specialization;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DateTime manufactureDate;
  private final @Nullable List<Device_Version> version;

  private ImmutableDevice(
      @Nullable List<Device_DeviceName> deviceName,
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable Reference location,
      @Nullable Reference definition,
      @Nullable String lotNumber,
      String resourceType,
      @Nullable Narrative text,
      @Nullable String manufacturer,
      @Nullable Uri url,
      @Nullable DeviceStatus status,
      @Nullable String serialNumber,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String partNumber,
      @Nullable Reference parent,
      @Nullable List<Device_Property> property,
      @Nullable String modelNumber,
      @Nullable List<Device_UdiCarrier> udiCarrier,
      @Nullable List<CodeableConcept> statusReason,
      @Nullable CodeableConcept type,
      @Nullable String distinctIdentifier,
      @Nullable Uri implicitRules,
      @Nullable DateTime expirationDate,
      @Nullable Reference owner,
      @Nullable List<Identifier> identifier,
      @Nullable List<ContactPoint> contact,
      @Nullable Reference patient,
      @Nullable List<CodeableConcept> safety,
      @Nullable List<Annotation> note,
      @Nullable List<Extension> extension,
      @Nullable List<Device_Specialization> specialization,
      @Nullable List<ResourceList> contained,
      @Nullable DateTime manufactureDate,
      @Nullable List<Device_Version> version) {
    this.deviceName = deviceName;
    this.language = language;
    this.meta = meta;
    this.location = location;
    this.definition = definition;
    this.lotNumber = lotNumber;
    this.resourceType = resourceType;
    this.text = text;
    this.manufacturer = manufacturer;
    this.url = url;
    this.status = status;
    this.serialNumber = serialNumber;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.partNumber = partNumber;
    this.parent = parent;
    this.property = property;
    this.modelNumber = modelNumber;
    this.udiCarrier = udiCarrier;
    this.statusReason = statusReason;
    this.type = type;
    this.distinctIdentifier = distinctIdentifier;
    this.implicitRules = implicitRules;
    this.expirationDate = expirationDate;
    this.owner = owner;
    this.identifier = identifier;
    this.contact = contact;
    this.patient = patient;
    this.safety = safety;
    this.note = note;
    this.extension = extension;
    this.specialization = specialization;
    this.contained = contained;
    this.manufactureDate = manufactureDate;
    this.version = version;
  }

  /**
   * @return The value of the {@code deviceName} attribute
   */
  @JsonProperty("deviceName")
  @Override
  public Optional<List<Device_DeviceName>> deviceName() {
    return Optional.ofNullable(deviceName);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<Reference> definition() {
    return Optional.ofNullable(definition);
  }

  /**
   * @return The value of the {@code lotNumber} attribute
   */
  @JsonProperty("lotNumber")
  @Override
  public Optional<String> lotNumber() {
    return Optional.ofNullable(lotNumber);
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
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<String> manufacturer() {
    return Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<DeviceStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code serialNumber} attribute
   */
  @JsonProperty("serialNumber")
  @Override
  public Optional<String> serialNumber() {
    return Optional.ofNullable(serialNumber);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code partNumber} attribute
   */
  @JsonProperty("partNumber")
  @Override
  public Optional<String> partNumber() {
    return Optional.ofNullable(partNumber);
  }

  /**
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<Reference> parent() {
    return Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<List<Device_Property>> property() {
    return Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code modelNumber} attribute
   */
  @JsonProperty("modelNumber")
  @Override
  public Optional<String> modelNumber() {
    return Optional.ofNullable(modelNumber);
  }

  /**
   * @return The value of the {@code udiCarrier} attribute
   */
  @JsonProperty("udiCarrier")
  @Override
  public Optional<List<Device_UdiCarrier>> udiCarrier() {
    return Optional.ofNullable(udiCarrier);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<List<CodeableConcept>> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code distinctIdentifier} attribute
   */
  @JsonProperty("distinctIdentifier")
  @Override
  public Optional<String> distinctIdentifier() {
    return Optional.ofNullable(distinctIdentifier);
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
   * @return The value of the {@code expirationDate} attribute
   */
  @JsonProperty("expirationDate")
  @Override
  public Optional<DateTime> expirationDate() {
    return Optional.ofNullable(expirationDate);
  }

  /**
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public Optional<Reference> owner() {
    return Optional.ofNullable(owner);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactPoint>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Optional<Reference> patient() {
    return Optional.ofNullable(patient);
  }

  /**
   * @return The value of the {@code safety} attribute
   */
  @JsonProperty("safety")
  @Override
  public Optional<List<CodeableConcept>> safety() {
    return Optional.ofNullable(safety);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
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
   * @return The value of the {@code specialization} attribute
   */
  @JsonProperty("specialization")
  @Override
  public Optional<List<Device_Specialization>> specialization() {
    return Optional.ofNullable(specialization);
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
   * @return The value of the {@code manufactureDate} attribute
   */
  @JsonProperty("manufactureDate")
  @Override
  public Optional<DateTime> manufactureDate() {
    return Optional.ofNullable(manufactureDate);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<List<Device_Version>> version() {
    return Optional.ofNullable(version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDeviceName(List<Device_DeviceName> value) {
    @Nullable List<Device_DeviceName> newValue = Objects.requireNonNull(value, "deviceName");
    if (this.deviceName == newValue) return this;
    return new ImmutableDevice(
        newValue,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#deviceName() deviceName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withDeviceName(Optional<? extends List<Device_DeviceName>> optional) {
    @Nullable List<Device_DeviceName> value = optional.orElse(null);
    if (this.deviceName == value) return this;
    return new ImmutableDevice(
        value,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        newValue,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        value,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        newValue,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        value,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        newValue,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        value,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDefinition(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        newValue,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withDefinition(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        value,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#lotNumber() lotNumber} attribute.
   * @param value The value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLotNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "lotNumber");
    if (Objects.equals(this.lotNumber, newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        newValue,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#lotNumber() lotNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLotNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.lotNumber, value)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        value,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Device#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDevice withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        newValue,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        newValue,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        value,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withManufacturer(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "manufacturer");
    if (Objects.equals(this.manufacturer, newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        newValue,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#manufacturer() manufacturer} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withManufacturer(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.manufacturer, value)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        value,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        newValue,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        value,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withStatus(DeviceStatus value) {
    @Nullable DeviceStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        newValue,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withStatus(Optional<? extends DeviceStatus> optional) {
    @Nullable DeviceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        value,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#serialNumber() serialNumber} attribute.
   * @param value The value for serialNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSerialNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "serialNumber");
    if (Objects.equals(this.serialNumber, newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        newValue,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#serialNumber() serialNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serialNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSerialNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.serialNumber, value)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        value,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        newValue,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        value,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        newValue,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        value,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#partNumber() partNumber} attribute.
   * @param value The value for partNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withPartNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "partNumber");
    if (Objects.equals(this.partNumber, newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        newValue,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#partNumber() partNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withPartNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.partNumber, value)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        value,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withParent(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        newValue,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withParent(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        value,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withProperty(List<Device_Property> value) {
    @Nullable List<Device_Property> newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        newValue,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withProperty(Optional<? extends List<Device_Property>> optional) {
    @Nullable List<Device_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        value,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#modelNumber() modelNumber} attribute.
   * @param value The value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withModelNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "modelNumber");
    if (Objects.equals(this.modelNumber, newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        newValue,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#modelNumber() modelNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withModelNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.modelNumber, value)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        value,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#udiCarrier() udiCarrier} attribute.
   * @param value The value for udiCarrier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withUdiCarrier(List<Device_UdiCarrier> value) {
    @Nullable List<Device_UdiCarrier> newValue = Objects.requireNonNull(value, "udiCarrier");
    if (this.udiCarrier == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        newValue,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#udiCarrier() udiCarrier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udiCarrier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withUdiCarrier(Optional<? extends List<Device_UdiCarrier>> optional) {
    @Nullable List<Device_UdiCarrier> value = optional.orElse(null);
    if (this.udiCarrier == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        value,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withStatusReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        newValue,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withStatusReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        value,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        newValue,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        value,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#distinctIdentifier() distinctIdentifier} attribute.
   * @param value The value for distinctIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDistinctIdentifier(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "distinctIdentifier");
    if (Objects.equals(this.distinctIdentifier, newValue)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        newValue,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#distinctIdentifier() distinctIdentifier} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for distinctIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDistinctIdentifier(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.distinctIdentifier, value)) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        value,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        newValue,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        value,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#expirationDate() expirationDate} attribute.
   * @param value The value for expirationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withExpirationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "expirationDate");
    if (this.expirationDate == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        newValue,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#expirationDate() expirationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withExpirationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.expirationDate == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        value,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withOwner(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        newValue,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withOwner(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        value,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        newValue,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        value,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withContact(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        newValue,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withContact(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        value,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withPatient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        newValue,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withPatient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        value,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#safety() safety} attribute.
   * @param value The value for safety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSafety(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "safety");
    if (this.safety == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        newValue,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#safety() safety} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for safety
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withSafety(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.safety == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        value,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        newValue,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        value,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        newValue,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        value,
        this.specialization,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#specialization() specialization} attribute.
   * @param value The value for specialization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSpecialization(List<Device_Specialization> value) {
    @Nullable List<Device_Specialization> newValue = Objects.requireNonNull(value, "specialization");
    if (this.specialization == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        newValue,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#specialization() specialization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withSpecialization(Optional<? extends List<Device_Specialization>> optional) {
    @Nullable List<Device_Specialization> value = optional.orElse(null);
    if (this.specialization == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        value,
        this.contained,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        newValue,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        value,
        this.manufactureDate,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#manufactureDate() manufactureDate} attribute.
   * @param value The value for manufactureDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withManufactureDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "manufactureDate");
    if (this.manufactureDate == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        newValue,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#manufactureDate() manufactureDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufactureDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withManufactureDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.manufactureDate == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        value,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withVersion(List<Device_Version> value) {
    @Nullable List<Device_Version> newValue = Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withVersion(Optional<? extends List<Device_Version>> optional) {
    @Nullable List<Device_Version> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableDevice(
        this.deviceName,
        this.language,
        this.meta,
        this.location,
        this.definition,
        this.lotNumber,
        this.resourceType,
        this.text,
        this.manufacturer,
        this.url,
        this.status,
        this.serialNumber,
        this.id,
        this.modifierExtension,
        this.partNumber,
        this.parent,
        this.property,
        this.modelNumber,
        this.udiCarrier,
        this.statusReason,
        this.type,
        this.distinctIdentifier,
        this.implicitRules,
        this.expirationDate,
        this.owner,
        this.identifier,
        this.contact,
        this.patient,
        this.safety,
        this.note,
        this.extension,
        this.specialization,
        this.contained,
        this.manufactureDate,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDevice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDevice
        && equalTo((ImmutableDevice) another);
  }

  private boolean equalTo(ImmutableDevice another) {
    return Objects.equals(deviceName, another.deviceName)
        && Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(location, another.location)
        && Objects.equals(definition, another.definition)
        && Objects.equals(lotNumber, another.lotNumber)
        && resourceType.equals(another.resourceType)
        && Objects.equals(text, another.text)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(url, another.url)
        && Objects.equals(status, another.status)
        && Objects.equals(serialNumber, another.serialNumber)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(partNumber, another.partNumber)
        && Objects.equals(parent, another.parent)
        && Objects.equals(property, another.property)
        && Objects.equals(modelNumber, another.modelNumber)
        && Objects.equals(udiCarrier, another.udiCarrier)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(type, another.type)
        && Objects.equals(distinctIdentifier, another.distinctIdentifier)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(expirationDate, another.expirationDate)
        && Objects.equals(owner, another.owner)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(contact, another.contact)
        && Objects.equals(patient, another.patient)
        && Objects.equals(safety, another.safety)
        && Objects.equals(note, another.note)
        && Objects.equals(extension, another.extension)
        && Objects.equals(specialization, another.specialization)
        && Objects.equals(contained, another.contained)
        && Objects.equals(manufactureDate, another.manufactureDate)
        && Objects.equals(version, another.version);
  }

  /**
   * Computes a hash code from attributes: {@code deviceName}, {@code language}, {@code meta}, {@code location}, {@code definition}, {@code lotNumber}, {@code resourceType}, {@code text}, {@code manufacturer}, {@code url}, {@code status}, {@code serialNumber}, {@code id}, {@code modifierExtension}, {@code partNumber}, {@code parent}, {@code property}, {@code modelNumber}, {@code udiCarrier}, {@code statusReason}, {@code type}, {@code distinctIdentifier}, {@code implicitRules}, {@code expirationDate}, {@code owner}, {@code identifier}, {@code contact}, {@code patient}, {@code safety}, {@code note}, {@code extension}, {@code specialization}, {@code contained}, {@code manufactureDate}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(deviceName);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(definition);
    h += (h << 5) + Objects.hashCode(lotNumber);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(serialNumber);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(partNumber);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(modelNumber);
    h += (h << 5) + Objects.hashCode(udiCarrier);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(distinctIdentifier);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(expirationDate);
    h += (h << 5) + Objects.hashCode(owner);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(patient);
    h += (h << 5) + Objects.hashCode(safety);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(specialization);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(manufactureDate);
    h += (h << 5) + Objects.hashCode(version);
    return h;
  }

  /**
   * Prints the immutable value {@code Device} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Device{");
    if (deviceName != null) {
      builder.append("deviceName=").append(deviceName);
    }
    if (language != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (location != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (definition != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (lotNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("lotNumber=").append(lotNumber);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (serialNumber != null) {
      builder.append(", ");
      builder.append("serialNumber=").append(serialNumber);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (partNumber != null) {
      builder.append(", ");
      builder.append("partNumber=").append(partNumber);
    }
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (property != null) {
      builder.append(", ");
      builder.append("property=").append(property);
    }
    if (modelNumber != null) {
      builder.append(", ");
      builder.append("modelNumber=").append(modelNumber);
    }
    if (udiCarrier != null) {
      builder.append(", ");
      builder.append("udiCarrier=").append(udiCarrier);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (distinctIdentifier != null) {
      builder.append(", ");
      builder.append("distinctIdentifier=").append(distinctIdentifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (expirationDate != null) {
      builder.append(", ");
      builder.append("expirationDate=").append(expirationDate);
    }
    if (owner != null) {
      builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (safety != null) {
      builder.append(", ");
      builder.append("safety=").append(safety);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (specialization != null) {
      builder.append(", ");
      builder.append("specialization=").append(specialization);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (manufactureDate != null) {
      builder.append(", ");
      builder.append("manufactureDate=").append(manufactureDate);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Device", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Device {
    @Nullable Optional<List<Device_DeviceName>> deviceName = Optional.empty();
    boolean deviceNameIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<Reference> definition = Optional.empty();
    boolean definitionIsSet;
    @Nullable Optional<String> lotNumber = Optional.empty();
    boolean lotNumberIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<DeviceStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> serialNumber = Optional.empty();
    boolean serialNumberIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> partNumber = Optional.empty();
    boolean partNumberIsSet;
    @Nullable Optional<Reference> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<List<Device_Property>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<String> modelNumber = Optional.empty();
    boolean modelNumberIsSet;
    @Nullable Optional<List<Device_UdiCarrier>> udiCarrier = Optional.empty();
    boolean udiCarrierIsSet;
    @Nullable Optional<List<CodeableConcept>> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> distinctIdentifier = Optional.empty();
    boolean distinctIdentifierIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<DateTime> expirationDate = Optional.empty();
    boolean expirationDateIsSet;
    @Nullable Optional<Reference> owner = Optional.empty();
    boolean ownerIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ContactPoint>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Reference> patient = Optional.empty();
    boolean patientIsSet;
    @Nullable Optional<List<CodeableConcept>> safety = Optional.empty();
    boolean safetyIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Device_Specialization>> specialization = Optional.empty();
    boolean specializationIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DateTime> manufactureDate = Optional.empty();
    boolean manufactureDateIsSet;
    @Nullable Optional<List<Device_Version>> version = Optional.empty();
    boolean versionIsSet;
    @JsonProperty("deviceName")
    public void setDeviceName(Optional<List<Device_DeviceName>> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<Reference> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @JsonProperty("lotNumber")
    public void setLotNumber(Optional<String> lotNumber) {
      this.lotNumber = lotNumber;
      this.lotNumberIsSet = true;
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
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<String> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<DeviceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("serialNumber")
    public void setSerialNumber(Optional<String> serialNumber) {
      this.serialNumber = serialNumber;
      this.serialNumberIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("partNumber")
    public void setPartNumber(Optional<String> partNumber) {
      this.partNumber = partNumber;
      this.partNumberIsSet = true;
    }
    @JsonProperty("parent")
    public void setParent(Optional<Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<Device_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("modelNumber")
    public void setModelNumber(Optional<String> modelNumber) {
      this.modelNumber = modelNumber;
      this.modelNumberIsSet = true;
    }
    @JsonProperty("udiCarrier")
    public void setUdiCarrier(Optional<List<Device_UdiCarrier>> udiCarrier) {
      this.udiCarrier = udiCarrier;
      this.udiCarrierIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<List<CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("distinctIdentifier")
    public void setDistinctIdentifier(Optional<String> distinctIdentifier) {
      this.distinctIdentifier = distinctIdentifier;
      this.distinctIdentifierIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("expirationDate")
    public void setExpirationDate(Optional<DateTime> expirationDate) {
      this.expirationDate = expirationDate;
      this.expirationDateIsSet = true;
    }
    @JsonProperty("owner")
    public void setOwner(Optional<Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Optional<Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @JsonProperty("safety")
    public void setSafety(Optional<List<CodeableConcept>> safety) {
      this.safety = safety;
      this.safetyIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("specialization")
    public void setSpecialization(Optional<List<Device_Specialization>> specialization) {
      this.specialization = specialization;
      this.specializationIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("manufactureDate")
    public void setManufactureDate(Optional<DateTime> manufactureDate) {
      this.manufactureDate = manufactureDate;
      this.manufactureDateIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<List<Device_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @Override
    public Optional<List<Device_DeviceName>> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> definition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> lotNumber() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DeviceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> serialNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> partNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> modelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_UdiCarrier>> udiCarrier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> distinctIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> expirationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> safety() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_Specialization>> specialization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> manufactureDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_Version>> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDevice fromJson(Json json) {
    ImmutableDevice.Builder builder = ((ImmutableDevice.Builder) ImmutableDevice.builder());
    if (json.deviceNameIsSet) {
      builder.deviceName(json.deviceName);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.lotNumberIsSet) {
      builder.lotNumber(json.lotNumber);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.serialNumberIsSet) {
      builder.serialNumber(json.serialNumber);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.partNumberIsSet) {
      builder.partNumber(json.partNumber);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.modelNumberIsSet) {
      builder.modelNumber(json.modelNumber);
    }
    if (json.udiCarrierIsSet) {
      builder.udiCarrier(json.udiCarrier);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.distinctIdentifierIsSet) {
      builder.distinctIdentifier(json.distinctIdentifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.expirationDateIsSet) {
      builder.expirationDate(json.expirationDate);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.safetyIsSet) {
      builder.safety(json.safety);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.specializationIsSet) {
      builder.specialization(json.specialization);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.manufactureDateIsSet) {
      builder.manufactureDate(json.manufactureDate);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    return (ImmutableDevice) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Device} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Device instance
   */
  public static Device copyOf(Device instance) {
    if (instance instanceof ImmutableDevice) {
      return (ImmutableDevice) instance;
    }
    return ((ImmutableDevice.Builder) ImmutableDevice.builder())
        .deviceName(instance.deviceName())
        .language(instance.language())
        .meta(instance.meta())
        .location(instance.location())
        .definition(instance.definition())
        .lotNumber(instance.lotNumber())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .manufacturer(instance.manufacturer())
        .url(instance.url())
        .status(instance.status())
        .serialNumber(instance.serialNumber())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .partNumber(instance.partNumber())
        .parent(instance.parent())
        .property(instance.property())
        .modelNumber(instance.modelNumber())
        .udiCarrier(instance.udiCarrier())
        .statusReason(instance.statusReason())
        .type(instance.type())
        .distinctIdentifier(instance.distinctIdentifier())
        .implicitRules(instance.implicitRules())
        .expirationDate(instance.expirationDate())
        .owner(instance.owner())
        .identifier(instance.identifier())
        .contact(instance.contact())
        .patient(instance.patient())
        .safety(instance.safety())
        .note(instance.note())
        .extension(instance.extension())
        .specialization(instance.specialization())
        .contained(instance.contained())
        .manufactureDate(instance.manufactureDate())
        .version(instance.version())
        .build();
  }

  /**
   * Creates a builder for {@link Device Device}.
   * <pre>
   * ImmutableDevice.builder()
   *    .deviceName(List&amp;lt;com.medplum.types.fhir.Device_DeviceName&amp;gt;) // optional {@link Device#deviceName() deviceName}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Device#language() language}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Device#meta() meta}
   *    .location(com.medplum.types.fhir.Reference) // optional {@link Device#location() location}
   *    .definition(com.medplum.types.fhir.Reference) // optional {@link Device#definition() definition}
   *    .lotNumber(String) // optional {@link Device#lotNumber() lotNumber}
   *    .resourceType(String) // required {@link Device#resourceType() resourceType}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Device#text() text}
   *    .manufacturer(String) // optional {@link Device#manufacturer() manufacturer}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link Device#url() url}
   *    .status(com.medplum.types.fhir.DeviceStatus) // optional {@link Device#status() status}
   *    .serialNumber(String) // optional {@link Device#serialNumber() serialNumber}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Device#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Device#modifierExtension() modifierExtension}
   *    .partNumber(String) // optional {@link Device#partNumber() partNumber}
   *    .parent(com.medplum.types.fhir.Reference) // optional {@link Device#parent() parent}
   *    .property(List&amp;lt;com.medplum.types.fhir.Device_Property&amp;gt;) // optional {@link Device#property() property}
   *    .modelNumber(String) // optional {@link Device#modelNumber() modelNumber}
   *    .udiCarrier(List&amp;lt;com.medplum.types.fhir.Device_UdiCarrier&amp;gt;) // optional {@link Device#udiCarrier() udiCarrier}
   *    .statusReason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Device#statusReason() statusReason}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Device#type() type}
   *    .distinctIdentifier(String) // optional {@link Device#distinctIdentifier() distinctIdentifier}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Device#implicitRules() implicitRules}
   *    .expirationDate(com.medplum.types.fhir.DateTime) // optional {@link Device#expirationDate() expirationDate}
   *    .owner(com.medplum.types.fhir.Reference) // optional {@link Device#owner() owner}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Device#identifier() identifier}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Device#contact() contact}
   *    .patient(com.medplum.types.fhir.Reference) // optional {@link Device#patient() patient}
   *    .safety(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Device#safety() safety}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link Device#note() note}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Device#extension() extension}
   *    .specialization(List&amp;lt;com.medplum.types.fhir.Device_Specialization&amp;gt;) // optional {@link Device#specialization() specialization}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Device#contained() contained}
   *    .manufactureDate(com.medplum.types.fhir.DateTime) // optional {@link Device#manufactureDate() manufactureDate}
   *    .version(List&amp;lt;com.medplum.types.fhir.Device_Version&amp;gt;) // optional {@link Device#version() version}
   *    .build();
   * </pre>
   * @return A new Device builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDevice.Builder();
  }

  /**
   * Builds instances of type {@link Device Device}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Device", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DEVICE_NAME = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_LOCATION = 0x8L;
    private static final long OPT_BIT_DEFINITION = 0x10L;
    private static final long OPT_BIT_LOT_NUMBER = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_MANUFACTURER = 0x80L;
    private static final long OPT_BIT_URL = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_SERIAL_NUMBER = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_PART_NUMBER = 0x2000L;
    private static final long OPT_BIT_PARENT = 0x4000L;
    private static final long OPT_BIT_PROPERTY = 0x8000L;
    private static final long OPT_BIT_MODEL_NUMBER = 0x10000L;
    private static final long OPT_BIT_UDI_CARRIER = 0x20000L;
    private static final long OPT_BIT_STATUS_REASON = 0x40000L;
    private static final long OPT_BIT_TYPE = 0x80000L;
    private static final long OPT_BIT_DISTINCT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_EXPIRATION_DATE = 0x400000L;
    private static final long OPT_BIT_OWNER = 0x800000L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000000L;
    private static final long OPT_BIT_CONTACT = 0x2000000L;
    private static final long OPT_BIT_PATIENT = 0x4000000L;
    private static final long OPT_BIT_SAFETY = 0x8000000L;
    private static final long OPT_BIT_NOTE = 0x10000000L;
    private static final long OPT_BIT_EXTENSION = 0x20000000L;
    private static final long OPT_BIT_SPECIALIZATION = 0x40000000L;
    private static final long OPT_BIT_CONTAINED = 0x80000000L;
    private static final long OPT_BIT_MANUFACTURE_DATE = 0x100000000L;
    private static final long OPT_BIT_VERSION = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Device_DeviceName> deviceName;
    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable Reference location;
    private @Nullable Reference definition;
    private @Nullable String lotNumber;
    private @Nullable String resourceType;
    private @Nullable Narrative text;
    private @Nullable String manufacturer;
    private @Nullable Uri url;
    private @Nullable DeviceStatus status;
    private @Nullable String serialNumber;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String partNumber;
    private @Nullable Reference parent;
    private @Nullable List<Device_Property> property;
    private @Nullable String modelNumber;
    private @Nullable List<Device_UdiCarrier> udiCarrier;
    private @Nullable List<CodeableConcept> statusReason;
    private @Nullable CodeableConcept type;
    private @Nullable String distinctIdentifier;
    private @Nullable Uri implicitRules;
    private @Nullable DateTime expirationDate;
    private @Nullable Reference owner;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ContactPoint> contact;
    private @Nullable Reference patient;
    private @Nullable List<CodeableConcept> safety;
    private @Nullable List<Annotation> note;
    private @Nullable List<Extension> extension;
    private @Nullable List<Device_Specialization> specialization;
    private @Nullable List<ResourceList> contained;
    private @Nullable DateTime manufactureDate;
    private @Nullable List<Device_Version> version;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceName(List<Device_DeviceName> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = Objects.requireNonNull(deviceName, "deviceName");
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deviceName")
    public final Builder deviceName(Optional<? extends List<Device_DeviceName>> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = deviceName.orElse(null);
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#language() language} to language.
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
     * Initializes the optional value {@link Device#language() language} to language.
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
     * Initializes the optional value {@link Device#meta() meta} to meta.
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
     * Initializes the optional value {@link Device#meta() meta} to meta.
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
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(Reference definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<? extends Reference> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder lotNumber(String lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = Objects.requireNonNull(lotNumber, "lotNumber");
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lotNumber")
    public final Builder lotNumber(Optional<String> lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = lotNumber.orElse(null);
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link Device#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Device#text() text} to text.
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
     * Initializes the optional value {@link Device#text() text} to text.
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
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(String manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<String> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(DeviceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends DeviceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder serialNumber(String serialNumber) {
      checkNotIsSet(serialNumberIsSet(), "serialNumber");
      this.serialNumber = Objects.requireNonNull(serialNumber, "serialNumber");
      optBits |= OPT_BIT_SERIAL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serialNumber")
    public final Builder serialNumber(Optional<String> serialNumber) {
      checkNotIsSet(serialNumberIsSet(), "serialNumber");
      this.serialNumber = serialNumber.orElse(null);
      optBits |= OPT_BIT_SERIAL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#id() id} to id.
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
     * Initializes the optional value {@link Device#id() id} to id.
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
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder partNumber(String partNumber) {
      checkNotIsSet(partNumberIsSet(), "partNumber");
      this.partNumber = Objects.requireNonNull(partNumber, "partNumber");
      optBits |= OPT_BIT_PART_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partNumber")
    public final Builder partNumber(Optional<String> partNumber) {
      checkNotIsSet(partNumberIsSet(), "partNumber");
      this.partNumber = partNumber.orElse(null);
      optBits |= OPT_BIT_PART_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(Reference parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(Optional<? extends Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(List<Device_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends List<Device_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder modelNumber(String modelNumber) {
      checkNotIsSet(modelNumberIsSet(), "modelNumber");
      this.modelNumber = Objects.requireNonNull(modelNumber, "modelNumber");
      optBits |= OPT_BIT_MODEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modelNumber")
    public final Builder modelNumber(Optional<String> modelNumber) {
      checkNotIsSet(modelNumberIsSet(), "modelNumber");
      this.modelNumber = modelNumber.orElse(null);
      optBits |= OPT_BIT_MODEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for chained invocation
     */
    public final Builder udiCarrier(List<Device_UdiCarrier> udiCarrier) {
      checkNotIsSet(udiCarrierIsSet(), "udiCarrier");
      this.udiCarrier = Objects.requireNonNull(udiCarrier, "udiCarrier");
      optBits |= OPT_BIT_UDI_CARRIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("udiCarrier")
    public final Builder udiCarrier(Optional<? extends List<Device_UdiCarrier>> udiCarrier) {
      checkNotIsSet(udiCarrierIsSet(), "udiCarrier");
      this.udiCarrier = udiCarrier.orElse(null);
      optBits |= OPT_BIT_UDI_CARRIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(List<CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends List<CodeableConcept>> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder distinctIdentifier(String distinctIdentifier) {
      checkNotIsSet(distinctIdentifierIsSet(), "distinctIdentifier");
      this.distinctIdentifier = Objects.requireNonNull(distinctIdentifier, "distinctIdentifier");
      optBits |= OPT_BIT_DISTINCT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("distinctIdentifier")
    public final Builder distinctIdentifier(Optional<String> distinctIdentifier) {
      checkNotIsSet(distinctIdentifierIsSet(), "distinctIdentifier");
      this.distinctIdentifier = distinctIdentifier.orElse(null);
      optBits |= OPT_BIT_DISTINCT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationDate(DateTime expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = Objects.requireNonNull(expirationDate, "expirationDate");
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expirationDate")
    public final Builder expirationDate(Optional<? extends DateTime> expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = expirationDate.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    public final Builder owner(Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = Objects.requireNonNull(owner, "owner");
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owner")
    public final Builder owner(Optional<? extends Reference> owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = owner.orElse(null);
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<ContactPoint>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Optional<? extends Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for chained invocation
     */
    public final Builder safety(List<CodeableConcept> safety) {
      checkNotIsSet(safetyIsSet(), "safety");
      this.safety = Objects.requireNonNull(safety, "safety");
      optBits |= OPT_BIT_SAFETY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("safety")
    public final Builder safety(Optional<? extends List<CodeableConcept>> safety) {
      checkNotIsSet(safetyIsSet(), "safety");
      this.safety = safety.orElse(null);
      optBits |= OPT_BIT_SAFETY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#extension() extension} to extension.
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
     * Initializes the optional value {@link Device#extension() extension} to extension.
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
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialization(List<Device_Specialization> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = Objects.requireNonNull(specialization, "specialization");
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialization")
    public final Builder specialization(Optional<? extends List<Device_Specialization>> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = specialization.orElse(null);
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#contained() contained} to contained.
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
     * Initializes the optional value {@link Device#contained() contained} to contained.
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
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufactureDate(DateTime manufactureDate) {
      checkNotIsSet(manufactureDateIsSet(), "manufactureDate");
      this.manufactureDate = Objects.requireNonNull(manufactureDate, "manufactureDate");
      optBits |= OPT_BIT_MANUFACTURE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufactureDate")
    public final Builder manufactureDate(Optional<? extends DateTime> manufactureDate) {
      checkNotIsSet(manufactureDateIsSet(), "manufactureDate");
      this.manufactureDate = manufactureDate.orElse(null);
      optBits |= OPT_BIT_MANUFACTURE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(List<Device_Version> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<? extends List<Device_Version>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link Device Device}.
     * @return An immutable instance of Device
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Device build() {
      checkRequiredAttributes();
      return new ImmutableDevice(
          deviceName,
          language,
          meta,
          location,
          definition,
          lotNumber,
          resourceType,
          text,
          manufacturer,
          url,
          status,
          serialNumber,
          id,
          modifierExtension,
          partNumber,
          parent,
          property,
          modelNumber,
          udiCarrier,
          statusReason,
          type,
          distinctIdentifier,
          implicitRules,
          expirationDate,
          owner,
          identifier,
          contact,
          patient,
          safety,
          note,
          extension,
          specialization,
          contained,
          manufactureDate,
          version);
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean lotNumberIsSet() {
      return (optBits & OPT_BIT_LOT_NUMBER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean serialNumberIsSet() {
      return (optBits & OPT_BIT_SERIAL_NUMBER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean partNumberIsSet() {
      return (optBits & OPT_BIT_PART_NUMBER) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean modelNumberIsSet() {
      return (optBits & OPT_BIT_MODEL_NUMBER) != 0;
    }

    private boolean udiCarrierIsSet() {
      return (optBits & OPT_BIT_UDI_CARRIER) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean distinctIdentifierIsSet() {
      return (optBits & OPT_BIT_DISTINCT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean expirationDateIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_DATE) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean safetyIsSet() {
      return (optBits & OPT_BIT_SAFETY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean specializationIsSet() {
      return (optBits & OPT_BIT_SPECIALIZATION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean manufactureDateIsSet() {
      return (optBits & OPT_BIT_MANUFACTURE_DATE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Device is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Device, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Device", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Device#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Device", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deviceName(List<Device_DeviceName> deviceName);

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deviceName(Optional<? extends List<Device_DeviceName>> deviceName);

    /**
     * Initializes the optional value {@link Device#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Device#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Device#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Device#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(Reference definition);

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(Optional<? extends Reference> definition);

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lotNumber(String lotNumber);

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lotNumber(Optional<String> lotNumber);

    /**
     * Initializes the optional value {@link Device#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Device#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(String manufacturer);

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<String> manufacturer);

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(DeviceStatus status);

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends DeviceStatus> status);

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serialNumber(String serialNumber);

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serialNumber(Optional<String> serialNumber);

    /**
     * Initializes the optional value {@link Device#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Device#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partNumber(String partNumber);

    /**
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partNumber(Optional<String> partNumber);

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(Reference parent);

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(Optional<? extends Reference> parent);

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(List<Device_Property> property);

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(Optional<? extends List<Device_Property>> property);

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modelNumber(String modelNumber);

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modelNumber(Optional<String> modelNumber);

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udiCarrier(List<Device_UdiCarrier> udiCarrier);

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udiCarrier(Optional<? extends List<Device_UdiCarrier>> udiCarrier);

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(List<CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends List<CodeableConcept>> statusReason);

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal distinctIdentifier(String distinctIdentifier);

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal distinctIdentifier(Optional<String> distinctIdentifier);

    /**
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expirationDate(DateTime expirationDate);

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expirationDate(Optional<? extends DateTime> expirationDate);

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(Reference owner);

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(Optional<? extends Reference> owner);

    /**
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactPoint> contact);

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactPoint>> contact);

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(Reference patient);

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Optional<? extends Reference> patient);

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for chained invocation
     */
    BuildFinal safety(List<CodeableConcept> safety);

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal safety(Optional<? extends List<CodeableConcept>> safety);

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Device#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Device#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialization(List<Device_Specialization> specialization);

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialization(Optional<? extends List<Device_Specialization>> specialization);

    /**
     * Initializes the optional value {@link Device#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Device#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufactureDate(DateTime manufactureDate);

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufactureDate(Optional<? extends DateTime> manufactureDate);

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(List<Device_Version> version);

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<? extends List<Device_Version>> version);

    /**
     * Builds a new {@link Device Device}.
     * @return An immutable instance of Device
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Device build();
  }
}
