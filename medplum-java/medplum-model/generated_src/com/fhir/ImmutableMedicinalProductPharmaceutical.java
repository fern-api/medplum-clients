//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductPharmaceutical}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPharmaceutical.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPharmaceutical implements com.fhir.MedicinalProductPharmaceutical {
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> ingredient;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> device;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final com.fhir.CodeableConcept administrableDoseForm;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept unitOfPresentation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> characteristics;

  private ImmutableMedicinalProductPharmaceutical(
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> ingredient,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> device,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      com.fhir.CodeableConcept administrableDoseForm,
      @javax.annotation.Nullable com.fhir.CodeableConcept unitOfPresentation,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> characteristics) {
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.routeOfAdministration = routeOfAdministration;
    this.contained = contained;
    this.extension = extension;
    this.ingredient = ingredient;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.device = device;
    this.text = text;
    this.resourceType = resourceType;
    this.id = id;
    this.identifier = identifier;
    this.administrableDoseForm = administrableDoseForm;
    this.unitOfPresentation = unitOfPresentation;
    this.characteristics = characteristics;
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code routeOfAdministration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("routeOfAdministration")
  @Override
  public java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration() {
    return routeOfAdministration;
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
   * @return The value of the {@code ingredient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> ingredient() {
    return java.util.Optional.ofNullable(ingredient);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("device")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> device() {
    return java.util.Optional.ofNullable(device);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code administrableDoseForm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("administrableDoseForm")
  @Override
  public com.fhir.CodeableConcept administrableDoseForm() {
    return administrableDoseForm;
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
   * @return The value of the {@code characteristics} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("characteristics")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> characteristics() {
    return java.util.Optional.ofNullable(characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        newValue,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        value,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        newValue,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        value,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withRouteOfAdministration(com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration... elements) {
    java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        newValue,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of routeOfAdministration elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withRouteOfAdministration(Iterable<? extends com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> elements) {
    if (this.routeOfAdministration == elements) return this;
    java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        newValue,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        newValue,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        value,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        newValue,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        value,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withIngredient(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        newValue,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withIngredient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        value,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        newValue,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        value,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        newValue,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        value,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withDevice(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        newValue,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withDevice(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        value,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        newValue,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        value,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        newValue,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        newValue,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        value,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        newValue,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        value,
        this.administrableDoseForm,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for administrableDoseForm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withAdministrableDoseForm(com.fhir.CodeableConcept value) {
    if (this.administrableDoseForm == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "administrableDoseForm");
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        newValue,
        this.unitOfPresentation,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} attribute.
   * @param value The value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withUnitOfPresentation(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "unitOfPresentation");
    if (this.unitOfPresentation == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        newValue,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withUnitOfPresentation(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.unitOfPresentation == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        value,
        this.characteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#characteristics() characteristics} attribute.
   * @param value The value for characteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withCharacteristics(java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> newValue = java.util.Objects.requireNonNull(value, "characteristics");
    if (this.characteristics == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#characteristics() characteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withCharacteristics(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> value = optional.orElse(null);
    if (this.characteristics == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.implicitRules,
        this.meta,
        this.routeOfAdministration,
        this.contained,
        this.extension,
        this.ingredient,
        this.language,
        this.modifierExtension,
        this.device,
        this.text,
        this.resourceType,
        this.id,
        this.identifier,
        this.administrableDoseForm,
        this.unitOfPresentation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPharmaceutical} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPharmaceutical
        && equalTo((ImmutableMedicinalProductPharmaceutical) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPharmaceutical another) {
    return java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(meta, another.meta)
        && routeOfAdministration.equals(another.routeOfAdministration)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(ingredient, another.ingredient)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(device, another.device)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && administrableDoseForm.equals(another.administrableDoseForm)
        && java.util.Objects.equals(unitOfPresentation, another.unitOfPresentation)
        && java.util.Objects.equals(characteristics, another.characteristics);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code meta}, {@code routeOfAdministration}, {@code contained}, {@code extension}, {@code ingredient}, {@code language}, {@code modifierExtension}, {@code device}, {@code text}, {@code resourceType}, {@code id}, {@code identifier}, {@code administrableDoseForm}, {@code unitOfPresentation}, {@code characteristics}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + routeOfAdministration.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(ingredient);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(device);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + administrableDoseForm.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(unitOfPresentation);
    h += (h << 5) + java.util.Objects.hashCode(characteristics);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPharmaceutical} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductPharmaceutical{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("routeOfAdministration=").append(routeOfAdministration);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (ingredient != null) {
      builder.append(", ");
      builder.append("ingredient=").append(ingredient);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("administrableDoseForm=").append(administrableDoseForm);
    if (unitOfPresentation != null) {
      builder.append(", ");
      builder.append("unitOfPresentation=").append(unitOfPresentation);
    }
    if (characteristics != null) {
      builder.append(", ");
      builder.append("characteristics=").append(characteristics);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductPharmaceutical {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> ingredient = java.util.Optional.empty();
    boolean ingredientIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> device = java.util.Optional.empty();
    boolean deviceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept administrableDoseForm;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation = java.util.Optional.empty();
    boolean unitOfPresentationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> characteristics = java.util.Optional.empty();
    boolean characteristicsIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("routeOfAdministration")
    public void setRouteOfAdministration(java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration) {
      this.routeOfAdministration = routeOfAdministration;
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
    @com.fasterxml.jackson.annotation.JsonProperty("ingredient")
    public void setIngredient(java.util.Optional<java.util.List<com.fhir.Reference>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public void setDevice(java.util.Optional<java.util.List<com.fhir.Reference>> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
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
    @com.fasterxml.jackson.annotation.JsonProperty("administrableDoseForm")
    public void setAdministrableDoseForm(com.fhir.CodeableConcept administrableDoseForm) {
      this.administrableDoseForm = administrableDoseForm;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfPresentation")
    public void setUnitOfPresentation(java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation) {
      this.unitOfPresentation = unitOfPresentation;
      this.unitOfPresentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("characteristics")
    public void setCharacteristics(java.util.Optional<java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> characteristics) {
      this.characteristics = characteristics;
      this.characteristicsIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> device() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept administrableDoseForm() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> unitOfPresentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> characteristics() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPharmaceutical fromJson(Json json) {
    ImmutableMedicinalProductPharmaceutical.Builder builder = ((ImmutableMedicinalProductPharmaceutical.Builder) ImmutableMedicinalProductPharmaceutical.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.routeOfAdministration != null) {
      builder.addAllRouteOfAdministration(json.routeOfAdministration);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.administrableDoseForm != null) {
      builder.administrableDoseForm(json.administrableDoseForm);
    }
    if (json.unitOfPresentationIsSet) {
      builder.unitOfPresentation(json.unitOfPresentation);
    }
    if (json.characteristicsIsSet) {
      builder.characteristics(json.characteristics);
    }
    return (ImmutableMedicinalProductPharmaceutical) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPharmaceutical} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPharmaceutical instance
   */
  public static MedicinalProductPharmaceutical copyOf(MedicinalProductPharmaceutical instance) {
    if (instance instanceof ImmutableMedicinalProductPharmaceutical) {
      return (ImmutableMedicinalProductPharmaceutical) instance;
    }
    return ((ImmutableMedicinalProductPharmaceutical.Builder) ImmutableMedicinalProductPharmaceutical.builder())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .addAllRouteOfAdministration(instance.routeOfAdministration())
        .contained(instance.contained())
        .extension(instance.extension())
        .ingredient(instance.ingredient())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .device(instance.device())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .identifier(instance.identifier())
        .administrableDoseForm(instance.administrableDoseForm())
        .unitOfPresentation(instance.unitOfPresentation())
        .characteristics(instance.characteristics())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
   * <pre>
   * ImmutableMedicinalProductPharmaceutical.builder()
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductPharmaceutical#implicitRules() implicitRules}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductPharmaceutical#meta() meta}
   *    .addRouteOfAdministration|addAllRouteOfAdministration(com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration) // {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} elements
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductPharmaceutical#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical#extension() extension}
   *    .ingredient(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPharmaceutical#ingredient() ingredient}
   *    .language(com.fhir.code) // optional {@link MedicinalProductPharmaceutical#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension}
   *    .device(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPharmaceutical#device() device}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductPharmaceutical#text() text}
   *    .resourceType(String) // required {@link MedicinalProductPharmaceutical#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link MedicinalProductPharmaceutical#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductPharmaceutical#identifier() identifier}
   *    .administrableDoseForm(com.fhir.CodeableConcept) // required {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm}
   *    .unitOfPresentation(com.fhir.CodeableConcept) // optional {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation}
   *    .characteristics(List&amp;lt;com.fhir.MedicinalProductPharmaceutical_Characteristics&amp;gt;) // optional {@link MedicinalProductPharmaceutical#characteristics() characteristics}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPharmaceutical builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductPharmaceutical.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, AdministrableDoseFormBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_ADMINISTRABLE_DOSE_FORM = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_INGREDIENT = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_DEVICE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_UNIT_OF_PRESENTATION = 0x800L;
    private static final long OPT_BIT_CHARACTERISTICS = 0x1000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private final java.util.List<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration = new java.util.ArrayList<com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration>();
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> ingredient;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> device;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept administrableDoseForm;
    private @javax.annotation.Nullable com.fhir.CodeableConcept unitOfPresentation;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> characteristics;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
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
     * Adds one element to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param element A routeOfAdministration element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRouteOfAdministration(com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration element) {
      this.routeOfAdministration.add(java.util.Objects.requireNonNull(element, "routeOfAdministration element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An array of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRouteOfAdministration(com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration... elements) {
      for (com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration element : elements) {
        this.routeOfAdministration.add(java.util.Objects.requireNonNull(element, "routeOfAdministration element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An iterable of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRouteOfAdministration(Iterable<? extends com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> elements) {
      for (com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration element : elements) {
        this.routeOfAdministration.add(java.util.Objects.requireNonNull(element, "routeOfAdministration element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(java.util.List<com.fhir.Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = java.util.Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public final Builder device(java.util.Optional<? extends java.util.List<com.fhir.Reference>> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
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
     * Initializes the value for the {@link MedicinalProductPharmaceutical#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm} attribute.
     * @param administrableDoseForm The value for administrableDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("administrableDoseForm")
    public final Builder administrableDoseForm(com.fhir.CodeableConcept administrableDoseForm) {
      checkNotIsSet(administrableDoseFormIsSet(), "administrableDoseForm");
      this.administrableDoseForm = java.util.Objects.requireNonNull(administrableDoseForm, "administrableDoseForm");
      initBits &= ~INIT_BIT_ADMINISTRABLE_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristics(java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> characteristics) {
      checkNotIsSet(characteristicsIsSet(), "characteristics");
      this.characteristics = java.util.Objects.requireNonNull(characteristics, "characteristics");
      optBits |= OPT_BIT_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("characteristics")
    public final Builder characteristics(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> characteristics) {
      checkNotIsSet(characteristicsIsSet(), "characteristics");
      this.characteristics = characteristics.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTICS;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
     * @return An immutable instance of MedicinalProductPharmaceutical
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductPharmaceutical build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPharmaceutical(
          implicitRules,
          meta,
          createUnmodifiableList(true, routeOfAdministration),
          contained,
          extension,
          ingredient,
          language,
          modifierExtension,
          device,
          text,
          resourceType,
          id,
          identifier,
          administrableDoseForm,
          unitOfPresentation,
          characteristics);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
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

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean unitOfPresentationIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_PRESENTATION) != 0;
    }

    private boolean characteristicsIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTICS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean administrableDoseFormIsSet() {
      return (initBits & INIT_BIT_ADMINISTRABLE_DOSE_FORM) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductPharmaceutical is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!administrableDoseFormIsSet()) attributes.add("administrableDoseForm");
      return "Cannot build MedicinalProductPharmaceutical, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    AdministrableDoseFormBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  public interface AdministrableDoseFormBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm} attribute.
     * @param administrableDoseForm The value for administrableDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal administrableDoseForm(com.fhir.CodeableConcept administrableDoseForm);
  }

  @org.immutables.value.Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Adds one element to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param element A routeOfAdministration element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addRouteOfAdministration(com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration element);

    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An array of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addRouteOfAdministration(com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration... elements);

    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An iterable of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllRouteOfAdministration(Iterable<? extends com.fhir.MedicinalProductPharmaceutical_RouteOfAdministration> elements);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(java.util.List<com.fhir.Reference> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(java.util.List<com.fhir.Reference> device);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(java.util.Optional<? extends java.util.List<com.fhir.Reference>> device);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitOfPresentation(com.fhir.CodeableConcept unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitOfPresentation(java.util.Optional<? extends com.fhir.CodeableConcept> unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal characteristics(java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics> characteristics);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal characteristics(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductPharmaceutical_Characteristics>> characteristics);

    /**
     * Builds a new {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
     * @return An immutable instance of MedicinalProductPharmaceutical
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPharmaceutical build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
