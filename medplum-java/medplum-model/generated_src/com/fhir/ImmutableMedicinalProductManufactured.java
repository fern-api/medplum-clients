//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductManufactured}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductManufactured.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductManufactured implements com.fhir.MedicinalProductManufactured {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> ingredient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> otherCharacteristics;
  private final com.fhir.CodeableConcept manufacturedDoseForm;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.ProdCharacteristic physicalCharacteristics;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept unitOfPresentation;

  private ImmutableMedicinalProductManufactured(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> ingredient,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> otherCharacteristics,
      com.fhir.CodeableConcept manufacturedDoseForm,
      @javax.annotation.Nullable com.fhir.Meta meta,
      com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.ProdCharacteristic physicalCharacteristics,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer,
      @javax.annotation.Nullable com.fhir.CodeableConcept unitOfPresentation) {
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.ingredient = ingredient;
    this.otherCharacteristics = otherCharacteristics;
    this.manufacturedDoseForm = manufacturedDoseForm;
    this.meta = meta;
    this.quantity = quantity;
    this.text = text;
    this.id = id;
    this.implicitRules = implicitRules;
    this.physicalCharacteristics = physicalCharacteristics;
    this.contained = contained;
    this.extension = extension;
    this.language = language;
    this.manufacturer = manufacturer;
    this.unitOfPresentation = unitOfPresentation;
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code ingredient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> ingredient() {
    return java.util.Optional.ofNullable(ingredient);
  }

  /**
   * @return The value of the {@code otherCharacteristics} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("otherCharacteristics")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> otherCharacteristics() {
    return java.util.Optional.ofNullable(otherCharacteristics);
  }

  /**
   * @return The value of the {@code manufacturedDoseForm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturedDoseForm")
  @Override
  public com.fhir.CodeableConcept manufacturedDoseForm() {
    return manufacturedDoseForm;
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
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public com.fhir.Quantity quantity() {
    return quantity;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code physicalCharacteristics} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("physicalCharacteristics")
  @Override
  public java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics() {
    return java.util.Optional.ofNullable(physicalCharacteristics);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code unitOfPresentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unitOfPresentation")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation() {
    return java.util.Optional.ofNullable(unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        newValue,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductManufactured(
        value,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductManufactured#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        newValue,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withIngredient(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withIngredient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        value,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} attribute.
   * @param value The value for otherCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withOtherCharacteristics(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "otherCharacteristics");
    if (this.otherCharacteristics == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        newValue,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withOtherCharacteristics(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.otherCharacteristics == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        value,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for manufacturedDoseForm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withManufacturedDoseForm(com.fhir.CodeableConcept value) {
    if (this.manufacturedDoseForm == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "manufacturedDoseForm");
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        newValue,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        newValue,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        value,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductManufactured#quantity() quantity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withQuantity(com.fhir.Quantity value) {
    if (this.quantity == value) return this;
    com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        newValue,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        newValue,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        value,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        newValue,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        value,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        newValue,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        value,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} attribute.
   * @param value The value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withPhysicalCharacteristics(com.fhir.ProdCharacteristic value) {
    @javax.annotation.Nullable com.fhir.ProdCharacteristic newValue = java.util.Objects.requireNonNull(value, "physicalCharacteristics");
    if (this.physicalCharacteristics == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        newValue,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withPhysicalCharacteristics(java.util.Optional<? extends com.fhir.ProdCharacteristic> optional) {
    @javax.annotation.Nullable com.fhir.ProdCharacteristic value = optional.orElse(null);
    if (this.physicalCharacteristics == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        value,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        newValue,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        value,
        this.extension,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        newValue,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        value,
        this.language,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        newValue,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        value,
        this.manufacturer,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withManufacturer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        newValue,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withManufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        value,
        this.unitOfPresentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} attribute.
   * @param value The value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductManufactured withUnitOfPresentation(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "unitOfPresentation");
    if (this.unitOfPresentation == newValue) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductManufactured withUnitOfPresentation(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.unitOfPresentation == value) return this;
    return new ImmutableMedicinalProductManufactured(
        this.modifierExtension,
        this.resourceType,
        this.ingredient,
        this.otherCharacteristics,
        this.manufacturedDoseForm,
        this.meta,
        this.quantity,
        this.text,
        this.id,
        this.implicitRules,
        this.physicalCharacteristics,
        this.contained,
        this.extension,
        this.language,
        this.manufacturer,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductManufactured} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductManufactured
        && equalTo((ImmutableMedicinalProductManufactured) another);
  }

  private boolean equalTo(ImmutableMedicinalProductManufactured another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(ingredient, another.ingredient)
        && java.util.Objects.equals(otherCharacteristics, another.otherCharacteristics)
        && manufacturedDoseForm.equals(another.manufacturedDoseForm)
        && java.util.Objects.equals(meta, another.meta)
        && quantity.equals(another.quantity)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(physicalCharacteristics, another.physicalCharacteristics)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(unitOfPresentation, another.unitOfPresentation);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code resourceType}, {@code ingredient}, {@code otherCharacteristics}, {@code manufacturedDoseForm}, {@code meta}, {@code quantity}, {@code text}, {@code id}, {@code implicitRules}, {@code physicalCharacteristics}, {@code contained}, {@code extension}, {@code language}, {@code manufacturer}, {@code unitOfPresentation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(ingredient);
    h += (h << 5) + java.util.Objects.hashCode(otherCharacteristics);
    h += (h << 5) + manufacturedDoseForm.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + quantity.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(physicalCharacteristics);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(unitOfPresentation);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductManufactured} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductManufactured{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (ingredient != null) {
      builder.append(", ");
      builder.append("ingredient=").append(ingredient);
    }
    if (otherCharacteristics != null) {
      builder.append(", ");
      builder.append("otherCharacteristics=").append(otherCharacteristics);
    }
    builder.append(", ");
    builder.append("manufacturedDoseForm=").append(manufacturedDoseForm);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("quantity=").append(quantity);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (physicalCharacteristics != null) {
      builder.append(", ");
      builder.append("physicalCharacteristics=").append(physicalCharacteristics);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (unitOfPresentation != null) {
      builder.append(", ");
      builder.append("unitOfPresentation=").append(unitOfPresentation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductManufactured {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> ingredient = java.util.Optional.empty();
    boolean ingredientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> otherCharacteristics = java.util.Optional.empty();
    boolean otherCharacteristicsIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept manufacturedDoseForm;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable com.fhir.Quantity quantity;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics = java.util.Optional.empty();
    boolean physicalCharacteristicsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation = java.util.Optional.empty();
    boolean unitOfPresentationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
    public void setIngredient(java.util.Optional<java.util.List<com.fhir.Reference>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("otherCharacteristics")
    public void setOtherCharacteristics(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> otherCharacteristics) {
      this.otherCharacteristics = otherCharacteristics;
      this.otherCharacteristicsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturedDoseForm")
    public void setManufacturedDoseForm(com.fhir.CodeableConcept manufacturedDoseForm) {
      this.manufacturedDoseForm = manufacturedDoseForm;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(com.fhir.Quantity quantity) {
      this.quantity = quantity;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("physicalCharacteristics")
    public void setPhysicalCharacteristics(java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics) {
      this.physicalCharacteristics = physicalCharacteristics;
      this.physicalCharacteristicsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfPresentation")
    public void setUnitOfPresentation(java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation) {
      this.unitOfPresentation = unitOfPresentation;
      this.unitOfPresentationIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> otherCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept manufacturedDoseForm() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Quantity quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ProdCharacteristic> physicalCharacteristics() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductManufactured fromJson(Json json) {
    ImmutableMedicinalProductManufactured.Builder builder = ((ImmutableMedicinalProductManufactured.Builder) ImmutableMedicinalProductManufactured.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.otherCharacteristicsIsSet) {
      builder.otherCharacteristics(json.otherCharacteristics);
    }
    if (json.manufacturedDoseForm != null) {
      builder.manufacturedDoseForm(json.manufacturedDoseForm);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.quantity != null) {
      builder.quantity(json.quantity);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.physicalCharacteristicsIsSet) {
      builder.physicalCharacteristics(json.physicalCharacteristics);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.unitOfPresentationIsSet) {
      builder.unitOfPresentation(json.unitOfPresentation);
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
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .ingredient(instance.ingredient())
        .otherCharacteristics(instance.otherCharacteristics())
        .manufacturedDoseForm(instance.manufacturedDoseForm())
        .meta(instance.meta())
        .quantity(instance.quantity())
        .text(instance.text())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .physicalCharacteristics(instance.physicalCharacteristics())
        .contained(instance.contained())
        .extension(instance.extension())
        .language(instance.language())
        .manufacturer(instance.manufacturer())
        .unitOfPresentation(instance.unitOfPresentation())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductManufactured MedicinalProductManufactured}.
   * <pre>
   * ImmutableMedicinalProductManufactured.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductManufactured#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link MedicinalProductManufactured#resourceType() resourceType}
   *    .ingredient(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductManufactured#ingredient() ingredient}
   *    .otherCharacteristics(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics}
   *    .manufacturedDoseForm(com.fhir.CodeableConcept) // required {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductManufactured#meta() meta}
   *    .quantity(com.fhir.Quantity) // required {@link MedicinalProductManufactured#quantity() quantity}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductManufactured#text() text}
   *    .id(com.fhir.id) // optional {@link MedicinalProductManufactured#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductManufactured#implicitRules() implicitRules}
   *    .physicalCharacteristics(com.fhir.ProdCharacteristic) // optional {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductManufactured#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductManufactured#extension() extension}
   *    .language(com.fhir.code) // optional {@link MedicinalProductManufactured#language() language}
   *    .manufacturer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductManufactured#manufacturer() manufacturer}
   *    .unitOfPresentation(com.fhir.CodeableConcept) // optional {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation}
   *    .build();
   * </pre>
   * @return A new MedicinalProductManufactured builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductManufactured.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductManufactured MedicinalProductManufactured}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements ResourceTypeBuildStage, ManufacturedDoseFormBuildStage, QuantityBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_MANUFACTURED_DOSE_FORM = 0x2L;
    private static final long INIT_BIT_QUANTITY = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_INGREDIENT = 0x2L;
    private static final long OPT_BIT_OTHER_CHARACTERISTICS = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_PHYSICAL_CHARACTERISTICS = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_MANUFACTURER = 0x800L;
    private static final long OPT_BIT_UNIT_OF_PRESENTATION = 0x1000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> ingredient;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> otherCharacteristics;
    private @javax.annotation.Nullable com.fhir.CodeableConcept manufacturedDoseForm;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.ProdCharacteristic physicalCharacteristics;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
    private @javax.annotation.Nullable com.fhir.CodeableConcept unitOfPresentation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicinalProductManufactured#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    public final Builder ingredient(java.util.List<com.fhir.Reference> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = java.util.Objects.requireNonNull(ingredient, "ingredient");
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
    public final Builder ingredient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = ingredient.orElse(null);
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder otherCharacteristics(java.util.List<com.fhir.CodeableConcept> otherCharacteristics) {
      checkNotIsSet(otherCharacteristicsIsSet(), "otherCharacteristics");
      this.otherCharacteristics = java.util.Objects.requireNonNull(otherCharacteristics, "otherCharacteristics");
      optBits |= OPT_BIT_OTHER_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("otherCharacteristics")
    public final Builder otherCharacteristics(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> otherCharacteristics) {
      checkNotIsSet(otherCharacteristicsIsSet(), "otherCharacteristics");
      this.otherCharacteristics = otherCharacteristics.orElse(null);
      optBits |= OPT_BIT_OTHER_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm} attribute.
     * @param manufacturedDoseForm The value for manufacturedDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturedDoseForm")
    public final Builder manufacturedDoseForm(com.fhir.CodeableConcept manufacturedDoseForm) {
      checkNotIsSet(manufacturedDoseFormIsSet(), "manufacturedDoseForm");
      this.manufacturedDoseForm = java.util.Objects.requireNonNull(manufacturedDoseForm, "manufacturedDoseForm");
      initBits &= ~INIT_BIT_MANUFACTURED_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
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
     * Initializes the value for the {@link MedicinalProductManufactured#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      initBits &= ~INIT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
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
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(java.util.List<com.fhir.Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = java.util.Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public final Builder manufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitOfPresentation(com.fhir.CodeableConcept unitOfPresentation) {
      checkNotIsSet(unitOfPresentationIsSet(), "unitOfPresentation");
      this.unitOfPresentation = java.util.Objects.requireNonNull(unitOfPresentation, "unitOfPresentation");
      optBits |= OPT_BIT_UNIT_OF_PRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfPresentation")
    public final Builder unitOfPresentation(java.util.Optional<? extends com.fhir.CodeableConcept> unitOfPresentation) {
      checkNotIsSet(unitOfPresentationIsSet(), "unitOfPresentation");
      this.unitOfPresentation = unitOfPresentation.orElse(null);
      optBits |= OPT_BIT_UNIT_OF_PRESENTATION;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductManufactured MedicinalProductManufactured}.
     * @return An immutable instance of MedicinalProductManufactured
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductManufactured build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductManufactured(
          modifierExtension,
          resourceType,
          ingredient,
          otherCharacteristics,
          manufacturedDoseForm,
          meta,
          quantity,
          text,
          id,
          implicitRules,
          physicalCharacteristics,
          contained,
          extension,
          language,
          manufacturer,
          unitOfPresentation);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean otherCharacteristicsIsSet() {
      return (optBits & OPT_BIT_OTHER_CHARACTERISTICS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean physicalCharacteristicsIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_CHARACTERISTICS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean unitOfPresentationIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_PRESENTATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean manufacturedDoseFormIsSet() {
      return (initBits & INIT_BIT_MANUFACTURED_DOSE_FORM) == 0;
    }

    private boolean quantityIsSet() {
      return (initBits & INIT_BIT_QUANTITY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductManufactured is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!manufacturedDoseFormIsSet()) attributes.add("manufacturedDoseForm");
      if (!quantityIsSet()) attributes.add("quantity");
      return "Cannot build MedicinalProductManufactured, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductManufactured#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ManufacturedDoseFormBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface ManufacturedDoseFormBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductManufactured#manufacturedDoseForm() manufacturedDoseForm} attribute.
     * @param manufacturedDoseForm The value for manufacturedDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    QuantityBuildStage manufacturedDoseForm(com.fhir.CodeableConcept manufacturedDoseForm);
  }

  @org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface QuantityBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductManufactured#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);
  }

  @org.immutables.value.Generated(from = "MedicinalProductManufactured", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(java.util.List<com.fhir.Reference> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherCharacteristics(java.util.List<com.fhir.CodeableConcept> otherCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#otherCharacteristics() otherCharacteristics} to otherCharacteristics.
     * @param otherCharacteristics The value for otherCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherCharacteristics(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> otherCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalCharacteristics(com.fhir.ProdCharacteristic physicalCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#physicalCharacteristics() physicalCharacteristics} to physicalCharacteristics.
     * @param physicalCharacteristics The value for physicalCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalCharacteristics(java.util.Optional<? extends com.fhir.ProdCharacteristic> physicalCharacteristics);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(java.util.List<com.fhir.Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitOfPresentation(com.fhir.CodeableConcept unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductManufactured#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitOfPresentation(java.util.Optional<? extends com.fhir.CodeableConcept> unitOfPresentation);

    /**
     * Builds a new {@link MedicinalProductManufactured MedicinalProductManufactured}.
     * @return An immutable instance of MedicinalProductManufactured
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductManufactured build();
  }
}
