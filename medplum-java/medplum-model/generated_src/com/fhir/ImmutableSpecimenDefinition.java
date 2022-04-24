//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SpecimenDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimenDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "SpecimenDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimenDefinition implements com.fhir.SpecimenDefinition {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SpecimenDefinition_TypeTested> typeTested;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> collection;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept typeCollected;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> patientPreparation;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable java.lang.String timeAspect;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.code language;

  private ImmutableSpecimenDefinition(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.SpecimenDefinition_TypeTested> typeTested,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> collection,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.CodeableConcept typeCollected,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> patientPreparation,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable java.lang.String timeAspect,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.code language) {
    this.extension = extension;
    this.meta = meta;
    this.typeTested = typeTested;
    this.contained = contained;
    this.collection = collection;
    this.resourceType = resourceType;
    this.typeCollected = typeCollected;
    this.patientPreparation = patientPreparation;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
    this.timeAspect = timeAspect;
    this.text = text;
    this.language = language;
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code typeTested} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("typeTested")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SpecimenDefinition_TypeTested>> typeTested() {
    return java.util.Optional.ofNullable(typeTested);
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
   * @return The value of the {@code collection} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("collection")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> collection() {
    return java.util.Optional.ofNullable(collection);
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
   * @return The value of the {@code typeCollected} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("typeCollected")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> typeCollected() {
    return java.util.Optional.ofNullable(typeCollected);
  }

  /**
   * @return The value of the {@code patientPreparation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patientPreparation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> patientPreparation() {
    return java.util.Optional.ofNullable(patientPreparation);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code timeAspect} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timeAspect")
  @Override
  public java.util.Optional<java.lang.String> timeAspect() {
    return java.util.Optional.ofNullable(timeAspect);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimenDefinition(
        newValue,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimenDefinition(
        value,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        newValue,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        value,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#typeTested() typeTested} attribute.
   * @param value The value for typeTested
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTypeTested(java.util.List<com.fhir.SpecimenDefinition_TypeTested> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SpecimenDefinition_TypeTested> newValue = java.util.Objects.requireNonNull(value, "typeTested");
    if (this.typeTested == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        newValue,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#typeTested() typeTested} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeTested
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withTypeTested(java.util.Optional<? extends java.util.List<com.fhir.SpecimenDefinition_TypeTested>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SpecimenDefinition_TypeTested> value = optional.orElse(null);
    if (this.typeTested == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        value,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        newValue,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        value,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#collection() collection} attribute.
   * @param value The value for collection
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withCollection(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "collection");
    if (this.collection == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        newValue,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#collection() collection} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collection
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withCollection(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.collection == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        value,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecimenDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecimenDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        newValue,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#typeCollected() typeCollected} attribute.
   * @param value The value for typeCollected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTypeCollected(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "typeCollected");
    if (this.typeCollected == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        newValue,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#typeCollected() typeCollected} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeCollected
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withTypeCollected(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.typeCollected == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        value,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#patientPreparation() patientPreparation} attribute.
   * @param value The value for patientPreparation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withPatientPreparation(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "patientPreparation");
    if (this.patientPreparation == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        newValue,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#patientPreparation() patientPreparation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientPreparation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withPatientPreparation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.patientPreparation == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        value,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        newValue,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        value,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        value,
        this.identifier,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.timeAspect,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#timeAspect() timeAspect} attribute.
   * @param value The value for timeAspect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTimeAspect(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "timeAspect");
    if (java.util.Objects.equals(this.timeAspect, newValue)) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        newValue,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#timeAspect() timeAspect} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeAspect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTimeAspect(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.timeAspect, value)) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        value,
        this.text,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSpecimenDefinition(
        this.extension,
        this.meta,
        this.typeTested,
        this.contained,
        this.collection,
        this.resourceType,
        this.typeCollected,
        this.patientPreparation,
        this.id,
        this.modifierExtension,
        this.implicitRules,
        this.identifier,
        this.timeAspect,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimenDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimenDefinition
        && equalTo((ImmutableSpecimenDefinition) another);
  }

  private boolean equalTo(ImmutableSpecimenDefinition another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(typeTested, another.typeTested)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(collection, another.collection)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(typeCollected, another.typeCollected)
        && java.util.Objects.equals(patientPreparation, another.patientPreparation)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(timeAspect, another.timeAspect)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code meta}, {@code typeTested}, {@code contained}, {@code collection}, {@code resourceType}, {@code typeCollected}, {@code patientPreparation}, {@code id}, {@code modifierExtension}, {@code implicitRules}, {@code identifier}, {@code timeAspect}, {@code text}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(typeTested);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(collection);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(typeCollected);
    h += (h << 5) + java.util.Objects.hashCode(patientPreparation);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(timeAspect);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code SpecimenDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SpecimenDefinition{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (typeTested != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("typeTested=").append(typeTested);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (collection != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (typeCollected != null) {
      builder.append(", ");
      builder.append("typeCollected=").append(typeCollected);
    }
    if (patientPreparation != null) {
      builder.append(", ");
      builder.append("patientPreparation=").append(patientPreparation);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (timeAspect != null) {
      builder.append(", ");
      builder.append("timeAspect=").append(timeAspect);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
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
  @org.immutables.value.Generated(from = "SpecimenDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SpecimenDefinition {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SpecimenDefinition_TypeTested>> typeTested = java.util.Optional.empty();
    boolean typeTestedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> collection = java.util.Optional.empty();
    boolean collectionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> typeCollected = java.util.Optional.empty();
    boolean typeCollectedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> patientPreparation = java.util.Optional.empty();
    boolean patientPreparationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> timeAspect = java.util.Optional.empty();
    boolean timeAspectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("typeTested")
    public void setTypeTested(java.util.Optional<java.util.List<com.fhir.SpecimenDefinition_TypeTested>> typeTested) {
      this.typeTested = typeTested;
      this.typeTestedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("collection")
    public void setCollection(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("typeCollected")
    public void setTypeCollected(java.util.Optional<com.fhir.CodeableConcept> typeCollected) {
      this.typeCollected = typeCollected;
      this.typeCollectedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patientPreparation")
    public void setPatientPreparation(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> patientPreparation) {
      this.patientPreparation = patientPreparation;
      this.patientPreparationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timeAspect")
    public void setTimeAspect(java.util.Optional<java.lang.String> timeAspect) {
      this.timeAspect = timeAspect;
      this.timeAspectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SpecimenDefinition_TypeTested>> typeTested() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> collection() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> typeCollected() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> patientPreparation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> timeAspect() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimenDefinition fromJson(Json json) {
    ImmutableSpecimenDefinition.Builder builder = ((ImmutableSpecimenDefinition.Builder) ImmutableSpecimenDefinition.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.typeTestedIsSet) {
      builder.typeTested(json.typeTested);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.typeCollectedIsSet) {
      builder.typeCollected(json.typeCollected);
    }
    if (json.patientPreparationIsSet) {
      builder.patientPreparation(json.patientPreparation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.timeAspectIsSet) {
      builder.timeAspect(json.timeAspect);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableSpecimenDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SpecimenDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecimenDefinition instance
   */
  public static SpecimenDefinition copyOf(SpecimenDefinition instance) {
    if (instance instanceof ImmutableSpecimenDefinition) {
      return (ImmutableSpecimenDefinition) instance;
    }
    return ((ImmutableSpecimenDefinition.Builder) ImmutableSpecimenDefinition.builder())
        .extension(instance.extension())
        .meta(instance.meta())
        .typeTested(instance.typeTested())
        .contained(instance.contained())
        .collection(instance.collection())
        .resourceType(instance.resourceType())
        .typeCollected(instance.typeCollected())
        .patientPreparation(instance.patientPreparation())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .timeAspect(instance.timeAspect())
        .text(instance.text())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link SpecimenDefinition SpecimenDefinition}.
   * <pre>
   * ImmutableSpecimenDefinition.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition#extension() extension}
   *    .meta(com.fhir.Meta) // optional {@link SpecimenDefinition#meta() meta}
   *    .typeTested(List&amp;lt;com.fhir.SpecimenDefinition_TypeTested&amp;gt;) // optional {@link SpecimenDefinition#typeTested() typeTested}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SpecimenDefinition#contained() contained}
   *    .collection(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SpecimenDefinition#collection() collection}
   *    .resourceType(String) // required {@link SpecimenDefinition#resourceType() resourceType}
   *    .typeCollected(com.fhir.CodeableConcept) // optional {@link SpecimenDefinition#typeCollected() typeCollected}
   *    .patientPreparation(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SpecimenDefinition#patientPreparation() patientPreparation}
   *    .id(com.fhir.id) // optional {@link SpecimenDefinition#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link SpecimenDefinition#implicitRules() implicitRules}
   *    .identifier(com.fhir.Identifier) // optional {@link SpecimenDefinition#identifier() identifier}
   *    .timeAspect(String) // optional {@link SpecimenDefinition#timeAspect() timeAspect}
   *    .text(com.fhir.Narrative) // optional {@link SpecimenDefinition#text() text}
   *    .language(com.fhir.code) // optional {@link SpecimenDefinition#language() language}
   *    .build();
   * </pre>
   * @return A new SpecimenDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSpecimenDefinition.Builder();
  }

  /**
   * Builds instances of type {@link SpecimenDefinition SpecimenDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SpecimenDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_TYPE_TESTED = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_COLLECTION = 0x10L;
    private static final long OPT_BIT_TYPE_COLLECTED = 0x20L;
    private static final long OPT_BIT_PATIENT_PREPARATION = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_TIME_ASPECT = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.SpecimenDefinition_TypeTested> typeTested;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> collection;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.CodeableConcept typeCollected;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> patientPreparation;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable java.lang.String timeAspect;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeTested(java.util.List<com.fhir.SpecimenDefinition_TypeTested> typeTested) {
      checkNotIsSet(typeTestedIsSet(), "typeTested");
      this.typeTested = java.util.Objects.requireNonNull(typeTested, "typeTested");
      optBits |= OPT_BIT_TYPE_TESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("typeTested")
    public final Builder typeTested(java.util.Optional<? extends java.util.List<com.fhir.SpecimenDefinition_TypeTested>> typeTested) {
      checkNotIsSet(typeTestedIsSet(), "typeTested");
      this.typeTested = typeTested.orElse(null);
      optBits |= OPT_BIT_TYPE_TESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    public final Builder collection(java.util.List<com.fhir.CodeableConcept> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = java.util.Objects.requireNonNull(collection, "collection");
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collection")
    public final Builder collection(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = collection.orElse(null);
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecimenDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeCollected(com.fhir.CodeableConcept typeCollected) {
      checkNotIsSet(typeCollectedIsSet(), "typeCollected");
      this.typeCollected = java.util.Objects.requireNonNull(typeCollected, "typeCollected");
      optBits |= OPT_BIT_TYPE_COLLECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("typeCollected")
    public final Builder typeCollected(java.util.Optional<? extends com.fhir.CodeableConcept> typeCollected) {
      checkNotIsSet(typeCollectedIsSet(), "typeCollected");
      this.typeCollected = typeCollected.orElse(null);
      optBits |= OPT_BIT_TYPE_COLLECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientPreparation(java.util.List<com.fhir.CodeableConcept> patientPreparation) {
      checkNotIsSet(patientPreparationIsSet(), "patientPreparation");
      this.patientPreparation = java.util.Objects.requireNonNull(patientPreparation, "patientPreparation");
      optBits |= OPT_BIT_PATIENT_PREPARATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patientPreparation")
    public final Builder patientPreparation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> patientPreparation) {
      checkNotIsSet(patientPreparationIsSet(), "patientPreparation");
      this.patientPreparation = patientPreparation.orElse(null);
      optBits |= OPT_BIT_PATIENT_PREPARATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeAspect(java.lang.String timeAspect) {
      checkNotIsSet(timeAspectIsSet(), "timeAspect");
      this.timeAspect = java.util.Objects.requireNonNull(timeAspect, "timeAspect");
      optBits |= OPT_BIT_TIME_ASPECT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAspect")
    public final Builder timeAspect(java.util.Optional<java.lang.String> timeAspect) {
      checkNotIsSet(timeAspectIsSet(), "timeAspect");
      this.timeAspect = timeAspect.orElse(null);
      optBits |= OPT_BIT_TIME_ASPECT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
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
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
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
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
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
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
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
     * Builds a new {@link SpecimenDefinition SpecimenDefinition}.
     * @return An immutable instance of SpecimenDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SpecimenDefinition build() {
      checkRequiredAttributes();
      return new ImmutableSpecimenDefinition(
          extension,
          meta,
          typeTested,
          contained,
          collection,
          resourceType,
          typeCollected,
          patientPreparation,
          id,
          modifierExtension,
          implicitRules,
          identifier,
          timeAspect,
          text,
          language);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean typeTestedIsSet() {
      return (optBits & OPT_BIT_TYPE_TESTED) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean typeCollectedIsSet() {
      return (optBits & OPT_BIT_TYPE_COLLECTED) != 0;
    }

    private boolean patientPreparationIsSet() {
      return (optBits & OPT_BIT_PATIENT_PREPARATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean timeAspectIsSet() {
      return (optBits & OPT_BIT_TIME_ASPECT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SpecimenDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SpecimenDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SpecimenDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SpecimenDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SpecimenDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for chained invocation
     */
    BuildFinal typeTested(java.util.List<com.fhir.SpecimenDefinition_TypeTested> typeTested);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal typeTested(java.util.Optional<? extends java.util.List<com.fhir.SpecimenDefinition_TypeTested>> typeTested);

    /**
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    BuildFinal collection(java.util.List<com.fhir.CodeableConcept> collection);

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal collection(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> collection);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for chained invocation
     */
    BuildFinal typeCollected(com.fhir.CodeableConcept typeCollected);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal typeCollected(java.util.Optional<? extends com.fhir.CodeableConcept> typeCollected);

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patientPreparation(java.util.List<com.fhir.CodeableConcept> patientPreparation);

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patientPreparation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> patientPreparation);

    /**
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timeAspect(java.lang.String timeAspect);

    /**
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timeAspect(java.util.Optional<java.lang.String> timeAspect);

    /**
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Builds a new {@link SpecimenDefinition SpecimenDefinition}.
     * @return An immutable instance of SpecimenDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SpecimenDefinition build();
  }
}
