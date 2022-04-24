//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductContraindication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductContraindication.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductContraindication", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductContraindication
    implements com.fhir.MedicinalProductContraindication {
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept disease;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept diseaseStatus;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> comorbidity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Population> population;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> therapeuticIndication;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> otherTherapy;

  private ImmutableMedicinalProductContraindication(
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept disease,
      @javax.annotation.Nullable com.fhir.CodeableConcept diseaseStatus,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> comorbidity,
      @javax.annotation.Nullable java.util.List<com.fhir.Population> population,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> therapeuticIndication,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> otherTherapy) {
    this.resourceType = resourceType;
    this.id = id;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.subject = subject;
    this.meta = meta;
    this.disease = disease;
    this.diseaseStatus = diseaseStatus;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.text = text;
    this.comorbidity = comorbidity;
    this.population = population;
    this.therapeuticIndication = therapeuticIndication;
    this.language = language;
    this.otherTherapy = otherTherapy;
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
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
   * @return The value of the {@code disease} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disease")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> disease() {
    return java.util.Optional.ofNullable(disease);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code population} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("population")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Population>> population() {
    return java.util.Optional.ofNullable(population);
  }

  /**
   * @return The value of the {@code therapeuticIndication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("therapeuticIndication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> therapeuticIndication() {
    return java.util.Optional.ofNullable(therapeuticIndication);
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
   * @return The value of the {@code otherTherapy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("otherTherapy")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> otherTherapy() {
    return java.util.Optional.ofNullable(otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductContraindication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductContraindication(
        newValue,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        newValue,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        value,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        newValue,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        value,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        newValue,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        value,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        newValue,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        value,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        newValue,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        value,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#disease() disease} attribute.
   * @param value The value for disease
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withDisease(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "disease");
    if (this.disease == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        newValue,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#disease() disease} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disease
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withDisease(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.disease == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        value,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} attribute.
   * @param value The value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withDiseaseStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "diseaseStatus");
    if (this.diseaseStatus == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        newValue,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withDiseaseStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.diseaseStatus == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        value,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        newValue,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        value,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        newValue,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        value,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        newValue,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        value,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#comorbidity() comorbidity} attribute.
   * @param value The value for comorbidity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withComorbidity(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "comorbidity");
    if (this.comorbidity == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        newValue,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#comorbidity() comorbidity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comorbidity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withComorbidity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.comorbidity == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        value,
        this.population,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withPopulation(java.util.List<com.fhir.Population> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Population> newValue = java.util.Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        newValue,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withPopulation(java.util.Optional<? extends java.util.List<com.fhir.Population>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        value,
        this.therapeuticIndication,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} attribute.
   * @param value The value for therapeuticIndication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withTherapeuticIndication(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "therapeuticIndication");
    if (this.therapeuticIndication == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        newValue,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for therapeuticIndication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withTherapeuticIndication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.therapeuticIndication == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        value,
        this.language,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        newValue,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        value,
        this.otherTherapy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#otherTherapy() otherTherapy} attribute.
   * @param value The value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withOtherTherapy(java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> newValue = java.util.Objects.requireNonNull(value, "otherTherapy");
    if (this.otherTherapy == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#otherTherapy() otherTherapy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withOtherTherapy(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> value = optional.orElse(null);
    if (this.otherTherapy == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.resourceType,
        this.id,
        this.contained,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.disease,
        this.diseaseStatus,
        this.implicitRules,
        this.extension,
        this.text,
        this.comorbidity,
        this.population,
        this.therapeuticIndication,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductContraindication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductContraindication
        && equalTo((ImmutableMedicinalProductContraindication) another);
  }

  private boolean equalTo(ImmutableMedicinalProductContraindication another) {
    return resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(disease, another.disease)
        && java.util.Objects.equals(diseaseStatus, another.diseaseStatus)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(comorbidity, another.comorbidity)
        && java.util.Objects.equals(population, another.population)
        && java.util.Objects.equals(therapeuticIndication, another.therapeuticIndication)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(otherTherapy, another.otherTherapy);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code id}, {@code contained}, {@code modifierExtension}, {@code subject}, {@code meta}, {@code disease}, {@code diseaseStatus}, {@code implicitRules}, {@code extension}, {@code text}, {@code comorbidity}, {@code population}, {@code therapeuticIndication}, {@code language}, {@code otherTherapy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(disease);
    h += (h << 5) + java.util.Objects.hashCode(diseaseStatus);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(comorbidity);
    h += (h << 5) + java.util.Objects.hashCode(population);
    h += (h << 5) + java.util.Objects.hashCode(therapeuticIndication);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(otherTherapy);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductContraindication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductContraindication{");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (disease != null) {
      builder.append(", ");
      builder.append("disease=").append(disease);
    }
    if (diseaseStatus != null) {
      builder.append(", ");
      builder.append("diseaseStatus=").append(diseaseStatus);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (comorbidity != null) {
      builder.append(", ");
      builder.append("comorbidity=").append(comorbidity);
    }
    if (population != null) {
      builder.append(", ");
      builder.append("population=").append(population);
    }
    if (therapeuticIndication != null) {
      builder.append(", ");
      builder.append("therapeuticIndication=").append(therapeuticIndication);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (otherTherapy != null) {
      builder.append(", ");
      builder.append("otherTherapy=").append(otherTherapy);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductContraindication {
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> disease = java.util.Optional.empty();
    boolean diseaseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> diseaseStatus = java.util.Optional.empty();
    boolean diseaseStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity = java.util.Optional.empty();
    boolean comorbidityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Population>> population = java.util.Optional.empty();
    boolean populationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> therapeuticIndication = java.util.Optional.empty();
    boolean therapeuticIndicationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> otherTherapy = java.util.Optional.empty();
    boolean otherTherapyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disease")
    public void setDisease(java.util.Optional<com.fhir.CodeableConcept> disease) {
      this.disease = disease;
      this.diseaseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diseaseStatus")
    public void setDiseaseStatus(java.util.Optional<com.fhir.CodeableConcept> diseaseStatus) {
      this.diseaseStatus = diseaseStatus;
      this.diseaseStatusIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comorbidity")
    public void setComorbidity(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity) {
      this.comorbidity = comorbidity;
      this.comorbidityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public void setPopulation(java.util.Optional<java.util.List<com.fhir.Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("therapeuticIndication")
    public void setTherapeuticIndication(java.util.Optional<java.util.List<com.fhir.Reference>> therapeuticIndication) {
      this.therapeuticIndication = therapeuticIndication;
      this.therapeuticIndicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("otherTherapy")
    public void setOtherTherapy(java.util.Optional<java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> otherTherapy) {
      this.otherTherapy = otherTherapy;
      this.otherTherapyIsSet = true;
    }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> disease() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> diseaseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> comorbidity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Population>> population() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> therapeuticIndication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> otherTherapy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductContraindication fromJson(Json json) {
    ImmutableMedicinalProductContraindication.Builder builder = ((ImmutableMedicinalProductContraindication.Builder) ImmutableMedicinalProductContraindication.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.diseaseIsSet) {
      builder.disease(json.disease);
    }
    if (json.diseaseStatusIsSet) {
      builder.diseaseStatus(json.diseaseStatus);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.comorbidityIsSet) {
      builder.comorbidity(json.comorbidity);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.therapeuticIndicationIsSet) {
      builder.therapeuticIndication(json.therapeuticIndication);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.otherTherapyIsSet) {
      builder.otherTherapy(json.otherTherapy);
    }
    return (ImmutableMedicinalProductContraindication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductContraindication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductContraindication instance
   */
  public static MedicinalProductContraindication copyOf(MedicinalProductContraindication instance) {
    if (instance instanceof ImmutableMedicinalProductContraindication) {
      return (ImmutableMedicinalProductContraindication) instance;
    }
    return ((ImmutableMedicinalProductContraindication.Builder) ImmutableMedicinalProductContraindication.builder())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .subject(instance.subject())
        .meta(instance.meta())
        .disease(instance.disease())
        .diseaseStatus(instance.diseaseStatus())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .text(instance.text())
        .comorbidity(instance.comorbidity())
        .population(instance.population())
        .therapeuticIndication(instance.therapeuticIndication())
        .language(instance.language())
        .otherTherapy(instance.otherTherapy())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductContraindication MedicinalProductContraindication}.
   * <pre>
   * ImmutableMedicinalProductContraindication.builder()
   *    .resourceType(String) // required {@link MedicinalProductContraindication#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link MedicinalProductContraindication#id() id}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductContraindication#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductContraindication#modifierExtension() modifierExtension}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductContraindication#subject() subject}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductContraindication#meta() meta}
   *    .disease(com.fhir.CodeableConcept) // optional {@link MedicinalProductContraindication#disease() disease}
   *    .diseaseStatus(com.fhir.CodeableConcept) // optional {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductContraindication#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductContraindication#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductContraindication#text() text}
   *    .comorbidity(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductContraindication#comorbidity() comorbidity}
   *    .population(List&amp;lt;com.fhir.Population&amp;gt;) // optional {@link MedicinalProductContraindication#population() population}
   *    .therapeuticIndication(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication}
   *    .language(com.fhir.code) // optional {@link MedicinalProductContraindication#language() language}
   *    .otherTherapy(List&amp;lt;com.fhir.MedicinalProductContraindication_OtherTherapy&amp;gt;) // optional {@link MedicinalProductContraindication#otherTherapy() otherTherapy}
   *    .build();
   * </pre>
   * @return A new MedicinalProductContraindication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductContraindication.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductContraindication MedicinalProductContraindication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_SUBJECT = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_DISEASE = 0x20L;
    private static final long OPT_BIT_DISEASE_STATUS = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_COMORBIDITY = 0x400L;
    private static final long OPT_BIT_POPULATION = 0x800L;
    private static final long OPT_BIT_THERAPEUTIC_INDICATION = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_OTHER_THERAPY = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept disease;
    private @javax.annotation.Nullable com.fhir.CodeableConcept diseaseStatus;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> comorbidity;
    private @javax.annotation.Nullable java.util.List<com.fhir.Population> population;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> therapeuticIndication;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> otherTherapy;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MedicinalProductContraindication#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for chained invocation
     */
    public final Builder disease(com.fhir.CodeableConcept disease) {
      checkNotIsSet(diseaseIsSet(), "disease");
      this.disease = java.util.Objects.requireNonNull(disease, "disease");
      optBits |= OPT_BIT_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disease")
    public final Builder disease(java.util.Optional<? extends com.fhir.CodeableConcept> disease) {
      checkNotIsSet(diseaseIsSet(), "disease");
      this.disease = disease.orElse(null);
      optBits |= OPT_BIT_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
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
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
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
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
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
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
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
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
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
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
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
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for chained invocation
     */
    public final Builder therapeuticIndication(java.util.List<com.fhir.Reference> therapeuticIndication) {
      checkNotIsSet(therapeuticIndicationIsSet(), "therapeuticIndication");
      this.therapeuticIndication = java.util.Objects.requireNonNull(therapeuticIndication, "therapeuticIndication");
      optBits |= OPT_BIT_THERAPEUTIC_INDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("therapeuticIndication")
    public final Builder therapeuticIndication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> therapeuticIndication) {
      checkNotIsSet(therapeuticIndicationIsSet(), "therapeuticIndication");
      this.therapeuticIndication = therapeuticIndication.orElse(null);
      optBits |= OPT_BIT_THERAPEUTIC_INDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    public final Builder otherTherapy(java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = java.util.Objects.requireNonNull(otherTherapy, "otherTherapy");
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("otherTherapy")
    public final Builder otherTherapy(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = otherTherapy.orElse(null);
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductContraindication MedicinalProductContraindication}.
     * @return An immutable instance of MedicinalProductContraindication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductContraindication build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductContraindication(
          resourceType,
          id,
          contained,
          modifierExtension,
          subject,
          meta,
          disease,
          diseaseStatus,
          implicitRules,
          extension,
          text,
          comorbidity,
          population,
          therapeuticIndication,
          language,
          otherTherapy);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean diseaseIsSet() {
      return (optBits & OPT_BIT_DISEASE) != 0;
    }

    private boolean diseaseStatusIsSet() {
      return (optBits & OPT_BIT_DISEASE_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean comorbidityIsSet() {
      return (optBits & OPT_BIT_COMORBIDITY) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean therapeuticIndicationIsSet() {
      return (optBits & OPT_BIT_THERAPEUTIC_INDICATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean otherTherapyIsSet() {
      return (optBits & OPT_BIT_OTHER_THERAPY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductContraindication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductContraindication, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductContraindication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disease(com.fhir.CodeableConcept disease);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disease(java.util.Optional<? extends com.fhir.CodeableConcept> disease);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diseaseStatus(com.fhir.CodeableConcept diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diseaseStatus(java.util.Optional<? extends com.fhir.CodeableConcept> diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comorbidity(java.util.List<com.fhir.CodeableConcept> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comorbidity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    BuildFinal population(java.util.List<com.fhir.Population> population);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal population(java.util.Optional<? extends java.util.List<com.fhir.Population>> population);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal therapeuticIndication(java.util.List<com.fhir.Reference> therapeuticIndication);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal therapeuticIndication(java.util.Optional<? extends java.util.List<com.fhir.Reference>> therapeuticIndication);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherTherapy(java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherTherapy(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductContraindication_OtherTherapy>> otherTherapy);

    /**
     * Builds a new {@link MedicinalProductContraindication MedicinalProductContraindication}.
     * @return An immutable instance of MedicinalProductContraindication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductContraindication build();
  }
}
