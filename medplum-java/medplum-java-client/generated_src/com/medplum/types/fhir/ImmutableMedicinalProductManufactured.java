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
 * Immutable implementation of {@link MedicinalProductManufactured}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductManufactured.builder()}.
 */
@Generated(from = "MedicinalProductManufactured", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductManufactured
    implements MedicinalProductManufactured {
  private final @Nullable List<Reference> ingredient;
  private final @Nullable List<Reference> manufacturer;
  private final @Nullable List<Extension> extension;
  private final Quantity quantity;
  private final @Nullable ProdCharacteristic physicalCharacteristics;
  private final @Nullable List<CodeableConcept> otherCharacteristics;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable CodeableConcept unitOfPresentation;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Narrative text;
  private final CodeableConcept manufacturedDoseForm;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final String resourceType;

  private ImmutableMedicinalProductManufactured(
      @Nullable List<Reference> ingredient,
      @Nullable List<Reference> manufacturer,
      @Nullable List<Extension> extension,
      Quantity quantity,
      @Nullable ProdCharacteristic physicalCharacteristics,
      @Nullable List<CodeableConcept> otherCharacteristics,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable CodeableConcept unitOfPresentation,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Narrative text,
      CodeableConcept manufacturedDoseForm,
      @Nullable Meta meta,
      @Nullable Code language,
      String resourceType) {
    this.ingredient = ingredient;
    this.manufacturer = manufacturer;
    this.extension = extension;
    this.quantity = quantity;
    this.physicalCharacteristics = physicalCharacteristics;
    this.otherCharacteristics = otherCharacteristics;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.unitOfPresentation = unitOfPresentation;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.text = text;
    this.manufacturedDoseForm = manufacturedDoseForm;
    this.meta = meta;
    this.language = language;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code ingredient} attribute
   */
  @JsonProperty("ingredient")
  @Override
  public Optional<List<Reference>> ingredient() {
    return Optional.ofNullable(ingredient);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code physicalCharacteristics} attribute
   */
  @JsonProperty("physicalCharacteristics")
  @Override
  public Optional<ProdCharacteristic> physicalCharacteristics() {
    return Optional.ofNullable(physicalCharacteristics);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code unitOfPresentation} attribute
   */
  @JsonProperty("unitOfPresentation")
  @Override
  public Optional<CodeableConcept> unitOfPresentation() {
    return Optional.ofNullable(unitOfPresentation);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code manufacturedDoseForm} attribute
   */
  @JsonProperty("manufacturedDoseForm")
  @Override
  public CodeableConcept manufacturedDoseForm() {
    return manufacturedDoseForm;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withIngredient(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        newValue,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withIngredient(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedicinalProductManufactured(
        value,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withManufacturer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        newValue,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withManufacturer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        value,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        newValue,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        value,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductManufactured#quantity() quantity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withQuantity(Quantity value) {
    if (this.quantity == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "quantity");
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        newValue,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} attribute.
   * @param value The value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withPhysicalCharacteristics(ProdCharacteristic value) {
    @Nullable ProdCharacteristic newValue = Objects.requireNonNull(value, "physicalCharacteristics");
    if (this.physicalCharacteristics == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        newValue,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withPhysicalCharacteristics(Optional<? extends ProdCharacteristic> optional) {
    @Nullable ProdCharacteristic value = optional.orElse(null);
    if (this.physicalCharacteristics == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        value,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} attribute.
   * @param value The value for otherCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withOtherCharacteristics(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "otherCharacteristics");
    if (this.otherCharacteristics == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        newValue,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withOtherCharacteristics(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.otherCharacteristics == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        value,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        newValue,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        value,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        newValue,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        value,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} attribute.
   * @param value The value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withUnitOfPresentation(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unitOfPresentation");
    if (this.unitOfPresentation == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        newValue,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withUnitOfPresentation(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unitOfPresentation == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        value,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        newValue,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        value,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        newValue,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        value,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        newValue,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        value,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for manufacturedDoseForm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withManufacturedDoseForm(CodeableConcept value) {
    if (this.manufacturedDoseForm == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "manufacturedDoseForm");
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        newValue,
        this.meta,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        newValue,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        value,
        this.language,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductManufactured#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductManufactured(
        this.ingredient,
        this.manufacturer,
        this.extension,
        this.quantity,
        this.physicalCharacteristics,
        this.otherCharacteristics,
        this.implicitRules,
        this.contained,
        this.unitOfPresentation,
        this.id,
        this.modifierExtension,
        this.text,
        this.manufacturedDoseForm,
        this.meta,
        this.language,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductManufactured} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductManufactured
        && equalTo((ImmutableMedicinalProductManufactured) another);
  }

  private boolean equalTo(ImmutableMedicinalProductManufactured another) {
    return Objects.equals(ingredient, another.ingredient)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(extension, another.extension)
        && quantity.equals(another.quantity)
        && Objects.equals(physicalCharacteristics, another.physicalCharacteristics)
        && Objects.equals(otherCharacteristics, another.otherCharacteristics)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(unitOfPresentation, another.unitOfPresentation)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(text, another.text)
        && manufacturedDoseForm.equals(another.manufacturedDoseForm)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code ingredient}, {@code manufacturer}, {@code extension}, {@code quantity}, {@code physicalCharacteristics}, {@code otherCharacteristics}, {@code implicitRules}, {@code contained}, {@code unitOfPresentation}, {@code id}, {@code modifierExtension}, {@code text}, {@code manufacturedDoseForm}, {@code meta}, {@code language}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(ingredient);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + quantity.hashCode();
    h += (h << 5) + Objects.hashCode(physicalCharacteristics);
    h += (h << 5) + Objects.hashCode(otherCharacteristics);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(unitOfPresentation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + manufacturedDoseForm.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductManufactured} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductManufactured{");
    if (ingredient != null) {
      builder.append("ingredient=").append(ingredient);
    }
    if (manufacturer != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("quantity=").append(quantity);
    if (physicalCharacteristics != null) {
      builder.append(", ");
      builder.append("physicalCharacteristics=").append(physicalCharacteristics);
    }
    if (otherCharacteristics != null) {
      builder.append(", ");
      builder.append("otherCharacteristics=").append(otherCharacteristics);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (unitOfPresentation != null) {
      builder.append(", ");
      builder.append("unitOfPresentation=").append(unitOfPresentation);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("manufacturedDoseForm=").append(manufacturedDoseForm);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductManufactured {
    @Nullable Optional<List<Reference>> ingredient = Optional.empty();
    boolean ingredientIsSet;
    @Nullable Optional<List<Reference>> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Quantity quantity;
    @Nullable Optional<ProdCharacteristic> physicalCharacteristics = Optional.empty();
    boolean physicalCharacteristicsIsSet;
    @Nullable Optional<List<CodeableConcept>> otherCharacteristics = Optional.empty();
    boolean otherCharacteristicsIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> unitOfPresentation = Optional.empty();
    boolean unitOfPresentationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable CodeableConcept manufacturedDoseForm;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable String resourceType;
    @JsonProperty("ingredient")
    public void setIngredient(Optional<List<Reference>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<List<Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
      this.quantity = quantity;
    }
    @JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(Optional<ProdCharacteristic> physicalCharacteristics) {
      this.physicalCharacteristics = physicalCharacteristics;
      this.physicalCharacteristicsIsSet = true;
    }
    @JsonProperty("otherCharacteristics")
    public void setOtherCharacteristics(Optional<List<CodeableConcept>> otherCharacteristics) {
      this.otherCharacteristics = otherCharacteristics;
      this.otherCharacteristicsIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("unitOfPresentation")
    public void setUnitOfPresentation(Optional<CodeableConcept> unitOfPresentation) {
      this.unitOfPresentation = unitOfPresentation;
      this.unitOfPresentationIsSet = true;
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
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("manufacturedDoseForm")
    public void setManufacturedDoseForm(CodeableConcept manufacturedDoseForm) {
      this.manufacturedDoseForm = manufacturedDoseForm;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<List<Reference>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ProdCharacteristic> physicalCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> otherCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unitOfPresentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept manufacturedDoseForm() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductManufactured fromJson(Json json) {
    ImmutableMedicinalProductManufactured.Builder builder = ((ImmutableMedicinalProductManufactured.Builder) ImmutableMedicinalProductManufactured.builder());
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.quantity != null) {
      builder.quantity(json.quantity);
    }
    if (json.physicalCharacteristicsIsSet) {
      builder.physicalCharacteristics(json.physicalCharacteristics);
    }
    if (json.otherCharacteristicsIsSet) {
      builder.otherCharacteristics(json.otherCharacteristics);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.unitOfPresentationIsSet) {
      builder.unitOfPresentation(json.unitOfPresentation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.manufacturedDoseForm != null) {
      builder.manufacturedDoseForm(json.manufacturedDoseForm);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableMedicinalProductManufactured) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductManufactured} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductManufactured instance
   */
  public static MedicinalProductManufactured copyOf(MedicinalProductManufactured instance) {
    if (instance instanceof ImmutableMedicinalProductManufactured) {
      return (ImmutableMedicinalProductManufactured) instance;
    }
    return ((ImmutableMedicinalProductManufactured.Builder) ImmutableMedicinalProductManufactured.builder())
        .ingredient(instance.ingredient())
        .manufacturer(instance.manufacturer())
        .extension(instance.extension())
        .quantity(instance.quantity())
        .physicalCharacteristics(instance.physicalCharacteristics())
        .otherCharacteristics(instance.otherCharacteristics())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .unitOfPresentation(instance.unitOfPresentation())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .text(instance.text())
        .manufacturedDoseForm(instance.manufacturedDoseForm())
        .meta(instance.meta())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductManufactured MedicinalProductManufactured}.
   * <pre>
   * ImmutableMedicinalProductManufactured.builder()
   *    .ingredient(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductManufactured#ingredient() ingredient}
   *    .manufacturer(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductManufactured#manufacturer() manufacturer}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductManufactured#extension() extension}
   *    .quantity(com.medplum.types.fhir.Quantity) // required {@link MedicinalProductManufactured#quantity() quantity}
   *    .physicalCharacteristics(com.medplum.types.fhir.ProdCharacteristic) // optional {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics}
   *    .otherCharacteristics(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductManufactured#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductManufactured#contained() contained}
   *    .unitOfPresentation(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductManufactured#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductManufactured#modifierExtension() modifierExtension}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductManufactured#text() text}
   *    .manufacturedDoseForm(com.medplum.types.fhir.CodeableConcept) // required {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductManufactured#meta() meta}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductManufactured#language() language}
   *    .resourceType(String) // required {@link MedicinalProductManufactured#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new MedicinalProductManufactured builder
   */
  public static QuantityBuildStage builder() {
    return new ImmutableMedicinalProductManufactured.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductManufactured MedicinalProductManufactured}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements QuantityBuildStage, ManufacturedDoseFormBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_QUANTITY = 0x1L;
    private static final long INIT_BIT_MANUFACTURED_DOSE_FORM = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_INGREDIENT = 0x1L;
    private static final long OPT_BIT_MANUFACTURER = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_PHYSICAL_CHARACTERISTICS = 0x8L;
    private static final long OPT_BIT_OTHER_CHARACTERISTICS = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_UNIT_OF_PRESENTATION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<Reference> ingredient;
    private @Nullable List<Reference> manufacturer;
    private @Nullable List<Extension> extension;
    private @Nullable Quantity quantity;
    private @Nullable ProdCharacteristic physicalCharacteristics;
    private @Nullable List<CodeableConcept> otherCharacteristics;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable CodeableConcept unitOfPresentation;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Narrative text;
    private @Nullable CodeableConcept manufacturedDoseForm;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    public final Builder ingredient(List<Reference> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = Objects.requireNonNull(ingredient, "ingredient");
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ingredient")
    public final Builder ingredient(Optional<? extends List<Reference>> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = ingredient.orElse(null);
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
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
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
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
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
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
     * Initializes the value for the {@link MedicinalProductManufactured#quantity() quantity} attribute.
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
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitOfPresentation(CodeableConcept unitOfPresentation) {
      checkNotIsSet(unitOfPresentationIsSet(), "unitOfPresentation");
      this.unitOfPresentation = Objects.requireNonNull(unitOfPresentation, "unitOfPresentation");
      optBits |= OPT_BIT_UNIT_OF_PRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unitOfPresentation")
    public final Builder unitOfPresentation(Optional<? extends CodeableConcept> unitOfPresentation) {
      checkNotIsSet(unitOfPresentationIsSet(), "unitOfPresentation");
      this.unitOfPresentation = unitOfPresentation.orElse(null);
      optBits |= OPT_BIT_UNIT_OF_PRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
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
     * Initializes the value for the {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm} attribute.
     * @param manufacturedDoseForm The value for manufacturedDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturedDoseForm")
    public final Builder manufacturedDoseForm(CodeableConcept manufacturedDoseForm) {
      checkNotIsSet(manufacturedDoseFormIsSet(), "manufacturedDoseForm");
      this.manufacturedDoseForm = Objects.requireNonNull(manufacturedDoseForm, "manufacturedDoseForm");
      initBits &= ~INIT_BIT_MANUFACTURED_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
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
     * Initializes the value for the {@link MedicinalProductManufactured#resourceType() resourceType} attribute.
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
     * Builds a new {@link MedicinalProductManufactured MedicinalProductManufactured}.
     * @return An immutable instance of MedicinalProductManufactured
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductManufactured build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductManufactured(
          ingredient,
          manufacturer,
          extension,
          quantity,
          physicalCharacteristics,
          otherCharacteristics,
          implicitRules,
          contained,
          unitOfPresentation,
          id,
          modifierExtension,
          text,
          manufacturedDoseForm,
          meta,
          language,
          resourceType);
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean physicalCharacteristicsIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_CHARACTERISTICS) != 0;
    }

    private boolean otherCharacteristicsIsSet() {
      return (optBits & OPT_BIT_OTHER_CHARACTERISTICS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean unitOfPresentationIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_PRESENTATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean quantityIsSet() {
      return (initBits & INIT_BIT_QUANTITY) == 0;
    }

    private boolean manufacturedDoseFormIsSet() {
      return (initBits & INIT_BIT_MANUFACTURED_DOSE_FORM) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductManufactured is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!quantityIsSet()) attributes.add("quantity");
      if (!manufacturedDoseFormIsSet()) attributes.add("manufacturedDoseForm");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductManufactured, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface QuantityBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductManufactured#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    ManufacturedDoseFormBuildStage quantity(Quantity quantity);
  }

  @Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface ManufacturedDoseFormBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm} attribute.
     * @param manufacturedDoseForm The value for manufacturedDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage manufacturedDoseForm(CodeableConcept manufacturedDoseForm);
  }

  @Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductManufactured#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(List<Reference> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(Optional<? extends List<Reference>> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(List<Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends List<Reference>> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalCharacteristics(ProdCharacteristic physicalCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalCharacteristics(Optional<? extends ProdCharacteristic> physicalCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherCharacteristics(List<CodeableConcept> otherCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherCharacteristics(Optional<? extends List<CodeableConcept>> otherCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitOfPresentation(CodeableConcept unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitOfPresentation(Optional<? extends CodeableConcept> unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Builds a new {@link MedicinalProductManufactured MedicinalProductManufactured}.
     * @return An immutable instance of MedicinalProductManufactured
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductManufactured build();
  }
}
