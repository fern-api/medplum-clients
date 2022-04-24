//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DeviceDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "DeviceDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition implements com.fhir.DeviceDefinition {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String manufacturerString;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Material> material;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> languageCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> version;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.uri onlineInformation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String modelNumber;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Specialization> specialization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Capability> capability;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier;
  private final @javax.annotation.Nullable com.fhir.Reference parentDevice;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Property> property;
  private final @javax.annotation.Nullable com.fhir.Reference manufacturerReference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ProductShelfLife> shelfLifeStorage;
  private final @javax.annotation.Nullable com.fhir.ProdCharacteristic physicalCharacteristics;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Reference owner;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_DeviceName> deviceName;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> safety;

  private ImmutableDeviceDefinition(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String manufacturerString,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Material> material,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> languageCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<java.lang.String> version,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.uri onlineInformation,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String modelNumber,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Specialization> specialization,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Capability> capability,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier,
      @javax.annotation.Nullable com.fhir.Reference parentDevice,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Property> property,
      @javax.annotation.Nullable com.fhir.Reference manufacturerReference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable java.util.List<com.fhir.ProductShelfLife> shelfLifeStorage,
      @javax.annotation.Nullable com.fhir.ProdCharacteristic physicalCharacteristics,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Reference owner,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_DeviceName> deviceName,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> safety) {
    this.language = language;
    this.type = type;
    this.manufacturerString = manufacturerString;
    this.text = text;
    this.material = material;
    this.languageCode = languageCode;
    this.modifierExtension = modifierExtension;
    this.version = version;
    this.url = url;
    this.extension = extension;
    this.note = note;
    this.onlineInformation = onlineInformation;
    this.contained = contained;
    this.modelNumber = modelNumber;
    this.contact = contact;
    this.specialization = specialization;
    this.capability = capability;
    this.resourceType = resourceType;
    this.udiDeviceIdentifier = udiDeviceIdentifier;
    this.parentDevice = parentDevice;
    this.property = property;
    this.manufacturerReference = manufacturerReference;
    this.meta = meta;
    this.id = id;
    this.identifier = identifier;
    this.quantity = quantity;
    this.shelfLifeStorage = shelfLifeStorage;
    this.physicalCharacteristics = physicalCharacteristics;
    this.implicitRules = implicitRules;
    this.owner = owner;
    this.deviceName = deviceName;
    this.safety = safety;
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code manufacturerString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturerString")
  @Override
  public java.util.Optional<java.lang.String> manufacturerString() {
    return java.util.Optional.ofNullable(manufacturerString);
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
   * @return The value of the {@code material} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("material")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Material>> material() {
    return java.util.Optional.ofNullable(material);
  }

  /**
   * @return The value of the {@code languageCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> languageCode() {
    return java.util.Optional.ofNullable(languageCode);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code onlineInformation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onlineInformation")
  @Override
  public java.util.Optional<com.fhir.uri> onlineInformation() {
    return java.util.Optional.ofNullable(onlineInformation);
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
   * @return The value of the {@code modelNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modelNumber")
  @Override
  public java.util.Optional<java.lang.String> modelNumber() {
    return java.util.Optional.ofNullable(modelNumber);
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
   * @return The value of the {@code specialization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialization")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Specialization>> specialization() {
    return java.util.Optional.ofNullable(specialization);
  }

  /**
   * @return The value of the {@code capability} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("capability")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Capability>> capability() {
    return java.util.Optional.ofNullable(capability);
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
   * @return The value of the {@code udiDeviceIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("udiDeviceIdentifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier() {
    return java.util.Optional.ofNullable(udiDeviceIdentifier);
  }

  /**
   * @return The value of the {@code parentDevice} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parentDevice")
  @Override
  public java.util.Optional<com.fhir.Reference> parentDevice() {
    return java.util.Optional.ofNullable(parentDevice);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("property")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Property>> property() {
    return java.util.Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code manufacturerReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturerReference")
  @Override
  public java.util.Optional<com.fhir.Reference> manufacturerReference() {
    return java.util.Optional.ofNullable(manufacturerReference);
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
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code shelfLifeStorage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("shelfLifeStorage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ProductShelfLife>> shelfLifeStorage() {
    return java.util.Optional.ofNullable(shelfLifeStorage);
  }

  /**
   * @return The value of the {@code physicalCharacteristics} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("physicalCharacteristics")
  @Override
  public java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics() {
    return java.util.Optional.ofNullable(physicalCharacteristics);
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
   * @return The value of the {@code deviceName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_DeviceName>> deviceName() {
    return java.util.Optional.ofNullable(deviceName);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceDefinition(
        newValue,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceDefinition(
        value,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        newValue,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        value,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#manufacturerString() manufacturerString} attribute.
   * @param value The value for manufacturerString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withManufacturerString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "manufacturerString");
    if (java.util.Objects.equals(this.manufacturerString, newValue)) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        newValue,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#manufacturerString() manufacturerString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturerString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withManufacturerString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.manufacturerString, value)) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        value,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        newValue,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        value,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#material() material} attribute.
   * @param value The value for material
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withMaterial(java.util.List<com.fhir.DeviceDefinition_Material> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Material> newValue = java.util.Objects.requireNonNull(value, "material");
    if (this.material == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        newValue,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#material() material} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for material
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withMaterial(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Material>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Material> value = optional.orElse(null);
    if (this.material == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        value,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#languageCode() languageCode} attribute.
   * @param value The value for languageCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withLanguageCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "languageCode");
    if (this.languageCode == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        newValue,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#languageCode() languageCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for languageCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withLanguageCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.languageCode == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        value,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        newValue,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        value,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withVersion(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        newValue,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withVersion(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        value,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        newValue,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        value,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        newValue,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        value,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        newValue,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        value,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#onlineInformation() onlineInformation} attribute.
   * @param value The value for onlineInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withOnlineInformation(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "onlineInformation");
    if (this.onlineInformation == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        newValue,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#onlineInformation() onlineInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onlineInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withOnlineInformation(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.onlineInformation == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        value,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        newValue,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        value,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#modelNumber() modelNumber} attribute.
   * @param value The value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withModelNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "modelNumber");
    if (java.util.Objects.equals(this.modelNumber, newValue)) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        newValue,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#modelNumber() modelNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withModelNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.modelNumber, value)) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        value,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withContact(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        newValue,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        value,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#specialization() specialization} attribute.
   * @param value The value for specialization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withSpecialization(java.util.List<com.fhir.DeviceDefinition_Specialization> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Specialization> newValue = java.util.Objects.requireNonNull(value, "specialization");
    if (this.specialization == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        newValue,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#specialization() specialization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withSpecialization(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Specialization>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Specialization> value = optional.orElse(null);
    if (this.specialization == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        value,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#capability() capability} attribute.
   * @param value The value for capability
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withCapability(java.util.List<com.fhir.DeviceDefinition_Capability> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Capability> newValue = java.util.Objects.requireNonNull(value, "capability");
    if (this.capability == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        newValue,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#capability() capability} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for capability
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withCapability(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Capability>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Capability> value = optional.orElse(null);
    if (this.capability == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        value,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        newValue,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} attribute.
   * @param value The value for udiDeviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withUdiDeviceIdentifier(java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> newValue = java.util.Objects.requireNonNull(value, "udiDeviceIdentifier");
    if (this.udiDeviceIdentifier == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        newValue,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udiDeviceIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withUdiDeviceIdentifier(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> value = optional.orElse(null);
    if (this.udiDeviceIdentifier == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        value,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#parentDevice() parentDevice} attribute.
   * @param value The value for parentDevice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withParentDevice(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "parentDevice");
    if (this.parentDevice == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        newValue,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#parentDevice() parentDevice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentDevice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withParentDevice(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.parentDevice == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        value,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withProperty(java.util.List<com.fhir.DeviceDefinition_Property> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Property> newValue = java.util.Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        newValue,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withProperty(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Property>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        value,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#manufacturerReference() manufacturerReference} attribute.
   * @param value The value for manufacturerReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withManufacturerReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "manufacturerReference");
    if (this.manufacturerReference == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        newValue,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#manufacturerReference() manufacturerReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturerReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withManufacturerReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.manufacturerReference == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        value,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        newValue,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        value,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        newValue,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        value,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        newValue,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        value,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        newValue,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        value,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} attribute.
   * @param value The value for shelfLifeStorage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withShelfLifeStorage(java.util.List<com.fhir.ProductShelfLife> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ProductShelfLife> newValue = java.util.Objects.requireNonNull(value, "shelfLifeStorage");
    if (this.shelfLifeStorage == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        newValue,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shelfLifeStorage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withShelfLifeStorage(java.util.Optional<? extends java.util.List<com.fhir.ProductShelfLife>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ProductShelfLife> value = optional.orElse(null);
    if (this.shelfLifeStorage == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        value,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} attribute.
   * @param value The value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withPhysicalCharacteristics(com.fhir.ProdCharacteristic value) {
    @javax.annotation.Nullable com.fhir.ProdCharacteristic newValue = java.util.Objects.requireNonNull(value, "physicalCharacteristics");
    if (this.physicalCharacteristics == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        newValue,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withPhysicalCharacteristics(java.util.Optional<? extends com.fhir.ProdCharacteristic> optional) {
    @javax.annotation.Nullable com.fhir.ProdCharacteristic value = optional.orElse(null);
    if (this.physicalCharacteristics == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        value,
        this.implicitRules,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        newValue,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        value,
        this.owner,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withOwner(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        newValue,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withOwner(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        value,
        this.deviceName,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withDeviceName(java.util.List<com.fhir.DeviceDefinition_DeviceName> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_DeviceName> newValue = java.util.Objects.requireNonNull(value, "deviceName");
    if (this.deviceName == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        newValue,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#deviceName() deviceName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withDeviceName(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_DeviceName>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_DeviceName> value = optional.orElse(null);
    if (this.deviceName == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        value,
        this.safety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#safety() safety} attribute.
   * @param value The value for safety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withSafety(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "safety");
    if (this.safety == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#safety() safety} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for safety
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withSafety(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.safety == value) return this;
    return new ImmutableDeviceDefinition(
        this.language,
        this.type,
        this.manufacturerString,
        this.text,
        this.material,
        this.languageCode,
        this.modifierExtension,
        this.version,
        this.url,
        this.extension,
        this.note,
        this.onlineInformation,
        this.contained,
        this.modelNumber,
        this.contact,
        this.specialization,
        this.capability,
        this.resourceType,
        this.udiDeviceIdentifier,
        this.parentDevice,
        this.property,
        this.manufacturerReference,
        this.meta,
        this.id,
        this.identifier,
        this.quantity,
        this.shelfLifeStorage,
        this.physicalCharacteristics,
        this.implicitRules,
        this.owner,
        this.deviceName,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition
        && equalTo((ImmutableDeviceDefinition) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(manufacturerString, another.manufacturerString)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(material, another.material)
        && java.util.Objects.equals(languageCode, another.languageCode)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(onlineInformation, another.onlineInformation)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modelNumber, another.modelNumber)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(specialization, another.specialization)
        && java.util.Objects.equals(capability, another.capability)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(udiDeviceIdentifier, another.udiDeviceIdentifier)
        && java.util.Objects.equals(parentDevice, another.parentDevice)
        && java.util.Objects.equals(property, another.property)
        && java.util.Objects.equals(manufacturerReference, another.manufacturerReference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(shelfLifeStorage, another.shelfLifeStorage)
        && java.util.Objects.equals(physicalCharacteristics, another.physicalCharacteristics)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(owner, another.owner)
        && java.util.Objects.equals(deviceName, another.deviceName)
        && java.util.Objects.equals(safety, another.safety);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code type}, {@code manufacturerString}, {@code text}, {@code material}, {@code languageCode}, {@code modifierExtension}, {@code version}, {@code url}, {@code extension}, {@code note}, {@code onlineInformation}, {@code contained}, {@code modelNumber}, {@code contact}, {@code specialization}, {@code capability}, {@code resourceType}, {@code udiDeviceIdentifier}, {@code parentDevice}, {@code property}, {@code manufacturerReference}, {@code meta}, {@code id}, {@code identifier}, {@code quantity}, {@code shelfLifeStorage}, {@code physicalCharacteristics}, {@code implicitRules}, {@code owner}, {@code deviceName}, {@code safety}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(manufacturerString);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(material);
    h += (h << 5) + java.util.Objects.hashCode(languageCode);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(onlineInformation);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modelNumber);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(specialization);
    h += (h << 5) + java.util.Objects.hashCode(capability);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(udiDeviceIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(parentDevice);
    h += (h << 5) + java.util.Objects.hashCode(property);
    h += (h << 5) + java.util.Objects.hashCode(manufacturerReference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(shelfLifeStorage);
    h += (h << 5) + java.util.Objects.hashCode(physicalCharacteristics);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(owner);
    h += (h << 5) + java.util.Objects.hashCode(deviceName);
    h += (h << 5) + java.util.Objects.hashCode(safety);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DeviceDefinition{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (type != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (manufacturerString != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("manufacturerString=").append(manufacturerString);
    }
    if (text != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (material != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("material=").append(material);
    }
    if (languageCode != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("languageCode=").append(languageCode);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (version != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (url != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (note != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (onlineInformation != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("onlineInformation=").append(onlineInformation);
    }
    if (contained != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modelNumber != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modelNumber=").append(modelNumber);
    }
    if (contact != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (specialization != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("specialization=").append(specialization);
    }
    if (capability != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("capability=").append(capability);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (udiDeviceIdentifier != null) {
      builder.append(", ");
      builder.append("udiDeviceIdentifier=").append(udiDeviceIdentifier);
    }
    if (parentDevice != null) {
      builder.append(", ");
      builder.append("parentDevice=").append(parentDevice);
    }
    if (property != null) {
      builder.append(", ");
      builder.append("property=").append(property);
    }
    if (manufacturerReference != null) {
      builder.append(", ");
      builder.append("manufacturerReference=").append(manufacturerReference);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (shelfLifeStorage != null) {
      builder.append(", ");
      builder.append("shelfLifeStorage=").append(shelfLifeStorage);
    }
    if (physicalCharacteristics != null) {
      builder.append(", ");
      builder.append("physicalCharacteristics=").append(physicalCharacteristics);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (owner != null) {
      builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (deviceName != null) {
      builder.append(", ");
      builder.append("deviceName=").append(deviceName);
    }
    if (safety != null) {
      builder.append(", ");
      builder.append("safety=").append(safety);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DeviceDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DeviceDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> manufacturerString = java.util.Optional.empty();
    boolean manufacturerStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Material>> material = java.util.Optional.empty();
    boolean materialIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> languageCode = java.util.Optional.empty();
    boolean languageCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> onlineInformation = java.util.Optional.empty();
    boolean onlineInformationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> modelNumber = java.util.Optional.empty();
    boolean modelNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Specialization>> specialization = java.util.Optional.empty();
    boolean specializationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Capability>> capability = java.util.Optional.empty();
    boolean capabilityIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier = java.util.Optional.empty();
    boolean udiDeviceIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> parentDevice = java.util.Optional.empty();
    boolean parentDeviceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Property>> property = java.util.Optional.empty();
    boolean propertyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> manufacturerReference = java.util.Optional.empty();
    boolean manufacturerReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ProductShelfLife>> shelfLifeStorage = java.util.Optional.empty();
    boolean shelfLifeStorageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics = java.util.Optional.empty();
    boolean physicalCharacteristicsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> owner = java.util.Optional.empty();
    boolean ownerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceDefinition_DeviceName>> deviceName = java.util.Optional.empty();
    boolean deviceNameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety = java.util.Optional.empty();
    boolean safetyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturerString")
    public void setManufacturerString(java.util.Optional<java.lang.String> manufacturerString) {
      this.manufacturerString = manufacturerString;
      this.manufacturerStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("material")
    public void setMaterial(java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Material>> material) {
      this.material = material;
      this.materialIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    public void setLanguageCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> languageCode) {
      this.languageCode = languageCode;
      this.languageCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.util.List<java.lang.String>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onlineInformation")
    public void setOnlineInformation(java.util.Optional<com.fhir.uri> onlineInformation) {
      this.onlineInformation = onlineInformation;
      this.onlineInformationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modelNumber")
    public void setModelNumber(java.util.Optional<java.lang.String> modelNumber) {
      this.modelNumber = modelNumber;
      this.modelNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialization")
    public void setSpecialization(java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Specialization>> specialization) {
      this.specialization = specialization;
      this.specializationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("capability")
    public void setCapability(java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Capability>> capability) {
      this.capability = capability;
      this.capabilityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("udiDeviceIdentifier")
    public void setUdiDeviceIdentifier(java.util.Optional<java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier) {
      this.udiDeviceIdentifier = udiDeviceIdentifier;
      this.udiDeviceIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parentDevice")
    public void setParentDevice(java.util.Optional<com.fhir.Reference> parentDevice) {
      this.parentDevice = parentDevice;
      this.parentDeviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public void setProperty(java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturerReference")
    public void setManufacturerReference(java.util.Optional<com.fhir.Reference> manufacturerReference) {
      this.manufacturerReference = manufacturerReference;
      this.manufacturerReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("shelfLifeStorage")
    public void setShelfLifeStorage(java.util.Optional<java.util.List<com.fhir.ProductShelfLife>> shelfLifeStorage) {
      this.shelfLifeStorage = shelfLifeStorage;
      this.shelfLifeStorageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics) {
      this.physicalCharacteristics = physicalCharacteristics;
      this.physicalCharacteristicsIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
    public void setDeviceName(java.util.Optional<java.util.List<com.fhir.DeviceDefinition_DeviceName>> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("safety")
    public void setSafety(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety) {
      this.safety = safety;
      this.safetyIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> manufacturerString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Material>> material() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> languageCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> onlineInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> modelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Specialization>> specialization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Capability>> capability() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> parentDevice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> manufacturerReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ProductShelfLife>> shelfLifeStorage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceDefinition_DeviceName>> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> safety() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceDefinition fromJson(Json json) {
    ImmutableDeviceDefinition.Builder builder = ((ImmutableDeviceDefinition.Builder) ImmutableDeviceDefinition.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.manufacturerStringIsSet) {
      builder.manufacturerString(json.manufacturerString);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.materialIsSet) {
      builder.material(json.material);
    }
    if (json.languageCodeIsSet) {
      builder.languageCode(json.languageCode);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.onlineInformationIsSet) {
      builder.onlineInformation(json.onlineInformation);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modelNumberIsSet) {
      builder.modelNumber(json.modelNumber);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.specializationIsSet) {
      builder.specialization(json.specialization);
    }
    if (json.capabilityIsSet) {
      builder.capability(json.capability);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.udiDeviceIdentifierIsSet) {
      builder.udiDeviceIdentifier(json.udiDeviceIdentifier);
    }
    if (json.parentDeviceIsSet) {
      builder.parentDevice(json.parentDevice);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.manufacturerReferenceIsSet) {
      builder.manufacturerReference(json.manufacturerReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.shelfLifeStorageIsSet) {
      builder.shelfLifeStorage(json.shelfLifeStorage);
    }
    if (json.physicalCharacteristicsIsSet) {
      builder.physicalCharacteristics(json.physicalCharacteristics);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.deviceNameIsSet) {
      builder.deviceName(json.deviceName);
    }
    if (json.safetyIsSet) {
      builder.safety(json.safety);
    }
    return (ImmutableDeviceDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceDefinition instance
   */
  public static DeviceDefinition copyOf(DeviceDefinition instance) {
    if (instance instanceof ImmutableDeviceDefinition) {
      return (ImmutableDeviceDefinition) instance;
    }
    return ((ImmutableDeviceDefinition.Builder) ImmutableDeviceDefinition.builder())
        .language(instance.language())
        .type(instance.type())
        .manufacturerString(instance.manufacturerString())
        .text(instance.text())
        .material(instance.material())
        .languageCode(instance.languageCode())
        .modifierExtension(instance.modifierExtension())
        .version(instance.version())
        .url(instance.url())
        .extension(instance.extension())
        .note(instance.note())
        .onlineInformation(instance.onlineInformation())
        .contained(instance.contained())
        .modelNumber(instance.modelNumber())
        .contact(instance.contact())
        .specialization(instance.specialization())
        .capability(instance.capability())
        .resourceType(instance.resourceType())
        .udiDeviceIdentifier(instance.udiDeviceIdentifier())
        .parentDevice(instance.parentDevice())
        .property(instance.property())
        .manufacturerReference(instance.manufacturerReference())
        .meta(instance.meta())
        .id(instance.id())
        .identifier(instance.identifier())
        .quantity(instance.quantity())
        .shelfLifeStorage(instance.shelfLifeStorage())
        .physicalCharacteristics(instance.physicalCharacteristics())
        .implicitRules(instance.implicitRules())
        .owner(instance.owner())
        .deviceName(instance.deviceName())
        .safety(instance.safety())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition DeviceDefinition}.
   * <pre>
   * ImmutableDeviceDefinition.builder()
   *    .language(com.fhir.code) // optional {@link DeviceDefinition#language() language}
   *    .type(com.fhir.CodeableConcept) // optional {@link DeviceDefinition#type() type}
   *    .manufacturerString(String) // optional {@link DeviceDefinition#manufacturerString() manufacturerString}
   *    .text(com.fhir.Narrative) // optional {@link DeviceDefinition#text() text}
   *    .material(List&amp;lt;com.fhir.DeviceDefinition_Material&amp;gt;) // optional {@link DeviceDefinition#material() material}
   *    .languageCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceDefinition#languageCode() languageCode}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition#modifierExtension() modifierExtension}
   *    .version(List&amp;lt;String&amp;gt;) // optional {@link DeviceDefinition#version() version}
   *    .url(com.fhir.uri) // optional {@link DeviceDefinition#url() url}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition#extension() extension}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link DeviceDefinition#note() note}
   *    .onlineInformation(com.fhir.uri) // optional {@link DeviceDefinition#onlineInformation() onlineInformation}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DeviceDefinition#contained() contained}
   *    .modelNumber(String) // optional {@link DeviceDefinition#modelNumber() modelNumber}
   *    .contact(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link DeviceDefinition#contact() contact}
   *    .specialization(List&amp;lt;com.fhir.DeviceDefinition_Specialization&amp;gt;) // optional {@link DeviceDefinition#specialization() specialization}
   *    .capability(List&amp;lt;com.fhir.DeviceDefinition_Capability&amp;gt;) // optional {@link DeviceDefinition#capability() capability}
   *    .resourceType(String) // required {@link DeviceDefinition#resourceType() resourceType}
   *    .udiDeviceIdentifier(List&amp;lt;com.fhir.DeviceDefinition_UdiDeviceIdentifier&amp;gt;) // optional {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier}
   *    .parentDevice(com.fhir.Reference) // optional {@link DeviceDefinition#parentDevice() parentDevice}
   *    .property(List&amp;lt;com.fhir.DeviceDefinition_Property&amp;gt;) // optional {@link DeviceDefinition#property() property}
   *    .manufacturerReference(com.fhir.Reference) // optional {@link DeviceDefinition#manufacturerReference() manufacturerReference}
   *    .meta(com.fhir.Meta) // optional {@link DeviceDefinition#meta() meta}
   *    .id(com.fhir.id) // optional {@link DeviceDefinition#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DeviceDefinition#identifier() identifier}
   *    .quantity(com.fhir.Quantity) // optional {@link DeviceDefinition#quantity() quantity}
   *    .shelfLifeStorage(List&amp;lt;com.fhir.ProductShelfLife&amp;gt;) // optional {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage}
   *    .physicalCharacteristics(com.fhir.ProdCharacteristic) // optional {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics}
   *    .implicitRules(com.fhir.uri) // optional {@link DeviceDefinition#implicitRules() implicitRules}
   *    .owner(com.fhir.Reference) // optional {@link DeviceDefinition#owner() owner}
   *    .deviceName(List&amp;lt;com.fhir.DeviceDefinition_DeviceName&amp;gt;) // optional {@link DeviceDefinition#deviceName() deviceName}
   *    .safety(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceDefinition#safety() safety}
   *    .build();
   * </pre>
   * @return A new DeviceDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDeviceDefinition.Builder();
  }

  /**
   * Builds instances of type {@link DeviceDefinition DeviceDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DeviceDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_MANUFACTURER_STRING = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_MATERIAL = 0x10L;
    private static final long OPT_BIT_LANGUAGE_CODE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_VERSION = 0x80L;
    private static final long OPT_BIT_URL = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_NOTE = 0x400L;
    private static final long OPT_BIT_ONLINE_INFORMATION = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_MODEL_NUMBER = 0x2000L;
    private static final long OPT_BIT_CONTACT = 0x4000L;
    private static final long OPT_BIT_SPECIALIZATION = 0x8000L;
    private static final long OPT_BIT_CAPABILITY = 0x10000L;
    private static final long OPT_BIT_UDI_DEVICE_IDENTIFIER = 0x20000L;
    private static final long OPT_BIT_PARENT_DEVICE = 0x40000L;
    private static final long OPT_BIT_PROPERTY = 0x80000L;
    private static final long OPT_BIT_MANUFACTURER_REFERENCE = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_IDENTIFIER = 0x800000L;
    private static final long OPT_BIT_QUANTITY = 0x1000000L;
    private static final long OPT_BIT_SHELF_LIFE_STORAGE = 0x2000000L;
    private static final long OPT_BIT_PHYSICAL_CHARACTERISTICS = 0x4000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000000L;
    private static final long OPT_BIT_OWNER = 0x10000000L;
    private static final long OPT_BIT_DEVICE_NAME = 0x20000000L;
    private static final long OPT_BIT_SAFETY = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String manufacturerString;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Material> material;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> languageCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<java.lang.String> version;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.uri onlineInformation;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String modelNumber;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Specialization> specialization;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Capability> capability;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier;
    private @javax.annotation.Nullable com.fhir.Reference parentDevice;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_Property> property;
    private @javax.annotation.Nullable com.fhir.Reference manufacturerReference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable java.util.List<com.fhir.ProductShelfLife> shelfLifeStorage;
    private @javax.annotation.Nullable com.fhir.ProdCharacteristic physicalCharacteristics;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference owner;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceDefinition_DeviceName> deviceName;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> safety;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
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
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
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
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
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
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
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
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturerString(java.lang.String manufacturerString) {
      checkNotIsSet(manufacturerStringIsSet(), "manufacturerString");
      this.manufacturerString = java.util.Objects.requireNonNull(manufacturerString, "manufacturerString");
      optBits |= OPT_BIT_MANUFACTURER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturerString")
    public final Builder manufacturerString(java.util.Optional<java.lang.String> manufacturerString) {
      checkNotIsSet(manufacturerStringIsSet(), "manufacturerString");
      this.manufacturerString = manufacturerString.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
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
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
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
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    public final Builder material(java.util.List<com.fhir.DeviceDefinition_Material> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = java.util.Objects.requireNonNull(material, "material");
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("material")
    public final Builder material(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Material>> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = material.orElse(null);
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder languageCode(java.util.List<com.fhir.CodeableConcept> languageCode) {
      checkNotIsSet(languageCodeIsSet(), "languageCode");
      this.languageCode = java.util.Objects.requireNonNull(languageCode, "languageCode");
      optBits |= OPT_BIT_LANGUAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    public final Builder languageCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> languageCode) {
      checkNotIsSet(languageCodeIsSet(), "languageCode");
      this.languageCode = languageCode.orElse(null);
      optBits |= OPT_BIT_LANGUAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.util.List<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<? extends java.util.List<java.lang.String>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
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
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
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
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
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
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
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
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder onlineInformation(com.fhir.uri onlineInformation) {
      checkNotIsSet(onlineInformationIsSet(), "onlineInformation");
      this.onlineInformation = java.util.Objects.requireNonNull(onlineInformation, "onlineInformation");
      optBits |= OPT_BIT_ONLINE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineInformation")
    public final Builder onlineInformation(java.util.Optional<? extends com.fhir.uri> onlineInformation) {
      checkNotIsSet(onlineInformationIsSet(), "onlineInformation");
      this.onlineInformation = onlineInformation.orElse(null);
      optBits |= OPT_BIT_ONLINE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
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
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
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
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialization(java.util.List<com.fhir.DeviceDefinition_Specialization> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = java.util.Objects.requireNonNull(specialization, "specialization");
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialization")
    public final Builder specialization(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Specialization>> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = specialization.orElse(null);
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for chained invocation
     */
    public final Builder capability(java.util.List<com.fhir.DeviceDefinition_Capability> capability) {
      checkNotIsSet(capabilityIsSet(), "capability");
      this.capability = java.util.Objects.requireNonNull(capability, "capability");
      optBits |= OPT_BIT_CAPABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capability")
    public final Builder capability(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Capability>> capability) {
      checkNotIsSet(capabilityIsSet(), "capability");
      this.capability = capability.orElse(null);
      optBits |= OPT_BIT_CAPABILITY;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder udiDeviceIdentifier(java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier) {
      checkNotIsSet(udiDeviceIdentifierIsSet(), "udiDeviceIdentifier");
      this.udiDeviceIdentifier = java.util.Objects.requireNonNull(udiDeviceIdentifier, "udiDeviceIdentifier");
      optBits |= OPT_BIT_UDI_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("udiDeviceIdentifier")
    public final Builder udiDeviceIdentifier(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier) {
      checkNotIsSet(udiDeviceIdentifierIsSet(), "udiDeviceIdentifier");
      this.udiDeviceIdentifier = udiDeviceIdentifier.orElse(null);
      optBits |= OPT_BIT_UDI_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentDevice(com.fhir.Reference parentDevice) {
      checkNotIsSet(parentDeviceIsSet(), "parentDevice");
      this.parentDevice = java.util.Objects.requireNonNull(parentDevice, "parentDevice");
      optBits |= OPT_BIT_PARENT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentDevice")
    public final Builder parentDevice(java.util.Optional<? extends com.fhir.Reference> parentDevice) {
      checkNotIsSet(parentDeviceIsSet(), "parentDevice");
      this.parentDevice = parentDevice.orElse(null);
      optBits |= OPT_BIT_PARENT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(java.util.List<com.fhir.DeviceDefinition_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = java.util.Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public final Builder property(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturerReference(com.fhir.Reference manufacturerReference) {
      checkNotIsSet(manufacturerReferenceIsSet(), "manufacturerReference");
      this.manufacturerReference = java.util.Objects.requireNonNull(manufacturerReference, "manufacturerReference");
      optBits |= OPT_BIT_MANUFACTURER_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturerReference")
    public final Builder manufacturerReference(java.util.Optional<? extends com.fhir.Reference> manufacturerReference) {
      checkNotIsSet(manufacturerReferenceIsSet(), "manufacturerReference");
      this.manufacturerReference = manufacturerReference.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for chained invocation
     */
    public final Builder shelfLifeStorage(java.util.List<com.fhir.ProductShelfLife> shelfLifeStorage) {
      checkNotIsSet(shelfLifeStorageIsSet(), "shelfLifeStorage");
      this.shelfLifeStorage = java.util.Objects.requireNonNull(shelfLifeStorage, "shelfLifeStorage");
      optBits |= OPT_BIT_SHELF_LIFE_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shelfLifeStorage")
    public final Builder shelfLifeStorage(java.util.Optional<? extends java.util.List<com.fhir.ProductShelfLife>> shelfLifeStorage) {
      checkNotIsSet(shelfLifeStorageIsSet(), "shelfLifeStorage");
      this.shelfLifeStorage = shelfLifeStorage.orElse(null);
      optBits |= OPT_BIT_SHELF_LIFE_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder physicalCharacteristics(com.fhir.ProdCharacteristic physicalCharacteristics) {
      checkNotIsSet(physicalCharacteristicsIsSet(), "physicalCharacteristics");
      this.physicalCharacteristics = java.util.Objects.requireNonNull(physicalCharacteristics, "physicalCharacteristics");
      optBits |= OPT_BIT_PHYSICAL_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("physicalCharacteristics")
    public final Builder physicalCharacteristics(java.util.Optional<? extends com.fhir.ProdCharacteristic> physicalCharacteristics) {
      checkNotIsSet(physicalCharacteristicsIsSet(), "physicalCharacteristics");
      this.physicalCharacteristics = physicalCharacteristics.orElse(null);
      optBits |= OPT_BIT_PHYSICAL_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
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
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
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
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceName(java.util.List<com.fhir.DeviceDefinition_DeviceName> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = java.util.Objects.requireNonNull(deviceName, "deviceName");
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
    public final Builder deviceName(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_DeviceName>> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = deviceName.orElse(null);
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
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
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
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
     * Builds a new {@link DeviceDefinition DeviceDefinition}.
     * @return An immutable instance of DeviceDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DeviceDefinition build() {
      checkRequiredAttributes();
      return new ImmutableDeviceDefinition(
          language,
          type,
          manufacturerString,
          text,
          material,
          languageCode,
          modifierExtension,
          version,
          url,
          extension,
          note,
          onlineInformation,
          contained,
          modelNumber,
          contact,
          specialization,
          capability,
          resourceType,
          udiDeviceIdentifier,
          parentDevice,
          property,
          manufacturerReference,
          meta,
          id,
          identifier,
          quantity,
          shelfLifeStorage,
          physicalCharacteristics,
          implicitRules,
          owner,
          deviceName,
          safety);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean manufacturerStringIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER_STRING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean materialIsSet() {
      return (optBits & OPT_BIT_MATERIAL) != 0;
    }

    private boolean languageCodeIsSet() {
      return (optBits & OPT_BIT_LANGUAGE_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean onlineInformationIsSet() {
      return (optBits & OPT_BIT_ONLINE_INFORMATION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modelNumberIsSet() {
      return (optBits & OPT_BIT_MODEL_NUMBER) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean specializationIsSet() {
      return (optBits & OPT_BIT_SPECIALIZATION) != 0;
    }

    private boolean capabilityIsSet() {
      return (optBits & OPT_BIT_CAPABILITY) != 0;
    }

    private boolean udiDeviceIdentifierIsSet() {
      return (optBits & OPT_BIT_UDI_DEVICE_IDENTIFIER) != 0;
    }

    private boolean parentDeviceIsSet() {
      return (optBits & OPT_BIT_PARENT_DEVICE) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean manufacturerReferenceIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean shelfLifeStorageIsSet() {
      return (optBits & OPT_BIT_SHELF_LIFE_STORAGE) != 0;
    }

    private boolean physicalCharacteristicsIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_CHARACTERISTICS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean safetyIsSet() {
      return (optBits & OPT_BIT_SAFETY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DeviceDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DeviceDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DeviceDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DeviceDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturerString(java.lang.String manufacturerString);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturerString(java.util.Optional<java.lang.String> manufacturerString);

    /**
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    BuildFinal material(java.util.List<com.fhir.DeviceDefinition_Material> material);

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal material(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Material>> material);

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal languageCode(java.util.List<com.fhir.CodeableConcept> languageCode);

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal languageCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> languageCode);

    /**
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.util.List<java.lang.String> version);

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<? extends java.util.List<java.lang.String>> version);

    /**
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onlineInformation(com.fhir.uri onlineInformation);

    /**
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onlineInformation(java.util.Optional<? extends com.fhir.uri> onlineInformation);

    /**
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modelNumber(java.lang.String modelNumber);

    /**
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modelNumber(java.util.Optional<java.lang.String> modelNumber);

    /**
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactPoint> contact);

    /**
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact);

    /**
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialization(java.util.List<com.fhir.DeviceDefinition_Specialization> specialization);

    /**
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialization(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Specialization>> specialization);

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for chained invocation
     */
    BuildFinal capability(java.util.List<com.fhir.DeviceDefinition_Capability> capability);

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal capability(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Capability>> capability);

    /**
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udiDeviceIdentifier(java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udiDeviceIdentifier(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parentDevice(com.fhir.Reference parentDevice);

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parentDevice(java.util.Optional<? extends com.fhir.Reference> parentDevice);

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(java.util.List<com.fhir.DeviceDefinition_Property> property);

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_Property>> property);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturerReference(com.fhir.Reference manufacturerReference);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturerReference(java.util.Optional<? extends com.fhir.Reference> manufacturerReference);

    /**
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shelfLifeStorage(java.util.List<com.fhir.ProductShelfLife> shelfLifeStorage);

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shelfLifeStorage(java.util.Optional<? extends java.util.List<com.fhir.ProductShelfLife>> shelfLifeStorage);

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalCharacteristics(com.fhir.ProdCharacteristic physicalCharacteristics);

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalCharacteristics(java.util.Optional<? extends com.fhir.ProdCharacteristic> physicalCharacteristics);

    /**
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(com.fhir.Reference owner);

    /**
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(java.util.Optional<? extends com.fhir.Reference> owner);

    /**
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deviceName(java.util.List<com.fhir.DeviceDefinition_DeviceName> deviceName);

    /**
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deviceName(java.util.Optional<? extends java.util.List<com.fhir.DeviceDefinition_DeviceName>> deviceName);

    /**
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for chained invocation
     */
    BuildFinal safety(java.util.List<com.fhir.CodeableConcept> safety);

    /**
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal safety(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> safety);

    /**
     * Builds a new {@link DeviceDefinition DeviceDefinition}.
     * @return An immutable instance of DeviceDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceDefinition build();
  }
}
