//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductIngredient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIngredient.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductIngredient", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIngredient implements com.fhir.MedicinalProductIngredient {
  private final @javax.annotation.Nullable com.fhir.MedicinalProductIngredient_Substance substance;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.CodeableConcept role;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
  private final @javax.annotation.Nullable java.lang.Boolean allergenicIndicator;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Meta meta;

  private ImmutableMedicinalProductIngredient(
      @javax.annotation.Nullable com.fhir.MedicinalProductIngredient_Substance substance,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.CodeableConcept role,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer,
      @javax.annotation.Nullable java.lang.Boolean allergenicIndicator,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Meta meta) {
    this.substance = substance;
    this.language = language;
    this.role = role;
    this.id = id;
    this.manufacturer = manufacturer;
    this.allergenicIndicator = allergenicIndicator;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.text = text;
    this.identifier = identifier;
    this.extension = extension;
    this.specifiedSubstance = specifiedSubstance;
    this.contained = contained;
    this.meta = meta;
  }

  /**
   * @return The value of the {@code substance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("substance")
  @Override
  public java.util.Optional<com.fhir.MedicinalProductIngredient_Substance> substance() {
    return java.util.Optional.ofNullable(substance);
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
   * @return The value of the {@code role} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("role")
  @Override
  public com.fhir.CodeableConcept role() {
    return role;
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
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code allergenicIndicator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("allergenicIndicator")
  @Override
  public java.util.Optional<java.lang.Boolean> allergenicIndicator() {
    return java.util.Optional.ofNullable(allergenicIndicator);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code specifiedSubstance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specifiedSubstance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance() {
    return java.util.Optional.ofNullable(specifiedSubstance);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#substance() substance} attribute.
   * @param value The value for substance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withSubstance(com.fhir.MedicinalProductIngredient_Substance value) {
    @javax.annotation.Nullable com.fhir.MedicinalProductIngredient_Substance newValue = java.util.Objects.requireNonNull(value, "substance");
    if (this.substance == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        newValue,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#substance() substance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withSubstance(java.util.Optional<? extends com.fhir.MedicinalProductIngredient_Substance> optional) {
    @javax.annotation.Nullable com.fhir.MedicinalProductIngredient_Substance value = optional.orElse(null);
    if (this.substance == value) return this;
    return new ImmutableMedicinalProductIngredient(
        value,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        newValue,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        value,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient#role() role} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withRole(com.fhir.CodeableConcept value) {
    if (this.role == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "role");
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        newValue,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        newValue,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        value,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withManufacturer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        newValue,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withManufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        value,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} attribute.
   * @param value The value for allergenicIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withAllergenicIndicator(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.allergenicIndicator, newValue)) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allergenicIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withAllergenicIndicator(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.allergenicIndicator, value)) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        value,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        value,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        value,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        newValue,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        value,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        newValue,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        value,
        this.specifiedSubstance,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} attribute.
   * @param value The value for specifiedSubstance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withSpecifiedSubstance(java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> newValue = java.util.Objects.requireNonNull(value, "specifiedSubstance");
    if (this.specifiedSubstance == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        newValue,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specifiedSubstance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withSpecifiedSubstance(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> value = optional.orElse(null);
    if (this.specifiedSubstance == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        value,
        this.contained,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductIngredient(
        this.substance,
        this.language,
        this.role,
        this.id,
        this.manufacturer,
        this.allergenicIndicator,
        this.resourceType,
        this.modifierExtension,
        this.implicitRules,
        this.text,
        this.identifier,
        this.extension,
        this.specifiedSubstance,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIngredient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIngredient
        && equalTo((ImmutableMedicinalProductIngredient) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIngredient another) {
    return java.util.Objects.equals(substance, another.substance)
        && java.util.Objects.equals(language, another.language)
        && role.equals(another.role)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(allergenicIndicator, another.allergenicIndicator)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(specifiedSubstance, another.specifiedSubstance)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code substance}, {@code language}, {@code role}, {@code id}, {@code manufacturer}, {@code allergenicIndicator}, {@code resourceType}, {@code modifierExtension}, {@code implicitRules}, {@code text}, {@code identifier}, {@code extension}, {@code specifiedSubstance}, {@code contained}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(substance);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + role.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(allergenicIndicator);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(specifiedSubstance);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIngredient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductIngredient{");
    if (substance != null) {
      builder.append("substance=").append(substance);
    }
    if (language != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("role=").append(role);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (allergenicIndicator != null) {
      builder.append(", ");
      builder.append("allergenicIndicator=").append(allergenicIndicator);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (specifiedSubstance != null) {
      builder.append(", ");
      builder.append("specifiedSubstance=").append(specifiedSubstance);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductIngredient {
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicinalProductIngredient_Substance> substance = java.util.Optional.empty();
    boolean substanceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept role;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> allergenicIndicator = java.util.Optional.empty();
    boolean allergenicIndicatorIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance = java.util.Optional.empty();
    boolean specifiedSubstanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("substance")
    public void setSubstance(java.util.Optional<com.fhir.MedicinalProductIngredient_Substance> substance) {
      this.substance = substance;
      this.substanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public void setRole(com.fhir.CodeableConcept role) {
      this.role = role;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("allergenicIndicator")
    public void setAllergenicIndicator(java.util.Optional<java.lang.Boolean> allergenicIndicator) {
      this.allergenicIndicator = allergenicIndicator;
      this.allergenicIndicatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specifiedSubstance")
    public void setSpecifiedSubstance(java.util.Optional<java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance) {
      this.specifiedSubstance = specifiedSubstance;
      this.specifiedSubstanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.MedicinalProductIngredient_Substance> substance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept role() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> allergenicIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductIngredient fromJson(Json json) {
    ImmutableMedicinalProductIngredient.Builder builder = ((ImmutableMedicinalProductIngredient.Builder) ImmutableMedicinalProductIngredient.builder());
    if (json.substanceIsSet) {
      builder.substance(json.substance);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.role != null) {
      builder.role(json.role);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.allergenicIndicatorIsSet) {
      builder.allergenicIndicator(json.allergenicIndicator);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.specifiedSubstanceIsSet) {
      builder.specifiedSubstance(json.specifiedSubstance);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
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
        .substance(instance.substance())
        .language(instance.language())
        .role(instance.role())
        .id(instance.id())
        .manufacturer(instance.manufacturer())
        .allergenicIndicator(instance.allergenicIndicator())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .specifiedSubstance(instance.specifiedSubstance())
        .contained(instance.contained())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIngredient MedicinalProductIngredient}.
   * <pre>
   * ImmutableMedicinalProductIngredient.builder()
   *    .substance(com.fhir.MedicinalProductIngredient_Substance) // optional {@link MedicinalProductIngredient#substance() substance}
   *    .language(com.fhir.code) // optional {@link MedicinalProductIngredient#language() language}
   *    .role(com.fhir.CodeableConcept) // required {@link MedicinalProductIngredient#role() role}
   *    .id(com.fhir.id) // optional {@link MedicinalProductIngredient#id() id}
   *    .manufacturer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductIngredient#manufacturer() manufacturer}
   *    .allergenicIndicator(Boolean) // optional {@link MedicinalProductIngredient#allergenicIndicator() allergenicIndicator}
   *    .resourceType(String) // required {@link MedicinalProductIngredient#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductIngredient#implicitRules() implicitRules}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductIngredient#text() text}
   *    .identifier(com.fhir.Identifier) // optional {@link MedicinalProductIngredient#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient#extension() extension}
   *    .specifiedSubstance(List&amp;lt;com.fhir.MedicinalProductIngredient_SpecifiedSubstance&amp;gt;) // optional {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductIngredient#contained() contained}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductIngredient#meta() meta}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIngredient builder
   */
  public static RoleBuildStage builder() {
    return new ImmutableMedicinalProductIngredient.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIngredient MedicinalProductIngredient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements RoleBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_ROLE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_SUBSTANCE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MANUFACTURER = 0x8L;
    private static final long OPT_BIT_ALLERGENIC_INDICATOR = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_SPECIFIED_SUBSTANCE = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.MedicinalProductIngredient_Substance substance;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept role;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
    private @javax.annotation.Nullable java.lang.Boolean allergenicIndicator;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    public final Builder substance(com.fhir.MedicinalProductIngredient_Substance substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = java.util.Objects.requireNonNull(substance, "substance");
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("substance")
    public final Builder substance(java.util.Optional<? extends com.fhir.MedicinalProductIngredient_Substance> substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = substance.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
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
     * Initializes the value for the {@link MedicinalProductIngredient#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public final Builder role(com.fhir.CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = java.util.Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
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
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
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
    @com.fasterxml.jackson.annotation.JsonProperty("allergenicIndicator")
    public final Builder allergenicIndicator(java.util.Optional<java.lang.Boolean> allergenicIndicator) {
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for chained invocation
     */
    public final Builder specifiedSubstance(java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance) {
      checkNotIsSet(specifiedSubstanceIsSet(), "specifiedSubstance");
      this.specifiedSubstance = java.util.Objects.requireNonNull(specifiedSubstance, "specifiedSubstance");
      optBits |= OPT_BIT_SPECIFIED_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specifiedSubstance")
    public final Builder specifiedSubstance(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance) {
      checkNotIsSet(specifiedSubstanceIsSet(), "specifiedSubstance");
      this.specifiedSubstance = specifiedSubstance.orElse(null);
      optBits |= OPT_BIT_SPECIFIED_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
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
     * Builds a new {@link MedicinalProductIngredient MedicinalProductIngredient}.
     * @return An immutable instance of MedicinalProductIngredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductIngredient build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIngredient(
          substance,
          language,
          role,
          id,
          manufacturer,
          allergenicIndicator,
          resourceType,
          modifierExtension,
          implicitRules,
          text,
          identifier,
          extension,
          specifiedSubstance,
          contained,
          meta);
    }

    private boolean substanceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean allergenicIndicatorIsSet() {
      return (optBits & OPT_BIT_ALLERGENIC_INDICATOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean specifiedSubstanceIsSet() {
      return (optBits & OPT_BIT_SPECIFIED_SUBSTANCE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean roleIsSet() {
      return (initBits & INIT_BIT_ROLE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductIngredient is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!roleIsSet()) attributes.add("role");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductIngredient, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  public interface RoleBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage role(com.fhir.CodeableConcept role);
  }

  @org.immutables.value.Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductIngredient", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substance(com.fhir.MedicinalProductIngredient_Substance substance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substance(java.util.Optional<? extends com.fhir.MedicinalProductIngredient_Substance> substance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(java.util.List<com.fhir.Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> manufacturer);

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
    BuildFinal allergenicIndicator(java.util.Optional<java.lang.Boolean> allergenicIndicator);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specifiedSubstance(java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance> specifiedSubstance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#specifiedSubstance() specifiedSubstance} to specifiedSubstance.
     * @param specifiedSubstance The value for specifiedSubstance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specifiedSubstance(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Builds a new {@link MedicinalProductIngredient MedicinalProductIngredient}.
     * @return An immutable instance of MedicinalProductIngredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIngredient build();
  }
}
