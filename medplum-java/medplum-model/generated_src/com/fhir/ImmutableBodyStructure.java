//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link BodyStructure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBodyStructure.builder()}.
 */
@org.immutables.value.Generated(from = "BodyStructure", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBodyStructure implements com.fhir.BodyStructure {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Attachment> image;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept morphology;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> locationQualifier;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept location;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;

  private ImmutableBodyStructure(
      @javax.annotation.Nullable java.util.List<com.fhir.Attachment> image,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable com.fhir.CodeableConcept morphology,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> locationQualifier,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.CodeableConcept location,
      @javax.annotation.Nullable com.fhir.uri implicitRules) {
    this.image = image;
    this.modifierExtension = modifierExtension;
    this.meta = meta;
    this.description = description;
    this.text = text;
    this.resourceType = resourceType;
    this.patient = patient;
    this.contained = contained;
    this.identifier = identifier;
    this.active = active;
    this.morphology = morphology;
    this.locationQualifier = locationQualifier;
    this.language = language;
    this.extension = extension;
    this.id = id;
    this.location = location;
    this.implicitRules = implicitRules;
  }

  /**
   * @return The value of the {@code image} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("image")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Attachment>> image() {
    return java.util.Optional.ofNullable(image);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code morphology} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("morphology")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> morphology() {
    return java.util.Optional.ofNullable(morphology);
  }

  /**
   * @return The value of the {@code locationQualifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationQualifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationQualifier() {
    return java.util.Optional.ofNullable(locationQualifier);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> location() {
    return java.util.Optional.ofNullable(location);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#image() image} attribute.
   * @param value The value for image
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withImage(java.util.List<com.fhir.Attachment> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> newValue = java.util.Objects.requireNonNull(value, "image");
    if (this.image == newValue) return this;
    return new ImmutableBodyStructure(
        newValue,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#image() image} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for image
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withImage(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> value = optional.orElse(null);
    if (this.image == value) return this;
    return new ImmutableBodyStructure(
        value,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        newValue,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        value,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        newValue,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        value,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        newValue,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        value,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        newValue,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        value,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BodyStructure#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBodyStructure withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        newValue,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BodyStructure#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBodyStructure withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        newValue,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        newValue,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        value,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        newValue,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        value,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        newValue,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        value,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#morphology() morphology} attribute.
   * @param value The value for morphology
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withMorphology(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "morphology");
    if (this.morphology == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        newValue,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#morphology() morphology} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for morphology
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withMorphology(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.morphology == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        value,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#locationQualifier() locationQualifier} attribute.
   * @param value The value for locationQualifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withLocationQualifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "locationQualifier");
    if (this.locationQualifier == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        newValue,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#locationQualifier() locationQualifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationQualifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withLocationQualifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.locationQualifier == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        value,
        this.language,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        newValue,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        value,
        this.extension,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        newValue,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        value,
        this.id,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        newValue,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        value,
        this.location,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withLocation(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withLocation(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBodyStructure(
        this.image,
        this.modifierExtension,
        this.meta,
        this.description,
        this.text,
        this.resourceType,
        this.patient,
        this.contained,
        this.identifier,
        this.active,
        this.morphology,
        this.locationQualifier,
        this.language,
        this.extension,
        this.id,
        this.location,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBodyStructure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBodyStructure
        && equalTo((ImmutableBodyStructure) another);
  }

  private boolean equalTo(ImmutableBodyStructure another) {
    return java.util.Objects.equals(image, another.image)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && patient.equals(another.patient)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(morphology, another.morphology)
        && java.util.Objects.equals(locationQualifier, another.locationQualifier)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code image}, {@code modifierExtension}, {@code meta}, {@code description}, {@code text}, {@code resourceType}, {@code patient}, {@code contained}, {@code identifier}, {@code active}, {@code morphology}, {@code locationQualifier}, {@code language}, {@code extension}, {@code id}, {@code location}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(image);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(morphology);
    h += (h << 5) + java.util.Objects.hashCode(locationQualifier);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code BodyStructure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("BodyStructure{");
    if (image != null) {
      builder.append("image=").append(image);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (description != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (morphology != null) {
      builder.append(", ");
      builder.append("morphology=").append(morphology);
    }
    if (locationQualifier != null) {
      builder.append(", ");
      builder.append("locationQualifier=").append(locationQualifier);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "BodyStructure", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.BodyStructure {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Attachment>> image = java.util.Optional.empty();
    boolean imageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> morphology = java.util.Optional.empty();
    boolean morphologyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationQualifier = java.util.Optional.empty();
    boolean locationQualifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    public void setImage(java.util.Optional<java.util.List<com.fhir.Attachment>> image) {
      this.image = image;
      this.imageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("morphology")
    public void setMorphology(java.util.Optional<com.fhir.CodeableConcept> morphology) {
      this.morphology = morphology;
      this.morphologyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationQualifier")
    public void setLocationQualifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationQualifier) {
      this.locationQualifier = locationQualifier;
      this.locationQualifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.CodeableConcept> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Attachment>> image() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> morphology() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationQualifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBodyStructure fromJson(Json json) {
    ImmutableBodyStructure.Builder builder = ((ImmutableBodyStructure.Builder) ImmutableBodyStructure.builder());
    if (json.imageIsSet) {
      builder.image(json.image);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.morphologyIsSet) {
      builder.morphology(json.morphology);
    }
    if (json.locationQualifierIsSet) {
      builder.locationQualifier(json.locationQualifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableBodyStructure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link BodyStructure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BodyStructure instance
   */
  public static BodyStructure copyOf(BodyStructure instance) {
    if (instance instanceof ImmutableBodyStructure) {
      return (ImmutableBodyStructure) instance;
    }
    return ((ImmutableBodyStructure.Builder) ImmutableBodyStructure.builder())
        .image(instance.image())
        .modifierExtension(instance.modifierExtension())
        .meta(instance.meta())
        .description(instance.description())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .patient(instance.patient())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .active(instance.active())
        .morphology(instance.morphology())
        .locationQualifier(instance.locationQualifier())
        .language(instance.language())
        .extension(instance.extension())
        .id(instance.id())
        .location(instance.location())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link BodyStructure BodyStructure}.
   * <pre>
   * ImmutableBodyStructure.builder()
   *    .image(List&amp;lt;com.fhir.Attachment&amp;gt;) // optional {@link BodyStructure#image() image}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BodyStructure#modifierExtension() modifierExtension}
   *    .meta(com.fhir.Meta) // optional {@link BodyStructure#meta() meta}
   *    .description(String) // optional {@link BodyStructure#description() description}
   *    .text(com.fhir.Narrative) // optional {@link BodyStructure#text() text}
   *    .resourceType(String) // required {@link BodyStructure#resourceType() resourceType}
   *    .patient(com.fhir.Reference) // required {@link BodyStructure#patient() patient}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link BodyStructure#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link BodyStructure#identifier() identifier}
   *    .active(Boolean) // optional {@link BodyStructure#active() active}
   *    .morphology(com.fhir.CodeableConcept) // optional {@link BodyStructure#morphology() morphology}
   *    .locationQualifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link BodyStructure#locationQualifier() locationQualifier}
   *    .language(com.fhir.code) // optional {@link BodyStructure#language() language}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BodyStructure#extension() extension}
   *    .id(com.fhir.id) // optional {@link BodyStructure#id() id}
   *    .location(com.fhir.CodeableConcept) // optional {@link BodyStructure#location() location}
   *    .implicitRules(com.fhir.uri) // optional {@link BodyStructure#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new BodyStructure builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableBodyStructure.Builder();
  }

  /**
   * Builds instances of type {@link BodyStructure BodyStructure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "BodyStructure", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long OPT_BIT_IMAGE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_ACTIVE = 0x80L;
    private static final long OPT_BIT_MORPHOLOGY = 0x100L;
    private static final long OPT_BIT_LOCATION_QUALIFIER = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_LOCATION = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Attachment> image;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable com.fhir.CodeableConcept morphology;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> locationQualifier;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept location;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for chained invocation
     */
    public final Builder image(java.util.List<com.fhir.Attachment> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = java.util.Objects.requireNonNull(image, "image");
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    public final Builder image(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = image.orElse(null);
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
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
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
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
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#text() text} to text.
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
     * Initializes the optional value {@link BodyStructure#text() text} to text.
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
     * Initializes the value for the {@link BodyStructure#resourceType() resourceType} attribute.
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
     * Initializes the value for the {@link BodyStructure#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
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
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
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
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BodyStructure#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for chained invocation
     */
    public final Builder morphology(com.fhir.CodeableConcept morphology) {
      checkNotIsSet(morphologyIsSet(), "morphology");
      this.morphology = java.util.Objects.requireNonNull(morphology, "morphology");
      optBits |= OPT_BIT_MORPHOLOGY;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("morphology")
    public final Builder morphology(java.util.Optional<? extends com.fhir.CodeableConcept> morphology) {
      checkNotIsSet(morphologyIsSet(), "morphology");
      this.morphology = morphology.orElse(null);
      optBits |= OPT_BIT_MORPHOLOGY;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationQualifier(java.util.List<com.fhir.CodeableConcept> locationQualifier) {
      checkNotIsSet(locationQualifierIsSet(), "locationQualifier");
      this.locationQualifier = java.util.Objects.requireNonNull(locationQualifier, "locationQualifier");
      optBits |= OPT_BIT_LOCATION_QUALIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationQualifier")
    public final Builder locationQualifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> locationQualifier) {
      checkNotIsSet(locationQualifierIsSet(), "locationQualifier");
      this.locationQualifier = locationQualifier.orElse(null);
      optBits |= OPT_BIT_LOCATION_QUALIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#language() language} to language.
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
     * Initializes the optional value {@link BodyStructure#language() language} to language.
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
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
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
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
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
     * Initializes the optional value {@link BodyStructure#id() id} to id.
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
     * Initializes the optional value {@link BodyStructure#id() id} to id.
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
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.CodeableConcept location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.CodeableConcept> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link BodyStructure BodyStructure}.
     * @return An immutable instance of BodyStructure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.BodyStructure build() {
      checkRequiredAttributes();
      return new ImmutableBodyStructure(
          image,
          modifierExtension,
          meta,
          description,
          text,
          resourceType,
          patient,
          contained,
          identifier,
          active,
          morphology,
          locationQualifier,
          language,
          extension,
          id,
          location,
          implicitRules);
    }

    private boolean imageIsSet() {
      return (optBits & OPT_BIT_IMAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean morphologyIsSet() {
      return (optBits & OPT_BIT_MORPHOLOGY) != 0;
    }

    private boolean locationQualifierIsSet() {
      return (optBits & OPT_BIT_LOCATION_QUALIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of BodyStructure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build BodyStructure, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "BodyStructure", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link BodyStructure#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "BodyStructure", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link BodyStructure#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "BodyStructure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for chained invocation
     */
    BuildFinal image(java.util.List<com.fhir.Attachment> image);

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal image(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> image);

    /**
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link BodyStructure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link BodyStructure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link BodyStructure#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link BodyStructure#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for chained invocation
     */
    BuildFinal morphology(com.fhir.CodeableConcept morphology);

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal morphology(java.util.Optional<? extends com.fhir.CodeableConcept> morphology);

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationQualifier(java.util.List<com.fhir.CodeableConcept> locationQualifier);

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationQualifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> locationQualifier);

    /**
     * Initializes the optional value {@link BodyStructure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link BodyStructure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link BodyStructure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link BodyStructure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.CodeableConcept location);

    /**
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.CodeableConcept> location);

    /**
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Builds a new {@link BodyStructure BodyStructure}.
     * @return An immutable instance of BodyStructure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    BodyStructure build();
  }
}
