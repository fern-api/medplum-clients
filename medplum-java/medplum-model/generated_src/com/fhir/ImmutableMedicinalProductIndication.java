//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductIndication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIndication.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductIndication", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIndication implements com.fhir.MedicinalProductIndication {
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> otherTherapy;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Quantity duration;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Population> population;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept diseaseSymptomProcedure;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept diseaseStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> comorbidity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> undesirableEffect;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept intendedEffect;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;

  private ImmutableMedicinalProductIndication(
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> otherTherapy,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Quantity duration,
      @javax.annotation.Nullable java.util.List<com.fhir.Population> population,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept diseaseSymptomProcedure,
      @javax.annotation.Nullable com.fhir.CodeableConcept diseaseStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> comorbidity,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> undesirableEffect,
      @javax.annotation.Nullable com.fhir.CodeableConcept intendedEffect,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject) {
    this.id = id;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.meta = meta;
    this.otherTherapy = otherTherapy;
    this.resourceType = resourceType;
    this.duration = duration;
    this.population = population;
    this.implicitRules = implicitRules;
    this.language = language;
    this.diseaseSymptomProcedure = diseaseSymptomProcedure;
    this.diseaseStatus = diseaseStatus;
    this.comorbidity = comorbidity;
    this.undesirableEffect = undesirableEffect;
    this.intendedEffect = intendedEffect;
    this.extension = extension;
    this.subject = subject;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code otherTherapy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("otherTherapy")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> otherTherapy() {
    return java.util.Optional.ofNullable(otherTherapy);
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
   * @return The value of the {@code duration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("duration")
  @Override
  public java.util.Optional<com.fhir.Quantity> duration() {
    return java.util.Optional.ofNullable(duration);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code diseaseSymptomProcedure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diseaseSymptomProcedure")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> diseaseSymptomProcedure() {
    return java.util.Optional.ofNullable(diseaseSymptomProcedure);
  }

  /**
   * @return The value of the {@code diseaseStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diseaseStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> diseaseStatus() {
    return java.util.Optional.ofNullable(diseaseStatus);
  }

  /**
   * @return The value of the {@code comorbidity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comorbidity")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity() {
    return java.util.Optional.ofNullable(comorbidity);
  }

  /**
   * @return The value of the {@code undesirableEffect} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("undesirableEffect")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> undesirableEffect() {
    return java.util.Optional.ofNullable(undesirableEffect);
  }

  /**
   * @return The value of the {@code intendedEffect} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intendedEffect")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> intendedEffect() {
    return java.util.Optional.ofNullable(intendedEffect);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        newValue,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductIndication(
        value,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        newValue,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        value,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        newValue,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        value,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        newValue,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        value,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        newValue,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        value,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#otherTherapy() otherTherapy} attribute.
   * @param value The value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withOtherTherapy(java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> newValue = java.util.Objects.requireNonNull(value, "otherTherapy");
    if (this.otherTherapy == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        newValue,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#otherTherapy() otherTherapy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withOtherTherapy(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> value = optional.orElse(null);
    if (this.otherTherapy == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        value,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIndication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIndication withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        newValue,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withDuration(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        newValue,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withDuration(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        value,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withPopulation(java.util.List<com.fhir.Population> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Population> newValue = java.util.Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        newValue,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withPopulation(java.util.Optional<? extends java.util.List<com.fhir.Population>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        value,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        newValue,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        value,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        newValue,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        value,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} attribute.
   * @param value The value for diseaseSymptomProcedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withDiseaseSymptomProcedure(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "diseaseSymptomProcedure");
    if (this.diseaseSymptomProcedure == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        newValue,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diseaseSymptomProcedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withDiseaseSymptomProcedure(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.diseaseSymptomProcedure == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        value,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} attribute.
   * @param value The value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withDiseaseStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "diseaseStatus");
    if (this.diseaseStatus == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        newValue,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withDiseaseStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.diseaseStatus == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        value,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#comorbidity() comorbidity} attribute.
   * @param value The value for comorbidity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withComorbidity(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "comorbidity");
    if (this.comorbidity == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        newValue,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#comorbidity() comorbidity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comorbidity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withComorbidity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.comorbidity == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        value,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} attribute.
   * @param value The value for undesirableEffect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withUndesirableEffect(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "undesirableEffect");
    if (this.undesirableEffect == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        newValue,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for undesirableEffect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withUndesirableEffect(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.undesirableEffect == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        value,
        this.intendedEffect,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#intendedEffect() intendedEffect} attribute.
   * @param value The value for intendedEffect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withIntendedEffect(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "intendedEffect");
    if (this.intendedEffect == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        newValue,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#intendedEffect() intendedEffect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intendedEffect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withIntendedEffect(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.intendedEffect == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        value,
        this.extension,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        newValue,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        value,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.id,
        this.text,
        this.modifierExtension,
        this.contained,
        this.meta,
        this.otherTherapy,
        this.resourceType,
        this.duration,
        this.population,
        this.implicitRules,
        this.language,
        this.diseaseSymptomProcedure,
        this.diseaseStatus,
        this.comorbidity,
        this.undesirableEffect,
        this.intendedEffect,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIndication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIndication
        && equalTo((ImmutableMedicinalProductIndication) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIndication another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(otherTherapy, another.otherTherapy)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(duration, another.duration)
        && java.util.Objects.equals(population, another.population)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(diseaseSymptomProcedure, another.diseaseSymptomProcedure)
        && java.util.Objects.equals(diseaseStatus, another.diseaseStatus)
        && java.util.Objects.equals(comorbidity, another.comorbidity)
        && java.util.Objects.equals(undesirableEffect, another.undesirableEffect)
        && java.util.Objects.equals(intendedEffect, another.intendedEffect)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(subject, another.subject);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code text}, {@code modifierExtension}, {@code contained}, {@code meta}, {@code otherTherapy}, {@code resourceType}, {@code duration}, {@code population}, {@code implicitRules}, {@code language}, {@code diseaseSymptomProcedure}, {@code diseaseStatus}, {@code comorbidity}, {@code undesirableEffect}, {@code intendedEffect}, {@code extension}, {@code subject}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(otherTherapy);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(duration);
    h += (h << 5) + java.util.Objects.hashCode(population);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(diseaseSymptomProcedure);
    h += (h << 5) + java.util.Objects.hashCode(diseaseStatus);
    h += (h << 5) + java.util.Objects.hashCode(comorbidity);
    h += (h << 5) + java.util.Objects.hashCode(undesirableEffect);
    h += (h << 5) + java.util.Objects.hashCode(intendedEffect);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIndication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductIndication{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (otherTherapy != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("otherTherapy=").append(otherTherapy);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (duration != null) {
      builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (population != null) {
      builder.append(", ");
      builder.append("population=").append(population);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (diseaseSymptomProcedure != null) {
      builder.append(", ");
      builder.append("diseaseSymptomProcedure=").append(diseaseSymptomProcedure);
    }
    if (diseaseStatus != null) {
      builder.append(", ");
      builder.append("diseaseStatus=").append(diseaseStatus);
    }
    if (comorbidity != null) {
      builder.append(", ");
      builder.append("comorbidity=").append(comorbidity);
    }
    if (undesirableEffect != null) {
      builder.append(", ");
      builder.append("undesirableEffect=").append(undesirableEffect);
    }
    if (intendedEffect != null) {
      builder.append(", ");
      builder.append("intendedEffect=").append(intendedEffect);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
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
  @org.immutables.value.Generated(from = "MedicinalProductIndication", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductIndication {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> otherTherapy = java.util.Optional.empty();
    boolean otherTherapyIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> duration = java.util.Optional.empty();
    boolean durationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Population>> population = java.util.Optional.empty();
    boolean populationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> diseaseSymptomProcedure = java.util.Optional.empty();
    boolean diseaseSymptomProcedureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> diseaseStatus = java.util.Optional.empty();
    boolean diseaseStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity = java.util.Optional.empty();
    boolean comorbidityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> undesirableEffect = java.util.Optional.empty();
    boolean undesirableEffectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> intendedEffect = java.util.Optional.empty();
    boolean intendedEffectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("otherTherapy")
    public void setOtherTherapy(java.util.Optional<java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> otherTherapy) {
      this.otherTherapy = otherTherapy;
      this.otherTherapyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public void setDuration(java.util.Optional<com.fhir.Quantity> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public void setPopulation(java.util.Optional<java.util.List<com.fhir.Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diseaseSymptomProcedure")
    public void setDiseaseSymptomProcedure(java.util.Optional<com.fhir.CodeableConcept> diseaseSymptomProcedure) {
      this.diseaseSymptomProcedure = diseaseSymptomProcedure;
      this.diseaseSymptomProcedureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diseaseStatus")
    public void setDiseaseStatus(java.util.Optional<com.fhir.CodeableConcept> diseaseStatus) {
      this.diseaseStatus = diseaseStatus;
      this.diseaseStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comorbidity")
    public void setComorbidity(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity) {
      this.comorbidity = comorbidity;
      this.comorbidityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("undesirableEffect")
    public void setUndesirableEffect(java.util.Optional<java.util.List<com.fhir.Reference>> undesirableEffect) {
      this.undesirableEffect = undesirableEffect;
      this.undesirableEffectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intendedEffect")
    public void setIntendedEffect(java.util.Optional<com.fhir.CodeableConcept> intendedEffect) {
      this.intendedEffect = intendedEffect;
      this.intendedEffectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> otherTherapy() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> duration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Population>> population() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> diseaseSymptomProcedure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> diseaseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> undesirableEffect() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> intendedEffect() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductIndication fromJson(Json json) {
    ImmutableMedicinalProductIndication.Builder builder = ((ImmutableMedicinalProductIndication.Builder) ImmutableMedicinalProductIndication.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.otherTherapyIsSet) {
      builder.otherTherapy(json.otherTherapy);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.diseaseSymptomProcedureIsSet) {
      builder.diseaseSymptomProcedure(json.diseaseSymptomProcedure);
    }
    if (json.diseaseStatusIsSet) {
      builder.diseaseStatus(json.diseaseStatus);
    }
    if (json.comorbidityIsSet) {
      builder.comorbidity(json.comorbidity);
    }
    if (json.undesirableEffectIsSet) {
      builder.undesirableEffect(json.undesirableEffect);
    }
    if (json.intendedEffectIsSet) {
      builder.intendedEffect(json.intendedEffect);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    return (ImmutableMedicinalProductIndication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIndication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIndication instance
   */
  public static MedicinalProductIndication copyOf(MedicinalProductIndication instance) {
    if (instance instanceof ImmutableMedicinalProductIndication) {
      return (ImmutableMedicinalProductIndication) instance;
    }
    return ((ImmutableMedicinalProductIndication.Builder) ImmutableMedicinalProductIndication.builder())
        .id(instance.id())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .meta(instance.meta())
        .otherTherapy(instance.otherTherapy())
        .resourceType(instance.resourceType())
        .duration(instance.duration())
        .population(instance.population())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .diseaseSymptomProcedure(instance.diseaseSymptomProcedure())
        .diseaseStatus(instance.diseaseStatus())
        .comorbidity(instance.comorbidity())
        .undesirableEffect(instance.undesirableEffect())
        .intendedEffect(instance.intendedEffect())
        .extension(instance.extension())
        .subject(instance.subject())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIndication MedicinalProductIndication}.
   * <pre>
   * ImmutableMedicinalProductIndication.builder()
   *    .id(com.fhir.id) // optional {@link MedicinalProductIndication#id() id}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductIndication#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIndication#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductIndication#contained() contained}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductIndication#meta() meta}
   *    .otherTherapy(List&amp;lt;com.fhir.MedicinalProductIndication_OtherTherapy&amp;gt;) // optional {@link MedicinalProductIndication#otherTherapy() otherTherapy}
   *    .resourceType(String) // required {@link MedicinalProductIndication#resourceType() resourceType}
   *    .duration(com.fhir.Quantity) // optional {@link MedicinalProductIndication#duration() duration}
   *    .population(List&amp;lt;com.fhir.Population&amp;gt;) // optional {@link MedicinalProductIndication#population() population}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductIndication#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link MedicinalProductIndication#language() language}
   *    .diseaseSymptomProcedure(com.fhir.CodeableConcept) // optional {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure}
   *    .diseaseStatus(com.fhir.CodeableConcept) // optional {@link MedicinalProductIndication#diseaseStatus() diseaseStatus}
   *    .comorbidity(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductIndication#comorbidity() comorbidity}
   *    .undesirableEffect(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductIndication#undesirableEffect() undesirableEffect}
   *    .intendedEffect(com.fhir.CodeableConcept) // optional {@link MedicinalProductIndication#intendedEffect() intendedEffect}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIndication#extension() extension}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductIndication#subject() subject}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIndication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductIndication.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIndication MedicinalProductIndication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductIndication", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_OTHER_THERAPY = 0x20L;
    private static final long OPT_BIT_DURATION = 0x40L;
    private static final long OPT_BIT_POPULATION = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_DISEASE_SYMPTOM_PROCEDURE = 0x400L;
    private static final long OPT_BIT_DISEASE_STATUS = 0x800L;
    private static final long OPT_BIT_COMORBIDITY = 0x1000L;
    private static final long OPT_BIT_UNDESIRABLE_EFFECT = 0x2000L;
    private static final long OPT_BIT_INTENDED_EFFECT = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_SUBJECT = 0x10000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> otherTherapy;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Quantity duration;
    private @javax.annotation.Nullable java.util.List<com.fhir.Population> population;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept diseaseSymptomProcedure;
    private @javax.annotation.Nullable com.fhir.CodeableConcept diseaseStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> comorbidity;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> undesirableEffect;
    private @javax.annotation.Nullable com.fhir.CodeableConcept intendedEffect;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    public final Builder otherTherapy(java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = java.util.Objects.requireNonNull(otherTherapy, "otherTherapy");
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("otherTherapy")
    public final Builder otherTherapy(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = otherTherapy.orElse(null);
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIndication#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(com.fhir.Quantity duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = java.util.Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public final Builder duration(java.util.Optional<? extends com.fhir.Quantity> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
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
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
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
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder diseaseSymptomProcedure(com.fhir.CodeableConcept diseaseSymptomProcedure) {
      checkNotIsSet(diseaseSymptomProcedureIsSet(), "diseaseSymptomProcedure");
      this.diseaseSymptomProcedure = java.util.Objects.requireNonNull(diseaseSymptomProcedure, "diseaseSymptomProcedure");
      optBits |= OPT_BIT_DISEASE_SYMPTOM_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diseaseSymptomProcedure")
    public final Builder diseaseSymptomProcedure(java.util.Optional<? extends com.fhir.CodeableConcept> diseaseSymptomProcedure) {
      checkNotIsSet(diseaseSymptomProcedureIsSet(), "diseaseSymptomProcedure");
      this.diseaseSymptomProcedure = diseaseSymptomProcedure.orElse(null);
      optBits |= OPT_BIT_DISEASE_SYMPTOM_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder diseaseStatus(com.fhir.CodeableConcept diseaseStatus) {
      checkNotIsSet(diseaseStatusIsSet(), "diseaseStatus");
      this.diseaseStatus = java.util.Objects.requireNonNull(diseaseStatus, "diseaseStatus");
      optBits |= OPT_BIT_DISEASE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diseaseStatus")
    public final Builder diseaseStatus(java.util.Optional<? extends com.fhir.CodeableConcept> diseaseStatus) {
      checkNotIsSet(diseaseStatusIsSet(), "diseaseStatus");
      this.diseaseStatus = diseaseStatus.orElse(null);
      optBits |= OPT_BIT_DISEASE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for chained invocation
     */
    public final Builder comorbidity(java.util.List<com.fhir.CodeableConcept> comorbidity) {
      checkNotIsSet(comorbidityIsSet(), "comorbidity");
      this.comorbidity = java.util.Objects.requireNonNull(comorbidity, "comorbidity");
      optBits |= OPT_BIT_COMORBIDITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comorbidity")
    public final Builder comorbidity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> comorbidity) {
      checkNotIsSet(comorbidityIsSet(), "comorbidity");
      this.comorbidity = comorbidity.orElse(null);
      optBits |= OPT_BIT_COMORBIDITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for chained invocation
     */
    public final Builder undesirableEffect(java.util.List<com.fhir.Reference> undesirableEffect) {
      checkNotIsSet(undesirableEffectIsSet(), "undesirableEffect");
      this.undesirableEffect = java.util.Objects.requireNonNull(undesirableEffect, "undesirableEffect");
      optBits |= OPT_BIT_UNDESIRABLE_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("undesirableEffect")
    public final Builder undesirableEffect(java.util.Optional<? extends java.util.List<com.fhir.Reference>> undesirableEffect) {
      checkNotIsSet(undesirableEffectIsSet(), "undesirableEffect");
      this.undesirableEffect = undesirableEffect.orElse(null);
      optBits |= OPT_BIT_UNDESIRABLE_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for chained invocation
     */
    public final Builder intendedEffect(com.fhir.CodeableConcept intendedEffect) {
      checkNotIsSet(intendedEffectIsSet(), "intendedEffect");
      this.intendedEffect = java.util.Objects.requireNonNull(intendedEffect, "intendedEffect");
      optBits |= OPT_BIT_INTENDED_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intendedEffect")
    public final Builder intendedEffect(java.util.Optional<? extends com.fhir.CodeableConcept> intendedEffect) {
      checkNotIsSet(intendedEffectIsSet(), "intendedEffect");
      this.intendedEffect = intendedEffect.orElse(null);
      optBits |= OPT_BIT_INTENDED_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
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
     * Builds a new {@link MedicinalProductIndication MedicinalProductIndication}.
     * @return An immutable instance of MedicinalProductIndication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductIndication build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIndication(
          id,
          text,
          modifierExtension,
          contained,
          meta,
          otherTherapy,
          resourceType,
          duration,
          population,
          implicitRules,
          language,
          diseaseSymptomProcedure,
          diseaseStatus,
          comorbidity,
          undesirableEffect,
          intendedEffect,
          extension,
          subject);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean otherTherapyIsSet() {
      return (optBits & OPT_BIT_OTHER_THERAPY) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean diseaseSymptomProcedureIsSet() {
      return (optBits & OPT_BIT_DISEASE_SYMPTOM_PROCEDURE) != 0;
    }

    private boolean diseaseStatusIsSet() {
      return (optBits & OPT_BIT_DISEASE_STATUS) != 0;
    }

    private boolean comorbidityIsSet() {
      return (optBits & OPT_BIT_COMORBIDITY) != 0;
    }

    private boolean undesirableEffectIsSet() {
      return (optBits & OPT_BIT_UNDESIRABLE_EFFECT) != 0;
    }

    private boolean intendedEffectIsSet() {
      return (optBits & OPT_BIT_INTENDED_EFFECT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductIndication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductIndication, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductIndication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIndication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductIndication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherTherapy(java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherTherapy(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductIndication_OtherTherapy>> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal duration(com.fhir.Quantity duration);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal duration(java.util.Optional<? extends com.fhir.Quantity> duration);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    BuildFinal population(java.util.List<com.fhir.Population> population);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal population(java.util.Optional<? extends java.util.List<com.fhir.Population>> population);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diseaseSymptomProcedure(com.fhir.CodeableConcept diseaseSymptomProcedure);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diseaseSymptomProcedure(java.util.Optional<? extends com.fhir.CodeableConcept> diseaseSymptomProcedure);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diseaseStatus(com.fhir.CodeableConcept diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diseaseStatus(java.util.Optional<? extends com.fhir.CodeableConcept> diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comorbidity(java.util.List<com.fhir.CodeableConcept> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comorbidity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal undesirableEffect(java.util.List<com.fhir.Reference> undesirableEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal undesirableEffect(java.util.Optional<? extends java.util.List<com.fhir.Reference>> undesirableEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intendedEffect(com.fhir.CodeableConcept intendedEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intendedEffect(java.util.Optional<? extends com.fhir.CodeableConcept> intendedEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Builds a new {@link MedicinalProductIndication MedicinalProductIndication}.
     * @return An immutable instance of MedicinalProductIndication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIndication build();
  }
}
