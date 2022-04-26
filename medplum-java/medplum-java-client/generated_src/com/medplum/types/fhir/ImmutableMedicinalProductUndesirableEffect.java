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
 * Immutable implementation of {@link MedicinalProductUndesirableEffect}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductUndesirableEffect.builder()}.
 */
@Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductUndesirableEffect
    implements MedicinalProductUndesirableEffect {
  private final @Nullable CodeableConcept classification;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> subject;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Code language;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept frequencyOfOccurrence;
  private final @Nullable CodeableConcept symptomConditionEffect;
  private final @Nullable List<Population> population;

  private ImmutableMedicinalProductUndesirableEffect(
      @Nullable CodeableConcept classification,
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable Narrative text,
      @Nullable List<Reference> subject,
      @Nullable List<ResourceList> contained,
      @Nullable Code language,
      @Nullable Id id,
      String resourceType,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept frequencyOfOccurrence,
      @Nullable CodeableConcept symptomConditionEffect,
      @Nullable List<Population> population) {
    this.classification = classification;
    this.meta = meta;
    this.extension = extension;
    this.text = text;
    this.subject = subject;
    this.contained = contained;
    this.language = language;
    this.id = id;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.frequencyOfOccurrence = frequencyOfOccurrence;
    this.symptomConditionEffect = symptomConditionEffect;
    this.population = population;
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @JsonProperty("classification")
  @Override
  public Optional<CodeableConcept> classification() {
    return Optional.ofNullable(classification);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<List<Reference>> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code frequencyOfOccurrence} attribute
   */
  @JsonProperty("frequencyOfOccurrence")
  @Override
  public Optional<CodeableConcept> frequencyOfOccurrence() {
    return Optional.ofNullable(frequencyOfOccurrence);
  }

  /**
   * @return The value of the {@code symptomConditionEffect} attribute
   */
  @JsonProperty("symptomConditionEffect")
  @Override
  public Optional<CodeableConcept> symptomConditionEffect() {
    return Optional.ofNullable(symptomConditionEffect);
  }

  /**
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Optional<List<Population>> population() {
    return Optional.ofNullable(population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withClassification(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        newValue,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withClassification(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        value,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        newValue,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        value,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        newValue,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        value,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        newValue,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        value,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        newValue,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        value,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        newValue,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        value,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        newValue,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        value,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        value,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductUndesirableEffect#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        newValue,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        value,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        value,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} attribute.
   * @param value The value for frequencyOfOccurrence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withFrequencyOfOccurrence(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "frequencyOfOccurrence");
    if (this.frequencyOfOccurrence == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequencyOfOccurrence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withFrequencyOfOccurrence(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.frequencyOfOccurrence == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.symptomConditionEffect,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} attribute.
   * @param value The value for symptomConditionEffect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withSymptomConditionEffect(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "symptomConditionEffect");
    if (this.symptomConditionEffect == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        newValue,
        this.population);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for symptomConditionEffect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withSymptomConditionEffect(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.symptomConditionEffect == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        value,
        this.population);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductUndesirableEffect#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductUndesirableEffect withPopulation(List<Population> value) {
    @Nullable List<Population> newValue = Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductUndesirableEffect#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductUndesirableEffect withPopulation(Optional<? extends List<Population>> optional) {
    @Nullable List<Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMedicinalProductUndesirableEffect(
        this.classification,
        this.meta,
        this.extension,
        this.text,
        this.subject,
        this.contained,
        this.language,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.modifierExtension,
        this.frequencyOfOccurrence,
        this.symptomConditionEffect,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductUndesirableEffect} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductUndesirableEffect
        && equalTo((ImmutableMedicinalProductUndesirableEffect) another);
  }

  private boolean equalTo(ImmutableMedicinalProductUndesirableEffect another) {
    return Objects.equals(classification, another.classification)
        && Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text)
        && Objects.equals(subject, another.subject)
        && Objects.equals(contained, another.contained)
        && Objects.equals(language, another.language)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(frequencyOfOccurrence, another.frequencyOfOccurrence)
        && Objects.equals(symptomConditionEffect, another.symptomConditionEffect)
        && Objects.equals(population, another.population);
  }

  /**
   * Computes a hash code from attributes: {@code classification}, {@code meta}, {@code extension}, {@code text}, {@code subject}, {@code contained}, {@code language}, {@code id}, {@code resourceType}, {@code implicitRules}, {@code modifierExtension}, {@code frequencyOfOccurrence}, {@code symptomConditionEffect}, {@code population}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(classification);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(frequencyOfOccurrence);
    h += (h << 5) + Objects.hashCode(symptomConditionEffect);
    h += (h << 5) + Objects.hashCode(population);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductUndesirableEffect} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductUndesirableEffect{");
    if (classification != null) {
      builder.append("classification=").append(classification);
    }
    if (meta != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (subject != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (contained != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 34) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (frequencyOfOccurrence != null) {
      builder.append(", ");
      builder.append("frequencyOfOccurrence=").append(frequencyOfOccurrence);
    }
    if (symptomConditionEffect != null) {
      builder.append(", ");
      builder.append("symptomConditionEffect=").append(symptomConditionEffect);
    }
    if (population != null) {
      builder.append(", ");
      builder.append("population=").append(population);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductUndesirableEffect {
    @Nullable Optional<CodeableConcept> classification = Optional.empty();
    boolean classificationIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> frequencyOfOccurrence = Optional.empty();
    boolean frequencyOfOccurrenceIsSet;
    @Nullable Optional<CodeableConcept> symptomConditionEffect = Optional.empty();
    boolean symptomConditionEffectIsSet;
    @Nullable Optional<List<Population>> population = Optional.empty();
    boolean populationIsSet;
    @JsonProperty("classification")
    public void setClassification(Optional<CodeableConcept> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
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
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("frequencyOfOccurrence")
    public void setFrequencyOfOccurrence(Optional<CodeableConcept> frequencyOfOccurrence) {
      this.frequencyOfOccurrence = frequencyOfOccurrence;
      this.frequencyOfOccurrenceIsSet = true;
    }
    @JsonProperty("symptomConditionEffect")
    public void setSymptomConditionEffect(Optional<CodeableConcept> symptomConditionEffect) {
      this.symptomConditionEffect = symptomConditionEffect;
      this.symptomConditionEffectIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Optional<List<Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> classification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> frequencyOfOccurrence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> symptomConditionEffect() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Population>> population() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductUndesirableEffect fromJson(Json json) {
    ImmutableMedicinalProductUndesirableEffect.Builder builder = ((ImmutableMedicinalProductUndesirableEffect.Builder) ImmutableMedicinalProductUndesirableEffect.builder());
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.frequencyOfOccurrenceIsSet) {
      builder.frequencyOfOccurrence(json.frequencyOfOccurrence);
    }
    if (json.symptomConditionEffectIsSet) {
      builder.symptomConditionEffect(json.symptomConditionEffect);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
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
        .classification(instance.classification())
        .meta(instance.meta())
        .extension(instance.extension())
        .text(instance.text())
        .subject(instance.subject())
        .contained(instance.contained())
        .language(instance.language())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .frequencyOfOccurrence(instance.frequencyOfOccurrence())
        .symptomConditionEffect(instance.symptomConditionEffect())
        .population(instance.population())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
   * <pre>
   * ImmutableMedicinalProductUndesirableEffect.builder()
   *    .classification(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductUndesirableEffect#classification() classification}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductUndesirableEffect#meta() meta}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#extension() extension}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductUndesirableEffect#text() text}
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#subject() subject}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#contained() contained}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductUndesirableEffect#language() language}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductUndesirableEffect#id() id}
   *    .resourceType(String) // required {@link MedicinalProductUndesirableEffect#resourceType() resourceType}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension}
   *    .frequencyOfOccurrence(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence}
   *    .symptomConditionEffect(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect}
   *    .population(List&amp;lt;com.medplum.types.fhir.Population&amp;gt;) // optional {@link MedicinalProductUndesirableEffect#population() population}
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
  @Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CLASSIFICATION = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_SUBJECT = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_FREQUENCY_OF_OCCURRENCE = 0x400L;
    private static final long OPT_BIT_SYMPTOM_CONDITION_EFFECT = 0x800L;
    private static final long OPT_BIT_POPULATION = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept classification;
    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable Narrative text;
    private @Nullable List<Reference> subject;
    private @Nullable List<ResourceList> contained;
    private @Nullable Code language;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept frequencyOfOccurrence;
    private @Nullable CodeableConcept symptomConditionEffect;
    private @Nullable List<Population> population;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(CodeableConcept classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("classification")
    public final Builder classification(Optional<? extends CodeableConcept> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(List<Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends List<Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
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
     * Initializes the value for the {@link MedicinalProductUndesirableEffect#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequencyOfOccurrence(CodeableConcept frequencyOfOccurrence) {
      checkNotIsSet(frequencyOfOccurrenceIsSet(), "frequencyOfOccurrence");
      this.frequencyOfOccurrence = Objects.requireNonNull(frequencyOfOccurrence, "frequencyOfOccurrence");
      optBits |= OPT_BIT_FREQUENCY_OF_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequencyOfOccurrence")
    public final Builder frequencyOfOccurrence(Optional<? extends CodeableConcept> frequencyOfOccurrence) {
      checkNotIsSet(frequencyOfOccurrenceIsSet(), "frequencyOfOccurrence");
      this.frequencyOfOccurrence = frequencyOfOccurrence.orElse(null);
      optBits |= OPT_BIT_FREQUENCY_OF_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for chained invocation
     */
    public final Builder symptomConditionEffect(CodeableConcept symptomConditionEffect) {
      checkNotIsSet(symptomConditionEffectIsSet(), "symptomConditionEffect");
      this.symptomConditionEffect = Objects.requireNonNull(symptomConditionEffect, "symptomConditionEffect");
      optBits |= OPT_BIT_SYMPTOM_CONDITION_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("symptomConditionEffect")
    public final Builder symptomConditionEffect(Optional<? extends CodeableConcept> symptomConditionEffect) {
      checkNotIsSet(symptomConditionEffectIsSet(), "symptomConditionEffect");
      this.symptomConditionEffect = symptomConditionEffect.orElse(null);
      optBits |= OPT_BIT_SYMPTOM_CONDITION_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    public final Builder population(List<Population> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = Objects.requireNonNull(population, "population");
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("population")
    public final Builder population(Optional<? extends List<Population>> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = population.orElse(null);
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
     * @return An immutable instance of MedicinalProductUndesirableEffect
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductUndesirableEffect build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductUndesirableEffect(
          classification,
          meta,
          extension,
          text,
          subject,
          contained,
          language,
          id,
          resourceType,
          implicitRules,
          modifierExtension,
          frequencyOfOccurrence,
          symptomConditionEffect,
          population);
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean frequencyOfOccurrenceIsSet() {
      return (optBits & OPT_BIT_FREQUENCY_OF_OCCURRENCE) != 0;
    }

    private boolean symptomConditionEffectIsSet() {
      return (optBits & OPT_BIT_SYMPTOM_CONDITION_EFFECT) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductUndesirableEffect is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductUndesirableEffect, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductUndesirableEffect#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductUndesirableEffect", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classification(CodeableConcept classification);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(Optional<? extends CodeableConcept> classification);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal frequencyOfOccurrence(CodeableConcept frequencyOfOccurrence);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#frequencyOfOccurrence() frequencyOfOccurrence} to frequencyOfOccurrence.
     * @param frequencyOfOccurrence The value for frequencyOfOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal frequencyOfOccurrence(Optional<? extends CodeableConcept> frequencyOfOccurrence);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal symptomConditionEffect(CodeableConcept symptomConditionEffect);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#symptomConditionEffect() symptomConditionEffect} to symptomConditionEffect.
     * @param symptomConditionEffect The value for symptomConditionEffect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal symptomConditionEffect(Optional<? extends CodeableConcept> symptomConditionEffect);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    BuildFinal population(List<Population> population);

    /**
     * Initializes the optional value {@link MedicinalProductUndesirableEffect#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal population(Optional<? extends List<Population>> population);

    /**
     * Builds a new {@link MedicinalProductUndesirableEffect MedicinalProductUndesirableEffect}.
     * @return An immutable instance of MedicinalProductUndesirableEffect
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductUndesirableEffect build();
  }
}