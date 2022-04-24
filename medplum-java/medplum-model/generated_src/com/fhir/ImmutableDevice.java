//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Device}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDevice.builder()}.
 */
@org.immutables.value.Generated(from = "Device", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDevice implements com.fhir.Device {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Device_Property> property;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> safety;
  private final @javax.annotation.Nullable com.fhir.Reference parent;
  private final @javax.annotation.Nullable com.fhir.Reference definition;
  private final @javax.annotation.Nullable com.fhir.dateTime manufactureDate;
  private final @javax.annotation.Nullable com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String modelNumber;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String serialNumber;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Device_Version> version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Device_UdiCarrier> udiCarrier;
  private final @javax.annotation.Nullable com.fhir.DeviceStatus status;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Reference owner;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Device_Specialization> specialization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.lang.String lotNumber;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String partNumber;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String manufacturer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Device_DeviceName> deviceName;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable java.lang.String distinctIdentifier;
  private final @javax.annotation.Nullable com.fhir.dateTime expirationDate;

  private ImmutableDevice(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Device_Property> property,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> safety,
      @javax.annotation.Nullable com.fhir.Reference parent,
      @javax.annotation.Nullable com.fhir.Reference definition,
      @javax.annotation.Nullable com.fhir.dateTime manufactureDate,
      @javax.annotation.Nullable com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String modelNumber,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String serialNumber,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Device_Version> version,
      @javax.annotation.Nullable java.util.List<com.fhir.Device_UdiCarrier> udiCarrier,
      @javax.annotation.Nullable com.fhir.DeviceStatus status,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Reference owner,
      @javax.annotation.Nullable java.util.List<com.fhir.Device_Specialization> specialization,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.lang.String lotNumber,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String partNumber,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String manufacturer,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Device_DeviceName> deviceName,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable java.lang.String distinctIdentifier,
      @javax.annotation.Nullable com.fhir.dateTime expirationDate) {
    this.language = language;
    this.property = property;
    this.safety = safety;
    this.parent = parent;
    this.definition = definition;
    this.manufactureDate = manufactureDate;
    this.patient = patient;
    this.modifierExtension = modifierExtension;
    this.modelNumber = modelNumber;
    this.identifier = identifier;
    this.meta = meta;
    this.serialNumber = serialNumber;
    this.statusReason = statusReason;
    this.id = id;
    this.version = version;
    this.udiCarrier = udiCarrier;
    this.status = status;
    this.implicitRules = implicitRules;
    this.owner = owner;
    this.specialization = specialization;
    this.note = note;
    this.lotNumber = lotNumber;
    this.resourceType = resourceType;
    this.extension = extension;
    this.text = text;
    this.partNumber = partNumber;
    this.type = type;
    this.manufacturer = manufacturer;
    this.contained = contained;
    this.deviceName = deviceName;
    this.contact = contact;
    this.url = url;
    this.location = location;
    this.distinctIdentifier = distinctIdentifier;
    this.expirationDate = expirationDate;
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
   * @return The value of the {@code property} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("property")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Device_Property>> property() {
    return java.util.Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code safety} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("safety")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety() {
    return java.util.Optional.ofNullable(safety);
  }

  /**
   * @return The value of the {@code parent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  @Override
  public java.util.Optional<com.fhir.Reference> parent() {
    return java.util.Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<com.fhir.Reference> definition() {
    return java.util.Optional.ofNullable(definition);
  }

  /**
   * @return The value of the {@code manufactureDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufactureDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> manufactureDate() {
    return java.util.Optional.ofNullable(manufactureDate);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public java.util.Optional<com.fhir.Reference> patient() {
    return java.util.Optional.ofNullable(patient);
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
   * @return The value of the {@code modelNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modelNumber")
  @Override
  public java.util.Optional<java.lang.String> modelNumber() {
    return java.util.Optional.ofNullable(modelNumber);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code serialNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
  @Override
  public java.util.Optional<java.lang.String> serialNumber() {
    return java.util.Optional.ofNullable(serialNumber);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Device_Version>> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code udiCarrier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("udiCarrier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Device_UdiCarrier>> udiCarrier() {
    return java.util.Optional.ofNullable(udiCarrier);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.DeviceStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code owner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("owner")
  @Override
  public java.util.Optional<com.fhir.Reference> owner() {
    return java.util.Optional.ofNullable(owner);
  }

  /**
   * @return The value of the {@code specialization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialization")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Device_Specialization>> specialization() {
    return java.util.Optional.ofNullable(specialization);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code lotNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lotNumber")
  @Override
  public java.util.Optional<java.lang.String> lotNumber() {
    return java.util.Optional.ofNullable(lotNumber);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code partNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
  @Override
  public java.util.Optional<java.lang.String> partNumber() {
    return java.util.Optional.ofNullable(partNumber);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<java.lang.String> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
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
   * @return The value of the {@code deviceName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Device_DeviceName>> deviceName() {
    return java.util.Optional.ofNullable(deviceName);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code distinctIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("distinctIdentifier")
  @Override
  public java.util.Optional<java.lang.String> distinctIdentifier() {
    return java.util.Optional.ofNullable(distinctIdentifier);
  }

  /**
   * @return The value of the {@code expirationDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> expirationDate() {
    return java.util.Optional.ofNullable(expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDevice(
        newValue,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDevice(
        value,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withProperty(java.util.List<com.fhir.Device_Property> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_Property> newValue = java.util.Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableDevice(
        this.language,
        newValue,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withProperty(java.util.Optional<? extends java.util.List<com.fhir.Device_Property>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableDevice(
        this.language,
        value,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#safety() safety} attribute.
   * @param value The value for safety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSafety(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "safety");
    if (this.safety == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        newValue,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#safety() safety} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for safety
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withSafety(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.safety == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        value,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withParent(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        newValue,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withParent(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        value,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDefinition(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        newValue,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withDefinition(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        value,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#manufactureDate() manufactureDate} attribute.
   * @param value The value for manufactureDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withManufactureDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "manufactureDate");
    if (this.manufactureDate == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        newValue,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#manufactureDate() manufactureDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufactureDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withManufactureDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.manufactureDate == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        value,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withPatient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        newValue,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withPatient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        value,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        newValue,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        value,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#modelNumber() modelNumber} attribute.
   * @param value The value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withModelNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "modelNumber");
    if (java.util.Objects.equals(this.modelNumber, newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#modelNumber() modelNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withModelNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.modelNumber, value)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        value,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        newValue,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        value,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        newValue,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        value,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#serialNumber() serialNumber} attribute.
   * @param value The value for serialNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSerialNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "serialNumber");
    if (java.util.Objects.equals(this.serialNumber, newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        newValue,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#serialNumber() serialNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serialNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSerialNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.serialNumber, value)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        value,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withStatusReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        newValue,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withStatusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        value,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        newValue,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        value,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withVersion(java.util.List<com.fhir.Device_Version> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_Version> newValue = java.util.Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        newValue,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withVersion(java.util.Optional<? extends java.util.List<com.fhir.Device_Version>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_Version> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        value,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#udiCarrier() udiCarrier} attribute.
   * @param value The value for udiCarrier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withUdiCarrier(java.util.List<com.fhir.Device_UdiCarrier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_UdiCarrier> newValue = java.util.Objects.requireNonNull(value, "udiCarrier");
    if (this.udiCarrier == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        newValue,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#udiCarrier() udiCarrier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udiCarrier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withUdiCarrier(java.util.Optional<? extends java.util.List<com.fhir.Device_UdiCarrier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_UdiCarrier> value = optional.orElse(null);
    if (this.udiCarrier == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        value,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withStatus(com.fhir.DeviceStatus value) {
    @javax.annotation.Nullable com.fhir.DeviceStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        newValue,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withStatus(java.util.Optional<? extends com.fhir.DeviceStatus> optional) {
    @javax.annotation.Nullable com.fhir.DeviceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        value,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        newValue,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        value,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withOwner(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        newValue,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withOwner(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        value,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#specialization() specialization} attribute.
   * @param value The value for specialization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withSpecialization(java.util.List<com.fhir.Device_Specialization> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_Specialization> newValue = java.util.Objects.requireNonNull(value, "specialization");
    if (this.specialization == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        newValue,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#specialization() specialization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withSpecialization(java.util.Optional<? extends java.util.List<com.fhir.Device_Specialization>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_Specialization> value = optional.orElse(null);
    if (this.specialization == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        value,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        newValue,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        value,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#lotNumber() lotNumber} attribute.
   * @param value The value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLotNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "lotNumber");
    if (java.util.Objects.equals(this.lotNumber, newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        newValue,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#lotNumber() lotNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLotNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.lotNumber, value)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        value,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Device#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDevice withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        newValue,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        newValue,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        value,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        newValue,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        value,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#partNumber() partNumber} attribute.
   * @param value The value for partNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withPartNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "partNumber");
    if (java.util.Objects.equals(this.partNumber, newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        newValue,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#partNumber() partNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withPartNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.partNumber, value)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        value,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        newValue,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        value,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withManufacturer(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (java.util.Objects.equals(this.manufacturer, newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        newValue,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#manufacturer() manufacturer} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withManufacturer(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.manufacturer, value)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        value,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        newValue,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        value,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDeviceName(java.util.List<com.fhir.Device_DeviceName> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_DeviceName> newValue = java.util.Objects.requireNonNull(value, "deviceName");
    if (this.deviceName == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        newValue,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#deviceName() deviceName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withDeviceName(java.util.Optional<? extends java.util.List<com.fhir.Device_DeviceName>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Device_DeviceName> value = optional.orElse(null);
    if (this.deviceName == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        value,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withContact(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        newValue,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        value,
        this.url,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        newValue,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        value,
        this.location,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        newValue,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        value,
        this.distinctIdentifier,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#distinctIdentifier() distinctIdentifier} attribute.
   * @param value The value for distinctIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDistinctIdentifier(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "distinctIdentifier");
    if (java.util.Objects.equals(this.distinctIdentifier, newValue)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        newValue,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#distinctIdentifier() distinctIdentifier} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for distinctIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withDistinctIdentifier(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.distinctIdentifier, value)) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        value,
        this.expirationDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device#expirationDate() expirationDate} attribute.
   * @param value The value for expirationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice withExpirationDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "expirationDate");
    if (this.expirationDate == newValue) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device#expirationDate() expirationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice withExpirationDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.expirationDate == value) return this;
    return new ImmutableDevice(
        this.language,
        this.property,
        this.safety,
        this.parent,
        this.definition,
        this.manufactureDate,
        this.patient,
        this.modifierExtension,
        this.modelNumber,
        this.identifier,
        this.meta,
        this.serialNumber,
        this.statusReason,
        this.id,
        this.version,
        this.udiCarrier,
        this.status,
        this.implicitRules,
        this.owner,
        this.specialization,
        this.note,
        this.lotNumber,
        this.resourceType,
        this.extension,
        this.text,
        this.partNumber,
        this.type,
        this.manufacturer,
        this.contained,
        this.deviceName,
        this.contact,
        this.url,
        this.location,
        this.distinctIdentifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDevice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDevice
        && equalTo((ImmutableDevice) another);
  }

  private boolean equalTo(ImmutableDevice another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(property, another.property)
        && java.util.Objects.equals(safety, another.safety)
        && java.util.Objects.equals(parent, another.parent)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(manufactureDate, another.manufactureDate)
        && java.util.Objects.equals(patient, another.patient)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(modelNumber, another.modelNumber)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(serialNumber, another.serialNumber)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(udiCarrier, another.udiCarrier)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(owner, another.owner)
        && java.util.Objects.equals(specialization, another.specialization)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(lotNumber, another.lotNumber)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(partNumber, another.partNumber)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(deviceName, another.deviceName)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(distinctIdentifier, another.distinctIdentifier)
        && java.util.Objects.equals(expirationDate, another.expirationDate);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code property}, {@code safety}, {@code parent}, {@code definition}, {@code manufactureDate}, {@code patient}, {@code modifierExtension}, {@code modelNumber}, {@code identifier}, {@code meta}, {@code serialNumber}, {@code statusReason}, {@code id}, {@code version}, {@code udiCarrier}, {@code status}, {@code implicitRules}, {@code owner}, {@code specialization}, {@code note}, {@code lotNumber}, {@code resourceType}, {@code extension}, {@code text}, {@code partNumber}, {@code type}, {@code manufacturer}, {@code contained}, {@code deviceName}, {@code contact}, {@code url}, {@code location}, {@code distinctIdentifier}, {@code expirationDate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(property);
    h += (h << 5) + java.util.Objects.hashCode(safety);
    h += (h << 5) + java.util.Objects.hashCode(parent);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(manufactureDate);
    h += (h << 5) + java.util.Objects.hashCode(patient);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(modelNumber);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(serialNumber);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(udiCarrier);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(owner);
    h += (h << 5) + java.util.Objects.hashCode(specialization);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(lotNumber);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(partNumber);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(deviceName);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(distinctIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(expirationDate);
    return h;
  }

  /**
   * Prints the immutable value {@code Device} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Device{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (property != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (safety != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("safety=").append(safety);
    }
    if (parent != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (definition != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (manufactureDate != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("manufactureDate=").append(manufactureDate);
    }
    if (patient != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (modifierExtension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (modelNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modelNumber=").append(modelNumber);
    }
    if (identifier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (serialNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("serialNumber=").append(serialNumber);
    }
    if (statusReason != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (udiCarrier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("udiCarrier=").append(udiCarrier);
    }
    if (status != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (owner != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (specialization != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("specialization=").append(specialization);
    }
    if (note != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (lotNumber != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("lotNumber=").append(lotNumber);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (partNumber != null) {
      builder.append(", ");
      builder.append("partNumber=").append(partNumber);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (deviceName != null) {
      builder.append(", ");
      builder.append("deviceName=").append(deviceName);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (distinctIdentifier != null) {
      builder.append(", ");
      builder.append("distinctIdentifier=").append(distinctIdentifier);
    }
    if (expirationDate != null) {
      builder.append(", ");
      builder.append("expirationDate=").append(expirationDate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Device", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Device {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Device_Property>> property = java.util.Optional.empty();
    boolean propertyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety = java.util.Optional.empty();
    boolean safetyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> parent = java.util.Optional.empty();
    boolean parentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> manufactureDate = java.util.Optional.empty();
    boolean manufactureDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> patient = java.util.Optional.empty();
    boolean patientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> modelNumber = java.util.Optional.empty();
    boolean modelNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> serialNumber = java.util.Optional.empty();
    boolean serialNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Device_Version>> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Device_UdiCarrier>> udiCarrier = java.util.Optional.empty();
    boolean udiCarrierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DeviceStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> owner = java.util.Optional.empty();
    boolean ownerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Device_Specialization>> specialization = java.util.Optional.empty();
    boolean specializationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> lotNumber = java.util.Optional.empty();
    boolean lotNumberIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> partNumber = java.util.Optional.empty();
    boolean partNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Device_DeviceName>> deviceName = java.util.Optional.empty();
    boolean deviceNameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> distinctIdentifier = java.util.Optional.empty();
    boolean distinctIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> expirationDate = java.util.Optional.empty();
    boolean expirationDateIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public void setProperty(java.util.Optional<java.util.List<com.fhir.Device_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("safety")
    public void setSafety(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety) {
      this.safety = safety;
      this.safetyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public void setParent(java.util.Optional<com.fhir.Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<com.fhir.Reference> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufactureDate")
    public void setManufactureDate(java.util.Optional<com.fhir.dateTime> manufactureDate) {
      this.manufactureDate = manufactureDate;
      this.manufactureDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(java.util.Optional<com.fhir.Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modelNumber")
    public void setModelNumber(java.util.Optional<java.lang.String> modelNumber) {
      this.modelNumber = modelNumber;
      this.modelNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    public void setSerialNumber(java.util.Optional<java.lang.String> serialNumber) {
      this.serialNumber = serialNumber;
      this.serialNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.util.List<com.fhir.Device_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("udiCarrier")
    public void setUdiCarrier(java.util.Optional<java.util.List<com.fhir.Device_UdiCarrier>> udiCarrier) {
      this.udiCarrier = udiCarrier;
      this.udiCarrierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.DeviceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public void setOwner(java.util.Optional<com.fhir.Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialization")
    public void setSpecialization(java.util.Optional<java.util.List<com.fhir.Device_Specialization>> specialization) {
      this.specialization = specialization;
      this.specializationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lotNumber")
    public void setLotNumber(java.util.Optional<java.lang.String> lotNumber) {
      this.lotNumber = lotNumber;
      this.lotNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    public void setPartNumber(java.util.Optional<java.lang.String> partNumber) {
      this.partNumber = partNumber;
      this.partNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<java.lang.String> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
    public void setDeviceName(java.util.Optional<java.util.List<com.fhir.Device_DeviceName>> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("distinctIdentifier")
    public void setDistinctIdentifier(java.util.Optional<java.lang.String> distinctIdentifier) {
      this.distinctIdentifier = distinctIdentifier;
      this.distinctIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    public void setExpirationDate(java.util.Optional<com.fhir.dateTime> expirationDate) {
      this.expirationDate = expirationDate;
      this.expirationDateIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Device_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> manufactureDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> modelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> serialNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Device_Version>> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Device_UdiCarrier>> udiCarrier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DeviceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Device_Specialization>> specialization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> lotNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> partNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Device_DeviceName>> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> distinctIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> expirationDate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDevice fromJson(Json json) {
    ImmutableDevice.Builder builder = ((ImmutableDevice.Builder) ImmutableDevice.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.safetyIsSet) {
      builder.safety(json.safety);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.manufactureDateIsSet) {
      builder.manufactureDate(json.manufactureDate);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.modelNumberIsSet) {
      builder.modelNumber(json.modelNumber);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.serialNumberIsSet) {
      builder.serialNumber(json.serialNumber);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.udiCarrierIsSet) {
      builder.udiCarrier(json.udiCarrier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.specializationIsSet) {
      builder.specialization(json.specialization);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.lotNumberIsSet) {
      builder.lotNumber(json.lotNumber);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.partNumberIsSet) {
      builder.partNumber(json.partNumber);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.deviceNameIsSet) {
      builder.deviceName(json.deviceName);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.distinctIdentifierIsSet) {
      builder.distinctIdentifier(json.distinctIdentifier);
    }
    if (json.expirationDateIsSet) {
      builder.expirationDate(json.expirationDate);
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
        .language(instance.language())
        .property(instance.property())
        .safety(instance.safety())
        .parent(instance.parent())
        .definition(instance.definition())
        .manufactureDate(instance.manufactureDate())
        .patient(instance.patient())
        .modifierExtension(instance.modifierExtension())
        .modelNumber(instance.modelNumber())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .serialNumber(instance.serialNumber())
        .statusReason(instance.statusReason())
        .id(instance.id())
        .version(instance.version())
        .udiCarrier(instance.udiCarrier())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .owner(instance.owner())
        .specialization(instance.specialization())
        .note(instance.note())
        .lotNumber(instance.lotNumber())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .text(instance.text())
        .partNumber(instance.partNumber())
        .type(instance.type())
        .manufacturer(instance.manufacturer())
        .contained(instance.contained())
        .deviceName(instance.deviceName())
        .contact(instance.contact())
        .url(instance.url())
        .location(instance.location())
        .distinctIdentifier(instance.distinctIdentifier())
        .expirationDate(instance.expirationDate())
        .build();
  }

  /**
   * Creates a builder for {@link Device Device}.
   * <pre>
   * ImmutableDevice.builder()
   *    .language(com.fhir.code) // optional {@link Device#language() language}
   *    .property(List&amp;lt;com.fhir.Device_Property&amp;gt;) // optional {@link Device#property() property}
   *    .safety(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Device#safety() safety}
   *    .parent(com.fhir.Reference) // optional {@link Device#parent() parent}
   *    .definition(com.fhir.Reference) // optional {@link Device#definition() definition}
   *    .manufactureDate(com.fhir.dateTime) // optional {@link Device#manufactureDate() manufactureDate}
   *    .patient(com.fhir.Reference) // optional {@link Device#patient() patient}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Device#modifierExtension() modifierExtension}
   *    .modelNumber(String) // optional {@link Device#modelNumber() modelNumber}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Device#identifier() identifier}
   *    .meta(com.fhir.Meta) // optional {@link Device#meta() meta}
   *    .serialNumber(String) // optional {@link Device#serialNumber() serialNumber}
   *    .statusReason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Device#statusReason() statusReason}
   *    .id(com.fhir.id) // optional {@link Device#id() id}
   *    .version(List&amp;lt;com.fhir.Device_Version&amp;gt;) // optional {@link Device#version() version}
   *    .udiCarrier(List&amp;lt;com.fhir.Device_UdiCarrier&amp;gt;) // optional {@link Device#udiCarrier() udiCarrier}
   *    .status(com.fhir.DeviceStatus) // optional {@link Device#status() status}
   *    .implicitRules(com.fhir.uri) // optional {@link Device#implicitRules() implicitRules}
   *    .owner(com.fhir.Reference) // optional {@link Device#owner() owner}
   *    .specialization(List&amp;lt;com.fhir.Device_Specialization&amp;gt;) // optional {@link Device#specialization() specialization}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Device#note() note}
   *    .lotNumber(String) // optional {@link Device#lotNumber() lotNumber}
   *    .resourceType(String) // required {@link Device#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Device#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link Device#text() text}
   *    .partNumber(String) // optional {@link Device#partNumber() partNumber}
   *    .type(com.fhir.CodeableConcept) // optional {@link Device#type() type}
   *    .manufacturer(String) // optional {@link Device#manufacturer() manufacturer}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Device#contained() contained}
   *    .deviceName(List&amp;lt;com.fhir.Device_DeviceName&amp;gt;) // optional {@link Device#deviceName() deviceName}
   *    .contact(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Device#contact() contact}
   *    .url(com.fhir.uri) // optional {@link Device#url() url}
   *    .location(com.fhir.Reference) // optional {@link Device#location() location}
   *    .distinctIdentifier(String) // optional {@link Device#distinctIdentifier() distinctIdentifier}
   *    .expirationDate(com.fhir.dateTime) // optional {@link Device#expirationDate() expirationDate}
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
  @org.immutables.value.Generated(from = "Device", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_PROPERTY = 0x2L;
    private static final long OPT_BIT_SAFETY = 0x4L;
    private static final long OPT_BIT_PARENT = 0x8L;
    private static final long OPT_BIT_DEFINITION = 0x10L;
    private static final long OPT_BIT_MANUFACTURE_DATE = 0x20L;
    private static final long OPT_BIT_PATIENT = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_MODEL_NUMBER = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_SERIAL_NUMBER = 0x800L;
    private static final long OPT_BIT_STATUS_REASON = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_VERSION = 0x4000L;
    private static final long OPT_BIT_UDI_CARRIER = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_OWNER = 0x40000L;
    private static final long OPT_BIT_SPECIALIZATION = 0x80000L;
    private static final long OPT_BIT_NOTE = 0x100000L;
    private static final long OPT_BIT_LOT_NUMBER = 0x200000L;
    private static final long OPT_BIT_EXTENSION = 0x400000L;
    private static final long OPT_BIT_TEXT = 0x800000L;
    private static final long OPT_BIT_PART_NUMBER = 0x1000000L;
    private static final long OPT_BIT_TYPE = 0x2000000L;
    private static final long OPT_BIT_MANUFACTURER = 0x4000000L;
    private static final long OPT_BIT_CONTAINED = 0x8000000L;
    private static final long OPT_BIT_DEVICE_NAME = 0x10000000L;
    private static final long OPT_BIT_CONTACT = 0x20000000L;
    private static final long OPT_BIT_URL = 0x40000000L;
    private static final long OPT_BIT_LOCATION = 0x80000000L;
    private static final long OPT_BIT_DISTINCT_IDENTIFIER = 0x100000000L;
    private static final long OPT_BIT_EXPIRATION_DATE = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Device_Property> property;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> safety;
    private @javax.annotation.Nullable com.fhir.Reference parent;
    private @javax.annotation.Nullable com.fhir.Reference definition;
    private @javax.annotation.Nullable com.fhir.dateTime manufactureDate;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String modelNumber;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String serialNumber;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Device_Version> version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Device_UdiCarrier> udiCarrier;
    private @javax.annotation.Nullable com.fhir.DeviceStatus status;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference owner;
    private @javax.annotation.Nullable java.util.List<com.fhir.Device_Specialization> specialization;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.lang.String lotNumber;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String partNumber;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String manufacturer;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Device_DeviceName> deviceName;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable java.lang.String distinctIdentifier;
    private @javax.annotation.Nullable com.fhir.dateTime expirationDate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Device#language() language} to language.
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
     * Initializes the optional value {@link Device#language() language} to language.
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
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(java.util.List<com.fhir.Device_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = java.util.Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public final Builder property(java.util.Optional<? extends java.util.List<com.fhir.Device_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for chained invocation
     */
    public final Builder safety(java.util.List<com.fhir.CodeableConcept> safety) {
      checkNotIsSet(safetyIsSet(), "safety");
      this.safety = java.util.Objects.requireNonNull(safety, "safety");
      optBits |= OPT_BIT_SAFETY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("safety")
    public final Builder safety(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> safety) {
      checkNotIsSet(safetyIsSet(), "safety");
      this.safety = safety.orElse(null);
      optBits |= OPT_BIT_SAFETY;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(com.fhir.Reference parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = java.util.Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public final Builder parent(java.util.Optional<? extends com.fhir.Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(com.fhir.Reference definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<? extends com.fhir.Reference> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufactureDate(com.fhir.dateTime manufactureDate) {
      checkNotIsSet(manufactureDateIsSet(), "manufactureDate");
      this.manufactureDate = java.util.Objects.requireNonNull(manufactureDate, "manufactureDate");
      optBits |= OPT_BIT_MANUFACTURE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufactureDate")
    public final Builder manufactureDate(java.util.Optional<? extends com.fhir.dateTime> manufactureDate) {
      checkNotIsSet(manufactureDateIsSet(), "manufactureDate");
      this.manufactureDate = manufactureDate.orElse(null);
      optBits |= OPT_BIT_MANUFACTURE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(java.util.Optional<? extends com.fhir.Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder modelNumber(java.lang.String modelNumber) {
      checkNotIsSet(modelNumberIsSet(), "modelNumber");
      this.modelNumber = java.util.Objects.requireNonNull(modelNumber, "modelNumber");
      optBits |= OPT_BIT_MODEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelNumber")
    public final Builder modelNumber(java.util.Optional<java.lang.String> modelNumber) {
      checkNotIsSet(modelNumberIsSet(), "modelNumber");
      this.modelNumber = modelNumber.orElse(null);
      optBits |= OPT_BIT_MODEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Device#meta() meta} to meta.
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
     * Initializes the optional value {@link Device#meta() meta} to meta.
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
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder serialNumber(java.lang.String serialNumber) {
      checkNotIsSet(serialNumberIsSet(), "serialNumber");
      this.serialNumber = java.util.Objects.requireNonNull(serialNumber, "serialNumber");
      optBits |= OPT_BIT_SERIAL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    public final Builder serialNumber(java.util.Optional<java.lang.String> serialNumber) {
      checkNotIsSet(serialNumberIsSet(), "serialNumber");
      this.serialNumber = serialNumber.orElse(null);
      optBits |= OPT_BIT_SERIAL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(java.util.List<com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#id() id} to id.
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
     * Initializes the optional value {@link Device#id() id} to id.
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
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.util.List<com.fhir.Device_Version> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<? extends java.util.List<com.fhir.Device_Version>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for chained invocation
     */
    public final Builder udiCarrier(java.util.List<com.fhir.Device_UdiCarrier> udiCarrier) {
      checkNotIsSet(udiCarrierIsSet(), "udiCarrier");
      this.udiCarrier = java.util.Objects.requireNonNull(udiCarrier, "udiCarrier");
      optBits |= OPT_BIT_UDI_CARRIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("udiCarrier")
    public final Builder udiCarrier(java.util.Optional<? extends java.util.List<com.fhir.Device_UdiCarrier>> udiCarrier) {
      checkNotIsSet(udiCarrierIsSet(), "udiCarrier");
      this.udiCarrier = udiCarrier.orElse(null);
      optBits |= OPT_BIT_UDI_CARRIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.DeviceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.DeviceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    public final Builder owner(com.fhir.Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = java.util.Objects.requireNonNull(owner, "owner");
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public final Builder owner(java.util.Optional<? extends com.fhir.Reference> owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = owner.orElse(null);
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialization(java.util.List<com.fhir.Device_Specialization> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = java.util.Objects.requireNonNull(specialization, "specialization");
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialization")
    public final Builder specialization(java.util.Optional<? extends java.util.List<com.fhir.Device_Specialization>> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = specialization.orElse(null);
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder lotNumber(java.lang.String lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = java.util.Objects.requireNonNull(lotNumber, "lotNumber");
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lotNumber")
    public final Builder lotNumber(java.util.Optional<java.lang.String> lotNumber) {
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#extension() extension} to extension.
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
     * Initializes the optional value {@link Device#extension() extension} to extension.
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
     * Initializes the optional value {@link Device#text() text} to text.
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
     * Initializes the optional value {@link Device#text() text} to text.
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
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder partNumber(java.lang.String partNumber) {
      checkNotIsSet(partNumberIsSet(), "partNumber");
      this.partNumber = java.util.Objects.requireNonNull(partNumber, "partNumber");
      optBits |= OPT_BIT_PART_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    public final Builder partNumber(java.util.Optional<java.lang.String> partNumber) {
      checkNotIsSet(partNumberIsSet(), "partNumber");
      this.partNumber = partNumber.orElse(null);
      optBits |= OPT_BIT_PART_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(java.lang.String manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = java.util.Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public final Builder manufacturer(java.util.Optional<java.lang.String> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#contained() contained} to contained.
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
     * Initializes the optional value {@link Device#contained() contained} to contained.
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
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceName(java.util.List<com.fhir.Device_DeviceName> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = java.util.Objects.requireNonNull(deviceName, "deviceName");
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
    public final Builder deviceName(java.util.Optional<? extends java.util.List<com.fhir.Device_DeviceName>> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = deviceName.orElse(null);
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder distinctIdentifier(java.lang.String distinctIdentifier) {
      checkNotIsSet(distinctIdentifierIsSet(), "distinctIdentifier");
      this.distinctIdentifier = java.util.Objects.requireNonNull(distinctIdentifier, "distinctIdentifier");
      optBits |= OPT_BIT_DISTINCT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distinctIdentifier")
    public final Builder distinctIdentifier(java.util.Optional<java.lang.String> distinctIdentifier) {
      checkNotIsSet(distinctIdentifierIsSet(), "distinctIdentifier");
      this.distinctIdentifier = distinctIdentifier.orElse(null);
      optBits |= OPT_BIT_DISTINCT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationDate(com.fhir.dateTime expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = java.util.Objects.requireNonNull(expirationDate, "expirationDate");
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    public final Builder expirationDate(java.util.Optional<? extends com.fhir.dateTime> expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = expirationDate.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Builds a new {@link Device Device}.
     * @return An immutable instance of Device
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Device build() {
      checkRequiredAttributes();
      return new ImmutableDevice(
          language,
          property,
          safety,
          parent,
          definition,
          manufactureDate,
          patient,
          modifierExtension,
          modelNumber,
          identifier,
          meta,
          serialNumber,
          statusReason,
          id,
          version,
          udiCarrier,
          status,
          implicitRules,
          owner,
          specialization,
          note,
          lotNumber,
          resourceType,
          extension,
          text,
          partNumber,
          type,
          manufacturer,
          contained,
          deviceName,
          contact,
          url,
          location,
          distinctIdentifier,
          expirationDate);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean safetyIsSet() {
      return (optBits & OPT_BIT_SAFETY) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean manufactureDateIsSet() {
      return (optBits & OPT_BIT_MANUFACTURE_DATE) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean modelNumberIsSet() {
      return (optBits & OPT_BIT_MODEL_NUMBER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean serialNumberIsSet() {
      return (optBits & OPT_BIT_SERIAL_NUMBER) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean udiCarrierIsSet() {
      return (optBits & OPT_BIT_UDI_CARRIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean specializationIsSet() {
      return (optBits & OPT_BIT_SPECIALIZATION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean lotNumberIsSet() {
      return (optBits & OPT_BIT_LOT_NUMBER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean partNumberIsSet() {
      return (optBits & OPT_BIT_PART_NUMBER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean distinctIdentifierIsSet() {
      return (optBits & OPT_BIT_DISTINCT_IDENTIFIER) != 0;
    }

    private boolean expirationDateIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_DATE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Device is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Device, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Device", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Device#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Device", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Device#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Device#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(java.util.List<com.fhir.Device_Property> property);

    /**
     * Initializes the optional value {@link Device#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(java.util.Optional<? extends java.util.List<com.fhir.Device_Property>> property);

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for chained invocation
     */
    BuildFinal safety(java.util.List<com.fhir.CodeableConcept> safety);

    /**
     * Initializes the optional value {@link Device#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal safety(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> safety);

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(com.fhir.Reference parent);

    /**
     * Initializes the optional value {@link Device#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(java.util.Optional<? extends com.fhir.Reference> parent);

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(com.fhir.Reference definition);

    /**
     * Initializes the optional value {@link Device#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(java.util.Optional<? extends com.fhir.Reference> definition);

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufactureDate(com.fhir.dateTime manufactureDate);

    /**
     * Initializes the optional value {@link Device#manufactureDate() manufactureDate} to manufactureDate.
     * @param manufactureDate The value for manufactureDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufactureDate(java.util.Optional<? extends com.fhir.dateTime> manufactureDate);

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);

    /**
     * Initializes the optional value {@link Device#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(java.util.Optional<? extends com.fhir.Reference> patient);

    /**
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Device#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modelNumber(java.lang.String modelNumber);

    /**
     * Initializes the optional value {@link Device#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modelNumber(java.util.Optional<java.lang.String> modelNumber);

    /**
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Device#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Device#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Device#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serialNumber(java.lang.String serialNumber);

    /**
     * Initializes the optional value {@link Device#serialNumber() serialNumber} to serialNumber.
     * @param serialNumber The value for serialNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serialNumber(java.util.Optional<java.lang.String> serialNumber);

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(java.util.List<com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Device#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> statusReason);

    /**
     * Initializes the optional value {@link Device#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Device#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.util.List<com.fhir.Device_Version> version);

    /**
     * Initializes the optional value {@link Device#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<? extends java.util.List<com.fhir.Device_Version>> version);

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udiCarrier(java.util.List<com.fhir.Device_UdiCarrier> udiCarrier);

    /**
     * Initializes the optional value {@link Device#udiCarrier() udiCarrier} to udiCarrier.
     * @param udiCarrier The value for udiCarrier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udiCarrier(java.util.Optional<? extends java.util.List<com.fhir.Device_UdiCarrier>> udiCarrier);

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.DeviceStatus status);

    /**
     * Initializes the optional value {@link Device#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.DeviceStatus> status);

    /**
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Device#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(com.fhir.Reference owner);

    /**
     * Initializes the optional value {@link Device#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(java.util.Optional<? extends com.fhir.Reference> owner);

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialization(java.util.List<com.fhir.Device_Specialization> specialization);

    /**
     * Initializes the optional value {@link Device#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialization(java.util.Optional<? extends java.util.List<com.fhir.Device_Specialization>> specialization);

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Device#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lotNumber(java.lang.String lotNumber);

    /**
     * Initializes the optional value {@link Device#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lotNumber(java.util.Optional<java.lang.String> lotNumber);

    /**
     * Initializes the optional value {@link Device#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Device#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Device#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Device#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partNumber(java.lang.String partNumber);

    /**
     * Initializes the optional value {@link Device#partNumber() partNumber} to partNumber.
     * @param partNumber The value for partNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partNumber(java.util.Optional<java.lang.String> partNumber);

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Device#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(java.lang.String manufacturer);

    /**
     * Initializes the optional value {@link Device#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(java.util.Optional<java.lang.String> manufacturer);

    /**
     * Initializes the optional value {@link Device#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Device#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deviceName(java.util.List<com.fhir.Device_DeviceName> deviceName);

    /**
     * Initializes the optional value {@link Device#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deviceName(java.util.Optional<? extends java.util.List<com.fhir.Device_DeviceName>> deviceName);

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactPoint> contact);

    /**
     * Initializes the optional value {@link Device#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact);

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link Device#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link Device#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal distinctIdentifier(java.lang.String distinctIdentifier);

    /**
     * Initializes the optional value {@link Device#distinctIdentifier() distinctIdentifier} to distinctIdentifier.
     * @param distinctIdentifier The value for distinctIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal distinctIdentifier(java.util.Optional<java.lang.String> distinctIdentifier);

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expirationDate(com.fhir.dateTime expirationDate);

    /**
     * Initializes the optional value {@link Device#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expirationDate(java.util.Optional<? extends com.fhir.dateTime> expirationDate);

    /**
     * Builds a new {@link Device Device}.
     * @return An immutable instance of Device
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Device build();
  }
}
