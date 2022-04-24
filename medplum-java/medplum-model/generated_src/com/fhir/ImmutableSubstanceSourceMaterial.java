//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SubstanceSourceMaterial}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial.builder()}.
 */
@org.immutables.value.Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial implements com.fhir.SubstanceSourceMaterial {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialClass;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialType;
  private final @javax.annotation.Nullable com.fhir.Identifier organismId;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept developmentStage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.SubstanceSourceMaterial_Organism organism;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> partDescription;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> parentSubstanceId;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> parentSubstanceName;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> geographicalLocation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> fractionDescription;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialState;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> countryOfOrigin;
  private final @javax.annotation.Nullable java.lang.String organismName;

  private ImmutableSubstanceSourceMaterial(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialClass,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialType,
      @javax.annotation.Nullable com.fhir.Identifier organismId,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept developmentStage,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.SubstanceSourceMaterial_Organism organism,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> partDescription,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> parentSubstanceId,
      @javax.annotation.Nullable java.util.List<java.lang.String> parentSubstanceName,
      @javax.annotation.Nullable java.util.List<java.lang.String> geographicalLocation,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> fractionDescription,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialState,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> countryOfOrigin,
      @javax.annotation.Nullable java.lang.String organismName) {
    this.language = language;
    this.sourceMaterialClass = sourceMaterialClass;
    this.text = text;
    this.resourceType = resourceType;
    this.meta = meta;
    this.id = id;
    this.sourceMaterialType = sourceMaterialType;
    this.organismId = organismId;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.developmentStage = developmentStage;
    this.extension = extension;
    this.organism = organism;
    this.partDescription = partDescription;
    this.parentSubstanceId = parentSubstanceId;
    this.parentSubstanceName = parentSubstanceName;
    this.geographicalLocation = geographicalLocation;
    this.fractionDescription = fractionDescription;
    this.implicitRules = implicitRules;
    this.sourceMaterialState = sourceMaterialState;
    this.countryOfOrigin = countryOfOrigin;
    this.organismName = organismName;
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
   * @return The value of the {@code sourceMaterialClass} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialClass")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> sourceMaterialClass() {
    return java.util.Optional.ofNullable(sourceMaterialClass);
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
   * @return The value of the {@code sourceMaterialType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> sourceMaterialType() {
    return java.util.Optional.ofNullable(sourceMaterialType);
  }

  /**
   * @return The value of the {@code organismId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("organismId")
  @Override
  public java.util.Optional<com.fhir.Identifier> organismId() {
    return java.util.Optional.ofNullable(organismId);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code developmentStage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("developmentStage")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> developmentStage() {
    return java.util.Optional.ofNullable(developmentStage);
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
   * @return The value of the {@code organism} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("organism")
  @Override
  public java.util.Optional<com.fhir.SubstanceSourceMaterial_Organism> organism() {
    return java.util.Optional.ofNullable(organism);
  }

  /**
   * @return The value of the {@code partDescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partDescription")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> partDescription() {
    return java.util.Optional.ofNullable(partDescription);
  }

  /**
   * @return The value of the {@code parentSubstanceId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parentSubstanceId")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> parentSubstanceId() {
    return java.util.Optional.ofNullable(parentSubstanceId);
  }

  /**
   * @return The value of the {@code parentSubstanceName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parentSubstanceName")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> parentSubstanceName() {
    return java.util.Optional.ofNullable(parentSubstanceName);
  }

  /**
   * @return The value of the {@code geographicalLocation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("geographicalLocation")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> geographicalLocation() {
    return java.util.Optional.ofNullable(geographicalLocation);
  }

  /**
   * @return The value of the {@code fractionDescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fractionDescription")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> fractionDescription() {
    return java.util.Optional.ofNullable(fractionDescription);
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
   * @return The value of the {@code sourceMaterialState} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialState")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> sourceMaterialState() {
    return java.util.Optional.ofNullable(sourceMaterialState);
  }

  /**
   * @return The value of the {@code countryOfOrigin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("countryOfOrigin")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> countryOfOrigin() {
    return java.util.Optional.ofNullable(countryOfOrigin);
  }

  /**
   * @return The value of the {@code organismName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("organismName")
  @Override
  public java.util.Optional<java.lang.String> organismName() {
    return java.util.Optional.ofNullable(organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        newValue,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        value,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} attribute.
   * @param value The value for sourceMaterialClass
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withSourceMaterialClass(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "sourceMaterialClass");
    if (this.sourceMaterialClass == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        newValue,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterialClass
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withSourceMaterialClass(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.sourceMaterialClass == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        value,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        newValue,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        value,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceSourceMaterial#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        newValue,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        newValue,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        value,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        newValue,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        value,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} attribute.
   * @param value The value for sourceMaterialType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withSourceMaterialType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "sourceMaterialType");
    if (this.sourceMaterialType == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        newValue,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterialType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withSourceMaterialType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.sourceMaterialType == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        value,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#organismId() organismId} attribute.
   * @param value The value for organismId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganismId(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "organismId");
    if (this.organismId == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        newValue,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#organismId() organismId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organismId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withOrganismId(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.organismId == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        value,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        newValue,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        value,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        newValue,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        value,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#developmentStage() developmentStage} attribute.
   * @param value The value for developmentStage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withDevelopmentStage(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "developmentStage");
    if (this.developmentStage == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        newValue,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#developmentStage() developmentStage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for developmentStage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withDevelopmentStage(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.developmentStage == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        value,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        newValue,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        value,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#organism() organism} attribute.
   * @param value The value for organism
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganism(com.fhir.SubstanceSourceMaterial_Organism value) {
    @javax.annotation.Nullable com.fhir.SubstanceSourceMaterial_Organism newValue = java.util.Objects.requireNonNull(value, "organism");
    if (this.organism == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        newValue,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#organism() organism} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organism
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withOrganism(java.util.Optional<? extends com.fhir.SubstanceSourceMaterial_Organism> optional) {
    @javax.annotation.Nullable com.fhir.SubstanceSourceMaterial_Organism value = optional.orElse(null);
    if (this.organism == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        value,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#partDescription() partDescription} attribute.
   * @param value The value for partDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withPartDescription(java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> newValue = java.util.Objects.requireNonNull(value, "partDescription");
    if (this.partDescription == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        newValue,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#partDescription() partDescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partDescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withPartDescription(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> value = optional.orElse(null);
    if (this.partDescription == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        value,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} attribute.
   * @param value The value for parentSubstanceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withParentSubstanceId(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "parentSubstanceId");
    if (this.parentSubstanceId == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        newValue,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentSubstanceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withParentSubstanceId(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.parentSubstanceId == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        value,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} attribute.
   * @param value The value for parentSubstanceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withParentSubstanceName(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "parentSubstanceName");
    if (this.parentSubstanceName == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        newValue,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentSubstanceName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withParentSubstanceName(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.parentSubstanceName == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        value,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} attribute.
   * @param value The value for geographicalLocation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withGeographicalLocation(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "geographicalLocation");
    if (this.geographicalLocation == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        newValue,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geographicalLocation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withGeographicalLocation(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.geographicalLocation == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        value,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} attribute.
   * @param value The value for fractionDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withFractionDescription(java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> newValue = java.util.Objects.requireNonNull(value, "fractionDescription");
    if (this.fractionDescription == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        newValue,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fractionDescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withFractionDescription(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> value = optional.orElse(null);
    if (this.fractionDescription == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        value,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        newValue,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        value,
        this.sourceMaterialState,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} attribute.
   * @param value The value for sourceMaterialState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withSourceMaterialState(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "sourceMaterialState");
    if (this.sourceMaterialState == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        newValue,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterialState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withSourceMaterialState(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.sourceMaterialState == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        value,
        this.countryOfOrigin,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} attribute.
   * @param value The value for countryOfOrigin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withCountryOfOrigin(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "countryOfOrigin");
    if (this.countryOfOrigin == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        newValue,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for countryOfOrigin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withCountryOfOrigin(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.countryOfOrigin == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        value,
        this.organismName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#organismName() organismName} attribute.
   * @param value The value for organismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganismName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "organismName");
    if (java.util.Objects.equals(this.organismName, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#organismName() organismName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganismName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.organismName, value)) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.language,
        this.sourceMaterialClass,
        this.text,
        this.resourceType,
        this.meta,
        this.id,
        this.sourceMaterialType,
        this.organismId,
        this.contained,
        this.modifierExtension,
        this.developmentStage,
        this.extension,
        this.organism,
        this.partDescription,
        this.parentSubstanceId,
        this.parentSubstanceName,
        this.geographicalLocation,
        this.fractionDescription,
        this.implicitRules,
        this.sourceMaterialState,
        this.countryOfOrigin,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial
        && equalTo((ImmutableSubstanceSourceMaterial) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(sourceMaterialClass, another.sourceMaterialClass)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(sourceMaterialType, another.sourceMaterialType)
        && java.util.Objects.equals(organismId, another.organismId)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(developmentStage, another.developmentStage)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(organism, another.organism)
        && java.util.Objects.equals(partDescription, another.partDescription)
        && java.util.Objects.equals(parentSubstanceId, another.parentSubstanceId)
        && java.util.Objects.equals(parentSubstanceName, another.parentSubstanceName)
        && java.util.Objects.equals(geographicalLocation, another.geographicalLocation)
        && java.util.Objects.equals(fractionDescription, another.fractionDescription)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(sourceMaterialState, another.sourceMaterialState)
        && java.util.Objects.equals(countryOfOrigin, another.countryOfOrigin)
        && java.util.Objects.equals(organismName, another.organismName);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code sourceMaterialClass}, {@code text}, {@code resourceType}, {@code meta}, {@code id}, {@code sourceMaterialType}, {@code organismId}, {@code contained}, {@code modifierExtension}, {@code developmentStage}, {@code extension}, {@code organism}, {@code partDescription}, {@code parentSubstanceId}, {@code parentSubstanceName}, {@code geographicalLocation}, {@code fractionDescription}, {@code implicitRules}, {@code sourceMaterialState}, {@code countryOfOrigin}, {@code organismName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(sourceMaterialClass);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(sourceMaterialType);
    h += (h << 5) + java.util.Objects.hashCode(organismId);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(developmentStage);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(organism);
    h += (h << 5) + java.util.Objects.hashCode(partDescription);
    h += (h << 5) + java.util.Objects.hashCode(parentSubstanceId);
    h += (h << 5) + java.util.Objects.hashCode(parentSubstanceName);
    h += (h << 5) + java.util.Objects.hashCode(geographicalLocation);
    h += (h << 5) + java.util.Objects.hashCode(fractionDescription);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(sourceMaterialState);
    h += (h << 5) + java.util.Objects.hashCode(countryOfOrigin);
    h += (h << 5) + java.util.Objects.hashCode(organismName);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SubstanceSourceMaterial{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (sourceMaterialClass != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("sourceMaterialClass=").append(sourceMaterialClass);
    }
    if (text != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sourceMaterialType != null) {
      builder.append(", ");
      builder.append("sourceMaterialType=").append(sourceMaterialType);
    }
    if (organismId != null) {
      builder.append(", ");
      builder.append("organismId=").append(organismId);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (developmentStage != null) {
      builder.append(", ");
      builder.append("developmentStage=").append(developmentStage);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (organism != null) {
      builder.append(", ");
      builder.append("organism=").append(organism);
    }
    if (partDescription != null) {
      builder.append(", ");
      builder.append("partDescription=").append(partDescription);
    }
    if (parentSubstanceId != null) {
      builder.append(", ");
      builder.append("parentSubstanceId=").append(parentSubstanceId);
    }
    if (parentSubstanceName != null) {
      builder.append(", ");
      builder.append("parentSubstanceName=").append(parentSubstanceName);
    }
    if (geographicalLocation != null) {
      builder.append(", ");
      builder.append("geographicalLocation=").append(geographicalLocation);
    }
    if (fractionDescription != null) {
      builder.append(", ");
      builder.append("fractionDescription=").append(fractionDescription);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (sourceMaterialState != null) {
      builder.append(", ");
      builder.append("sourceMaterialState=").append(sourceMaterialState);
    }
    if (countryOfOrigin != null) {
      builder.append(", ");
      builder.append("countryOfOrigin=").append(countryOfOrigin);
    }
    if (organismName != null) {
      builder.append(", ");
      builder.append("organismName=").append(organismName);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SubstanceSourceMaterial {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> sourceMaterialClass = java.util.Optional.empty();
    boolean sourceMaterialClassIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> sourceMaterialType = java.util.Optional.empty();
    boolean sourceMaterialTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> organismId = java.util.Optional.empty();
    boolean organismIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> developmentStage = java.util.Optional.empty();
    boolean developmentStageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SubstanceSourceMaterial_Organism> organism = java.util.Optional.empty();
    boolean organismIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> partDescription = java.util.Optional.empty();
    boolean partDescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> parentSubstanceId = java.util.Optional.empty();
    boolean parentSubstanceIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> parentSubstanceName = java.util.Optional.empty();
    boolean parentSubstanceNameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> geographicalLocation = java.util.Optional.empty();
    boolean geographicalLocationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> fractionDescription = java.util.Optional.empty();
    boolean fractionDescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> sourceMaterialState = java.util.Optional.empty();
    boolean sourceMaterialStateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> countryOfOrigin = java.util.Optional.empty();
    boolean countryOfOriginIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> organismName = java.util.Optional.empty();
    boolean organismNameIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialClass")
    public void setSourceMaterialClass(java.util.Optional<com.fhir.CodeableConcept> sourceMaterialClass) {
      this.sourceMaterialClass = sourceMaterialClass;
      this.sourceMaterialClassIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialType")
    public void setSourceMaterialType(java.util.Optional<com.fhir.CodeableConcept> sourceMaterialType) {
      this.sourceMaterialType = sourceMaterialType;
      this.sourceMaterialTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organismId")
    public void setOrganismId(java.util.Optional<com.fhir.Identifier> organismId) {
      this.organismId = organismId;
      this.organismIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("developmentStage")
    public void setDevelopmentStage(java.util.Optional<com.fhir.CodeableConcept> developmentStage) {
      this.developmentStage = developmentStage;
      this.developmentStageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organism")
    public void setOrganism(java.util.Optional<com.fhir.SubstanceSourceMaterial_Organism> organism) {
      this.organism = organism;
      this.organismIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partDescription")
    public void setPartDescription(java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> partDescription) {
      this.partDescription = partDescription;
      this.partDescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubstanceId")
    public void setParentSubstanceId(java.util.Optional<java.util.List<com.fhir.Identifier>> parentSubstanceId) {
      this.parentSubstanceId = parentSubstanceId;
      this.parentSubstanceIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubstanceName")
    public void setParentSubstanceName(java.util.Optional<java.util.List<java.lang.String>> parentSubstanceName) {
      this.parentSubstanceName = parentSubstanceName;
      this.parentSubstanceNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("geographicalLocation")
    public void setGeographicalLocation(java.util.Optional<java.util.List<java.lang.String>> geographicalLocation) {
      this.geographicalLocation = geographicalLocation;
      this.geographicalLocationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fractionDescription")
    public void setFractionDescription(java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> fractionDescription) {
      this.fractionDescription = fractionDescription;
      this.fractionDescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialState")
    public void setSourceMaterialState(java.util.Optional<com.fhir.CodeableConcept> sourceMaterialState) {
      this.sourceMaterialState = sourceMaterialState;
      this.sourceMaterialStateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> countryOfOrigin) {
      this.countryOfOrigin = countryOfOrigin;
      this.countryOfOriginIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organismName")
    public void setOrganismName(java.util.Optional<java.lang.String> organismName) {
      this.organismName = organismName;
      this.organismNameIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> sourceMaterialClass() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> sourceMaterialType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> organismId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> developmentStage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SubstanceSourceMaterial_Organism> organism() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> partDescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> parentSubstanceId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> parentSubstanceName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> geographicalLocation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> fractionDescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> sourceMaterialState() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> countryOfOrigin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> organismName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial fromJson(Json json) {
    ImmutableSubstanceSourceMaterial.Builder builder = ((ImmutableSubstanceSourceMaterial.Builder) ImmutableSubstanceSourceMaterial.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.sourceMaterialClassIsSet) {
      builder.sourceMaterialClass(json.sourceMaterialClass);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sourceMaterialTypeIsSet) {
      builder.sourceMaterialType(json.sourceMaterialType);
    }
    if (json.organismIdIsSet) {
      builder.organismId(json.organismId);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.developmentStageIsSet) {
      builder.developmentStage(json.developmentStage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.organismIsSet) {
      builder.organism(json.organism);
    }
    if (json.partDescriptionIsSet) {
      builder.partDescription(json.partDescription);
    }
    if (json.parentSubstanceIdIsSet) {
      builder.parentSubstanceId(json.parentSubstanceId);
    }
    if (json.parentSubstanceNameIsSet) {
      builder.parentSubstanceName(json.parentSubstanceName);
    }
    if (json.geographicalLocationIsSet) {
      builder.geographicalLocation(json.geographicalLocation);
    }
    if (json.fractionDescriptionIsSet) {
      builder.fractionDescription(json.fractionDescription);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.sourceMaterialStateIsSet) {
      builder.sourceMaterialState(json.sourceMaterialState);
    }
    if (json.countryOfOriginIsSet) {
      builder.countryOfOrigin(json.countryOfOrigin);
    }
    if (json.organismNameIsSet) {
      builder.organismName(json.organismName);
    }
    return (ImmutableSubstanceSourceMaterial) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial instance
   */
  public static SubstanceSourceMaterial copyOf(SubstanceSourceMaterial instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial) {
      return (ImmutableSubstanceSourceMaterial) instance;
    }
    return ((ImmutableSubstanceSourceMaterial.Builder) ImmutableSubstanceSourceMaterial.builder())
        .language(instance.language())
        .sourceMaterialClass(instance.sourceMaterialClass())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .id(instance.id())
        .sourceMaterialType(instance.sourceMaterialType())
        .organismId(instance.organismId())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .developmentStage(instance.developmentStage())
        .extension(instance.extension())
        .organism(instance.organism())
        .partDescription(instance.partDescription())
        .parentSubstanceId(instance.parentSubstanceId())
        .parentSubstanceName(instance.parentSubstanceName())
        .geographicalLocation(instance.geographicalLocation())
        .fractionDescription(instance.fractionDescription())
        .implicitRules(instance.implicitRules())
        .sourceMaterialState(instance.sourceMaterialState())
        .countryOfOrigin(instance.countryOfOrigin())
        .organismName(instance.organismName())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
   * <pre>
   * ImmutableSubstanceSourceMaterial.builder()
   *    .language(com.fhir.code) // optional {@link SubstanceSourceMaterial#language() language}
   *    .sourceMaterialClass(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass}
   *    .text(com.fhir.Narrative) // optional {@link SubstanceSourceMaterial#text() text}
   *    .resourceType(String) // required {@link SubstanceSourceMaterial#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link SubstanceSourceMaterial#meta() meta}
   *    .id(com.fhir.id) // optional {@link SubstanceSourceMaterial#id() id}
   *    .sourceMaterialType(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType}
   *    .organismId(com.fhir.Identifier) // optional {@link SubstanceSourceMaterial#organismId() organismId}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SubstanceSourceMaterial#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial#modifierExtension() modifierExtension}
   *    .developmentStage(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#developmentStage() developmentStage}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial#extension() extension}
   *    .organism(com.fhir.SubstanceSourceMaterial_Organism) // optional {@link SubstanceSourceMaterial#organism() organism}
   *    .partDescription(List&amp;lt;com.fhir.SubstanceSourceMaterial_PartDescription&amp;gt;) // optional {@link SubstanceSourceMaterial#partDescription() partDescription}
   *    .parentSubstanceId(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId}
   *    .parentSubstanceName(List&amp;lt;String&amp;gt;) // optional {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName}
   *    .geographicalLocation(List&amp;lt;String&amp;gt;) // optional {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation}
   *    .fractionDescription(List&amp;lt;com.fhir.SubstanceSourceMaterial_FractionDescription&amp;gt;) // optional {@link SubstanceSourceMaterial#fractionDescription() fractionDescription}
   *    .implicitRules(com.fhir.uri) // optional {@link SubstanceSourceMaterial#implicitRules() implicitRules}
   *    .sourceMaterialState(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState}
   *    .countryOfOrigin(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin}
   *    .organismName(String) // optional {@link SubstanceSourceMaterial#organismName() organismName}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstanceSourceMaterial.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_SOURCE_MATERIAL_CLASS = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_SOURCE_MATERIAL_TYPE = 0x20L;
    private static final long OPT_BIT_ORGANISM_ID = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_DEVELOPMENT_STAGE = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_ORGANISM = 0x800L;
    private static final long OPT_BIT_PART_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_PARENT_SUBSTANCE_ID = 0x2000L;
    private static final long OPT_BIT_PARENT_SUBSTANCE_NAME = 0x4000L;
    private static final long OPT_BIT_GEOGRAPHICAL_LOCATION = 0x8000L;
    private static final long OPT_BIT_FRACTION_DESCRIPTION = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_SOURCE_MATERIAL_STATE = 0x40000L;
    private static final long OPT_BIT_COUNTRY_OF_ORIGIN = 0x80000L;
    private static final long OPT_BIT_ORGANISM_NAME = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialClass;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialType;
    private @javax.annotation.Nullable com.fhir.Identifier organismId;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept developmentStage;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.SubstanceSourceMaterial_Organism organism;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> partDescription;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> parentSubstanceId;
    private @javax.annotation.Nullable java.util.List<java.lang.String> parentSubstanceName;
    private @javax.annotation.Nullable java.util.List<java.lang.String> geographicalLocation;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> fractionDescription;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept sourceMaterialState;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> countryOfOrigin;
    private @javax.annotation.Nullable java.lang.String organismName;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterialClass(com.fhir.CodeableConcept sourceMaterialClass) {
      checkNotIsSet(sourceMaterialClassIsSet(), "sourceMaterialClass");
      this.sourceMaterialClass = java.util.Objects.requireNonNull(sourceMaterialClass, "sourceMaterialClass");
      optBits |= OPT_BIT_SOURCE_MATERIAL_CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialClass")
    public final Builder sourceMaterialClass(java.util.Optional<? extends com.fhir.CodeableConcept> sourceMaterialClass) {
      checkNotIsSet(sourceMaterialClassIsSet(), "sourceMaterialClass");
      this.sourceMaterialClass = sourceMaterialClass.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL_CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
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
     * Initializes the value for the {@link SubstanceSourceMaterial#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterialType(com.fhir.CodeableConcept sourceMaterialType) {
      checkNotIsSet(sourceMaterialTypeIsSet(), "sourceMaterialType");
      this.sourceMaterialType = java.util.Objects.requireNonNull(sourceMaterialType, "sourceMaterialType");
      optBits |= OPT_BIT_SOURCE_MATERIAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialType")
    public final Builder sourceMaterialType(java.util.Optional<? extends com.fhir.CodeableConcept> sourceMaterialType) {
      checkNotIsSet(sourceMaterialTypeIsSet(), "sourceMaterialType");
      this.sourceMaterialType = sourceMaterialType.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for chained invocation
     */
    public final Builder organismId(com.fhir.Identifier organismId) {
      checkNotIsSet(organismIdIsSet(), "organismId");
      this.organismId = java.util.Objects.requireNonNull(organismId, "organismId");
      optBits |= OPT_BIT_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("organismId")
    public final Builder organismId(java.util.Optional<? extends com.fhir.Identifier> organismId) {
      checkNotIsSet(organismIdIsSet(), "organismId");
      this.organismId = organismId.orElse(null);
      optBits |= OPT_BIT_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for chained invocation
     */
    public final Builder developmentStage(com.fhir.CodeableConcept developmentStage) {
      checkNotIsSet(developmentStageIsSet(), "developmentStage");
      this.developmentStage = java.util.Objects.requireNonNull(developmentStage, "developmentStage");
      optBits |= OPT_BIT_DEVELOPMENT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("developmentStage")
    public final Builder developmentStage(java.util.Optional<? extends com.fhir.CodeableConcept> developmentStage) {
      checkNotIsSet(developmentStageIsSet(), "developmentStage");
      this.developmentStage = developmentStage.orElse(null);
      optBits |= OPT_BIT_DEVELOPMENT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for chained invocation
     */
    public final Builder organism(com.fhir.SubstanceSourceMaterial_Organism organism) {
      checkNotIsSet(organismIsSet(), "organism");
      this.organism = java.util.Objects.requireNonNull(organism, "organism");
      optBits |= OPT_BIT_ORGANISM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("organism")
    public final Builder organism(java.util.Optional<? extends com.fhir.SubstanceSourceMaterial_Organism> organism) {
      checkNotIsSet(organismIsSet(), "organism");
      this.organism = organism.orElse(null);
      optBits |= OPT_BIT_ORGANISM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder partDescription(java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> partDescription) {
      checkNotIsSet(partDescriptionIsSet(), "partDescription");
      this.partDescription = java.util.Objects.requireNonNull(partDescription, "partDescription");
      optBits |= OPT_BIT_PART_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partDescription")
    public final Builder partDescription(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> partDescription) {
      checkNotIsSet(partDescriptionIsSet(), "partDescription");
      this.partDescription = partDescription.orElse(null);
      optBits |= OPT_BIT_PART_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentSubstanceId(java.util.List<com.fhir.Identifier> parentSubstanceId) {
      checkNotIsSet(parentSubstanceIdIsSet(), "parentSubstanceId");
      this.parentSubstanceId = java.util.Objects.requireNonNull(parentSubstanceId, "parentSubstanceId");
      optBits |= OPT_BIT_PARENT_SUBSTANCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubstanceId")
    public final Builder parentSubstanceId(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> parentSubstanceId) {
      checkNotIsSet(parentSubstanceIdIsSet(), "parentSubstanceId");
      this.parentSubstanceId = parentSubstanceId.orElse(null);
      optBits |= OPT_BIT_PARENT_SUBSTANCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentSubstanceName(java.util.List<java.lang.String> parentSubstanceName) {
      checkNotIsSet(parentSubstanceNameIsSet(), "parentSubstanceName");
      this.parentSubstanceName = java.util.Objects.requireNonNull(parentSubstanceName, "parentSubstanceName");
      optBits |= OPT_BIT_PARENT_SUBSTANCE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubstanceName")
    public final Builder parentSubstanceName(java.util.Optional<? extends java.util.List<java.lang.String>> parentSubstanceName) {
      checkNotIsSet(parentSubstanceNameIsSet(), "parentSubstanceName");
      this.parentSubstanceName = parentSubstanceName.orElse(null);
      optBits |= OPT_BIT_PARENT_SUBSTANCE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for chained invocation
     */
    public final Builder geographicalLocation(java.util.List<java.lang.String> geographicalLocation) {
      checkNotIsSet(geographicalLocationIsSet(), "geographicalLocation");
      this.geographicalLocation = java.util.Objects.requireNonNull(geographicalLocation, "geographicalLocation");
      optBits |= OPT_BIT_GEOGRAPHICAL_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("geographicalLocation")
    public final Builder geographicalLocation(java.util.Optional<? extends java.util.List<java.lang.String>> geographicalLocation) {
      checkNotIsSet(geographicalLocationIsSet(), "geographicalLocation");
      this.geographicalLocation = geographicalLocation.orElse(null);
      optBits |= OPT_BIT_GEOGRAPHICAL_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder fractionDescription(java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> fractionDescription) {
      checkNotIsSet(fractionDescriptionIsSet(), "fractionDescription");
      this.fractionDescription = java.util.Objects.requireNonNull(fractionDescription, "fractionDescription");
      optBits |= OPT_BIT_FRACTION_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fractionDescription")
    public final Builder fractionDescription(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> fractionDescription) {
      checkNotIsSet(fractionDescriptionIsSet(), "fractionDescription");
      this.fractionDescription = fractionDescription.orElse(null);
      optBits |= OPT_BIT_FRACTION_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterialState(com.fhir.CodeableConcept sourceMaterialState) {
      checkNotIsSet(sourceMaterialStateIsSet(), "sourceMaterialState");
      this.sourceMaterialState = java.util.Objects.requireNonNull(sourceMaterialState, "sourceMaterialState");
      optBits |= OPT_BIT_SOURCE_MATERIAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterialState")
    public final Builder sourceMaterialState(java.util.Optional<? extends com.fhir.CodeableConcept> sourceMaterialState) {
      checkNotIsSet(sourceMaterialStateIsSet(), "sourceMaterialState");
      this.sourceMaterialState = sourceMaterialState.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for chained invocation
     */
    public final Builder countryOfOrigin(java.util.List<com.fhir.CodeableConcept> countryOfOrigin) {
      checkNotIsSet(countryOfOriginIsSet(), "countryOfOrigin");
      this.countryOfOrigin = java.util.Objects.requireNonNull(countryOfOrigin, "countryOfOrigin");
      optBits |= OPT_BIT_COUNTRY_OF_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countryOfOrigin")
    public final Builder countryOfOrigin(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> countryOfOrigin) {
      checkNotIsSet(countryOfOriginIsSet(), "countryOfOrigin");
      this.countryOfOrigin = countryOfOrigin.orElse(null);
      optBits |= OPT_BIT_COUNTRY_OF_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for chained invocation
     */
    public final Builder organismName(java.lang.String organismName) {
      checkNotIsSet(organismNameIsSet(), "organismName");
      this.organismName = java.util.Objects.requireNonNull(organismName, "organismName");
      optBits |= OPT_BIT_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("organismName")
    public final Builder organismName(java.util.Optional<java.lang.String> organismName) {
      checkNotIsSet(organismNameIsSet(), "organismName");
      this.organismName = organismName.orElse(null);
      optBits |= OPT_BIT_ORGANISM_NAME;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
     * @return An immutable instance of SubstanceSourceMaterial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SubstanceSourceMaterial build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceSourceMaterial(
          language,
          sourceMaterialClass,
          text,
          resourceType,
          meta,
          id,
          sourceMaterialType,
          organismId,
          contained,
          modifierExtension,
          developmentStage,
          extension,
          organism,
          partDescription,
          parentSubstanceId,
          parentSubstanceName,
          geographicalLocation,
          fractionDescription,
          implicitRules,
          sourceMaterialState,
          countryOfOrigin,
          organismName);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean sourceMaterialClassIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL_CLASS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sourceMaterialTypeIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL_TYPE) != 0;
    }

    private boolean organismIdIsSet() {
      return (optBits & OPT_BIT_ORGANISM_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean developmentStageIsSet() {
      return (optBits & OPT_BIT_DEVELOPMENT_STAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean organismIsSet() {
      return (optBits & OPT_BIT_ORGANISM) != 0;
    }

    private boolean partDescriptionIsSet() {
      return (optBits & OPT_BIT_PART_DESCRIPTION) != 0;
    }

    private boolean parentSubstanceIdIsSet() {
      return (optBits & OPT_BIT_PARENT_SUBSTANCE_ID) != 0;
    }

    private boolean parentSubstanceNameIsSet() {
      return (optBits & OPT_BIT_PARENT_SUBSTANCE_NAME) != 0;
    }

    private boolean geographicalLocationIsSet() {
      return (optBits & OPT_BIT_GEOGRAPHICAL_LOCATION) != 0;
    }

    private boolean fractionDescriptionIsSet() {
      return (optBits & OPT_BIT_FRACTION_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean sourceMaterialStateIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL_STATE) != 0;
    }

    private boolean countryOfOriginIsSet() {
      return (optBits & OPT_BIT_COUNTRY_OF_ORIGIN) != 0;
    }

    private boolean organismNameIsSet() {
      return (optBits & OPT_BIT_ORGANISM_NAME) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SubstanceSourceMaterial is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceSourceMaterial, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceSourceMaterial#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterialClass(com.fhir.CodeableConcept sourceMaterialClass);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterialClass(java.util.Optional<? extends com.fhir.CodeableConcept> sourceMaterialClass);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterialType(com.fhir.CodeableConcept sourceMaterialType);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterialType(java.util.Optional<? extends com.fhir.CodeableConcept> sourceMaterialType);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organismId(com.fhir.Identifier organismId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organismId(java.util.Optional<? extends com.fhir.Identifier> organismId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal developmentStage(com.fhir.CodeableConcept developmentStage);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal developmentStage(java.util.Optional<? extends com.fhir.CodeableConcept> developmentStage);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organism(com.fhir.SubstanceSourceMaterial_Organism organism);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organism(java.util.Optional<? extends com.fhir.SubstanceSourceMaterial_Organism> organism);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partDescription(java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription> partDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partDescription(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSourceMaterial_PartDescription>> partDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parentSubstanceId(java.util.List<com.fhir.Identifier> parentSubstanceId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parentSubstanceId(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> parentSubstanceId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parentSubstanceName(java.util.List<java.lang.String> parentSubstanceName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parentSubstanceName(java.util.Optional<? extends java.util.List<java.lang.String>> parentSubstanceName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal geographicalLocation(java.util.List<java.lang.String> geographicalLocation);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal geographicalLocation(java.util.Optional<? extends java.util.List<java.lang.String>> geographicalLocation);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fractionDescription(java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription> fractionDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fractionDescription(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSourceMaterial_FractionDescription>> fractionDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterialState(com.fhir.CodeableConcept sourceMaterialState);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterialState(java.util.Optional<? extends com.fhir.CodeableConcept> sourceMaterialState);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal countryOfOrigin(java.util.List<com.fhir.CodeableConcept> countryOfOrigin);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal countryOfOrigin(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> countryOfOrigin);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organismName(java.lang.String organismName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organismName(java.util.Optional<java.lang.String> organismName);

    /**
     * Builds a new {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
     * @return An immutable instance of SubstanceSourceMaterial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceSourceMaterial build();
  }
}
