//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MolecularSequence}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence.builder()}.
 */
@org.immutables.value.Generated(from = "MolecularSequence", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence implements com.fhir.MolecularSequence {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.MolecularSequence_ReferenceSeq referenceSeq;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_StructureVariant> structureVariant;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference device;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.Reference specimen;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.Integer coordinateSystem;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String observedSeq;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.Integer readCoverage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> pointer;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Repository> repository;
  private final @javax.annotation.Nullable com.fhir.MolecularsequenceType type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Variant> variant;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Quality> quality;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference performer;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;

  private ImmutableMolecularSequence(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.MolecularSequence_ReferenceSeq referenceSeq,
      @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_StructureVariant> structureVariant,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference device,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.Reference specimen,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.Integer coordinateSystem,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String observedSeq,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.Integer readCoverage,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> pointer,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Repository> repository,
      @javax.annotation.Nullable com.fhir.MolecularsequenceType type,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Variant> variant,
      @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Quality> quality,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference performer,
      @javax.annotation.Nullable com.fhir.uri implicitRules) {
    this.modifierExtension = modifierExtension;
    this.referenceSeq = referenceSeq;
    this.structureVariant = structureVariant;
    this.id = id;
    this.device = device;
    this.quantity = quantity;
    this.specimen = specimen;
    this.meta = meta;
    this.resourceType = resourceType;
    this.coordinateSystem = coordinateSystem;
    this.extension = extension;
    this.observedSeq = observedSeq;
    this.identifier = identifier;
    this.readCoverage = readCoverage;
    this.pointer = pointer;
    this.language = language;
    this.repository = repository;
    this.type = type;
    this.contained = contained;
    this.patient = patient;
    this.variant = variant;
    this.quality = quality;
    this.text = text;
    this.performer = performer;
    this.implicitRules = implicitRules;
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
   * @return The value of the {@code referenceSeq} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referenceSeq")
  @Override
  public java.util.Optional<com.fhir.MolecularSequence_ReferenceSeq> referenceSeq() {
    return java.util.Optional.ofNullable(referenceSeq);
  }

  /**
   * @return The value of the {@code structureVariant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("structureVariant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MolecularSequence_StructureVariant>> structureVariant() {
    return java.util.Optional.ofNullable(structureVariant);
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
   * @return The value of the {@code device} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("device")
  @Override
  public java.util.Optional<com.fhir.Reference> device() {
    return java.util.Optional.ofNullable(device);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code specimen} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specimen")
  @Override
  public java.util.Optional<com.fhir.Reference> specimen() {
    return java.util.Optional.ofNullable(specimen);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code coordinateSystem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("coordinateSystem")
  @Override
  public java.util.Optional<java.lang.Integer> coordinateSystem() {
    return java.util.Optional.ofNullable(coordinateSystem);
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
   * @return The value of the {@code observedSeq} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("observedSeq")
  @Override
  public java.util.Optional<java.lang.String> observedSeq() {
    return java.util.Optional.ofNullable(observedSeq);
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
   * @return The value of the {@code readCoverage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("readCoverage")
  @Override
  public java.util.Optional<java.lang.Integer> readCoverage() {
    return java.util.Optional.ofNullable(readCoverage);
  }

  /**
   * @return The value of the {@code pointer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pointer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> pointer() {
    return java.util.Optional.ofNullable(pointer);
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
   * @return The value of the {@code repository} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("repository")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MolecularSequence_Repository>> repository() {
    return java.util.Optional.ofNullable(repository);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.MolecularsequenceType> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public java.util.Optional<com.fhir.Reference> patient() {
    return java.util.Optional.ofNullable(patient);
  }

  /**
   * @return The value of the {@code variant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("variant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MolecularSequence_Variant>> variant() {
    return java.util.Optional.ofNullable(variant);
  }

  /**
   * @return The value of the {@code quality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quality")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MolecularSequence_Quality>> quality() {
    return java.util.Optional.ofNullable(quality);
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
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<com.fhir.Reference> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence(
        newValue,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence(
        value,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#referenceSeq() referenceSeq} attribute.
   * @param value The value for referenceSeq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withReferenceSeq(com.fhir.MolecularSequence_ReferenceSeq value) {
    @javax.annotation.Nullable com.fhir.MolecularSequence_ReferenceSeq newValue = java.util.Objects.requireNonNull(value, "referenceSeq");
    if (this.referenceSeq == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        newValue,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#referenceSeq() referenceSeq} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceSeq
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withReferenceSeq(java.util.Optional<? extends com.fhir.MolecularSequence_ReferenceSeq> optional) {
    @javax.annotation.Nullable com.fhir.MolecularSequence_ReferenceSeq value = optional.orElse(null);
    if (this.referenceSeq == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        value,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#structureVariant() structureVariant} attribute.
   * @param value The value for structureVariant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withStructureVariant(java.util.List<com.fhir.MolecularSequence_StructureVariant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_StructureVariant> newValue = java.util.Objects.requireNonNull(value, "structureVariant");
    if (this.structureVariant == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        newValue,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#structureVariant() structureVariant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structureVariant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withStructureVariant(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_StructureVariant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_StructureVariant> value = optional.orElse(null);
    if (this.structureVariant == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        value,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        newValue,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        value,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withDevice(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        newValue,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withDevice(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        value,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        newValue,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        value,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withSpecimen(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        newValue,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withSpecimen(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        value,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        newValue,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        value,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MolecularSequence#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMolecularSequence withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        newValue,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#coordinateSystem() coordinateSystem} attribute.
   * @param value The value for coordinateSystem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withCoordinateSystem(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.coordinateSystem, newValue)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        newValue,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#coordinateSystem() coordinateSystem} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coordinateSystem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withCoordinateSystem(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.coordinateSystem, value)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        value,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        newValue,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        value,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#observedSeq() observedSeq} attribute.
   * @param value The value for observedSeq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withObservedSeq(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "observedSeq");
    if (java.util.Objects.equals(this.observedSeq, newValue)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        newValue,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#observedSeq() observedSeq} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observedSeq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withObservedSeq(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.observedSeq, value)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        value,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        newValue,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        value,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#readCoverage() readCoverage} attribute.
   * @param value The value for readCoverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withReadCoverage(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.readCoverage, newValue)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        newValue,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#readCoverage() readCoverage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readCoverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withReadCoverage(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.readCoverage, value)) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        value,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#pointer() pointer} attribute.
   * @param value The value for pointer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withPointer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "pointer");
    if (this.pointer == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        newValue,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#pointer() pointer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pointer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withPointer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.pointer == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        value,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        newValue,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        value,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#repository() repository} attribute.
   * @param value The value for repository
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withRepository(java.util.List<com.fhir.MolecularSequence_Repository> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Repository> newValue = java.util.Objects.requireNonNull(value, "repository");
    if (this.repository == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        newValue,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#repository() repository} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repository
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withRepository(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Repository>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Repository> value = optional.orElse(null);
    if (this.repository == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        value,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withType(com.fhir.MolecularsequenceType value) {
    @javax.annotation.Nullable com.fhir.MolecularsequenceType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        newValue,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withType(java.util.Optional<? extends com.fhir.MolecularsequenceType> optional) {
    @javax.annotation.Nullable com.fhir.MolecularsequenceType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        value,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        newValue,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        value,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withPatient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        newValue,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withPatient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        value,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#variant() variant} attribute.
   * @param value The value for variant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withVariant(java.util.List<com.fhir.MolecularSequence_Variant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Variant> newValue = java.util.Objects.requireNonNull(value, "variant");
    if (this.variant == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        newValue,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#variant() variant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withVariant(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Variant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Variant> value = optional.orElse(null);
    if (this.variant == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        value,
        this.quality,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#quality() quality} attribute.
   * @param value The value for quality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withQuality(java.util.List<com.fhir.MolecularSequence_Quality> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Quality> newValue = java.util.Objects.requireNonNull(value, "quality");
    if (this.quality == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        newValue,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#quality() quality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withQuality(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Quality>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Quality> value = optional.orElse(null);
    if (this.quality == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        value,
        this.text,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        newValue,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        value,
        this.performer,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withPerformer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withPerformer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMolecularSequence(
        this.modifierExtension,
        this.referenceSeq,
        this.structureVariant,
        this.id,
        this.device,
        this.quantity,
        this.specimen,
        this.meta,
        this.resourceType,
        this.coordinateSystem,
        this.extension,
        this.observedSeq,
        this.identifier,
        this.readCoverage,
        this.pointer,
        this.language,
        this.repository,
        this.type,
        this.contained,
        this.patient,
        this.variant,
        this.quality,
        this.text,
        this.performer,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence
        && equalTo((ImmutableMolecularSequence) another);
  }

  private boolean equalTo(ImmutableMolecularSequence another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(referenceSeq, another.referenceSeq)
        && java.util.Objects.equals(structureVariant, another.structureVariant)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(device, another.device)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(specimen, another.specimen)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(coordinateSystem, another.coordinateSystem)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(observedSeq, another.observedSeq)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(readCoverage, another.readCoverage)
        && java.util.Objects.equals(pointer, another.pointer)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(repository, another.repository)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(patient, another.patient)
        && java.util.Objects.equals(variant, another.variant)
        && java.util.Objects.equals(quality, another.quality)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code referenceSeq}, {@code structureVariant}, {@code id}, {@code device}, {@code quantity}, {@code specimen}, {@code meta}, {@code resourceType}, {@code coordinateSystem}, {@code extension}, {@code observedSeq}, {@code identifier}, {@code readCoverage}, {@code pointer}, {@code language}, {@code repository}, {@code type}, {@code contained}, {@code patient}, {@code variant}, {@code quality}, {@code text}, {@code performer}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(referenceSeq);
    h += (h << 5) + java.util.Objects.hashCode(structureVariant);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(device);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(specimen);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(coordinateSystem);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(observedSeq);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(readCoverage);
    h += (h << 5) + java.util.Objects.hashCode(pointer);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(repository);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(patient);
    h += (h << 5) + java.util.Objects.hashCode(variant);
    h += (h << 5) + java.util.Objects.hashCode(quality);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MolecularSequence{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (referenceSeq != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("referenceSeq=").append(referenceSeq);
    }
    if (structureVariant != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("structureVariant=").append(structureVariant);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (device != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("device=").append(device);
    }
    if (quantity != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (specimen != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (coordinateSystem != null) {
      builder.append(", ");
      builder.append("coordinateSystem=").append(coordinateSystem);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (observedSeq != null) {
      builder.append(", ");
      builder.append("observedSeq=").append(observedSeq);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (readCoverage != null) {
      builder.append(", ");
      builder.append("readCoverage=").append(readCoverage);
    }
    if (pointer != null) {
      builder.append(", ");
      builder.append("pointer=").append(pointer);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (repository != null) {
      builder.append(", ");
      builder.append("repository=").append(repository);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (variant != null) {
      builder.append(", ");
      builder.append("variant=").append(variant);
    }
    if (quality != null) {
      builder.append(", ");
      builder.append("quality=").append(quality);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
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
  @org.immutables.value.Generated(from = "MolecularSequence", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MolecularSequence {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MolecularSequence_ReferenceSeq> referenceSeq = java.util.Optional.empty();
    boolean referenceSeqIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MolecularSequence_StructureVariant>> structureVariant = java.util.Optional.empty();
    boolean structureVariantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> device = java.util.Optional.empty();
    boolean deviceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> specimen = java.util.Optional.empty();
    boolean specimenIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> coordinateSystem = java.util.Optional.empty();
    boolean coordinateSystemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> observedSeq = java.util.Optional.empty();
    boolean observedSeqIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> readCoverage = java.util.Optional.empty();
    boolean readCoverageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> pointer = java.util.Optional.empty();
    boolean pointerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MolecularSequence_Repository>> repository = java.util.Optional.empty();
    boolean repositoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MolecularsequenceType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> patient = java.util.Optional.empty();
    boolean patientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MolecularSequence_Variant>> variant = java.util.Optional.empty();
    boolean variantIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MolecularSequence_Quality>> quality = java.util.Optional.empty();
    boolean qualityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referenceSeq")
    public void setReferenceSeq(java.util.Optional<com.fhir.MolecularSequence_ReferenceSeq> referenceSeq) {
      this.referenceSeq = referenceSeq;
      this.referenceSeqIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("structureVariant")
    public void setStructureVariant(java.util.Optional<java.util.List<com.fhir.MolecularSequence_StructureVariant>> structureVariant) {
      this.structureVariant = structureVariant;
      this.structureVariantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public void setDevice(java.util.Optional<com.fhir.Reference> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public void setSpecimen(java.util.Optional<com.fhir.Reference> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("coordinateSystem")
    public void setCoordinateSystem(java.util.Optional<java.lang.Integer> coordinateSystem) {
      this.coordinateSystem = coordinateSystem;
      this.coordinateSystemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("observedSeq")
    public void setObservedSeq(java.util.Optional<java.lang.String> observedSeq) {
      this.observedSeq = observedSeq;
      this.observedSeqIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("readCoverage")
    public void setReadCoverage(java.util.Optional<java.lang.Integer> readCoverage) {
      this.readCoverage = readCoverage;
      this.readCoverageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("pointer")
    public void setPointer(java.util.Optional<java.util.List<com.fhir.Reference>> pointer) {
      this.pointer = pointer;
      this.pointerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    public void setRepository(java.util.Optional<java.util.List<com.fhir.MolecularSequence_Repository>> repository) {
      this.repository = repository;
      this.repositoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.MolecularsequenceType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(java.util.Optional<com.fhir.Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("variant")
    public void setVariant(java.util.Optional<java.util.List<com.fhir.MolecularSequence_Variant>> variant) {
      this.variant = variant;
      this.variantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quality")
    public void setQuality(java.util.Optional<java.util.List<com.fhir.MolecularSequence_Quality>> quality) {
      this.quality = quality;
      this.qualityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<com.fhir.Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MolecularSequence_ReferenceSeq> referenceSeq() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MolecularSequence_StructureVariant>> structureVariant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> device() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> coordinateSystem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> observedSeq() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> readCoverage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> pointer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MolecularSequence_Repository>> repository() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MolecularsequenceType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MolecularSequence_Variant>> variant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MolecularSequence_Quality>> quality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performer() { throw new UnsupportedOperationException(); }
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
  static ImmutableMolecularSequence fromJson(Json json) {
    ImmutableMolecularSequence.Builder builder = ((ImmutableMolecularSequence.Builder) ImmutableMolecularSequence.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.referenceSeqIsSet) {
      builder.referenceSeq(json.referenceSeq);
    }
    if (json.structureVariantIsSet) {
      builder.structureVariant(json.structureVariant);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.coordinateSystemIsSet) {
      builder.coordinateSystem(json.coordinateSystem);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.observedSeqIsSet) {
      builder.observedSeq(json.observedSeq);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.readCoverageIsSet) {
      builder.readCoverage(json.readCoverage);
    }
    if (json.pointerIsSet) {
      builder.pointer(json.pointer);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.repositoryIsSet) {
      builder.repository(json.repository);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.variantIsSet) {
      builder.variant(json.variant);
    }
    if (json.qualityIsSet) {
      builder.quality(json.quality);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableMolecularSequence) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence instance
   */
  public static MolecularSequence copyOf(MolecularSequence instance) {
    if (instance instanceof ImmutableMolecularSequence) {
      return (ImmutableMolecularSequence) instance;
    }
    return ((ImmutableMolecularSequence.Builder) ImmutableMolecularSequence.builder())
        .modifierExtension(instance.modifierExtension())
        .referenceSeq(instance.referenceSeq())
        .structureVariant(instance.structureVariant())
        .id(instance.id())
        .device(instance.device())
        .quantity(instance.quantity())
        .specimen(instance.specimen())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .coordinateSystem(instance.coordinateSystem())
        .extension(instance.extension())
        .observedSeq(instance.observedSeq())
        .identifier(instance.identifier())
        .readCoverage(instance.readCoverage())
        .pointer(instance.pointer())
        .language(instance.language())
        .repository(instance.repository())
        .type(instance.type())
        .contained(instance.contained())
        .patient(instance.patient())
        .variant(instance.variant())
        .quality(instance.quality())
        .text(instance.text())
        .performer(instance.performer())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence MolecularSequence}.
   * <pre>
   * ImmutableMolecularSequence.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence#modifierExtension() modifierExtension}
   *    .referenceSeq(com.fhir.MolecularSequence_ReferenceSeq) // optional {@link MolecularSequence#referenceSeq() referenceSeq}
   *    .structureVariant(List&amp;lt;com.fhir.MolecularSequence_StructureVariant&amp;gt;) // optional {@link MolecularSequence#structureVariant() structureVariant}
   *    .id(com.fhir.id) // optional {@link MolecularSequence#id() id}
   *    .device(com.fhir.Reference) // optional {@link MolecularSequence#device() device}
   *    .quantity(com.fhir.Quantity) // optional {@link MolecularSequence#quantity() quantity}
   *    .specimen(com.fhir.Reference) // optional {@link MolecularSequence#specimen() specimen}
   *    .meta(com.fhir.Meta) // optional {@link MolecularSequence#meta() meta}
   *    .resourceType(String) // required {@link MolecularSequence#resourceType() resourceType}
   *    .coordinateSystem(Integer) // optional {@link MolecularSequence#coordinateSystem() coordinateSystem}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence#extension() extension}
   *    .observedSeq(String) // optional {@link MolecularSequence#observedSeq() observedSeq}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MolecularSequence#identifier() identifier}
   *    .readCoverage(Integer) // optional {@link MolecularSequence#readCoverage() readCoverage}
   *    .pointer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MolecularSequence#pointer() pointer}
   *    .language(com.fhir.code) // optional {@link MolecularSequence#language() language}
   *    .repository(List&amp;lt;com.fhir.MolecularSequence_Repository&amp;gt;) // optional {@link MolecularSequence#repository() repository}
   *    .type(com.fhir.MolecularsequenceType) // optional {@link MolecularSequence#type() type}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MolecularSequence#contained() contained}
   *    .patient(com.fhir.Reference) // optional {@link MolecularSequence#patient() patient}
   *    .variant(List&amp;lt;com.fhir.MolecularSequence_Variant&amp;gt;) // optional {@link MolecularSequence#variant() variant}
   *    .quality(List&amp;lt;com.fhir.MolecularSequence_Quality&amp;gt;) // optional {@link MolecularSequence#quality() quality}
   *    .text(com.fhir.Narrative) // optional {@link MolecularSequence#text() text}
   *    .performer(com.fhir.Reference) // optional {@link MolecularSequence#performer() performer}
   *    .implicitRules(com.fhir.uri) // optional {@link MolecularSequence#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new MolecularSequence builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMolecularSequence.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence MolecularSequence}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MolecularSequence", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_REFERENCE_SEQ = 0x2L;
    private static final long OPT_BIT_STRUCTURE_VARIANT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_DEVICE = 0x10L;
    private static final long OPT_BIT_QUANTITY = 0x20L;
    private static final long OPT_BIT_SPECIMEN = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_COORDINATE_SYSTEM = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_OBSERVED_SEQ = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_READ_COVERAGE = 0x1000L;
    private static final long OPT_BIT_POINTER = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_REPOSITORY = 0x8000L;
    private static final long OPT_BIT_TYPE = 0x10000L;
    private static final long OPT_BIT_CONTAINED = 0x20000L;
    private static final long OPT_BIT_PATIENT = 0x40000L;
    private static final long OPT_BIT_VARIANT = 0x80000L;
    private static final long OPT_BIT_QUALITY = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_PERFORMER = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.MolecularSequence_ReferenceSeq referenceSeq;
    private @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_StructureVariant> structureVariant;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference device;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.Reference specimen;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.Integer coordinateSystem;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String observedSeq;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.Integer readCoverage;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> pointer;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Repository> repository;
    private @javax.annotation.Nullable com.fhir.MolecularsequenceType type;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Variant> variant;
    private @javax.annotation.Nullable java.util.List<com.fhir.MolecularSequence_Quality> quality;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference performer;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceSeq(com.fhir.MolecularSequence_ReferenceSeq referenceSeq) {
      checkNotIsSet(referenceSeqIsSet(), "referenceSeq");
      this.referenceSeq = java.util.Objects.requireNonNull(referenceSeq, "referenceSeq");
      optBits |= OPT_BIT_REFERENCE_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceSeq")
    public final Builder referenceSeq(java.util.Optional<? extends com.fhir.MolecularSequence_ReferenceSeq> referenceSeq) {
      checkNotIsSet(referenceSeqIsSet(), "referenceSeq");
      this.referenceSeq = referenceSeq.orElse(null);
      optBits |= OPT_BIT_REFERENCE_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for chained invocation
     */
    public final Builder structureVariant(java.util.List<com.fhir.MolecularSequence_StructureVariant> structureVariant) {
      checkNotIsSet(structureVariantIsSet(), "structureVariant");
      this.structureVariant = java.util.Objects.requireNonNull(structureVariant, "structureVariant");
      optBits |= OPT_BIT_STRUCTURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("structureVariant")
    public final Builder structureVariant(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_StructureVariant>> structureVariant) {
      checkNotIsSet(structureVariantIsSet(), "structureVariant");
      this.structureVariant = structureVariant.orElse(null);
      optBits |= OPT_BIT_STRUCTURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(com.fhir.Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = java.util.Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public final Builder device(java.util.Optional<? extends com.fhir.Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(com.fhir.Reference specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = java.util.Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public final Builder specimen(java.util.Optional<? extends com.fhir.Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
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
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
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
     * Initializes the value for the {@link MolecularSequence#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MolecularSequence#coordinateSystem() coordinateSystem} to coordinateSystem.
     * @param coordinateSystem The value for coordinateSystem
     * @return {@code this} builder for chained invocation
     */
    public final Builder coordinateSystem(int coordinateSystem) {
      checkNotIsSet(coordinateSystemIsSet(), "coordinateSystem");
      this.coordinateSystem = coordinateSystem;
      optBits |= OPT_BIT_COORDINATE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#coordinateSystem() coordinateSystem} to coordinateSystem.
     * @param coordinateSystem The value for coordinateSystem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinateSystem")
    public final Builder coordinateSystem(java.util.Optional<java.lang.Integer> coordinateSystem) {
      checkNotIsSet(coordinateSystemIsSet(), "coordinateSystem");
      this.coordinateSystem = coordinateSystem.orElse(null);
      optBits |= OPT_BIT_COORDINATE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for chained invocation
     */
    public final Builder observedSeq(java.lang.String observedSeq) {
      checkNotIsSet(observedSeqIsSet(), "observedSeq");
      this.observedSeq = java.util.Objects.requireNonNull(observedSeq, "observedSeq");
      optBits |= OPT_BIT_OBSERVED_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedSeq")
    public final Builder observedSeq(java.util.Optional<java.lang.String> observedSeq) {
      checkNotIsSet(observedSeqIsSet(), "observedSeq");
      this.observedSeq = observedSeq.orElse(null);
      optBits |= OPT_BIT_OBSERVED_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MolecularSequence#readCoverage() readCoverage} to readCoverage.
     * @param readCoverage The value for readCoverage
     * @return {@code this} builder for chained invocation
     */
    public final Builder readCoverage(int readCoverage) {
      checkNotIsSet(readCoverageIsSet(), "readCoverage");
      this.readCoverage = readCoverage;
      optBits |= OPT_BIT_READ_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#readCoverage() readCoverage} to readCoverage.
     * @param readCoverage The value for readCoverage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readCoverage")
    public final Builder readCoverage(java.util.Optional<java.lang.Integer> readCoverage) {
      checkNotIsSet(readCoverageIsSet(), "readCoverage");
      this.readCoverage = readCoverage.orElse(null);
      optBits |= OPT_BIT_READ_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for chained invocation
     */
    public final Builder pointer(java.util.List<com.fhir.Reference> pointer) {
      checkNotIsSet(pointerIsSet(), "pointer");
      this.pointer = java.util.Objects.requireNonNull(pointer, "pointer");
      optBits |= OPT_BIT_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pointer")
    public final Builder pointer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> pointer) {
      checkNotIsSet(pointerIsSet(), "pointer");
      this.pointer = pointer.orElse(null);
      optBits |= OPT_BIT_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
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
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
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
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for chained invocation
     */
    public final Builder repository(java.util.List<com.fhir.MolecularSequence_Repository> repository) {
      checkNotIsSet(repositoryIsSet(), "repository");
      this.repository = java.util.Objects.requireNonNull(repository, "repository");
      optBits |= OPT_BIT_REPOSITORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    public final Builder repository(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Repository>> repository) {
      checkNotIsSet(repositoryIsSet(), "repository");
      this.repository = repository.orElse(null);
      optBits |= OPT_BIT_REPOSITORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.MolecularsequenceType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.MolecularsequenceType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
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
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
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
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(java.util.Optional<? extends com.fhir.Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for chained invocation
     */
    public final Builder variant(java.util.List<com.fhir.MolecularSequence_Variant> variant) {
      checkNotIsSet(variantIsSet(), "variant");
      this.variant = java.util.Objects.requireNonNull(variant, "variant");
      optBits |= OPT_BIT_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variant")
    public final Builder variant(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Variant>> variant) {
      checkNotIsSet(variantIsSet(), "variant");
      this.variant = variant.orElse(null);
      optBits |= OPT_BIT_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for chained invocation
     */
    public final Builder quality(java.util.List<com.fhir.MolecularSequence_Quality> quality) {
      checkNotIsSet(qualityIsSet(), "quality");
      this.quality = java.util.Objects.requireNonNull(quality, "quality");
      optBits |= OPT_BIT_QUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quality")
    public final Builder quality(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Quality>> quality) {
      checkNotIsSet(qualityIsSet(), "quality");
      this.quality = quality.orElse(null);
      optBits |= OPT_BIT_QUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
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
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
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
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(com.fhir.Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link MolecularSequence MolecularSequence}.
     * @return An immutable instance of MolecularSequence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MolecularSequence build() {
      checkRequiredAttributes();
      return new ImmutableMolecularSequence(
          modifierExtension,
          referenceSeq,
          structureVariant,
          id,
          device,
          quantity,
          specimen,
          meta,
          resourceType,
          coordinateSystem,
          extension,
          observedSeq,
          identifier,
          readCoverage,
          pointer,
          language,
          repository,
          type,
          contained,
          patient,
          variant,
          quality,
          text,
          performer,
          implicitRules);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean referenceSeqIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ) != 0;
    }

    private boolean structureVariantIsSet() {
      return (optBits & OPT_BIT_STRUCTURE_VARIANT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean coordinateSystemIsSet() {
      return (optBits & OPT_BIT_COORDINATE_SYSTEM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean observedSeqIsSet() {
      return (optBits & OPT_BIT_OBSERVED_SEQ) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean readCoverageIsSet() {
      return (optBits & OPT_BIT_READ_COVERAGE) != 0;
    }

    private boolean pointerIsSet() {
      return (optBits & OPT_BIT_POINTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean repositoryIsSet() {
      return (optBits & OPT_BIT_REPOSITORY) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean variantIsSet() {
      return (optBits & OPT_BIT_VARIANT) != 0;
    }

    private boolean qualityIsSet() {
      return (optBits & OPT_BIT_QUALITY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MolecularSequence is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MolecularSequence, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MolecularSequence", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MolecularSequence#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MolecularSequence", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceSeq(com.fhir.MolecularSequence_ReferenceSeq referenceSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceSeq(java.util.Optional<? extends com.fhir.MolecularSequence_ReferenceSeq> referenceSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal structureVariant(java.util.List<com.fhir.MolecularSequence_StructureVariant> structureVariant);

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal structureVariant(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_StructureVariant>> structureVariant);

    /**
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(com.fhir.Reference device);

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(java.util.Optional<? extends com.fhir.Reference> device);

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(com.fhir.Reference specimen);

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(java.util.Optional<? extends com.fhir.Reference> specimen);

    /**
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MolecularSequence#coordinateSystem() coordinateSystem} to coordinateSystem.
     * @param coordinateSystem The value for coordinateSystem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coordinateSystem(int coordinateSystem);

    /**
     * Initializes the optional value {@link MolecularSequence#coordinateSystem() coordinateSystem} to coordinateSystem.
     * @param coordinateSystem The value for coordinateSystem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coordinateSystem(java.util.Optional<java.lang.Integer> coordinateSystem);

    /**
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for chained invocation
     */
    BuildFinal observedSeq(java.lang.String observedSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observedSeq(java.util.Optional<java.lang.String> observedSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MolecularSequence#readCoverage() readCoverage} to readCoverage.
     * @param readCoverage The value for readCoverage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal readCoverage(int readCoverage);

    /**
     * Initializes the optional value {@link MolecularSequence#readCoverage() readCoverage} to readCoverage.
     * @param readCoverage The value for readCoverage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal readCoverage(java.util.Optional<java.lang.Integer> readCoverage);

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal pointer(java.util.List<com.fhir.Reference> pointer);

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal pointer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> pointer);

    /**
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for chained invocation
     */
    BuildFinal repository(java.util.List<com.fhir.MolecularSequence_Repository> repository);

    /**
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal repository(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Repository>> repository);

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.MolecularsequenceType type);

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.MolecularsequenceType> type);

    /**
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(java.util.Optional<? extends com.fhir.Reference> patient);

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal variant(java.util.List<com.fhir.MolecularSequence_Variant> variant);

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal variant(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Variant>> variant);

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quality(java.util.List<com.fhir.MolecularSequence_Quality> quality);

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quality(java.util.Optional<? extends java.util.List<com.fhir.MolecularSequence_Quality>> quality);

    /**
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(com.fhir.Reference performer);

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Builds a new {@link MolecularSequence MolecularSequence}.
     * @return An immutable instance of MolecularSequence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MolecularSequence build();
  }
}
