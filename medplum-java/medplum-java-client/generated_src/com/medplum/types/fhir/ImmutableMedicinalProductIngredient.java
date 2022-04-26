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
 * Immutable implementation of {@link MedicinalProductIngredient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIngredient.builder()}.
 */
@Generated(from = "MedicinalProductIngredient", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIngredient
    implements MedicinalProductIngredient {
  private final @Nullable List<Reference> manufacturer;
  private final @Nullable List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance;
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean allergenicIndicator;
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id id;
  private final @Nullable Identifier identifier;
  private final CodeableConcept role;
  private final @Nullable MedicinalProductIngredient_Substance substance;
  private final @Nullable Narrative text;

  private ImmutableMedicinalProductIngredient(
      @Nullable List<Reference> manufacturer,
      @Nullable List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance,
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable Boolean allergenicIndicator,
      String resourceType,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id id,
      @Nullable Identifier identifier,
      CodeableConcept role,
      @Nullable MedicinalProductIngredient_Substance substance,
      @Nullable Narrative text) {
    this.manufacturer = manufacturer;
    this.specifiedSubstance = specifiedSubstance;
    this.language = language;
    this.meta = meta;
    this.extension = extension;
    this.allergenicIndicator = allergenicIndicator;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.identifier = identifier;
    this.role = role;
    this.substance = substance;
    this.text = text;
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
   * @return The value of the {@code specifiedSubstance} attribute
   */
  @JsonProperty("specifiedSubstance")
  @Override
  public Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance() {
    return Optional.ofNullable(specifiedSubstance);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code allergenicIndicator} attribute
   */
  @JsonProperty("allergenicIndicator")
  @Override
  public Optional<Boolean> allergenicIndicator() {
    return Optional.ofNullable(allergenicIndicator);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public CodeableConcept role() {
    return role;
  }

  /**
   * @return The value of the {@code substance} attribute
   */
  @JsonProperty("substance")
  @Override
  public Optional<MedicinalProductIngredient_Substance> substance() {
    return Optional.ofNullable(substance);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withManufacturer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        newValue,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withManufacturer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductIngredient(
        value,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} attribute.
   * @param value The value for specifiedSubstance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withSpecifiedSubstance(List<MedicinalProductIngredient_SpecifiedSubstance> value) {
    @Nullable List<MedicinalProductIngredient_SpecifiedSubstance> newValue = Objects.requireNonNull(value, "specifiedSubstance");
    if (this.specifiedSubstance == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        newValue,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specifiedSubstance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withSpecifiedSubstance(Optional<? extends List<MedicinalProductIngredient_SpecifiedSubstance>> optional) {
    @Nullable List<MedicinalProductIngredient_SpecifiedSubstance> value = optional.orElse(null);
    if (this.specifiedSubstance == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        value,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        newValue,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        value,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        newValue,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        value,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        newValue,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        value,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} attribute.
   * @param value The value for allergenicIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withAllergenicIndicator(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.allergenicIndicator, newValue)) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allergenicIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withAllergenicIndicator(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.allergenicIndicator, value)) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        value,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        newValue,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        newValue,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        value,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        newValue,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        value,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        value,
        this.identifier,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        newValue,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        value,
        this.role,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient#role() role} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withRole(CodeableConcept value) {
    if (this.role == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "role");
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        newValue,
        this.substance,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#substance() substance} attribute.
   * @param value The value for substance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withSubstance(MedicinalProductIngredient_Substance value) {
    @Nullable MedicinalProductIngredient_Substance newValue = Objects.requireNonNull(value, "substance");
    if (this.substance == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#substance() substance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withSubstance(Optional<? extends MedicinalProductIngredient_Substance> optional) {
    @Nullable MedicinalProductIngredient_Substance value = optional.orElse(null);
    if (this.substance == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.manufacturer,
        this.specifiedSubstance,
        this.language,
        this.meta,
        this.extension,
        this.allergenicIndicator,
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.identifier,
        this.role,
        this.substance,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIngredient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIngredient
        && equalTo((ImmutableMedicinalProductIngredient) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIngredient another) {
    return Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(specifiedSubstance, another.specifiedSubstance)
        && Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(allergenicIndicator, another.allergenicIndicator)
        && resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(identifier, another.identifier)
        && role.equals(another.role)
        && Objects.equals(substance, another.substance)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code manufacturer}, {@code specifiedSubstance}, {@code language}, {@code meta}, {@code extension}, {@code allergenicIndicator}, {@code resourceType}, {@code implicitRules}, {@code contained}, {@code modifierExtension}, {@code id}, {@code identifier}, {@code role}, {@code substance}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(specifiedSubstance);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(allergenicIndicator);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + role.hashCode();
    h += (h << 5) + Objects.hashCode(substance);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIngredient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductIngredient{");
    if (manufacturer != null) {
      builder.append("manufacturer=").append(manufacturer);
    }
    if (specifiedSubstance != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("specifiedSubstance=").append(specifiedSubstance);
    }
    if (language != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (allergenicIndicator != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("allergenicIndicator=").append(allergenicIndicator);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
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
    builder.append("role=").append(role);
    if (substance != null) {
      builder.append(", ");
      builder.append("substance=").append(substance);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductIngredient {
    @Nullable Optional<List<Reference>> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance = Optional.empty();
    boolean specifiedSubstanceIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> allergenicIndicator = Optional.empty();
    boolean allergenicIndicatorIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable CodeableConcept role;
    @Nullable Optional<MedicinalProductIngredient_Substance> substance = Optional.empty();
    boolean substanceIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<List<Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("specifiedSubstance")
    public void setSpecifiedSubstance(Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance) {
      this.specifiedSubstance = specifiedSubstance;
      this.specifiedSubstanceIsSet = true;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("allergenicIndicator")
    public void setAllergenicIndicator(Optional<Boolean> allergenicIndicator) {
      this.allergenicIndicator = allergenicIndicator;
      this.allergenicIndicatorIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(CodeableConcept role) {
      this.role = role;
    }
    @JsonProperty("substance")
    public void setSubstance(Optional<MedicinalProductIngredient_Substance> substance) {
      this.substance = substance;
      this.substanceIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<List<Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> allergenicIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicinalProductIngredient_Substance> substance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductIngredient fromJson(Json json) {
    ImmutableMedicinalProductIngredient.Builder builder = ((ImmutableMedicinalProductIngredient.Builder) ImmutableMedicinalProductIngredient.builder());
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.specifiedSubstanceIsSet) {
      builder.specifiedSubstance(json.specifiedSubstance);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.allergenicIndicatorIsSet) {
      builder.allergenicIndicator(json.allergenicIndicator);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.role != null) {
      builder.role(json.role);
    }
    if (json.substanceIsSet) {
      builder.substance(json.substance);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutableMedicinalProductIngredient) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIngredient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIngredient instance
   */
  public static MedicinalProductIngredient copyOf(MedicinalProductIngredient instance) {
    if (instance instanceof ImmutableMedicinalProductIngredient) {
      return (ImmutableMedicinalProductIngredient) instance;
    }
    return ((ImmutableMedicinalProductIngredient.Builder) ImmutableMedicinalProductIngredient.builder())
        .manufacturer(instance.manufacturer())
        .specifiedSubstance(instance.specifiedSubstance())
        .language(instance.language())
        .meta(instance.meta())
        .extension(instance.extension())
        .allergenicIndicator(instance.allergenicIndicator())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .identifier(instance.identifier())
        .role(instance.role())
        .substance(instance.substance())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIngredient MedicinalProductIngredient}.
   * <pre>
   * ImmutableMedicinalProductIngredient.builder()
   *    .manufacturer(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductIngredient#manufacturer() manufacturer}
   *    .specifiedSubstance(List&amp;lt;com.medplum.types.fhir.MedicinalProductIngredient_SpecifiedSubstance&amp;gt;) // optional {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductIngredient#language() language}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductIngredient#meta() meta}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient#extension() extension}
   *    .allergenicIndicator(Boolean) // optional {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator}
   *    .resourceType(String) // required {@link MedicinalProductIngredient#resourceType() resourceType}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductIngredient#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductIngredient#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient#modifierExtension() modifierExtension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductIngredient#id() id}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link MedicinalProductIngredient#identifier() identifier}
   *    .role(com.medplum.types.fhir.CodeableConcept) // required {@link MedicinalProductIngredient#role() role}
   *    .substance(com.medplum.types.fhir.MedicinalProductIngredient_Substance) // optional {@link MedicinalProductIngredient#substance() substance}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductIngredient#text() text}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIngredient builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductIngredient.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIngredient MedicinalProductIngredient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, RoleBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_ROLE = 0x2L;
    private static final long OPT_BIT_MANUFACTURER = 0x1L;
    private static final long OPT_BIT_SPECIFIED_SUBSTANCE = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ALLERGENIC_INDICATOR = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_SUBSTANCE = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Reference> manufacturer;
    private @Nullable List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance;
    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean allergenicIndicator;
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id id;
    private @Nullable Identifier identifier;
    private @Nullable CodeableConcept role;
    private @Nullable MedicinalProductIngredient_Substance substance;
    private @Nullable Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
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
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
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
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for chained invocation
     */
    public final Builder specifiedSubstance(List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance) {
      checkNotIsSet(specifiedSubstanceIsSet(), "specifiedSubstance");
      this.specifiedSubstance = Objects.requireNonNull(specifiedSubstance, "specifiedSubstance");
      optBits |= OPT_BIT_SPECIFIED_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specifiedSubstance")
    public final Builder specifiedSubstance(Optional<? extends List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance) {
      checkNotIsSet(specifiedSubstanceIsSet(), "specifiedSubstance");
      this.specifiedSubstance = specifiedSubstance.orElse(null);
      optBits |= OPT_BIT_SPECIFIED_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder allergenicIndicator(boolean allergenicIndicator) {
      checkNotIsSet(allergenicIndicatorIsSet(), "allergenicIndicator");
      this.allergenicIndicator = allergenicIndicator;
      optBits |= OPT_BIT_ALLERGENIC_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allergenicIndicator")
    public final Builder allergenicIndicator(Optional<Boolean> allergenicIndicator) {
      checkNotIsSet(allergenicIndicatorIsSet(), "allergenicIndicator");
      this.allergenicIndicator = allergenicIndicator.orElse(null);
      optBits |= OPT_BIT_ALLERGENIC_INDICATOR;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIngredient#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIngredient#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    public final Builder substance(MedicinalProductIngredient_Substance substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = Objects.requireNonNull(substance, "substance");
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substance")
    public final Builder substance(Optional<? extends MedicinalProductIngredient_Substance> substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = substance.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
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
     * Builds a new {@link MedicinalProductIngredient MedicinalProductIngredient}.
     * @return An immutable instance of MedicinalProductIngredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductIngredient build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIngredient(
          manufacturer,
          specifiedSubstance,
          language,
          meta,
          extension,
          allergenicIndicator,
          resourceType,
          implicitRules,
          contained,
          modifierExtension,
          id,
          identifier,
          role,
          substance,
          text);
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean specifiedSubstanceIsSet() {
      return (optBits & OPT_BIT_SPECIFIED_SUBSTANCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean allergenicIndicatorIsSet() {
      return (optBits & OPT_BIT_ALLERGENIC_INDICATOR) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean substanceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean roleIsSet() {
      return (initBits & INIT_BIT_ROLE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductIngredient is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!roleIsSet()) attributes.add("role");
      return "Cannot build MedicinalProductIngredient, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    RoleBuildStage resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  public interface RoleBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(CodeableConcept role);
  }

  @Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(List<Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends List<Reference>> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specifiedSubstance(List<MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specifiedSubstance(Optional<? extends List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allergenicIndicator(boolean allergenicIndicator);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allergenicIndicator(Optional<Boolean> allergenicIndicator);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substance(MedicinalProductIngredient_Substance substance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substance(Optional<? extends MedicinalProductIngredient_Substance> substance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Builds a new {@link MedicinalProductIngredient MedicinalProductIngredient}.
     * @return An immutable instance of MedicinalProductIngredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIngredient build();
  }
}
