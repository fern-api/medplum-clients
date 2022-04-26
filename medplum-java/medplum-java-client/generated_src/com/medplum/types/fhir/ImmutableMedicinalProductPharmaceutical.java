package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MedicinalProductPharmaceutical}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPharmaceutical.builder()}.
 */
@Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPharmaceutical
    implements MedicinalProductPharmaceutical {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable CodeableConcept unitOfPresentation;
  private final CodeableConcept administrableDoseForm;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Reference> device;
  private final @Nullable List<MedicinalProductPharmaceutical_Characteristics> characteristics;
  private final @Nullable List<Reference> ingredient;
  private final List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration;
  private final @Nullable Narrative text;
  private final @Nullable Id id;
  private final @Nullable List<Identifier> identifier;
  private final String resourceType;

  private ImmutableMedicinalProductPharmaceutical(
      @Nullable List<ResourceList> contained,
      @Nullable CodeableConcept unitOfPresentation,
      CodeableConcept administrableDoseForm,
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri implicitRules,
      @Nullable List<Reference> device,
      @Nullable List<MedicinalProductPharmaceutical_Characteristics> characteristics,
      @Nullable List<Reference> ingredient,
      List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration,
      @Nullable Narrative text,
      @Nullable Id id,
      @Nullable List<Identifier> identifier,
      String resourceType) {
    this.contained = contained;
    this.unitOfPresentation = unitOfPresentation;
    this.administrableDoseForm = administrableDoseForm;
    this.meta = meta;
    this.language = language;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.device = device;
    this.characteristics = characteristics;
    this.ingredient = ingredient;
    this.routeOfAdministration = routeOfAdministration;
    this.text = text;
    this.id = id;
    this.identifier = identifier;
    this.resourceType = resourceType;
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
   * @return The value of the {@code administrableDoseForm} attribute
   */
  @JsonProperty("administrableDoseForm")
  @Override
  public CodeableConcept administrableDoseForm() {
    return administrableDoseForm;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code characteristics} attribute
   */
  @JsonProperty("characteristics")
  @Override
  public Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics() {
    return Optional.ofNullable(characteristics);
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
   * @return The value of the {@code routeOfAdministration} attribute
   */
  @JsonProperty("routeOfAdministration")
  @Override
  public List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration() {
    return routeOfAdministration;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        newValue,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        value,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} attribute.
   * @param value The value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withUnitOfPresentation(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unitOfPresentation");
    if (this.unitOfPresentation == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        newValue,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfPresentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withUnitOfPresentation(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unitOfPresentation == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        value,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for administrableDoseForm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withAdministrableDoseForm(CodeableConcept value) {
    if (this.administrableDoseForm == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "administrableDoseForm");
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        newValue,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        newValue,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        value,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        newValue,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        value,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        newValue,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        value,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        newValue,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        value,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withDevice(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withDevice(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#characteristics() characteristics} attribute.
   * @param value The value for characteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withCharacteristics(List<MedicinalProductPharmaceutical_Characteristics> value) {
    @Nullable List<MedicinalProductPharmaceutical_Characteristics> newValue = Objects.requireNonNull(value, "characteristics");
    if (this.characteristics == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        newValue,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#characteristics() characteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withCharacteristics(Optional<? extends List<MedicinalProductPharmaceutical_Characteristics>> optional) {
    @Nullable List<MedicinalProductPharmaceutical_Characteristics> value = optional.orElse(null);
    if (this.characteristics == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        value,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withIngredient(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        newValue,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withIngredient(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        value,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withRouteOfAdministration(MedicinalProductPharmaceutical_RouteOfAdministration... elements) {
    List<MedicinalProductPharmaceutical_RouteOfAdministration> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        newValue,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of routeOfAdministration elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withRouteOfAdministration(Iterable<? extends MedicinalProductPharmaceutical_RouteOfAdministration> elements) {
    if (this.routeOfAdministration == elements) return this;
    List<MedicinalProductPharmaceutical_RouteOfAdministration> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        newValue,
        this.text,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        newValue,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        value,
        this.id,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        newValue,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        value,
        this.identifier,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductPharmaceutical(
        this.contained,
        this.unitOfPresentation,
        this.administrableDoseForm,
        this.meta,
        this.language,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.device,
        this.characteristics,
        this.ingredient,
        this.routeOfAdministration,
        this.text,
        this.id,
        this.identifier,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPharmaceutical} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPharmaceutical
        && equalTo((ImmutableMedicinalProductPharmaceutical) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPharmaceutical another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(unitOfPresentation, another.unitOfPresentation)
        && administrableDoseForm.equals(another.administrableDoseForm)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(device, another.device)
        && Objects.equals(characteristics, another.characteristics)
        && Objects.equals(ingredient, another.ingredient)
        && routeOfAdministration.equals(another.routeOfAdministration)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code unitOfPresentation}, {@code administrableDoseForm}, {@code meta}, {@code language}, {@code extension}, {@code modifierExtension}, {@code implicitRules}, {@code device}, {@code characteristics}, {@code ingredient}, {@code routeOfAdministration}, {@code text}, {@code id}, {@code identifier}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(unitOfPresentation);
    h += (h << 5) + administrableDoseForm.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(device);
    h += (h << 5) + Objects.hashCode(characteristics);
    h += (h << 5) + Objects.hashCode(ingredient);
    h += (h << 5) + routeOfAdministration.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPharmaceutical} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPharmaceutical{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (unitOfPresentation != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("unitOfPresentation=").append(unitOfPresentation);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("administrableDoseForm=").append(administrableDoseForm);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (characteristics != null) {
      builder.append(", ");
      builder.append("characteristics=").append(characteristics);
    }
    if (ingredient != null) {
      builder.append(", ");
      builder.append("ingredient=").append(ingredient);
    }
    builder.append(", ");
    builder.append("routeOfAdministration=").append(routeOfAdministration);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPharmaceutical {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> unitOfPresentation = Optional.empty();
    boolean unitOfPresentationIsSet;
    @Nullable CodeableConcept administrableDoseForm;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Reference>> device = Optional.empty();
    boolean deviceIsSet;
    @Nullable Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics = Optional.empty();
    boolean characteristicsIsSet;
    @Nullable Optional<List<Reference>> ingredient = Optional.empty();
    boolean ingredientIsSet;
    @Nullable List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration = Collections.emptyList();
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
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
    @JsonProperty("administrableDoseForm")
    public void setAdministrableDoseForm(CodeableConcept administrableDoseForm) {
      this.administrableDoseForm = administrableDoseForm;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Optional<List<Reference>> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @JsonProperty("characteristics")
    public void setCharacteristics(Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics) {
      this.characteristics = characteristics;
      this.characteristicsIsSet = true;
    }
    @JsonProperty("ingredient")
    public void setIngredient(Optional<List<Reference>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @JsonProperty("routeOfAdministration")
    public void setRouteOfAdministration(List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration) {
      this.routeOfAdministration = routeOfAdministration;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unitOfPresentation() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept administrableDoseForm() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductPharmaceutical fromJson(Json json) {
    ImmutableMedicinalProductPharmaceutical.Builder builder = ((ImmutableMedicinalProductPharmaceutical.Builder) ImmutableMedicinalProductPharmaceutical.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.unitOfPresentationIsSet) {
      builder.unitOfPresentation(json.unitOfPresentation);
    }
    if (json.administrableDoseForm != null) {
      builder.administrableDoseForm(json.administrableDoseForm);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.characteristicsIsSet) {
      builder.characteristics(json.characteristics);
    }
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.routeOfAdministration != null) {
      builder.addAllRouteOfAdministration(json.routeOfAdministration);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
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
        .contained(instance.contained())
        .unitOfPresentation(instance.unitOfPresentation())
        .administrableDoseForm(instance.administrableDoseForm())
        .meta(instance.meta())
        .language(instance.language())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .device(instance.device())
        .characteristics(instance.characteristics())
        .ingredient(instance.ingredient())
        .addAllRouteOfAdministration(instance.routeOfAdministration())
        .text(instance.text())
        .id(instance.id())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
   * <pre>
   * ImmutableMedicinalProductPharmaceutical.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductPharmaceutical#contained() contained}
   *    .unitOfPresentation(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation}
   *    .administrableDoseForm(com.medplum.types.fhir.CodeableConcept) // required {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductPharmaceutical#meta() meta}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductPharmaceutical#language() language}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductPharmaceutical#implicitRules() implicitRules}
   *    .device(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPharmaceutical#device() device}
   *    .characteristics(List&amp;lt;com.medplum.types.fhir.MedicinalProductPharmaceutical_Characteristics&amp;gt;) // optional {@link MedicinalProductPharmaceutical#characteristics() characteristics}
   *    .ingredient(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPharmaceutical#ingredient() ingredient}
   *    .addRouteOfAdministration|addAllRouteOfAdministration(com.medplum.types.fhir.MedicinalProductPharmaceutical_RouteOfAdministration) // {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} elements
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductPharmaceutical#text() text}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductPharmaceutical#id() id}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductPharmaceutical#identifier() identifier}
   *    .resourceType(String) // required {@link MedicinalProductPharmaceutical#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPharmaceutical builder
   */
  public static AdministrableDoseFormBuildStage builder() {
    return new ImmutableMedicinalProductPharmaceutical.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements AdministrableDoseFormBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_ADMINISTRABLE_DOSE_FORM = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_UNIT_OF_PRESENTATION = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_DEVICE = 0x80L;
    private static final long OPT_BIT_CHARACTERISTICS = 0x100L;
    private static final long OPT_BIT_INGREDIENT = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable CodeableConcept unitOfPresentation;
    private @Nullable CodeableConcept administrableDoseForm;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri implicitRules;
    private @Nullable List<Reference> device;
    private @Nullable List<MedicinalProductPharmaceutical_Characteristics> characteristics;
    private @Nullable List<Reference> ingredient;
    private final List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration = new ArrayList<MedicinalProductPharmaceutical_RouteOfAdministration>();
    private @Nullable Narrative text;
    private @Nullable Id id;
    private @Nullable List<Identifier> identifier;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
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
     * Initializes the value for the {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm} attribute.
     * @param administrableDoseForm The value for administrableDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("administrableDoseForm")
    public final Builder administrableDoseForm(CodeableConcept administrableDoseForm) {
      checkNotIsSet(administrableDoseFormIsSet(), "administrableDoseForm");
      this.administrableDoseForm = Objects.requireNonNull(administrableDoseForm, "administrableDoseForm");
      initBits &= ~INIT_BIT_ADMINISTRABLE_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristics(List<MedicinalProductPharmaceutical_Characteristics> characteristics) {
      checkNotIsSet(characteristicsIsSet(), "characteristics");
      this.characteristics = Objects.requireNonNull(characteristics, "characteristics");
      optBits |= OPT_BIT_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("characteristics")
    public final Builder characteristics(Optional<? extends List<MedicinalProductPharmaceutical_Characteristics>> characteristics) {
      checkNotIsSet(characteristicsIsSet(), "characteristics");
      this.characteristics = characteristics.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
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
     * Adds one element to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param element A routeOfAdministration element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRouteOfAdministration(MedicinalProductPharmaceutical_RouteOfAdministration element) {
      this.routeOfAdministration.add(Objects.requireNonNull(element, "routeOfAdministration element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An array of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRouteOfAdministration(MedicinalProductPharmaceutical_RouteOfAdministration... elements) {
      for (MedicinalProductPharmaceutical_RouteOfAdministration element : elements) {
        this.routeOfAdministration.add(Objects.requireNonNull(element, "routeOfAdministration element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An iterable of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRouteOfAdministration(Iterable<? extends MedicinalProductPharmaceutical_RouteOfAdministration> elements) {
      for (MedicinalProductPharmaceutical_RouteOfAdministration element : elements) {
        this.routeOfAdministration.add(Objects.requireNonNull(element, "routeOfAdministration element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link MedicinalProductPharmaceutical#resourceType() resourceType} attribute.
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
     * Builds a new {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
     * @return An immutable instance of MedicinalProductPharmaceutical
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPharmaceutical build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPharmaceutical(
          contained,
          unitOfPresentation,
          administrableDoseForm,
          meta,
          language,
          extension,
          modifierExtension,
          implicitRules,
          device,
          characteristics,
          ingredient,
          createUnmodifiableList(true, routeOfAdministration),
          text,
          id,
          identifier,
          resourceType);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean unitOfPresentationIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_PRESENTATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean characteristicsIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTICS) != 0;
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
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

    private boolean administrableDoseFormIsSet() {
      return (initBits & INIT_BIT_ADMINISTRABLE_DOSE_FORM) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPharmaceutical is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!administrableDoseFormIsSet()) attributes.add("administrableDoseForm");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductPharmaceutical, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  public interface AdministrableDoseFormBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical#administrableDoseForm() administrableDoseForm} attribute.
     * @param administrableDoseForm The value for administrableDoseForm 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage administrableDoseForm(CodeableConcept administrableDoseForm);
  }

  @Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductPharmaceutical", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitOfPresentation(CodeableConcept unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#unitOfPresentation() unitOfPresentation} to unitOfPresentation.
     * @param unitOfPresentation The value for unitOfPresentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitOfPresentation(Optional<? extends CodeableConcept> unitOfPresentation);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(List<Reference> device);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(Optional<? extends List<Reference>> device);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for chained invocation
     */
    BuildFinal characteristics(List<MedicinalProductPharmaceutical_Characteristics> characteristics);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#characteristics() characteristics} to characteristics.
     * @param characteristics The value for characteristics
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal characteristics(Optional<? extends List<MedicinalProductPharmaceutical_Characteristics>> characteristics);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(List<Reference> ingredient);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(Optional<? extends List<Reference>> ingredient);

    /**
     * Adds one element to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param element A routeOfAdministration element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addRouteOfAdministration(MedicinalProductPharmaceutical_RouteOfAdministration element);

    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An array of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addRouteOfAdministration(MedicinalProductPharmaceutical_RouteOfAdministration... elements);

    /**
     * Adds elements to {@link MedicinalProductPharmaceutical#routeOfAdministration() routeOfAdministration} list.
     * @param elements An iterable of routeOfAdministration elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllRouteOfAdministration(Iterable<? extends MedicinalProductPharmaceutical_RouteOfAdministration> elements);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Builds a new {@link MedicinalProductPharmaceutical MedicinalProductPharmaceutical}.
     * @return An immutable instance of MedicinalProductPharmaceutical
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPharmaceutical build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
