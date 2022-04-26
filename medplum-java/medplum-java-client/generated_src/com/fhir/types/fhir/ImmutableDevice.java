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
  private final @Nullable List<Device_UdiCarrier> udiCarrier;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Device_Version> version;
  private final @Nullable List<CodeableConcept> safety;
  private final @Nullable Id id;
  private final @Nullable List<Device_Property> property;
  private final @Nullable Reference owner;
  private final @Nullable Code language;
  private final @Nullable Reference parent;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference definition;
  private final @Nullable String distinctIdentifier;
  private final @Nullable String lotNumber;
  private final @Nullable List<Extension> extension;
  private final @Nullable String manufacturer;
  private final @Nullable String modelNumber;
  private final @Nullable Meta meta;
  private final @Nullable Uri url;
  private final @Nullable List<ContactPoint> contact;
  private final @Nullable Reference location;
  private final @Nullable Narrative text;
  private final @Nullable String serialNumber;
  private final @Nullable List<Device_Specialization> specialization;
  private final @Nullable String partNumber;
  private final String resourceType;
  private final @Nullable Reference patient;
  private final @Nullable DateTime manufactureDate;
  private final @Nullable DateTime expirationDate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DeviceStatus status;
  private final @Nullable List<CodeableConcept> statusReason;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Annotation> note;

  private ImmutableDevice(
      @Nullable List<Device_DeviceName> deviceName,
      @Nullable List<Device_UdiCarrier> udiCarrier,
      @Nullable CodeableConcept type,
      @Nullable List<Device_Version> version,
      @Nullable List<CodeableConcept> safety,
      @Nullable Id id,
      @Nullable List<Device_Property> property,
      @Nullable Reference owner,
      @Nullable Code language,
      @Nullable Reference parent,
      @Nullable List<ResourceList> contained,
      @Nullable Reference definition,
      @Nullable String distinctIdentifier,
      @Nullable String lotNumber,
      @Nullable List<Extension> extension,
      @Nullable String manufacturer,
      @Nullable String modelNumber,
      @Nullable Meta meta,
      @Nullable Uri url,
      @Nullable List<ContactPoint> contact,
      @Nullable Reference location,
      @Nullable Narrative text,
      @Nullable String serialNumber,
      @Nullable List<Device_Specialization> specialization,
      @Nullable String partNumber,
      String resourceType,
      @Nullable Reference patient,
      @Nullable DateTime manufactureDate,
      @Nullable DateTime expirationDate,
      @Nullable List<Extension> modifierExtension,
      @Nullable DeviceStatus status,
      @Nullable List<CodeableConcept> statusReason,
      @Nullable Uri implicitRules,
      @Nullable List<Identifier> identifier,
      @Nullable List<Annotation> note) {
    this.deviceName = deviceName;
    this.udiCarrier = udiCarrier;
    this.type = type;
    this.version = version;
    this.safety = safety;
    this.id = id;
    this.property = property;
    this.owner = owner;
    this.language = language;
    this.parent = parent;
    this.contained = contained;
    this.definition = definition;
    this.distinctIdentifier = distinctIdentifier;
    this.lotNumber = lotNumber;
    this.extension = extension;
    this.manufacturer = manufacturer;
    this.modelNumber = modelNumber;
    this.meta = meta;
    this.url = url;
    this.contact = contact;
    this.location = location;
    this.text = text;
    this.serialNumber = serialNumber;
    this.specialization = specialization;
    this.partNumber = partNumber;
    this.resourceType = resourceType;
    this.patient = patient;
    this.manufactureDate = manufactureDate;
    this.expirationDate = expirationDate;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.statusReason = statusReason;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
    this.note = note;
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
   * @return The value of the {@code udiCarrier} attribute
   */
  @JsonProperty("udiCarrier")
  @Override
  public Optional<List<Device_UdiCarrier>> udiCarrier() {
    return Optional.ofNullable(udiCarrier);
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
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<List<Device_Version>> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public Optional<Reference> owner() {
    return Optional.ofNullable(owner);
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
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<Reference> parent() {
    return Optional.ofNullable(parent);
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
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<Reference> definition() {
    return Optional.ofNullable(definition);
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
   * @return The value of the {@code lotNumber} attribute
   */
  @JsonProperty("lotNumber")
  @Override
  public Optional<String> lotNumber() {
    return Optional.ofNullable(lotNumber);
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
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<String> manufacturer() {
    return Optional.ofNullable(manufacturer);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactPoint>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code specialization} attribute
   */
  @JsonProperty("specialization")
  @Override
  public Optional<List<Device_Specialization>> specialization() {
    return Optional.ofNullable(specialization);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code manufactureDate} attribute
   */
  @JsonProperty("manufactureDate")
  @Override
  public Optional<DateTime> manufactureDate() {
    return Optional.ofNullable(manufactureDate);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<List<CodeableConcept>> statusReason() {
    return Optional.ofNullable(statusReason);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDeviceName(List<Device_DeviceName> value) {
    @Nullable List<Device_DeviceName> newValue = Objects.requireNonNull(value, "deviceName");
    if (this.deviceName == newValue) return this;
    return new ImmutableDevice(
        newValue,
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        newValue,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        value,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        newValue,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        value,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        newValue,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        value,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        newValue,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        value,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        newValue,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        value,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        newValue,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        value,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        newValue,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        value,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        newValue,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        value,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        newValue,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        value,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        newValue,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        value,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        newValue,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        value,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        newValue,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        value,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        newValue,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        value,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        newValue,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        value,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        newValue,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        value,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        newValue,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        value,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        newValue,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        value,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        newValue,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        value,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        newValue,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        value,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        newValue,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        value,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        newValue,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        value,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        newValue,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        value,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        newValue,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        value,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        newValue,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        value,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        newValue,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        newValue,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        value,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        newValue,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        value,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        newValue,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        value,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        newValue,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        value,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        newValue,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        value,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        newValue,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        value,
        this.implicitRules,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        newValue,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        value,
        this.identifier,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        newValue,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        value,
        this.note);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
        newValue);
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
        this.udiCarrier,
        this.type,
        this.version,
        this.safety,
        this.id,
        this.property,
        this.owner,
        this.language,
        this.parent,
        this.contained,
        this.definition,
        this.distinctIdentifier,
        this.lotNumber,
        this.extension,
        this.manufacturer,
        this.modelNumber,
        this.meta,
        this.url,
        this.contact,
        this.location,
        this.text,
        this.serialNumber,
        this.specialization,
        this.partNumber,
        this.resourceType,
        this.patient,
        this.manufactureDate,
        this.expirationDate,
        this.modifierExtension,
        this.status,
        this.statusReason,
        this.implicitRules,
        this.identifier,
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
        && Objects.equals(udiCarrier, another.udiCarrier)
        && Objects.equals(type, another.type)
        && Objects.equals(version, another.version)
        && Objects.equals(safety, another.safety)
        && Objects.equals(id, another.id)
        && Objects.equals(property, another.property)
        && Objects.equals(owner, another.owner)
        && Objects.equals(language, another.language)
        && Objects.equals(parent, another.parent)
        && Objects.equals(contained, another.contained)
        && Objects.equals(definition, another.definition)
        && Objects.equals(distinctIdentifier, another.distinctIdentifier)
        && Objects.equals(lotNumber, another.lotNumber)
        && Objects.equals(extension, another.extension)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(modelNumber, another.modelNumber)
        && Objects.equals(meta, another.meta)
        && Objects.equals(url, another.url)
        && Objects.equals(contact, another.contact)
        && Objects.equals(location, another.location)
        && Objects.equals(text, another.text)
        && Objects.equals(serialNumber, another.serialNumber)
        && Objects.equals(specialization, another.specialization)
        && Objects.equals(partNumber, another.partNumber)
        && resourceType.equals(another.resourceType)
        && Objects.equals(patient, another.patient)
        && Objects.equals(manufactureDate, another.manufactureDate)
        && Objects.equals(expirationDate, another.expirationDate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(note, another.note);
  }

  /**
   * Computes a hash code from attributes: {@code deviceName}, {@code udiCarrier}, {@code type}, {@code version}, {@code safety}, {@code id}, {@code property}, {@code owner}, {@code language}, {@code parent}, {@code contained}, {@code definition}, {@code distinctIdentifier}, {@code lotNumber}, {@code extension}, {@code manufacturer}, {@code modelNumber}, {@code meta}, {@code url}, {@code contact}, {@code location}, {@code text}, {@code serialNumber}, {@code specialization}, {@code partNumber}, {@code resourceType}, {@code patient}, {@code manufactureDate}, {@code expirationDate}, {@code modifierExtension}, {@code status}, {@code statusReason}, {@code implicitRules}, {@code identifier}, {@code note}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(deviceName);
    h += (h << 5) + Objects.hashCode(udiCarrier);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(safety);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(owner);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(definition);
    h += (h << 5) + Objects.hashCode(distinctIdentifier);
    h += (h << 5) + Objects.hashCode(lotNumber);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(modelNumber);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(serialNumber);
    h += (h << 5) + Objects.hashCode(specialization);
    h += (h << 5) + Objects.hashCode(partNumber);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(patient);
    h += (h << 5) + Objects.hashCode(manufactureDate);
    h += (h << 5) + Objects.hashCode(expirationDate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(note);
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
    if (udiCarrier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("udiCarrier=").append(udiCarrier);
    }
    if (type != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (version != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (safety != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("safety=").append(safety);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (property != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (owner != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (language != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (parent != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (contained != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (definition != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (distinctIdentifier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("distinctIdentifier=").append(distinctIdentifier);
    }
    if (lotNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("lotNumber=").append(lotNumber);
    }
    if (extension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (manufacturer != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (modelNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modelNumber=").append(modelNumber);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (url != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (contact != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (location != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (text != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (serialNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("serialNumber=").append(serialNumber);
    }
    if (specialization != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("specialization=").append(specialization);
    }
    if (partNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("partNumber=").append(partNumber);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (manufactureDate != null) {
      builder.append(", ");
      builder.append("manufactureDate=").append(manufactureDate);
    }
    if (expirationDate != null) {
      builder.append(", ");
      builder.append("expirationDate=").append(expirationDate);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
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
    @Nullable Optional<List<Device_UdiCarrier>> udiCarrier = Optional.empty();
    boolean udiCarrierIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Device_Version>> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<CodeableConcept>> safety = Optional.empty();
    boolean safetyIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Device_Property>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<Reference> owner = Optional.empty();
    boolean ownerIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> definition = Optional.empty();
    boolean definitionIsSet;
    @Nullable Optional<String> distinctIdentifier = Optional.empty();
    boolean distinctIdentifierIsSet;
    @Nullable Optional<String> lotNumber = Optional.empty();
    boolean lotNumberIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<String> modelNumber = Optional.empty();
    boolean modelNumberIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<ContactPoint>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> serialNumber = Optional.empty();
    boolean serialNumberIsSet;
    @Nullable Optional<List<Device_Specialization>> specialization = Optional.empty();
    boolean specializationIsSet;
    @Nullable Optional<String> partNumber = Optional.empty();
    boolean partNumberIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> patient = Optional.empty();
    boolean patientIsSet;
    @Nullable Optional<DateTime> manufactureDate = Optional.empty();
    boolean manufactureDateIsSet;
    @Nullable Optional<DateTime> expirationDate = Optional.empty();
    boolean expirationDateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DeviceStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @JsonProperty("deviceName")
    public void setDeviceName(Optional<List<Device_DeviceName>> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @JsonProperty("udiCarrier")
    public void setUdiCarrier(Optional<List<Device_UdiCarrier>> udiCarrier) {
      this.udiCarrier = udiCarrier;
      this.udiCarrierIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<List<Device_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("safety")
    public void setSafety(Optional<List<CodeableConcept>> safety) {
      this.safety = safety;
      this.safetyIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<Device_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("owner")
    public void setOwner(Optional<Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("parent")
    public void setParent(Optional<Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<Reference> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @JsonProperty("distinctIdentifier")
    public void setDistinctIdentifier(Optional<String> distinctIdentifier) {
      this.distinctIdentifier = distinctIdentifier;
      this.distinctIdentifierIsSet = true;
    }
    @JsonProperty("lotNumber")
    public void setLotNumber(Optional<String> lotNumber) {
      this.lotNumber = lotNumber;
      this.lotNumberIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<String> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("modelNumber")
    public void setModelNumber(Optional<String> modelNumber) {
      this.modelNumber = modelNumber;
      this.modelNumberIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("serialNumber")
    public void setSerialNumber(Optional<String> serialNumber) {
      this.serialNumber = serialNumber;
      this.serialNumberIsSet = true;
    }
    @JsonProperty("specialization")
    public void setSpecialization(Optional<List<Device_Specialization>> specialization) {
      this.specialization = specialization;
      this.specializationIsSet = true;
    }
    @JsonProperty("partNumber")
    public void setPartNumber(Optional<String> partNumber) {
      this.partNumber = partNumber;
      this.partNumberIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("patient")
    public void setPatient(Optional<Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @JsonProperty("manufactureDate")
    public void setManufactureDate(Optional<DateTime> manufactureDate) {
      this.manufactureDate = manufactureDate;
      this.manufactureDateIsSet = true;
    }
    @JsonProperty("expirationDate")
    public void setExpirationDate(Optional<DateTime> expirationDate) {
      this.expirationDate = expirationDate;
      this.expirationDateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<DeviceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<List<CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @Override
    public Optional<List<Device_DeviceName>> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_UdiCarrier>> udiCarrier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_Version>> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> safety() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> definition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> distinctIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> lotNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> modelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> serialNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Device_Specialization>> specialization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> partNumber() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> manufactureDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> expirationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DeviceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
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
    if (json.udiCarrierIsSet) {
      builder.udiCarrier(json.udiCarrier);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.safetyIsSet) {
      builder.safety(json.safety);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.distinctIdentifierIsSet) {
      builder.distinctIdentifier(json.distinctIdentifier);
    }
    if (json.lotNumberIsSet) {
      builder.lotNumber(json.lotNumber);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.modelNumberIsSet) {
      builder.modelNumber(json.modelNumber);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.serialNumberIsSet) {
      builder.serialNumber(json.serialNumber);
    }
    if (json.specializationIsSet) {
      builder.specialization(json.specialization);
    }
    if (json.partNumberIsSet) {
      builder.partNumber(json.partNumber);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.manufactureDateIsSet) {
      builder.manufactureDate(json.manufactureDate);
    }
    if (json.expirationDateIsSet) {
      builder.expirationDate(json.expirationDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
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
        .udiCarrier(instance.udiCarrier())
        .type(instance.type())
        .version(instance.version())
        .safety(instance.safety())
        .id(instance.id())
        .property(instance.property())
        .owner(instance.owner())
        .language(instance.language())
        .parent(instance.parent())
        .contained(instance.contained())
        .definition(instance.definition())
        .distinctIdentifier(instance.distinctIdentifier())
        .lotNumber(instance.lotNumber())
        .extension(instance.extension())
        .manufacturer(instance.manufacturer())
        .modelNumber(instance.modelNumber())
        .meta(instance.meta())
        .url(instance.url())
        .contact(instance.contact())
        .location(instance.location())
        .text(instance.text())
        .serialNumber(instance.serialNumber())
        .specialization(instance.specialization())
        .partNumber(instance.partNumber())
        .resourceType(instance.resourceType())
        .patient(instance.patient())
        .manufactureDate(instance.manufactureDate())
        .expirationDate(instance.expirationDate())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .statusReason(instance.statusReason())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .note(instance.note())
        .build();
  }

  /**
   * Creates a builder for {@link Device Device}.
   * <pre>
   * ImmutableDevice.builder()
   *    .deviceName(List&amp;lt;com.fhir.types.fhir.Device_DeviceName&amp;gt;) // optional {@link Device#deviceName() deviceName}
   *    .udiCarrier(List&amp;lt;com.fhir.types.fhir.Device_UdiCarrier&amp;gt;) // optional {@link Device#udiCarrier() udiCarrier}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Device#type() type}
   *    .version(List&amp;lt;com.fhir.types.fhir.Device_Version&amp;gt;) // optional {@link Device#version() version}
   *    .safety(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Device#safety() safety}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Device#id() id}
   *    .property(List&amp;lt;com.fhir.types.fhir.Device_Property&amp;gt;) // optional {@link Device#property() property}
   *    .owner(com.fhir.types.fhir.Reference) // optional {@link Device#owner() owner}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Device#language() language}
   *    .parent(com.fhir.types.fhir.Reference) // optional {@link Device#parent() parent}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Device#contained() contained}
   *    .definition(com.fhir.types.fhir.Reference) // optional {@link Device#definition() definition}
   *    .distinctIdentifier(String) // optional {@link Device#distinctIdentifier() distinctIdentifier}
   *    .lotNumber(String) // optional {@link Device#lotNumber() lotNumber}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Device#extension() extension}
   *    .manufacturer(String) // optional {@link Device#manufacturer() manufacturer}
   *    .modelNumber(String) // optional {@link Device#modelNumber() modelNumber}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Device#meta() meta}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link Device#url() url}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactPoint&amp;gt;) // optional {@link Device#contact() contact}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link Device#location() location}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Device#text() text}
   *    .serialNumber(String) // optional {@link Device#serialNumber() serialNumber}
   *    .specialization(List&amp;lt;com.fhir.types.fhir.Device_Specialization&amp;gt;) // optional {@link Device#specialization() specialization}
   *    .partNumber(String) // optional {@link Device#partNumber() partNumber}
   *    .resourceType(String) // required {@link Device#resourceType() resourceType}
   *    .patient(com.fhir.types.fhir.Reference) // optional {@link Device#patient() patient}
   *    .manufactureDate(com.fhir.types.fhir.DateTime) // optional {@link Device#manufactureDate() manufactureDate}
   *    .expirationDate(com.fhir.types.fhir.DateTime) // optional {@link Device#expirationDate() expirationDate}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Device#modifierExtension() modifierExtension}
   *    .status(com.fhir.types.fhir.DeviceStatus) // optional {@link Device#status() status}
   *    .statusReason(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Device#statusReason() statusReason}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Device#implicitRules() implicitRules}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Device#identifier() identifier}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Device#note() note}
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
    private static final long OPT_BIT_UDI_CARRIER = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_VERSION = 0x8L;
    private static final long OPT_BIT_SAFETY = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_PROPERTY = 0x40L;
    private static final long OPT_BIT_OWNER = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_PARENT = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_DEFINITION = 0x800L;
    private static final long OPT_BIT_DISTINCT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_LOT_NUMBER = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_MANUFACTURER = 0x8000L;
    private static final long OPT_BIT_MODEL_NUMBER = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_URL = 0x40000L;
    private static final long OPT_BIT_CONTACT = 0x80000L;
    private static final long OPT_BIT_LOCATION = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_SERIAL_NUMBER = 0x400000L;
    private static final long OPT_BIT_SPECIALIZATION = 0x800000L;
    private static final long OPT_BIT_PART_NUMBER = 0x1000000L;
    private static final long OPT_BIT_PATIENT = 0x2000000L;
    private static final long OPT_BIT_MANUFACTURE_DATE = 0x4000000L;
    private static final long OPT_BIT_EXPIRATION_DATE = 0x8000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_STATUS = 0x20000000L;
    private static final long OPT_BIT_STATUS_REASON = 0x40000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000000L;
    private static final long OPT_BIT_NOTE = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Device_DeviceName> deviceName;
    private @Nullable List<Device_UdiCarrier> udiCarrier;
    private @Nullable CodeableConcept type;
    private @Nullable List<Device_Version> version;
    private @Nullable List<CodeableConcept> safety;
    private @Nullable Id id;
    private @Nullable List<Device_Property> property;
    private @Nullable Reference owner;
    private @Nullable Code language;
    private @Nullable Reference parent;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference definition;
    private @Nullable String distinctIdentifier;
    private @Nullable String lotNumber;
    private @Nullable List<Extension> extension;
    private @Nullable String manufacturer;
    private @Nullable String modelNumber;
    private @Nullable Meta meta;
    private @Nullable Uri url;
    private @Nullable List<ContactPoint> contact;
    private @Nullable Reference location;
    private @Nullable Narrative text;
    private @Nullable String serialNumber;
    private @Nullable List<Device_Specialization> specialization;
    private @Nullable String partNumber;
    private @Nullable String resourceType;
    private @Nullable Reference patient;
    private @Nullable DateTime manufactureDate;
    private @Nullable DateTime expirationDate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DeviceStatus status;
    private @Nullable List<CodeableConcept> statusReason;
    private @Nullable Uri implicitRules;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Annotation> note;

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
     * Builds a new {@link Device Device}.
     * @return An immutable instance of Device
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Device build() {
      checkRequiredAttributes();
      return new ImmutableDevice(
          deviceName,
          udiCarrier,
          type,
          version,
          safety,
          id,
          property,
          owner,
          language,
          parent,
          contained,
          definition,
          distinctIdentifier,
          lotNumber,
          extension,
          manufacturer,
          modelNumber,
          meta,
          url,
          contact,
          location,
          text,
          serialNumber,
          specialization,
          partNumber,
          resourceType,
          patient,
          manufactureDate,
          expirationDate,
          modifierExtension,
          status,
          statusReason,
          implicitRules,
          identifier,
          note);
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean udiCarrierIsSet() {
      return (optBits & OPT_BIT_UDI_CARRIER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean safetyIsSet() {
      return (optBits & OPT_BIT_SAFETY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean distinctIdentifierIsSet() {
      return (optBits & OPT_BIT_DISTINCT_IDENTIFIER) != 0;
    }

    private boolean lotNumberIsSet() {
      return (optBits & OPT_BIT_LOT_NUMBER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean modelNumberIsSet() {
      return (optBits & OPT_BIT_MODEL_NUMBER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean serialNumberIsSet() {
      return (optBits & OPT_BIT_SERIAL_NUMBER) != 0;
    }

    private boolean specializationIsSet() {
      return (optBits & OPT_BIT_SPECIALIZATION) != 0;
    }

    private boolean partNumberIsSet() {
      return (optBits & OPT_BIT_PART_NUMBER) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean manufactureDateIsSet() {
      return (optBits & OPT_BIT_MANUFACTURE_DATE) != 0;
    }

    private boolean expirationDateIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
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
     * Builds a new {@link Device Device}.
     * @return An immutable instance of Device
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Device build();
  }
}
