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
 * Immutable implementation of {@link DeviceDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition.builder()}.
 */
@Generated(from = "DeviceDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition implements DeviceDefinition {
  private final @Nullable List<String> version;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference manufacturerReference;
  private final @Nullable List<DeviceDefinition_Material> material;
  private final @Nullable String manufacturerString;
  private final @Nullable List<Annotation> note;
  private final String resourceType;
  private final @Nullable List<ProductShelfLife> shelfLifeStorage;
  private final @Nullable Reference parentDevice;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept type;
  private final @Nullable Reference owner;
  private final @Nullable Uri onlineInformation;
  private final @Nullable List<DeviceDefinition_Capability> capability;
  private final @Nullable List<DeviceDefinition_Property> property;
  private final @Nullable Id id;
  private final @Nullable List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier;
  private final @Nullable List<CodeableConcept> languageCode;
  private final @Nullable ProdCharacteristic physicalCharacteristics;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Uri url;
  private final @Nullable Narrative text;
  private final @Nullable List<DeviceDefinition_DeviceName> deviceName;
  private final @Nullable String modelNumber;
  private final @Nullable List<CodeableConcept> safety;
  private final @Nullable Quantity quantity;
  private final @Nullable List<ContactPoint> contact;
  private final @Nullable List<DeviceDefinition_Specialization> specialization;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Code language;

  private ImmutableDeviceDefinition(
      @Nullable List<String> version,
      @Nullable Uri implicitRules,
      @Nullable Reference manufacturerReference,
      @Nullable List<DeviceDefinition_Material> material,
      @Nullable String manufacturerString,
      @Nullable List<Annotation> note,
      String resourceType,
      @Nullable List<ProductShelfLife> shelfLifeStorage,
      @Nullable Reference parentDevice,
      @Nullable List<Extension> modifierExtension,
      @Nullable Meta meta,
      @Nullable CodeableConcept type,
      @Nullable Reference owner,
      @Nullable Uri onlineInformation,
      @Nullable List<DeviceDefinition_Capability> capability,
      @Nullable List<DeviceDefinition_Property> property,
      @Nullable Id id,
      @Nullable List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier,
      @Nullable List<CodeableConcept> languageCode,
      @Nullable ProdCharacteristic physicalCharacteristics,
      @Nullable List<Identifier> identifier,
      @Nullable Uri url,
      @Nullable Narrative text,
      @Nullable List<DeviceDefinition_DeviceName> deviceName,
      @Nullable String modelNumber,
      @Nullable List<CodeableConcept> safety,
      @Nullable Quantity quantity,
      @Nullable List<ContactPoint> contact,
      @Nullable List<DeviceDefinition_Specialization> specialization,
      @Nullable List<Extension> extension,
      @Nullable List<ResourceList> contained,
      @Nullable Code language) {
    this.version = version;
    this.implicitRules = implicitRules;
    this.manufacturerReference = manufacturerReference;
    this.material = material;
    this.manufacturerString = manufacturerString;
    this.note = note;
    this.resourceType = resourceType;
    this.shelfLifeStorage = shelfLifeStorage;
    this.parentDevice = parentDevice;
    this.modifierExtension = modifierExtension;
    this.meta = meta;
    this.type = type;
    this.owner = owner;
    this.onlineInformation = onlineInformation;
    this.capability = capability;
    this.property = property;
    this.id = id;
    this.udiDeviceIdentifier = udiDeviceIdentifier;
    this.languageCode = languageCode;
    this.physicalCharacteristics = physicalCharacteristics;
    this.identifier = identifier;
    this.url = url;
    this.text = text;
    this.deviceName = deviceName;
    this.modelNumber = modelNumber;
    this.safety = safety;
    this.quantity = quantity;
    this.contact = contact;
    this.specialization = specialization;
    this.extension = extension;
    this.contained = contained;
    this.language = language;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<List<String>> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code manufacturerReference} attribute
   */
  @JsonProperty("manufacturerReference")
  @Override
  public Optional<Reference> manufacturerReference() {
    return Optional.ofNullable(manufacturerReference);
  }

  /**
   * @return The value of the {@code material} attribute
   */
  @JsonProperty("material")
  @Override
  public Optional<List<DeviceDefinition_Material>> material() {
    return Optional.ofNullable(material);
  }

  /**
   * @return The value of the {@code manufacturerString} attribute
   */
  @JsonProperty("manufacturerString")
  @Override
  public Optional<String> manufacturerString() {
    return Optional.ofNullable(manufacturerString);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code shelfLifeStorage} attribute
   */
  @JsonProperty("shelfLifeStorage")
  @Override
  public Optional<List<ProductShelfLife>> shelfLifeStorage() {
    return Optional.ofNullable(shelfLifeStorage);
  }

  /**
   * @return The value of the {@code parentDevice} attribute
   */
  @JsonProperty("parentDevice")
  @Override
  public Optional<Reference> parentDevice() {
    return Optional.ofNullable(parentDevice);
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
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code onlineInformation} attribute
   */
  @JsonProperty("onlineInformation")
  @Override
  public Optional<Uri> onlineInformation() {
    return Optional.ofNullable(onlineInformation);
  }

  /**
   * @return The value of the {@code capability} attribute
   */
  @JsonProperty("capability")
  @Override
  public Optional<List<DeviceDefinition_Capability>> capability() {
    return Optional.ofNullable(capability);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<List<DeviceDefinition_Property>> property() {
    return Optional.ofNullable(property);
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
   * @return The value of the {@code udiDeviceIdentifier} attribute
   */
  @JsonProperty("udiDeviceIdentifier")
  @Override
  public Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier() {
    return Optional.ofNullable(udiDeviceIdentifier);
  }

  /**
   * @return The value of the {@code languageCode} attribute
   */
  @JsonProperty("languageCode")
  @Override
  public Optional<List<CodeableConcept>> languageCode() {
    return Optional.ofNullable(languageCode);
  }

  /**
   * @return The value of the {@code physicalCharacteristics} attribute
   */
  @JsonProperty("physicalCharacteristics")
  @Override
  public Optional<ProdCharacteristic> physicalCharacteristics() {
    return Optional.ofNullable(physicalCharacteristics);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code deviceName} attribute
   */
  @JsonProperty("deviceName")
  @Override
  public Optional<List<DeviceDefinition_DeviceName>> deviceName() {
    return Optional.ofNullable(deviceName);
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
   * @return The value of the {@code safety} attribute
   */
  @JsonProperty("safety")
  @Override
  public Optional<List<CodeableConcept>> safety() {
    return Optional.ofNullable(safety);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
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
   * @return The value of the {@code specialization} attribute
   */
  @JsonProperty("specialization")
  @Override
  public Optional<List<DeviceDefinition_Specialization>> specialization() {
    return Optional.ofNullable(specialization);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withVersion(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableDeviceDefinition(
        newValue,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withVersion(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableDeviceDefinition(
        value,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        newValue,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        value,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#manufacturerReference() manufacturerReference} attribute.
   * @param value The value for manufacturerReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withManufacturerReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "manufacturerReference");
    if (this.manufacturerReference == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        newValue,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#manufacturerReference() manufacturerReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturerReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withManufacturerReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.manufacturerReference == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        value,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#material() material} attribute.
   * @param value The value for material
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withMaterial(List<DeviceDefinition_Material> value) {
    @Nullable List<DeviceDefinition_Material> newValue = Objects.requireNonNull(value, "material");
    if (this.material == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        newValue,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#material() material} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for material
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withMaterial(Optional<? extends List<DeviceDefinition_Material>> optional) {
    @Nullable List<DeviceDefinition_Material> value = optional.orElse(null);
    if (this.material == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        value,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#manufacturerString() manufacturerString} attribute.
   * @param value The value for manufacturerString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withManufacturerString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "manufacturerString");
    if (Objects.equals(this.manufacturerString, newValue)) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        newValue,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#manufacturerString() manufacturerString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturerString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withManufacturerString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.manufacturerString, value)) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        value,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        newValue,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        value,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        newValue,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} attribute.
   * @param value The value for shelfLifeStorage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withShelfLifeStorage(List<ProductShelfLife> value) {
    @Nullable List<ProductShelfLife> newValue = Objects.requireNonNull(value, "shelfLifeStorage");
    if (this.shelfLifeStorage == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        newValue,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shelfLifeStorage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withShelfLifeStorage(Optional<? extends List<ProductShelfLife>> optional) {
    @Nullable List<ProductShelfLife> value = optional.orElse(null);
    if (this.shelfLifeStorage == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        value,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#parentDevice() parentDevice} attribute.
   * @param value The value for parentDevice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withParentDevice(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "parentDevice");
    if (this.parentDevice == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        newValue,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#parentDevice() parentDevice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentDevice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withParentDevice(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.parentDevice == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        value,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        newValue,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        value,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        newValue,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        value,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        newValue,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        value,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withOwner(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        newValue,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withOwner(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        value,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#onlineInformation() onlineInformation} attribute.
   * @param value The value for onlineInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withOnlineInformation(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "onlineInformation");
    if (this.onlineInformation == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        newValue,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#onlineInformation() onlineInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onlineInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withOnlineInformation(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.onlineInformation == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        value,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#capability() capability} attribute.
   * @param value The value for capability
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withCapability(List<DeviceDefinition_Capability> value) {
    @Nullable List<DeviceDefinition_Capability> newValue = Objects.requireNonNull(value, "capability");
    if (this.capability == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        newValue,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#capability() capability} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for capability
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withCapability(Optional<? extends List<DeviceDefinition_Capability>> optional) {
    @Nullable List<DeviceDefinition_Capability> value = optional.orElse(null);
    if (this.capability == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        value,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withProperty(List<DeviceDefinition_Property> value) {
    @Nullable List<DeviceDefinition_Property> newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        newValue,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withProperty(Optional<? extends List<DeviceDefinition_Property>> optional) {
    @Nullable List<DeviceDefinition_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        value,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        newValue,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        value,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} attribute.
   * @param value The value for udiDeviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withUdiDeviceIdentifier(List<DeviceDefinition_UdiDeviceIdentifier> value) {
    @Nullable List<DeviceDefinition_UdiDeviceIdentifier> newValue = Objects.requireNonNull(value, "udiDeviceIdentifier");
    if (this.udiDeviceIdentifier == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        newValue,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udiDeviceIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withUdiDeviceIdentifier(Optional<? extends List<DeviceDefinition_UdiDeviceIdentifier>> optional) {
    @Nullable List<DeviceDefinition_UdiDeviceIdentifier> value = optional.orElse(null);
    if (this.udiDeviceIdentifier == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        value,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#languageCode() languageCode} attribute.
   * @param value The value for languageCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withLanguageCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "languageCode");
    if (this.languageCode == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        newValue,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#languageCode() languageCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for languageCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withLanguageCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.languageCode == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        value,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} attribute.
   * @param value The value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withPhysicalCharacteristics(ProdCharacteristic value) {
    @Nullable ProdCharacteristic newValue = Objects.requireNonNull(value, "physicalCharacteristics");
    if (this.physicalCharacteristics == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        newValue,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withPhysicalCharacteristics(Optional<? extends ProdCharacteristic> optional) {
    @Nullable ProdCharacteristic value = optional.orElse(null);
    if (this.physicalCharacteristics == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        value,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        newValue,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        value,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        newValue,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        value,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        newValue,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        value,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withDeviceName(List<DeviceDefinition_DeviceName> value) {
    @Nullable List<DeviceDefinition_DeviceName> newValue = Objects.requireNonNull(value, "deviceName");
    if (this.deviceName == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        newValue,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#deviceName() deviceName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withDeviceName(Optional<? extends List<DeviceDefinition_DeviceName>> optional) {
    @Nullable List<DeviceDefinition_DeviceName> value = optional.orElse(null);
    if (this.deviceName == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        value,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#modelNumber() modelNumber} attribute.
   * @param value The value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withModelNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "modelNumber");
    if (Objects.equals(this.modelNumber, newValue)) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        newValue,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#modelNumber() modelNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withModelNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.modelNumber, value)) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        value,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#safety() safety} attribute.
   * @param value The value for safety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withSafety(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "safety");
    if (this.safety == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        newValue,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#safety() safety} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for safety
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withSafety(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.safety == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        value,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        newValue,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        value,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withContact(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        newValue,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withContact(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        value,
        this.specialization,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#specialization() specialization} attribute.
   * @param value The value for specialization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withSpecialization(List<DeviceDefinition_Specialization> value) {
    @Nullable List<DeviceDefinition_Specialization> newValue = Objects.requireNonNull(value, "specialization");
    if (this.specialization == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        newValue,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#specialization() specialization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withSpecialization(Optional<? extends List<DeviceDefinition_Specialization>> optional) {
    @Nullable List<DeviceDefinition_Specialization> value = optional.orElse(null);
    if (this.specialization == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        value,
        this.extension,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        newValue,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        value,
        this.contained,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceDefinition(
        this.version,
        this.implicitRules,
        this.manufacturerReference,
        this.material,
        this.manufacturerString,
        this.note,
        this.resourceType,
        this.shelfLifeStorage,
        this.parentDevice,
        this.modifierExtension,
        this.meta,
        this.type,
        this.owner,
        this.onlineInformation,
        this.capability,
        this.property,
        this.id,
        this.udiDeviceIdentifier,
        this.languageCode,
        this.physicalCharacteristics,
        this.identifier,
        this.url,
        this.text,
        this.deviceName,
        this.modelNumber,
        this.safety,
        this.quantity,
        this.contact,
        this.specialization,
        this.extension,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition
        && equalTo((ImmutableDeviceDefinition) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition another) {
    return Objects.equals(version, another.version)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(manufacturerReference, another.manufacturerReference)
        && Objects.equals(material, another.material)
        && Objects.equals(manufacturerString, another.manufacturerString)
        && Objects.equals(note, another.note)
        && resourceType.equals(another.resourceType)
        && Objects.equals(shelfLifeStorage, another.shelfLifeStorage)
        && Objects.equals(parentDevice, another.parentDevice)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(type, another.type)
        && Objects.equals(owner, another.owner)
        && Objects.equals(onlineInformation, another.onlineInformation)
        && Objects.equals(capability, another.capability)
        && Objects.equals(property, another.property)
        && Objects.equals(id, another.id)
        && Objects.equals(udiDeviceIdentifier, another.udiDeviceIdentifier)
        && Objects.equals(languageCode, another.languageCode)
        && Objects.equals(physicalCharacteristics, another.physicalCharacteristics)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(url, another.url)
        && Objects.equals(text, another.text)
        && Objects.equals(deviceName, another.deviceName)
        && Objects.equals(modelNumber, another.modelNumber)
        && Objects.equals(safety, another.safety)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(contact, another.contact)
        && Objects.equals(specialization, another.specialization)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code implicitRules}, {@code manufacturerReference}, {@code material}, {@code manufacturerString}, {@code note}, {@code resourceType}, {@code shelfLifeStorage}, {@code parentDevice}, {@code modifierExtension}, {@code meta}, {@code type}, {@code owner}, {@code onlineInformation}, {@code capability}, {@code property}, {@code id}, {@code udiDeviceIdentifier}, {@code languageCode}, {@code physicalCharacteristics}, {@code identifier}, {@code url}, {@code text}, {@code deviceName}, {@code modelNumber}, {@code safety}, {@code quantity}, {@code contact}, {@code specialization}, {@code extension}, {@code contained}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(manufacturerReference);
    h += (h << 5) + Objects.hashCode(material);
    h += (h << 5) + Objects.hashCode(manufacturerString);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(shelfLifeStorage);
    h += (h << 5) + Objects.hashCode(parentDevice);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(owner);
    h += (h << 5) + Objects.hashCode(onlineInformation);
    h += (h << 5) + Objects.hashCode(capability);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(udiDeviceIdentifier);
    h += (h << 5) + Objects.hashCode(languageCode);
    h += (h << 5) + Objects.hashCode(physicalCharacteristics);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(deviceName);
    h += (h << 5) + Objects.hashCode(modelNumber);
    h += (h << 5) + Objects.hashCode(safety);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(specialization);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceDefinition{");
    if (version != null) {
      builder.append("version=").append(version);
    }
    if (implicitRules != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (manufacturerReference != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("manufacturerReference=").append(manufacturerReference);
    }
    if (material != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("material=").append(material);
    }
    if (manufacturerString != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("manufacturerString=").append(manufacturerString);
    }
    if (note != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (shelfLifeStorage != null) {
      builder.append(", ");
      builder.append("shelfLifeStorage=").append(shelfLifeStorage);
    }
    if (parentDevice != null) {
      builder.append(", ");
      builder.append("parentDevice=").append(parentDevice);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (owner != null) {
      builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (onlineInformation != null) {
      builder.append(", ");
      builder.append("onlineInformation=").append(onlineInformation);
    }
    if (capability != null) {
      builder.append(", ");
      builder.append("capability=").append(capability);
    }
    if (property != null) {
      builder.append(", ");
      builder.append("property=").append(property);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (udiDeviceIdentifier != null) {
      builder.append(", ");
      builder.append("udiDeviceIdentifier=").append(udiDeviceIdentifier);
    }
    if (languageCode != null) {
      builder.append(", ");
      builder.append("languageCode=").append(languageCode);
    }
    if (physicalCharacteristics != null) {
      builder.append(", ");
      builder.append("physicalCharacteristics=").append(physicalCharacteristics);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (deviceName != null) {
      builder.append(", ");
      builder.append("deviceName=").append(deviceName);
    }
    if (modelNumber != null) {
      builder.append(", ");
      builder.append("modelNumber=").append(modelNumber);
    }
    if (safety != null) {
      builder.append(", ");
      builder.append("safety=").append(safety);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (specialization != null) {
      builder.append(", ");
      builder.append("specialization=").append(specialization);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceDefinition {
    @Nullable Optional<List<String>> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> manufacturerReference = Optional.empty();
    boolean manufacturerReferenceIsSet;
    @Nullable Optional<List<DeviceDefinition_Material>> material = Optional.empty();
    boolean materialIsSet;
    @Nullable Optional<String> manufacturerString = Optional.empty();
    boolean manufacturerStringIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ProductShelfLife>> shelfLifeStorage = Optional.empty();
    boolean shelfLifeStorageIsSet;
    @Nullable Optional<Reference> parentDevice = Optional.empty();
    boolean parentDeviceIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> owner = Optional.empty();
    boolean ownerIsSet;
    @Nullable Optional<Uri> onlineInformation = Optional.empty();
    boolean onlineInformationIsSet;
    @Nullable Optional<List<DeviceDefinition_Capability>> capability = Optional.empty();
    boolean capabilityIsSet;
    @Nullable Optional<List<DeviceDefinition_Property>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier = Optional.empty();
    boolean udiDeviceIdentifierIsSet;
    @Nullable Optional<List<CodeableConcept>> languageCode = Optional.empty();
    boolean languageCodeIsSet;
    @Nullable Optional<ProdCharacteristic> physicalCharacteristics = Optional.empty();
    boolean physicalCharacteristicsIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<DeviceDefinition_DeviceName>> deviceName = Optional.empty();
    boolean deviceNameIsSet;
    @Nullable Optional<String> modelNumber = Optional.empty();
    boolean modelNumberIsSet;
    @Nullable Optional<List<CodeableConcept>> safety = Optional.empty();
    boolean safetyIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<ContactPoint>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<DeviceDefinition_Specialization>> specialization = Optional.empty();
    boolean specializationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("version")
    public void setVersion(Optional<List<String>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("manufacturerReference")
    public void setManufacturerReference(Optional<Reference> manufacturerReference) {
      this.manufacturerReference = manufacturerReference;
      this.manufacturerReferenceIsSet = true;
    }
    @JsonProperty("material")
    public void setMaterial(Optional<List<DeviceDefinition_Material>> material) {
      this.material = material;
      this.materialIsSet = true;
    }
    @JsonProperty("manufacturerString")
    public void setManufacturerString(Optional<String> manufacturerString) {
      this.manufacturerString = manufacturerString;
      this.manufacturerStringIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("shelfLifeStorage")
    public void setShelfLifeStorage(Optional<List<ProductShelfLife>> shelfLifeStorage) {
      this.shelfLifeStorage = shelfLifeStorage;
      this.shelfLifeStorageIsSet = true;
    }
    @JsonProperty("parentDevice")
    public void setParentDevice(Optional<Reference> parentDevice) {
      this.parentDevice = parentDevice;
      this.parentDeviceIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("owner")
    public void setOwner(Optional<Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @JsonProperty("onlineInformation")
    public void setOnlineInformation(Optional<Uri> onlineInformation) {
      this.onlineInformation = onlineInformation;
      this.onlineInformationIsSet = true;
    }
    @JsonProperty("capability")
    public void setCapability(Optional<List<DeviceDefinition_Capability>> capability) {
      this.capability = capability;
      this.capabilityIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<DeviceDefinition_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("udiDeviceIdentifier")
    public void setUdiDeviceIdentifier(Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier) {
      this.udiDeviceIdentifier = udiDeviceIdentifier;
      this.udiDeviceIdentifierIsSet = true;
    }
    @JsonProperty("languageCode")
    public void setLanguageCode(Optional<List<CodeableConcept>> languageCode) {
      this.languageCode = languageCode;
      this.languageCodeIsSet = true;
    }
    @JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(Optional<ProdCharacteristic> physicalCharacteristics) {
      this.physicalCharacteristics = physicalCharacteristics;
      this.physicalCharacteristicsIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("deviceName")
    public void setDeviceName(Optional<List<DeviceDefinition_DeviceName>> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @JsonProperty("modelNumber")
    public void setModelNumber(Optional<String> modelNumber) {
      this.modelNumber = modelNumber;
      this.modelNumberIsSet = true;
    }
    @JsonProperty("safety")
    public void setSafety(Optional<List<CodeableConcept>> safety) {
      this.safety = safety;
      this.safetyIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("specialization")
    public void setSpecialization(Optional<List<DeviceDefinition_Specialization>> specialization) {
      this.specialization = specialization;
      this.specializationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<List<String>> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> manufacturerReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceDefinition_Material>> material() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> manufacturerString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ProductShelfLife>> shelfLifeStorage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> parentDevice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> onlineInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceDefinition_Capability>> capability() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceDefinition_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> languageCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ProdCharacteristic> physicalCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceDefinition_DeviceName>> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> modelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> safety() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceDefinition_Specialization>> specialization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceDefinition fromJson(Json json) {
    ImmutableDeviceDefinition.Builder builder = ((ImmutableDeviceDefinition.Builder) ImmutableDeviceDefinition.builder());
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.manufacturerReferenceIsSet) {
      builder.manufacturerReference(json.manufacturerReference);
    }
    if (json.materialIsSet) {
      builder.material(json.material);
    }
    if (json.manufacturerStringIsSet) {
      builder.manufacturerString(json.manufacturerString);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.shelfLifeStorageIsSet) {
      builder.shelfLifeStorage(json.shelfLifeStorage);
    }
    if (json.parentDeviceIsSet) {
      builder.parentDevice(json.parentDevice);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.onlineInformationIsSet) {
      builder.onlineInformation(json.onlineInformation);
    }
    if (json.capabilityIsSet) {
      builder.capability(json.capability);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.udiDeviceIdentifierIsSet) {
      builder.udiDeviceIdentifier(json.udiDeviceIdentifier);
    }
    if (json.languageCodeIsSet) {
      builder.languageCode(json.languageCode);
    }
    if (json.physicalCharacteristicsIsSet) {
      builder.physicalCharacteristics(json.physicalCharacteristics);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.deviceNameIsSet) {
      builder.deviceName(json.deviceName);
    }
    if (json.modelNumberIsSet) {
      builder.modelNumber(json.modelNumber);
    }
    if (json.safetyIsSet) {
      builder.safety(json.safety);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.specializationIsSet) {
      builder.specialization(json.specialization);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
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
        .version(instance.version())
        .implicitRules(instance.implicitRules())
        .manufacturerReference(instance.manufacturerReference())
        .material(instance.material())
        .manufacturerString(instance.manufacturerString())
        .note(instance.note())
        .resourceType(instance.resourceType())
        .shelfLifeStorage(instance.shelfLifeStorage())
        .parentDevice(instance.parentDevice())
        .modifierExtension(instance.modifierExtension())
        .meta(instance.meta())
        .type(instance.type())
        .owner(instance.owner())
        .onlineInformation(instance.onlineInformation())
        .capability(instance.capability())
        .property(instance.property())
        .id(instance.id())
        .udiDeviceIdentifier(instance.udiDeviceIdentifier())
        .languageCode(instance.languageCode())
        .physicalCharacteristics(instance.physicalCharacteristics())
        .identifier(instance.identifier())
        .url(instance.url())
        .text(instance.text())
        .deviceName(instance.deviceName())
        .modelNumber(instance.modelNumber())
        .safety(instance.safety())
        .quantity(instance.quantity())
        .contact(instance.contact())
        .specialization(instance.specialization())
        .extension(instance.extension())
        .contained(instance.contained())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition DeviceDefinition}.
   * <pre>
   * ImmutableDeviceDefinition.builder()
   *    .version(List&amp;lt;String&amp;gt;) // optional {@link DeviceDefinition#version() version}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link DeviceDefinition#implicitRules() implicitRules}
   *    .manufacturerReference(com.medplum.types.fhir.Reference) // optional {@link DeviceDefinition#manufacturerReference() manufacturerReference}
   *    .material(List&amp;lt;com.medplum.types.fhir.DeviceDefinition_Material&amp;gt;) // optional {@link DeviceDefinition#material() material}
   *    .manufacturerString(String) // optional {@link DeviceDefinition#manufacturerString() manufacturerString}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link DeviceDefinition#note() note}
   *    .resourceType(String) // required {@link DeviceDefinition#resourceType() resourceType}
   *    .shelfLifeStorage(List&amp;lt;com.medplum.types.fhir.ProductShelfLife&amp;gt;) // optional {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage}
   *    .parentDevice(com.medplum.types.fhir.Reference) // optional {@link DeviceDefinition#parentDevice() parentDevice}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition#modifierExtension() modifierExtension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link DeviceDefinition#meta() meta}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link DeviceDefinition#type() type}
   *    .owner(com.medplum.types.fhir.Reference) // optional {@link DeviceDefinition#owner() owner}
   *    .onlineInformation(com.medplum.types.fhir.Uri) // optional {@link DeviceDefinition#onlineInformation() onlineInformation}
   *    .capability(List&amp;lt;com.medplum.types.fhir.DeviceDefinition_Capability&amp;gt;) // optional {@link DeviceDefinition#capability() capability}
   *    .property(List&amp;lt;com.medplum.types.fhir.DeviceDefinition_Property&amp;gt;) // optional {@link DeviceDefinition#property() property}
   *    .id(com.medplum.types.fhir.Id) // optional {@link DeviceDefinition#id() id}
   *    .udiDeviceIdentifier(List&amp;lt;com.medplum.types.fhir.DeviceDefinition_UdiDeviceIdentifier&amp;gt;) // optional {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier}
   *    .languageCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceDefinition#languageCode() languageCode}
   *    .physicalCharacteristics(com.medplum.types.fhir.ProdCharacteristic) // optional {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link DeviceDefinition#identifier() identifier}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link DeviceDefinition#url() url}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link DeviceDefinition#text() text}
   *    .deviceName(List&amp;lt;com.medplum.types.fhir.DeviceDefinition_DeviceName&amp;gt;) // optional {@link DeviceDefinition#deviceName() deviceName}
   *    .modelNumber(String) // optional {@link DeviceDefinition#modelNumber() modelNumber}
   *    .safety(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceDefinition#safety() safety}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link DeviceDefinition#quantity() quantity}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link DeviceDefinition#contact() contact}
   *    .specialization(List&amp;lt;com.medplum.types.fhir.DeviceDefinition_Specialization&amp;gt;) // optional {@link DeviceDefinition#specialization() specialization}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition#extension() extension}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link DeviceDefinition#contained() contained}
   *    .language(com.medplum.types.fhir.Code) // optional {@link DeviceDefinition#language() language}
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
  @Generated(from = "DeviceDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_VERSION = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_MANUFACTURER_REFERENCE = 0x4L;
    private static final long OPT_BIT_MATERIAL = 0x8L;
    private static final long OPT_BIT_MANUFACTURER_STRING = 0x10L;
    private static final long OPT_BIT_NOTE = 0x20L;
    private static final long OPT_BIT_SHELF_LIFE_STORAGE = 0x40L;
    private static final long OPT_BIT_PARENT_DEVICE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_TYPE = 0x400L;
    private static final long OPT_BIT_OWNER = 0x800L;
    private static final long OPT_BIT_ONLINE_INFORMATION = 0x1000L;
    private static final long OPT_BIT_CAPABILITY = 0x2000L;
    private static final long OPT_BIT_PROPERTY = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_UDI_DEVICE_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_LANGUAGE_CODE = 0x20000L;
    private static final long OPT_BIT_PHYSICAL_CHARACTERISTICS = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_URL = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_DEVICE_NAME = 0x400000L;
    private static final long OPT_BIT_MODEL_NUMBER = 0x800000L;
    private static final long OPT_BIT_SAFETY = 0x1000000L;
    private static final long OPT_BIT_QUANTITY = 0x2000000L;
    private static final long OPT_BIT_CONTACT = 0x4000000L;
    private static final long OPT_BIT_SPECIALIZATION = 0x8000000L;
    private static final long OPT_BIT_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_CONTAINED = 0x20000000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<String> version;
    private @Nullable Uri implicitRules;
    private @Nullable Reference manufacturerReference;
    private @Nullable List<DeviceDefinition_Material> material;
    private @Nullable String manufacturerString;
    private @Nullable List<Annotation> note;
    private @Nullable String resourceType;
    private @Nullable List<ProductShelfLife> shelfLifeStorage;
    private @Nullable Reference parentDevice;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept type;
    private @Nullable Reference owner;
    private @Nullable Uri onlineInformation;
    private @Nullable List<DeviceDefinition_Capability> capability;
    private @Nullable List<DeviceDefinition_Property> property;
    private @Nullable Id id;
    private @Nullable List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier;
    private @Nullable List<CodeableConcept> languageCode;
    private @Nullable ProdCharacteristic physicalCharacteristics;
    private @Nullable List<Identifier> identifier;
    private @Nullable Uri url;
    private @Nullable Narrative text;
    private @Nullable List<DeviceDefinition_DeviceName> deviceName;
    private @Nullable String modelNumber;
    private @Nullable List<CodeableConcept> safety;
    private @Nullable Quantity quantity;
    private @Nullable List<ContactPoint> contact;
    private @Nullable List<DeviceDefinition_Specialization> specialization;
    private @Nullable List<Extension> extension;
    private @Nullable List<ResourceList> contained;
    private @Nullable Code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(List<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<? extends List<String>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturerReference(Reference manufacturerReference) {
      checkNotIsSet(manufacturerReferenceIsSet(), "manufacturerReference");
      this.manufacturerReference = Objects.requireNonNull(manufacturerReference, "manufacturerReference");
      optBits |= OPT_BIT_MANUFACTURER_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturerReference")
    public final Builder manufacturerReference(Optional<? extends Reference> manufacturerReference) {
      checkNotIsSet(manufacturerReferenceIsSet(), "manufacturerReference");
      this.manufacturerReference = manufacturerReference.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    public final Builder material(List<DeviceDefinition_Material> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = Objects.requireNonNull(material, "material");
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("material")
    public final Builder material(Optional<? extends List<DeviceDefinition_Material>> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = material.orElse(null);
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturerString(String manufacturerString) {
      checkNotIsSet(manufacturerStringIsSet(), "manufacturerString");
      this.manufacturerString = Objects.requireNonNull(manufacturerString, "manufacturerString");
      optBits |= OPT_BIT_MANUFACTURER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturerString")
    public final Builder manufacturerString(Optional<String> manufacturerString) {
      checkNotIsSet(manufacturerStringIsSet(), "manufacturerString");
      this.manufacturerString = manufacturerString.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
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
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
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
     * Initializes the value for the {@link DeviceDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for chained invocation
     */
    public final Builder shelfLifeStorage(List<ProductShelfLife> shelfLifeStorage) {
      checkNotIsSet(shelfLifeStorageIsSet(), "shelfLifeStorage");
      this.shelfLifeStorage = Objects.requireNonNull(shelfLifeStorage, "shelfLifeStorage");
      optBits |= OPT_BIT_SHELF_LIFE_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("shelfLifeStorage")
    public final Builder shelfLifeStorage(Optional<? extends List<ProductShelfLife>> shelfLifeStorage) {
      checkNotIsSet(shelfLifeStorageIsSet(), "shelfLifeStorage");
      this.shelfLifeStorage = shelfLifeStorage.orElse(null);
      optBits |= OPT_BIT_SHELF_LIFE_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentDevice(Reference parentDevice) {
      checkNotIsSet(parentDeviceIsSet(), "parentDevice");
      this.parentDevice = Objects.requireNonNull(parentDevice, "parentDevice");
      optBits |= OPT_BIT_PARENT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentDevice")
    public final Builder parentDevice(Optional<? extends Reference> parentDevice) {
      checkNotIsSet(parentDeviceIsSet(), "parentDevice");
      this.parentDevice = parentDevice.orElse(null);
      optBits |= OPT_BIT_PARENT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
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
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
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
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
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
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
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
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder onlineInformation(Uri onlineInformation) {
      checkNotIsSet(onlineInformationIsSet(), "onlineInformation");
      this.onlineInformation = Objects.requireNonNull(onlineInformation, "onlineInformation");
      optBits |= OPT_BIT_ONLINE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onlineInformation")
    public final Builder onlineInformation(Optional<? extends Uri> onlineInformation) {
      checkNotIsSet(onlineInformationIsSet(), "onlineInformation");
      this.onlineInformation = onlineInformation.orElse(null);
      optBits |= OPT_BIT_ONLINE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for chained invocation
     */
    public final Builder capability(List<DeviceDefinition_Capability> capability) {
      checkNotIsSet(capabilityIsSet(), "capability");
      this.capability = Objects.requireNonNull(capability, "capability");
      optBits |= OPT_BIT_CAPABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("capability")
    public final Builder capability(Optional<? extends List<DeviceDefinition_Capability>> capability) {
      checkNotIsSet(capabilityIsSet(), "capability");
      this.capability = capability.orElse(null);
      optBits |= OPT_BIT_CAPABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(List<DeviceDefinition_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends List<DeviceDefinition_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder udiDeviceIdentifier(List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier) {
      checkNotIsSet(udiDeviceIdentifierIsSet(), "udiDeviceIdentifier");
      this.udiDeviceIdentifier = Objects.requireNonNull(udiDeviceIdentifier, "udiDeviceIdentifier");
      optBits |= OPT_BIT_UDI_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("udiDeviceIdentifier")
    public final Builder udiDeviceIdentifier(Optional<? extends List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier) {
      checkNotIsSet(udiDeviceIdentifierIsSet(), "udiDeviceIdentifier");
      this.udiDeviceIdentifier = udiDeviceIdentifier.orElse(null);
      optBits |= OPT_BIT_UDI_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder languageCode(List<CodeableConcept> languageCode) {
      checkNotIsSet(languageCodeIsSet(), "languageCode");
      this.languageCode = Objects.requireNonNull(languageCode, "languageCode");
      optBits |= OPT_BIT_LANGUAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("languageCode")
    public final Builder languageCode(Optional<? extends List<CodeableConcept>> languageCode) {
      checkNotIsSet(languageCodeIsSet(), "languageCode");
      this.languageCode = languageCode.orElse(null);
      optBits |= OPT_BIT_LANGUAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder physicalCharacteristics(ProdCharacteristic physicalCharacteristics) {
      checkNotIsSet(physicalCharacteristicsIsSet(), "physicalCharacteristics");
      this.physicalCharacteristics = Objects.requireNonNull(physicalCharacteristics, "physicalCharacteristics");
      optBits |= OPT_BIT_PHYSICAL_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("physicalCharacteristics")
    public final Builder physicalCharacteristics(Optional<? extends ProdCharacteristic> physicalCharacteristics) {
      checkNotIsSet(physicalCharacteristicsIsSet(), "physicalCharacteristics");
      this.physicalCharacteristics = physicalCharacteristics.orElse(null);
      optBits |= OPT_BIT_PHYSICAL_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
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
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
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
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
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
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
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
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceName(List<DeviceDefinition_DeviceName> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = Objects.requireNonNull(deviceName, "deviceName");
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deviceName")
    public final Builder deviceName(Optional<? extends List<DeviceDefinition_DeviceName>> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = deviceName.orElse(null);
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
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
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
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
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
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
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
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
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialization(List<DeviceDefinition_Specialization> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = Objects.requireNonNull(specialization, "specialization");
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialization")
    public final Builder specialization(Optional<? extends List<DeviceDefinition_Specialization>> specialization) {
      checkNotIsSet(specializationIsSet(), "specialization");
      this.specialization = specialization.orElse(null);
      optBits |= OPT_BIT_SPECIALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
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
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
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
     * Builds a new {@link DeviceDefinition DeviceDefinition}.
     * @return An immutable instance of DeviceDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceDefinition build() {
      checkRequiredAttributes();
      return new ImmutableDeviceDefinition(
          version,
          implicitRules,
          manufacturerReference,
          material,
          manufacturerString,
          note,
          resourceType,
          shelfLifeStorage,
          parentDevice,
          modifierExtension,
          meta,
          type,
          owner,
          onlineInformation,
          capability,
          property,
          id,
          udiDeviceIdentifier,
          languageCode,
          physicalCharacteristics,
          identifier,
          url,
          text,
          deviceName,
          modelNumber,
          safety,
          quantity,
          contact,
          specialization,
          extension,
          contained,
          language);
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean manufacturerReferenceIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER_REFERENCE) != 0;
    }

    private boolean materialIsSet() {
      return (optBits & OPT_BIT_MATERIAL) != 0;
    }

    private boolean manufacturerStringIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER_STRING) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean shelfLifeStorageIsSet() {
      return (optBits & OPT_BIT_SHELF_LIFE_STORAGE) != 0;
    }

    private boolean parentDeviceIsSet() {
      return (optBits & OPT_BIT_PARENT_DEVICE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean onlineInformationIsSet() {
      return (optBits & OPT_BIT_ONLINE_INFORMATION) != 0;
    }

    private boolean capabilityIsSet() {
      return (optBits & OPT_BIT_CAPABILITY) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean udiDeviceIdentifierIsSet() {
      return (optBits & OPT_BIT_UDI_DEVICE_IDENTIFIER) != 0;
    }

    private boolean languageCodeIsSet() {
      return (optBits & OPT_BIT_LANGUAGE_CODE) != 0;
    }

    private boolean physicalCharacteristicsIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_CHARACTERISTICS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean modelNumberIsSet() {
      return (optBits & OPT_BIT_MODEL_NUMBER) != 0;
    }

    private boolean safetyIsSet() {
      return (optBits & OPT_BIT_SAFETY) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean specializationIsSet() {
      return (optBits & OPT_BIT_SPECIALIZATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DeviceDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DeviceDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DeviceDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(List<String> version);

    /**
     * Initializes the optional value {@link DeviceDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<? extends List<String>> version);

    /**
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturerReference(Reference manufacturerReference);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerReference() manufacturerReference} to manufacturerReference.
     * @param manufacturerReference The value for manufacturerReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturerReference(Optional<? extends Reference> manufacturerReference);

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    BuildFinal material(List<DeviceDefinition_Material> material);

    /**
     * Initializes the optional value {@link DeviceDefinition#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal material(Optional<? extends List<DeviceDefinition_Material>> material);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturerString(String manufacturerString);

    /**
     * Initializes the optional value {@link DeviceDefinition#manufacturerString() manufacturerString} to manufacturerString.
     * @param manufacturerString The value for manufacturerString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturerString(Optional<String> manufacturerString);

    /**
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link DeviceDefinition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shelfLifeStorage(List<ProductShelfLife> shelfLifeStorage);

    /**
     * Initializes the optional value {@link DeviceDefinition#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shelfLifeStorage(Optional<? extends List<ProductShelfLife>> shelfLifeStorage);

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parentDevice(Reference parentDevice);

    /**
     * Initializes the optional value {@link DeviceDefinition#parentDevice() parentDevice} to parentDevice.
     * @param parentDevice The value for parentDevice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parentDevice(Optional<? extends Reference> parentDevice);

    /**
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DeviceDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link DeviceDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(Reference owner);

    /**
     * Initializes the optional value {@link DeviceDefinition#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(Optional<? extends Reference> owner);

    /**
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onlineInformation(Uri onlineInformation);

    /**
     * Initializes the optional value {@link DeviceDefinition#onlineInformation() onlineInformation} to onlineInformation.
     * @param onlineInformation The value for onlineInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onlineInformation(Optional<? extends Uri> onlineInformation);

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for chained invocation
     */
    BuildFinal capability(List<DeviceDefinition_Capability> capability);

    /**
     * Initializes the optional value {@link DeviceDefinition#capability() capability} to capability.
     * @param capability The value for capability
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal capability(Optional<? extends List<DeviceDefinition_Capability>> capability);

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(List<DeviceDefinition_Property> property);

    /**
     * Initializes the optional value {@link DeviceDefinition#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(Optional<? extends List<DeviceDefinition_Property>> property);

    /**
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DeviceDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udiDeviceIdentifier(List<DeviceDefinition_UdiDeviceIdentifier> udiDeviceIdentifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#udiDeviceIdentifier() udiDeviceIdentifier} to udiDeviceIdentifier.
     * @param udiDeviceIdentifier The value for udiDeviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udiDeviceIdentifier(Optional<? extends List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal languageCode(List<CodeableConcept> languageCode);

    /**
     * Initializes the optional value {@link DeviceDefinition#languageCode() languageCode} to languageCode.
     * @param languageCode The value for languageCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal languageCode(Optional<? extends List<CodeableConcept>> languageCode);

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalCharacteristics(ProdCharacteristic physicalCharacteristics);

    /**
     * Initializes the optional value {@link DeviceDefinition#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalCharacteristics(Optional<? extends ProdCharacteristic> physicalCharacteristics);

    /**
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link DeviceDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DeviceDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deviceName(List<DeviceDefinition_DeviceName> deviceName);

    /**
     * Initializes the optional value {@link DeviceDefinition#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deviceName(Optional<? extends List<DeviceDefinition_DeviceName>> deviceName);

    /**
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modelNumber(String modelNumber);

    /**
     * Initializes the optional value {@link DeviceDefinition#modelNumber() modelNumber} to modelNumber.
     * @param modelNumber The value for modelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modelNumber(Optional<String> modelNumber);

    /**
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for chained invocation
     */
    BuildFinal safety(List<CodeableConcept> safety);

    /**
     * Initializes the optional value {@link DeviceDefinition#safety() safety} to safety.
     * @param safety The value for safety
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal safety(Optional<? extends List<CodeableConcept>> safety);

    /**
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link DeviceDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactPoint> contact);

    /**
     * Initializes the optional value {@link DeviceDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactPoint>> contact);

    /**
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialization(List<DeviceDefinition_Specialization> specialization);

    /**
     * Initializes the optional value {@link DeviceDefinition#specialization() specialization} to specialization.
     * @param specialization The value for specialization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialization(Optional<? extends List<DeviceDefinition_Specialization>> specialization);

    /**
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DeviceDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Builds a new {@link DeviceDefinition DeviceDefinition}.
     * @return An immutable instance of DeviceDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceDefinition build();
  }
}
