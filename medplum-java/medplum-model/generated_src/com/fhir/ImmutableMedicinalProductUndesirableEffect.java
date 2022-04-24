//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductUndesirableEffect}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductUndesirableEffect.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductUndesirableEffect
    implements com.fhir.MedicinalProductUndesirableEffect {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Population> population;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept frequencyOfOccurrence;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept classification;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept symptomConditionEffect;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;

  private ImmutableMedicinalProductUndesirableEffect(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Population> population,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept frequencyOfOccurrence,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept classification,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept symptomConditionEffect,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject) {
    this.modifierExtension = modifierExtension;
    this.population = population;
    this.meta = meta;
    this.frequencyOfOccurrence = frequencyOfOccurrence;
    this.resourceType = resourceType;
    this.id = id;
    this.text = text;
    this.contained = contained;
    this.language = language;
    this.classification = classification;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.symptomConditionEffect = symptomConditionEffect;
    this.subject = subject;
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
   * @return The value of the {@code population} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("population")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Population>> population() {
    return java.util.Optional.ofNullable(population);
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
   * @return The value of the {@code frequencyOfOccurrence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("frequencyOfOccurrence")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> frequencyOfOccurrence() {
    return java.util.Optional.ofNullable(frequencyOfOccurrence);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("classification")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> classification() {
    return java.util.Optional.ofNullable(classification);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code symptomConditionEffect} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("symptomConditionEffect")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> symptomConditionEffect() {
    return java.util.Optional.ofNullable(symptomConditionEffect);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        newValue,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        value,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withPopulation(java.util.List<com.fhir.Population> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Population> newValue = java.util.Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        newValue,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withPopulation(java.util.Optional<? extends java.util.List<com.fhir.Population>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        value,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        newValue,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        value,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} attribute.
   * @param value The value for frequencyOfOccurrence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withFrequencyOfOccurrence(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "frequencyOfOccurrence");
    if (this.frequencyOfOccurrence == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        newValue,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequencyOfOccurrence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withFrequencyOfOccurrence(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.frequencyOfOccurrence == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        value,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductUndesirableEffect#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        newValue,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        newValue,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        value,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        newValue,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        value,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        newValue,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        value,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        newValue,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        value,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withClassification(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        newValue,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withClassification(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        value,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        newValue,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        value,
        this.extension,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        newValue,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        value,
        this.symptomConditionEffect,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} attribute.
   * @param value The value for symptomConditionEffect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withSymptomConditionEffect(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "symptomConditionEffect");
    if (this.symptomConditionEffect == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        newValue,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for symptomConditionEffect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withSymptomConditionEffect(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.symptomConditionEffect == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        value,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.modifierExtension,
        this.population,
        this.meta,
        this.frequencyOfOccurrence,
        this.resourceType,
        this.id,
        this.text,
        this.contained,
        this.language,
        this.classification,
        this.implicitRules,
        this.extension,
        this.symptomConditionEffect,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductUndesirableEffect} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductUndesirableEffect
        && equalTo((ImmutableMedicinalProductUndesirableEffect) another);
  }

  private boolean equalTo(ImmutableMedicinalProductUndesirableEffect another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(population, another.population)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(frequencyOfOccurrence, another.frequencyOfOccurrence)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(classification, another.classification)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(symptomConditionEffect, another.symptomConditionEffect)
        && java.util.Objects.equals(subject, another.subject);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code population}, {@code meta}, {@code frequencyOfOccurrence}, {@code resourceType}, {@code id}, {@code text}, {@code contained}, {@code language}, {@code classification}, {@code implicitRules}, {@code extension}, {@code symptomConditionEffect}, {@code subject}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(population);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(frequencyOfOccurrence);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(classification);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(symptomConditionEffect);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductUndesirableEffect} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductUndesirableEffect{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (population != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("population=").append(population);
    }
    if (meta != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (frequencyOfOccurrence != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("frequencyOfOccurrence=").append(frequencyOfOccurrence);
    }
    if (builder.length() > 34) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (classification != null) {
      builder.append(", ");
      builder.append("classification=").append(classification);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (symptomConditionEffect != null) {
      builder.append(", ");
      builder.append("symptomConditionEffect=").append(symptomConditionEffect);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductUndesirableEffect {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Population>> population = java.util.Optional.empty();
    boolean populationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> frequencyOfOccurrence = java.util.Optional.empty();
    boolean frequencyOfOccurrenceIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> classification = java.util.Optional.empty();
    boolean classificationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> symptomConditionEffect = java.util.Optional.empty();
    boolean symptomConditionEffectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public void setPopulation(java.util.Optional<java.util.List<com.fhir.Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyOfOccurrence")
    public void setFrequencyOfOccurrence(java.util.Optional<com.fhir.CodeableConcept> frequencyOfOccurrence) {
      this.frequencyOfOccurrence = frequencyOfOccurrence;
      this.frequencyOfOccurrenceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("classification")
    public void setClassification(java.util.Optional<com.fhir.CodeableConcept> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("symptomConditionEffect")
    public void setSymptomConditionEffect(java.util.Optional<com.fhir.CodeableConcept> symptomConditionEffect) {
      this.symptomConditionEffect = symptomConditionEffect;
      this.symptomConditionEffectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Population>> population() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> frequencyOfOccurrence() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> classification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> symptomConditionEffect() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subject() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductUndesirableEffect fromJson(Json json) {
    ImmutableMedicinalProductUndesirableEffect.Builder builder = ((ImmutableMedicinalProductUndesirableEffect.Builder) ImmutableMedicinalProductUndesirableEffect.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.frequencyOfOccurrenceIsSet) {
      builder.frequencyOfOccurrence(json.frequencyOfOccurrence);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.symptomConditionEffectIsSet) {
      builder.symptomConditionEffect(json.symptomConditionEffect);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    return (ImmutableMedicinalProductUndesirableEffect) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductUndesirableEffect} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductUndesirableEffect instance
   */
  public static MedicinalProductUndesirableEffect copyOf(MedicinalProductUndesirableEffect instance) {
    if (instance instanceof ImmutableMedicinalProductUndesirableEffect) {
      return (ImmutableMedicinalProductUndesirableEffect) instance;
    }
    return ((ImmutableMedicinalProductUndesirableEffect.Builder) ImmutableMedicinalProductUndesirableEffect.builder())
        .modifierExtension(instance.modifierExtension())
        .population(instance.population())
        .meta(instance.meta())
        .frequencyOfOccurrence(instance.frequencyOfOccurrence())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .text(instance.text())
        .contained(instance.contained())
        .language(instance.language())
        .classification(instance.classification())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .symptomConditionEffect(instance.symptomConditionEffect())
        .subject(instance.subject())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
   * <pre>
   * ImmutableMedicinalProductUndesirableEffect.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension}
   *    .population(List&amp;lt;com.fhir.Population&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#population() population}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductUndesirableEffect#meta() meta}
   *    .frequencyOfOccurrence(com.fhir.CodeableConcept) // optional {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence}
   *    .resourceType(String) // required {@link MedicinalProductUndesirableEffect#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link MedicinalProductUndesirableEffect#id() id}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductUndesirableEffect#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#contained() contained}
   *    .language(com.fhir.code) // optional {@link MedicinalProductUndesirableEffect#language() language}
   *    .classification(com.fhir.CodeableConcept) // optional {@link MedicinalProductUndesirableEffect#classification() classification}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#extension() extension}
   *    .symptomConditionEffect(com.fhir.CodeableConcept) // optional {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#subject() subject}
   *    .build();
   * </pre>
   * @return A new MedicinalProductUndesirableEffect builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductUndesirableEffect.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_POPULATION = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_FREQUENCY_OF_OCCURRENCE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_CLASSIFICATION = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_SYMPTOM_CONDITION_EFFECT = 0x800L;
    private static final long OPT_BIT_SUBJECT = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Population> population;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept frequencyOfOccurrence;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept classification;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept symptomConditionEffect;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    public final Builder population(java.util.List<com.fhir.Population> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = java.util.Objects.requireNonNull(population, "population");
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public final Builder population(java.util.Optional<? extends java.util.List<com.fhir.Population>> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = population.orElse(null);
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequencyOfOccurrence(com.fhir.CodeableConcept frequencyOfOccurrence) {
      checkNotIsSet(frequencyOfOccurrenceIsSet(), "frequencyOfOccurrence");
      this.frequencyOfOccurrence = java.util.Objects.requireNonNull(frequencyOfOccurrence, "frequencyOfOccurrence");
      optBits |= OPT_BIT_FREQUENCY_OF_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyOfOccurrence")
    public final Builder frequencyOfOccurrence(java.util.Optional<? extends com.fhir.CodeableConcept> frequencyOfOccurrence) {
      checkNotIsSet(frequencyOfOccurrenceIsSet(), "frequencyOfOccurrence");
      this.frequencyOfOccurrence = frequencyOfOccurrence.orElse(null);
      optBits |= OPT_BIT_FREQUENCY_OF_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductUndesirableEffect#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(com.fhir.CodeableConcept classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = java.util.Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("classification")
    public final Builder classification(java.util.Optional<? extends com.fhir.CodeableConcept> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for chained invocation
     */
    public final Builder symptomConditionEffect(com.fhir.CodeableConcept symptomConditionEffect) {
      checkNotIsSet(symptomConditionEffectIsSet(), "symptomConditionEffect");
      this.symptomConditionEffect = java.util.Objects.requireNonNull(symptomConditionEffect, "symptomConditionEffect");
      optBits |= OPT_BIT_SYMPTOM_CONDITION_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("symptomConditionEffect")
    public final Builder symptomConditionEffect(java.util.Optional<? extends com.fhir.CodeableConcept> symptomConditionEffect) {
      checkNotIsSet(symptomConditionEffectIsSet(), "symptomConditionEffect");
      this.symptomConditionEffect = symptomConditionEffect.orElse(null);
      optBits |= OPT_BIT_SYMPTOM_CONDITION_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(java.util.List<com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
     * @return An immutable instance of MedicinalProductUndesirableEffect
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductUndesirableEffect build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductUndesirableEffect(
          modifierExtension,
          population,
          meta,
          frequencyOfOccurrence,
          resourceType,
          id,
          text,
          contained,
          language,
          classification,
          implicitRules,
          extension,
          symptomConditionEffect,
          subject);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean frequencyOfOccurrenceIsSet() {
      return (optBits & OPT_BIT_FREQUENCY_OF_OCCURRENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean symptomConditionEffectIsSet() {
      return (optBits & OPT_BIT_SYMPTOM_CONDITION_EFFECT) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductUndesirableEffect is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductUndesirableEffect, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductUndesirableEffect#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    BuildFinal population(java.util.List<com.fhir.Population> population);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal population(java.util.Optional<? extends java.util.List<com.fhir.Population>> population);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal frequencyOfOccurrence(com.fhir.CodeableConcept frequencyOfOccurrence);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal frequencyOfOccurrence(java.util.Optional<? extends com.fhir.CodeableConcept> frequencyOfOccurrence);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classification(com.fhir.CodeableConcept classification);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(java.util.Optional<? extends com.fhir.CodeableConcept> classification);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal symptomConditionEffect(com.fhir.CodeableConcept symptomConditionEffect);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal symptomConditionEffect(java.util.Optional<? extends com.fhir.CodeableConcept> symptomConditionEffect);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Builds a new {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
     * @return An immutable instance of MedicinalProductUndesirableEffect
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductUndesirableEffect build();
  }
}
