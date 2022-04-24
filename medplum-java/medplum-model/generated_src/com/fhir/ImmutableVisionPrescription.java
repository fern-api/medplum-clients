//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link VisionPrescription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVisionPrescription.builder()}.
 */
@org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVisionPrescription implements com.fhir.VisionPrescription {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable com.fhir.dateTime dateWritten;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.Reference prescriber;
  private final java.lang.String resourceType;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable com.fhir.id id;

  private ImmutableVisionPrescription(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable com.fhir.dateTime dateWritten,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.Reference prescriber,
      java.lang.String resourceType,
      com.fhir.Reference patient,
      @javax.annotation.Nullable com.fhir.id id) {
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.status = status;
    this.encounter = encounter;
    this.meta = meta;
    this.lensSpecification = lensSpecification;
    this.extension = extension;
    this.created = created;
    this.dateWritten = dateWritten;
    this.text = text;
    this.identifier = identifier;
    this.language = language;
    this.prescriber = prescriber;
    this.resourceType = resourceType;
    this.patient = patient;
    this.id = id;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code lensSpecification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lensSpecification")
  @Override
  public java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification() {
    return lensSpecification;
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
   * @return The value of the {@code created} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("created")
  @Override
  public java.util.Optional<com.fhir.dateTime> created() {
    return java.util.Optional.ofNullable(created);
  }

  /**
   * @return The value of the {@code dateWritten} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateWritten")
  @Override
  public java.util.Optional<com.fhir.dateTime> dateWritten() {
    return java.util.Optional.ofNullable(dateWritten);
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
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code prescriber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prescriber")
  @Override
  public com.fhir.Reference prescriber() {
    return prescriber;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableVisionPrescription(
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableVisionPrescription(
        value,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        newValue,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        value,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        newValue,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        value,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        newValue,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        value,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        newValue,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        value,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link VisionPrescription#lensSpecification() lensSpecification}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withLensSpecification(com.fhir.VisionPrescription_LensSpecification... elements) {
    java.util.List<com.fhir.VisionPrescription_LensSpecification> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        newValue,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link VisionPrescription#lensSpecification() lensSpecification}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of lensSpecification elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withLensSpecification(Iterable<? extends com.fhir.VisionPrescription_LensSpecification> elements) {
    if (this.lensSpecification == elements) return this;
    java.util.List<com.fhir.VisionPrescription_LensSpecification> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        newValue,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        newValue,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        value,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        newValue,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        value,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#dateWritten() dateWritten} attribute.
   * @param value The value for dateWritten
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withDateWritten(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "dateWritten");
    if (this.dateWritten == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        newValue,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#dateWritten() dateWritten} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateWritten
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withDateWritten(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.dateWritten == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        value,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        newValue,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        value,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        newValue,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        value,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        newValue,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        value,
        this.prescriber,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription#prescriber() prescriber} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for prescriber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription withPrescriber(com.fhir.Reference value) {
    if (this.prescriber == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "prescriber");
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        newValue,
        this.resourceType,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        newValue,
        this.patient,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableVisionPrescription(
        this.contained,
        this.modifierExtension,
        this.implicitRules,
        this.status,
        this.encounter,
        this.meta,
        this.lensSpecification,
        this.extension,
        this.created,
        this.dateWritten,
        this.text,
        this.identifier,
        this.language,
        this.prescriber,
        this.resourceType,
        this.patient,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVisionPrescription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVisionPrescription
        && equalTo((ImmutableVisionPrescription) another);
  }

  private boolean equalTo(ImmutableVisionPrescription another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(meta, another.meta)
        && lensSpecification.equals(another.lensSpecification)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(dateWritten, another.dateWritten)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(language, another.language)
        && prescriber.equals(another.prescriber)
        && resourceType.equals(another.resourceType)
        && patient.equals(another.patient)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code modifierExtension}, {@code implicitRules}, {@code status}, {@code encounter}, {@code meta}, {@code lensSpecification}, {@code extension}, {@code created}, {@code dateWritten}, {@code text}, {@code identifier}, {@code language}, {@code prescriber}, {@code resourceType}, {@code patient}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + lensSpecification.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(dateWritten);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + prescriber.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code VisionPrescription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("VisionPrescription{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (encounter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("lensSpecification=").append(lensSpecification);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (dateWritten != null) {
      builder.append(", ");
      builder.append("dateWritten=").append(dateWritten);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("prescriber=").append(prescriber);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.VisionPrescription {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> dateWritten = java.util.Optional.empty();
    boolean dateWrittenIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.Reference prescriber;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lensSpecification")
    public void setLensSpecification(java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification) {
      this.lensSpecification = lensSpecification;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dateWritten")
    public void setDateWritten(java.util.Optional<com.fhir.dateTime> dateWritten) {
      this.dateWritten = dateWritten;
      this.dateWrittenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prescriber")
    public void setPrescriber(com.fhir.Reference prescriber) {
      this.prescriber = prescriber;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> dateWritten() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference prescriber() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableVisionPrescription fromJson(Json json) {
    ImmutableVisionPrescription.Builder builder = ((ImmutableVisionPrescription.Builder) ImmutableVisionPrescription.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.lensSpecification != null) {
      builder.addAllLensSpecification(json.lensSpecification);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.dateWrittenIsSet) {
      builder.dateWritten(json.dateWritten);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.prescriber != null) {
      builder.prescriber(json.prescriber);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableVisionPrescription) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VisionPrescription} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VisionPrescription instance
   */
  public static VisionPrescription copyOf(VisionPrescription instance) {
    if (instance instanceof ImmutableVisionPrescription) {
      return (ImmutableVisionPrescription) instance;
    }
    return ((ImmutableVisionPrescription.Builder) ImmutableVisionPrescription.builder())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .status(instance.status())
        .encounter(instance.encounter())
        .meta(instance.meta())
        .addAllLensSpecification(instance.lensSpecification())
        .extension(instance.extension())
        .created(instance.created())
        .dateWritten(instance.dateWritten())
        .text(instance.text())
        .identifier(instance.identifier())
        .language(instance.language())
        .prescriber(instance.prescriber())
        .resourceType(instance.resourceType())
        .patient(instance.patient())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link VisionPrescription VisionPrescription}.
   * <pre>
   * ImmutableVisionPrescription.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link VisionPrescription#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VisionPrescription#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link VisionPrescription#implicitRules() implicitRules}
   *    .status(com.fhir.code) // optional {@link VisionPrescription#status() status}
   *    .encounter(com.fhir.Reference) // optional {@link VisionPrescription#encounter() encounter}
   *    .meta(com.fhir.Meta) // optional {@link VisionPrescription#meta() meta}
   *    .addLensSpecification|addAllLensSpecification(com.fhir.VisionPrescription_LensSpecification) // {@link VisionPrescription#lensSpecification() lensSpecification} elements
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VisionPrescription#extension() extension}
   *    .created(com.fhir.dateTime) // optional {@link VisionPrescription#created() created}
   *    .dateWritten(com.fhir.dateTime) // optional {@link VisionPrescription#dateWritten() dateWritten}
   *    .text(com.fhir.Narrative) // optional {@link VisionPrescription#text() text}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link VisionPrescription#identifier() identifier}
   *    .language(com.fhir.code) // optional {@link VisionPrescription#language() language}
   *    .prescriber(com.fhir.Reference) // required {@link VisionPrescription#prescriber() prescriber}
   *    .resourceType(String) // required {@link VisionPrescription#resourceType() resourceType}
   *    .patient(com.fhir.Reference) // required {@link VisionPrescription#patient() patient}
   *    .id(com.fhir.id) // optional {@link VisionPrescription#id() id}
   *    .build();
   * </pre>
   * @return A new VisionPrescription builder
   */
  public static PrescriberBuildStage builder() {
    return new ImmutableVisionPrescription.Builder();
  }

  /**
   * Builds instances of type {@link VisionPrescription VisionPrescription}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PrescriberBuildStage, ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_PRESCRIBER = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_ENCOUNTER = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_CREATED = 0x80L;
    private static final long OPT_BIT_DATE_WRITTEN = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private final java.util.List<com.fhir.VisionPrescription_LensSpecification> lensSpecification = new java.util.ArrayList<com.fhir.VisionPrescription_LensSpecification>();
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable com.fhir.dateTime dateWritten;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference prescriber;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable com.fhir.id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
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
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
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
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
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
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
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
     * Adds one element to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param element A lensSpecification element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLensSpecification(com.fhir.VisionPrescription_LensSpecification element) {
      this.lensSpecification.add(java.util.Objects.requireNonNull(element, "lensSpecification element"));
      return this;
    }

    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An array of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLensSpecification(com.fhir.VisionPrescription_LensSpecification... elements) {
      for (com.fhir.VisionPrescription_LensSpecification element : elements) {
        this.lensSpecification.add(java.util.Objects.requireNonNull(element, "lensSpecification element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An iterable of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllLensSpecification(Iterable<? extends com.fhir.VisionPrescription_LensSpecification> elements) {
      for (com.fhir.VisionPrescription_LensSpecification element : elements) {
        this.lensSpecification.add(java.util.Objects.requireNonNull(element, "lensSpecification element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(com.fhir.dateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = java.util.Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public final Builder created(java.util.Optional<? extends com.fhir.dateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateWritten(com.fhir.dateTime dateWritten) {
      checkNotIsSet(dateWrittenIsSet(), "dateWritten");
      this.dateWritten = java.util.Objects.requireNonNull(dateWritten, "dateWritten");
      optBits |= OPT_BIT_DATE_WRITTEN;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateWritten")
    public final Builder dateWritten(java.util.Optional<? extends com.fhir.dateTime> dateWritten) {
      checkNotIsSet(dateWrittenIsSet(), "dateWritten");
      this.dateWritten = dateWritten.orElse(null);
      optBits |= OPT_BIT_DATE_WRITTEN;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
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
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
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
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
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
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
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
     * Initializes the value for the {@link VisionPrescription#prescriber() prescriber} attribute.
     * @param prescriber The value for prescriber 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prescriber")
    public final Builder prescriber(com.fhir.Reference prescriber) {
      checkNotIsSet(prescriberIsSet(), "prescriber");
      this.prescriber = java.util.Objects.requireNonNull(prescriber, "prescriber");
      initBits &= ~INIT_BIT_PRESCRIBER;
      return this;
    }

    /**
     * Initializes the value for the {@link VisionPrescription#resourceType() resourceType} attribute.
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
     * Initializes the value for the {@link VisionPrescription#patient() patient} attribute.
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
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
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
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
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
     * Builds a new {@link VisionPrescription VisionPrescription}.
     * @return An immutable instance of VisionPrescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.VisionPrescription build() {
      checkRequiredAttributes();
      return new ImmutableVisionPrescription(
          contained,
          modifierExtension,
          implicitRules,
          status,
          encounter,
          meta,
          createUnmodifiableList(true, lensSpecification),
          extension,
          created,
          dateWritten,
          text,
          identifier,
          language,
          prescriber,
          resourceType,
          patient,
          id);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean dateWrittenIsSet() {
      return (optBits & OPT_BIT_DATE_WRITTEN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean prescriberIsSet() {
      return (initBits & INIT_BIT_PRESCRIBER) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of VisionPrescription is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!prescriberIsSet()) attributes.add("prescriber");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build VisionPrescription, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
  public interface PrescriberBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription#prescriber() prescriber} attribute.
     * @param prescriber The value for prescriber 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage prescriber(com.fhir.Reference prescriber);
  }

  @org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "VisionPrescription", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Adds one element to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param element A lensSpecification element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addLensSpecification(com.fhir.VisionPrescription_LensSpecification element);

    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An array of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addLensSpecification(com.fhir.VisionPrescription_LensSpecification... elements);

    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An iterable of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllLensSpecification(Iterable<? extends com.fhir.VisionPrescription_LensSpecification> elements);

    /**
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateWritten(com.fhir.dateTime dateWritten);

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateWritten(java.util.Optional<? extends com.fhir.dateTime> dateWritten);

    /**
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Builds a new {@link VisionPrescription VisionPrescription}.
     * @return An immutable instance of VisionPrescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VisionPrescription build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
