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
 * Immutable implementation of {@link MedicinalProductPackaged_PackageItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPackaged_PackageItem.builder()}.
 */
@Generated(from = "MedicinalProductPackaged_PackageItem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPackaged_PackageItem
    implements MedicinalProductPackaged_PackageItem {
  private final @Nullable List<Reference> manufacturer;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> material;
  private final @Nullable List<CodeableConcept> alternateMaterial;
  private final @Nullable List<Extension> modifierExtension;
  private final Quantity quantity;
  private final @Nullable List<Reference> manufacturedItem;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ProductShelfLife> shelfLifeStorage;
  private final @Nullable List<Reference> device;
  private final @Nullable List<MedicinalProductPackaged_PackageItem> packageItem;
  private final @Nullable List<CodeableConcept> otherCharacteristics;
  private final @Nullable ProdCharacteristic physicalCharacteristics;
  private final CodeableConcept type;

  private ImmutableMedicinalProductPackaged_PackageItem(
      @Nullable List<Reference> manufacturer,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> material,
      @Nullable List<CodeableConcept> alternateMaterial,
      @Nullable List<Extension> modifierExtension,
      Quantity quantity,
      @Nullable List<Reference> manufacturedItem,
      @Nullable List<Identifier> identifier,
      @Nullable List<ProductShelfLife> shelfLifeStorage,
      @Nullable List<Reference> device,
      @Nullable List<MedicinalProductPackaged_PackageItem> packageItem,
      @Nullable List<CodeableConcept> otherCharacteristics,
      @Nullable ProdCharacteristic physicalCharacteristics,
      CodeableConcept type) {
    this.manufacturer = manufacturer;
    this.id = id;
    this.extension = extension;
    this.material = material;
    this.alternateMaterial = alternateMaterial;
    this.modifierExtension = modifierExtension;
    this.quantity = quantity;
    this.manufacturedItem = manufacturedItem;
    this.identifier = identifier;
    this.shelfLifeStorage = shelfLifeStorage;
    this.device = device;
    this.packageItem = packageItem;
    this.otherCharacteristics = otherCharacteristics;
    this.physicalCharacteristics = physicalCharacteristics;
    this.type = type;
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<List<Reference>> manufacturer() {
    return Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code material} attribute
   */
  @JsonProperty("material")
  @Override
  public Optional<List<CodeableConcept>> material() {
    return Optional.ofNullable(material);
  }

  /**
   * @return The value of the {@code alternateMaterial} attribute
   */
  @JsonProperty("alternateMaterial")
  @Override
  public Optional<List<CodeableConcept>> alternateMaterial() {
    return Optional.ofNullable(alternateMaterial);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Quantity quantity() {
    return quantity;
  }

  /**
   * @return The value of the {@code manufacturedItem} attribute
   */
  @JsonProperty("manufacturedItem")
  @Override
  public Optional<List<Reference>> manufacturedItem() {
    return Optional.ofNullable(manufacturedItem);
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
   * @return The value of the {@code shelfLifeStorage} attribute
   */
  @JsonProperty("shelfLifeStorage")
  @Override
  public Optional<List<ProductShelfLife>> shelfLifeStorage() {
    return Optional.ofNullable(shelfLifeStorage);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @JsonProperty("device")
  @Override
  public Optional<List<Reference>> device() {
    return Optional.ofNullable(device);
  }

  /**
   * @return The value of the {@code packageItem} attribute
   */
  @JsonProperty("packageItem")
  @Override
  public Optional<List<MedicinalProductPackaged_PackageItem>> packageItem() {
    return Optional.ofNullable(packageItem);
  }

  /**
   * @return The value of the {@code otherCharacteristics} attribute
   */
  @JsonProperty("otherCharacteristics")
  @Override
  public Optional<List<CodeableConcept>> otherCharacteristics() {
    return Optional.ofNullable(otherCharacteristics);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withManufacturer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        newValue,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withManufacturer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        value,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        newValue,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        value,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        newValue,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        value,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#material() material} attribute.
   * @param value The value for material
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withMaterial(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "material");
    if (this.material == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        newValue,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#material() material} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for material
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withMaterial(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.material == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        value,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial} attribute.
   * @param value The value for alternateMaterial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withAlternateMaterial(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "alternateMaterial");
    if (this.alternateMaterial == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        newValue,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alternateMaterial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withAlternateMaterial(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.alternateMaterial == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        value,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        newValue,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        value,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPackaged_PackageItem#quantity() quantity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withQuantity(Quantity value) {
    if (this.quantity == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "quantity");
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        newValue,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem} attribute.
   * @param value The value for manufacturedItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withManufacturedItem(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "manufacturedItem");
    if (this.manufacturedItem == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        newValue,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturedItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withManufacturedItem(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.manufacturedItem == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        value,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        newValue,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        value,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage} attribute.
   * @param value The value for shelfLifeStorage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withShelfLifeStorage(List<ProductShelfLife> value) {
    @Nullable List<ProductShelfLife> newValue = Objects.requireNonNull(value, "shelfLifeStorage");
    if (this.shelfLifeStorage == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        newValue,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shelfLifeStorage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withShelfLifeStorage(Optional<? extends List<ProductShelfLife>> optional) {
    @Nullable List<ProductShelfLife> value = optional.orElse(null);
    if (this.shelfLifeStorage == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        value,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withDevice(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        newValue,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withDevice(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        value,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem} attribute.
   * @param value The value for packageItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withPackageItem(List<MedicinalProductPackaged_PackageItem> value) {
    @Nullable List<MedicinalProductPackaged_PackageItem> newValue = Objects.requireNonNull(value, "packageItem");
    if (this.packageItem == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        newValue,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withPackageItem(Optional<? extends List<MedicinalProductPackaged_PackageItem>> optional) {
    @Nullable List<MedicinalProductPackaged_PackageItem> value = optional.orElse(null);
    if (this.packageItem == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        value,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics} attribute.
   * @param value The value for otherCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withOtherCharacteristics(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "otherCharacteristics");
    if (this.otherCharacteristics == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        newValue,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withOtherCharacteristics(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.otherCharacteristics == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        value,
        this.physicalCharacteristics,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics} attribute.
   * @param value The value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withPhysicalCharacteristics(ProdCharacteristic value) {
    @Nullable ProdCharacteristic newValue = Objects.requireNonNull(value, "physicalCharacteristics");
    if (this.physicalCharacteristics == newValue) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_PackageItem withPhysicalCharacteristics(Optional<? extends ProdCharacteristic> optional) {
    @Nullable ProdCharacteristic value = optional.orElse(null);
    if (this.physicalCharacteristics == value) return this;
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPackaged_PackageItem#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_PackageItem withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableMedicinalProductPackaged_PackageItem(
        this.manufacturer,
        this.id,
        this.extension,
        this.material,
        this.alternateMaterial,
        this.modifierExtension,
        this.quantity,
        this.manufacturedItem,
        this.identifier,
        this.shelfLifeStorage,
        this.device,
        this.packageItem,
        this.otherCharacteristics,
        this.physicalCharacteristics,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPackaged_PackageItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPackaged_PackageItem
        && equalTo((ImmutableMedicinalProductPackaged_PackageItem) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPackaged_PackageItem another) {
    return Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(material, another.material)
        && Objects.equals(alternateMaterial, another.alternateMaterial)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && quantity.equals(another.quantity)
        && Objects.equals(manufacturedItem, another.manufacturedItem)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(shelfLifeStorage, another.shelfLifeStorage)
        && Objects.equals(device, another.device)
        && Objects.equals(packageItem, another.packageItem)
        && Objects.equals(otherCharacteristics, another.otherCharacteristics)
        && Objects.equals(physicalCharacteristics, another.physicalCharacteristics)
        && type.equals(another.type);
  }

  /**
   * Computes a hash code from attributes: {@code manufacturer}, {@code id}, {@code extension}, {@code material}, {@code alternateMaterial}, {@code modifierExtension}, {@code quantity}, {@code manufacturedItem}, {@code identifier}, {@code shelfLifeStorage}, {@code device}, {@code packageItem}, {@code otherCharacteristics}, {@code physicalCharacteristics}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(material);
    h += (h << 5) + Objects.hashCode(alternateMaterial);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + quantity.hashCode();
    h += (h << 5) + Objects.hashCode(manufacturedItem);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(shelfLifeStorage);
    h += (h << 5) + Objects.hashCode(device);
    h += (h << 5) + Objects.hashCode(packageItem);
    h += (h << 5) + Objects.hashCode(otherCharacteristics);
    h += (h << 5) + Objects.hashCode(physicalCharacteristics);
    h += (h << 5) + type.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPackaged_PackageItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPackaged_PackageItem{");
    if (manufacturer != null) {
      builder.append("manufacturer=").append(manufacturer);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (material != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("material=").append(material);
    }
    if (alternateMaterial != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("alternateMaterial=").append(alternateMaterial);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 37) builder.append(", ");
    builder.append("quantity=").append(quantity);
    if (manufacturedItem != null) {
      builder.append(", ");
      builder.append("manufacturedItem=").append(manufacturedItem);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (shelfLifeStorage != null) {
      builder.append(", ");
      builder.append("shelfLifeStorage=").append(shelfLifeStorage);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (packageItem != null) {
      builder.append(", ");
      builder.append("packageItem=").append(packageItem);
    }
    if (otherCharacteristics != null) {
      builder.append(", ");
      builder.append("otherCharacteristics=").append(otherCharacteristics);
    }
    if (physicalCharacteristics != null) {
      builder.append(", ");
      builder.append("physicalCharacteristics=").append(physicalCharacteristics);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductPackaged_PackageItem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPackaged_PackageItem {
    @Nullable Optional<List<Reference>> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> material = Optional.empty();
    boolean materialIsSet;
    @Nullable Optional<List<CodeableConcept>> alternateMaterial = Optional.empty();
    boolean alternateMaterialIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Quantity quantity;
    @Nullable Optional<List<Reference>> manufacturedItem = Optional.empty();
    boolean manufacturedItemIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ProductShelfLife>> shelfLifeStorage = Optional.empty();
    boolean shelfLifeStorageIsSet;
    @Nullable Optional<List<Reference>> device = Optional.empty();
    boolean deviceIsSet;
    @Nullable Optional<List<MedicinalProductPackaged_PackageItem>> packageItem = Optional.empty();
    boolean packageItemIsSet;
    @Nullable Optional<List<CodeableConcept>> otherCharacteristics = Optional.empty();
    boolean otherCharacteristicsIsSet;
    @Nullable Optional<ProdCharacteristic> physicalCharacteristics = Optional.empty();
    boolean physicalCharacteristicsIsSet;
    @Nullable CodeableConcept type;
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<List<Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("material")
    public void setMaterial(Optional<List<CodeableConcept>> material) {
      this.material = material;
      this.materialIsSet = true;
    }
    @JsonProperty("alternateMaterial")
    public void setAlternateMaterial(Optional<List<CodeableConcept>> alternateMaterial) {
      this.alternateMaterial = alternateMaterial;
      this.alternateMaterialIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
      this.quantity = quantity;
    }
    @JsonProperty("manufacturedItem")
    public void setManufacturedItem(Optional<List<Reference>> manufacturedItem) {
      this.manufacturedItem = manufacturedItem;
      this.manufacturedItemIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("shelfLifeStorage")
    public void setShelfLifeStorage(Optional<List<ProductShelfLife>> shelfLifeStorage) {
      this.shelfLifeStorage = shelfLifeStorage;
      this.shelfLifeStorageIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Optional<List<Reference>> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @JsonProperty("packageItem")
    public void setPackageItem(Optional<List<MedicinalProductPackaged_PackageItem>> packageItem) {
      this.packageItem = packageItem;
      this.packageItemIsSet = true;
    }
    @JsonProperty("otherCharacteristics")
    public void setOtherCharacteristics(Optional<List<CodeableConcept>> otherCharacteristics) {
      this.otherCharacteristics = otherCharacteristics;
      this.otherCharacteristicsIsSet = true;
    }
    @JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(Optional<ProdCharacteristic> physicalCharacteristics) {
      this.physicalCharacteristics = physicalCharacteristics;
      this.physicalCharacteristicsIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @Override
    public Optional<List<Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> material() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> alternateMaterial() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> manufacturedItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ProductShelfLife>> shelfLifeStorage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductPackaged_PackageItem>> packageItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> otherCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ProdCharacteristic> physicalCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPackaged_PackageItem fromJson(Json json) {
    ImmutableMedicinalProductPackaged_PackageItem.Builder builder = ((ImmutableMedicinalProductPackaged_PackageItem.Builder) ImmutableMedicinalProductPackaged_PackageItem.builder());
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.materialIsSet) {
      builder.material(json.material);
    }
    if (json.alternateMaterialIsSet) {
      builder.alternateMaterial(json.alternateMaterial);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.quantity != null) {
      builder.quantity(json.quantity);
    }
    if (json.manufacturedItemIsSet) {
      builder.manufacturedItem(json.manufacturedItem);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.shelfLifeStorageIsSet) {
      builder.shelfLifeStorage(json.shelfLifeStorage);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.packageItemIsSet) {
      builder.packageItem(json.packageItem);
    }
    if (json.otherCharacteristicsIsSet) {
      builder.otherCharacteristics(json.otherCharacteristics);
    }
    if (json.physicalCharacteristicsIsSet) {
      builder.physicalCharacteristics(json.physicalCharacteristics);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    return (ImmutableMedicinalProductPackaged_PackageItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPackaged_PackageItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPackaged_PackageItem instance
   */
  public static MedicinalProductPackaged_PackageItem copyOf(MedicinalProductPackaged_PackageItem instance) {
    if (instance instanceof ImmutableMedicinalProductPackaged_PackageItem) {
      return (ImmutableMedicinalProductPackaged_PackageItem) instance;
    }
    return ((ImmutableMedicinalProductPackaged_PackageItem.Builder) ImmutableMedicinalProductPackaged_PackageItem.builder())
        .manufacturer(instance.manufacturer())
        .id(instance.id())
        .extension(instance.extension())
        .material(instance.material())
        .alternateMaterial(instance.alternateMaterial())
        .modifierExtension(instance.modifierExtension())
        .quantity(instance.quantity())
        .manufacturedItem(instance.manufacturedItem())
        .identifier(instance.identifier())
        .shelfLifeStorage(instance.shelfLifeStorage())
        .device(instance.device())
        .packageItem(instance.packageItem())
        .otherCharacteristics(instance.otherCharacteristics())
        .physicalCharacteristics(instance.physicalCharacteristics())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPackaged_PackageItem MedicinalProductPackaged_PackageItem}.
   * <pre>
   * ImmutableMedicinalProductPackaged_PackageItem.builder()
   *    .manufacturer(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer}
   *    .id(String) // optional {@link MedicinalProductPackaged_PackageItem#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#extension() extension}
   *    .material(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#material() material}
   *    .alternateMaterial(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension}
   *    .quantity(com.fhir.types.fhir.Quantity) // required {@link MedicinalProductPackaged_PackageItem#quantity() quantity}
   *    .manufacturedItem(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#identifier() identifier}
   *    .shelfLifeStorage(List&amp;lt;com.fhir.types.fhir.ProductShelfLife&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage}
   *    .device(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#device() device}
   *    .packageItem(List&amp;lt;com.fhir.types.fhir.MedicinalProductPackaged_PackageItem&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem}
   *    .otherCharacteristics(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics}
   *    .physicalCharacteristics(com.fhir.types.fhir.ProdCharacteristic) // optional {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link MedicinalProductPackaged_PackageItem#type() type}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPackaged_PackageItem builder
   */
  public static QuantityBuildStage builder() {
    return new ImmutableMedicinalProductPackaged_PackageItem.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPackaged_PackageItem MedicinalProductPackaged_PackageItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPackaged_PackageItem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements QuantityBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_QUANTITY = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_MANUFACTURER = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MATERIAL = 0x8L;
    private static final long OPT_BIT_ALTERNATE_MATERIAL = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_MANUFACTURED_ITEM = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_SHELF_LIFE_STORAGE = 0x100L;
    private static final long OPT_BIT_DEVICE = 0x200L;
    private static final long OPT_BIT_PACKAGE_ITEM = 0x400L;
    private static final long OPT_BIT_OTHER_CHARACTERISTICS = 0x800L;
    private static final long OPT_BIT_PHYSICAL_CHARACTERISTICS = 0x1000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Reference> manufacturer;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> material;
    private @Nullable List<CodeableConcept> alternateMaterial;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity quantity;
    private @Nullable List<Reference> manufacturedItem;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ProductShelfLife> shelfLifeStorage;
    private @Nullable List<Reference> device;
    private @Nullable List<MedicinalProductPackaged_PackageItem> packageItem;
    private @Nullable List<CodeableConcept> otherCharacteristics;
    private @Nullable ProdCharacteristic physicalCharacteristics;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(List<Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<? extends List<Reference>> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    public final Builder material(List<CodeableConcept> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = Objects.requireNonNull(material, "material");
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("material")
    public final Builder material(Optional<? extends List<CodeableConcept>> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = material.orElse(null);
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial} to alternateMaterial.
     * @param alternateMaterial The value for alternateMaterial
     * @return {@code this} builder for chained invocation
     */
    public final Builder alternateMaterial(List<CodeableConcept> alternateMaterial) {
      checkNotIsSet(alternateMaterialIsSet(), "alternateMaterial");
      this.alternateMaterial = Objects.requireNonNull(alternateMaterial, "alternateMaterial");
      optBits |= OPT_BIT_ALTERNATE_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial} to alternateMaterial.
     * @param alternateMaterial The value for alternateMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alternateMaterial")
    public final Builder alternateMaterial(Optional<? extends List<CodeableConcept>> alternateMaterial) {
      checkNotIsSet(alternateMaterialIsSet(), "alternateMaterial");
      this.alternateMaterial = alternateMaterial.orElse(null);
      optBits |= OPT_BIT_ALTERNATE_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicinalProductPackaged_PackageItem#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      initBits &= ~INIT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem} to manufacturedItem.
     * @param manufacturedItem The value for manufacturedItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturedItem(List<Reference> manufacturedItem) {
      checkNotIsSet(manufacturedItemIsSet(), "manufacturedItem");
      this.manufacturedItem = Objects.requireNonNull(manufacturedItem, "manufacturedItem");
      optBits |= OPT_BIT_MANUFACTURED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem} to manufacturedItem.
     * @param manufacturedItem The value for manufacturedItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturedItem")
    public final Builder manufacturedItem(Optional<? extends List<Reference>> manufacturedItem) {
      checkNotIsSet(manufacturedItemIsSet(), "manufacturedItem");
      this.manufacturedItem = manufacturedItem.orElse(null);
      optBits |= OPT_BIT_MANUFACTURED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(List<Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("device")
    public final Builder device(Optional<? extends List<Reference>> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem} to packageItem.
     * @param packageItem The value for packageItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageItem(List<MedicinalProductPackaged_PackageItem> packageItem) {
      checkNotIsSet(packageItemIsSet(), "packageItem");
      this.packageItem = Objects.requireNonNull(packageItem, "packageItem");
      optBits |= OPT_BIT_PACKAGE_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem} to packageItem.
     * @param packageItem The value for packageItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packageItem")
    public final Builder packageItem(Optional<? extends List<MedicinalProductPackaged_PackageItem>> packageItem) {
      checkNotIsSet(packageItemIsSet(), "packageItem");
      this.packageItem = packageItem.orElse(null);
      optBits |= OPT_BIT_PACKAGE_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder otherCharacteristics(List<CodeableConcept> otherCharacteristics) {
      checkNotIsSet(otherCharacteristicsIsSet(), "otherCharacteristics");
      this.otherCharacteristics = Objects.requireNonNull(otherCharacteristics, "otherCharacteristics");
      optBits |= OPT_BIT_OTHER_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("otherCharacteristics")
    public final Builder otherCharacteristics(Optional<? extends List<CodeableConcept>> otherCharacteristics) {
      checkNotIsSet(otherCharacteristicsIsSet(), "otherCharacteristics");
      this.otherCharacteristics = otherCharacteristics.orElse(null);
      optBits |= OPT_BIT_OTHER_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
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
     * Initializes the value for the {@link MedicinalProductPackaged_PackageItem#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductPackaged_PackageItem MedicinalProductPackaged_PackageItem}.
     * @return An immutable instance of MedicinalProductPackaged_PackageItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPackaged_PackageItem build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPackaged_PackageItem(
          manufacturer,
          id,
          extension,
          material,
          alternateMaterial,
          modifierExtension,
          quantity,
          manufacturedItem,
          identifier,
          shelfLifeStorage,
          device,
          packageItem,
          otherCharacteristics,
          physicalCharacteristics,
          type);
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean materialIsSet() {
      return (optBits & OPT_BIT_MATERIAL) != 0;
    }

    private boolean alternateMaterialIsSet() {
      return (optBits & OPT_BIT_ALTERNATE_MATERIAL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean manufacturedItemIsSet() {
      return (optBits & OPT_BIT_MANUFACTURED_ITEM) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean shelfLifeStorageIsSet() {
      return (optBits & OPT_BIT_SHELF_LIFE_STORAGE) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean packageItemIsSet() {
      return (optBits & OPT_BIT_PACKAGE_ITEM) != 0;
    }

    private boolean otherCharacteristicsIsSet() {
      return (optBits & OPT_BIT_OTHER_CHARACTERISTICS) != 0;
    }

    private boolean physicalCharacteristicsIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_CHARACTERISTICS) != 0;
    }

    private boolean quantityIsSet() {
      return (initBits & INIT_BIT_QUANTITY) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPackaged_PackageItem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!quantityIsSet()) attributes.add("quantity");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build MedicinalProductPackaged_PackageItem, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPackaged_PackageItem", generator = "Immutables")
  public interface QuantityBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPackaged_PackageItem#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage quantity(Quantity quantity);
  }

  @Generated(from = "MedicinalProductPackaged_PackageItem", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPackaged_PackageItem#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "MedicinalProductPackaged_PackageItem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(List<Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends List<Reference>> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    BuildFinal material(List<CodeableConcept> material);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal material(Optional<? extends List<CodeableConcept>> material);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial} to alternateMaterial.
     * @param alternateMaterial The value for alternateMaterial
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alternateMaterial(List<CodeableConcept> alternateMaterial);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#alternateMaterial() alternateMaterial} to alternateMaterial.
     * @param alternateMaterial The value for alternateMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alternateMaterial(Optional<? extends List<CodeableConcept>> alternateMaterial);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem} to manufacturedItem.
     * @param manufacturedItem The value for manufacturedItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturedItem(List<Reference> manufacturedItem);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#manufacturedItem() manufacturedItem} to manufacturedItem.
     * @param manufacturedItem The value for manufacturedItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturedItem(Optional<? extends List<Reference>> manufacturedItem);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shelfLifeStorage(List<ProductShelfLife> shelfLifeStorage);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#shelfLifeStorage() shelfLifeStorage} to shelfLifeStorage.
     * @param shelfLifeStorage The value for shelfLifeStorage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shelfLifeStorage(Optional<? extends List<ProductShelfLife>> shelfLifeStorage);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(List<Reference> device);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(Optional<? extends List<Reference>> device);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem} to packageItem.
     * @param packageItem The value for packageItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packageItem(List<MedicinalProductPackaged_PackageItem> packageItem);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#packageItem() packageItem} to packageItem.
     * @param packageItem The value for packageItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packageItem(Optional<? extends List<MedicinalProductPackaged_PackageItem>> packageItem);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherCharacteristics(List<CodeableConcept> otherCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherCharacteristics(Optional<? extends List<CodeableConcept>> otherCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalCharacteristics(ProdCharacteristic physicalCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_PackageItem#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalCharacteristics(Optional<? extends ProdCharacteristic> physicalCharacteristics);

    /**
     * Builds a new {@link MedicinalProductPackaged_PackageItem MedicinalProductPackaged_PackageItem}.
     * @return An immutable instance of MedicinalProductPackaged_PackageItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPackaged_PackageItem build();
  }
}
