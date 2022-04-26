package com.fhir.types.fhir;

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
 * Immutable implementation of {@link MolecularSequence}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence.builder()}.
 */
@Generated(from = "MolecularSequence", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence implements MolecularSequence {
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference specimen;
  private final String resourceType;
  private final @Nullable List<MolecularSequence_Repository> repository;
  private final @Nullable Reference device;
  private final @Nullable List<MolecularSequence_Quality> quality;
  private final @Nullable Id id;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<MolecularSequence_StructureVariant> structureVariant;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Quantity quantity;
  private final @Nullable MolecularSequence_ReferenceSeq referenceSeq;
  private final @Nullable List<Reference> pointer;
  private final @Nullable Integer coordinateSystem;
  private final @Nullable Reference performer;
  private final @Nullable Code language;
  private final @Nullable MolecularsequenceType type;
  private final @Nullable List<MolecularSequence_Variant> variant;
  private final @Nullable String observedSeq;
  private final @Nullable Uri implicitRules;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Integer readCoverage;
  private final @Nullable Reference patient;

  private ImmutableMolecularSequence(
      @Nullable List<Extension> extension,
      @Nullable Reference specimen,
      String resourceType,
      @Nullable List<MolecularSequence_Repository> repository,
      @Nullable Reference device,
      @Nullable List<MolecularSequence_Quality> quality,
      @Nullable Id id,
      @Nullable List<ResourceList> contained,
      @Nullable List<MolecularSequence_StructureVariant> structureVariant,
      @Nullable List<Identifier> identifier,
      @Nullable Quantity quantity,
      @Nullable MolecularSequence_ReferenceSeq referenceSeq,
      @Nullable List<Reference> pointer,
      @Nullable Integer coordinateSystem,
      @Nullable Reference performer,
      @Nullable Code language,
      @Nullable MolecularsequenceType type,
      @Nullable List<MolecularSequence_Variant> variant,
      @Nullable String observedSeq,
      @Nullable Uri implicitRules,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable Integer readCoverage,
      @Nullable Reference patient) {
    this.extension = extension;
    this.specimen = specimen;
    this.resourceType = resourceType;
    this.repository = repository;
    this.device = device;
    this.quality = quality;
    this.id = id;
    this.contained = contained;
    this.structureVariant = structureVariant;
    this.identifier = identifier;
    this.quantity = quantity;
    this.referenceSeq = referenceSeq;
    this.pointer = pointer;
    this.coordinateSystem = coordinateSystem;
    this.performer = performer;
    this.language = language;
    this.type = type;
    this.variant = variant;
    this.observedSeq = observedSeq;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.readCoverage = readCoverage;
    this.patient = patient;
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
   * @return The value of the {@code specimen} attribute
   */
  @JsonProperty("specimen")
  @Override
  public Optional<Reference> specimen() {
    return Optional.ofNullable(specimen);
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
   * @return The value of the {@code repository} attribute
   */
  @JsonProperty("repository")
  @Override
  public Optional<List<MolecularSequence_Repository>> repository() {
    return Optional.ofNullable(repository);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @JsonProperty("device")
  @Override
  public Optional<Reference> device() {
    return Optional.ofNullable(device);
  }

  /**
   * @return The value of the {@code quality} attribute
   */
  @JsonProperty("quality")
  @Override
  public Optional<List<MolecularSequence_Quality>> quality() {
    return Optional.ofNullable(quality);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code structureVariant} attribute
   */
  @JsonProperty("structureVariant")
  @Override
  public Optional<List<MolecularSequence_StructureVariant>> structureVariant() {
    return Optional.ofNullable(structureVariant);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code referenceSeq} attribute
   */
  @JsonProperty("referenceSeq")
  @Override
  public Optional<MolecularSequence_ReferenceSeq> referenceSeq() {
    return Optional.ofNullable(referenceSeq);
  }

  /**
   * @return The value of the {@code pointer} attribute
   */
  @JsonProperty("pointer")
  @Override
  public Optional<List<Reference>> pointer() {
    return Optional.ofNullable(pointer);
  }

  /**
   * @return The value of the {@code coordinateSystem} attribute
   */
  @JsonProperty("coordinateSystem")
  @Override
  public Optional<Integer> coordinateSystem() {
    return Optional.ofNullable(coordinateSystem);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<MolecularsequenceType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code variant} attribute
   */
  @JsonProperty("variant")
  @Override
  public Optional<List<MolecularSequence_Variant>> variant() {
    return Optional.ofNullable(variant);
  }

  /**
   * @return The value of the {@code observedSeq} attribute
   */
  @JsonProperty("observedSeq")
  @Override
  public Optional<String> observedSeq() {
    return Optional.ofNullable(observedSeq);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code readCoverage} attribute
   */
  @JsonProperty("readCoverage")
  @Override
  public Optional<Integer> readCoverage() {
    return Optional.ofNullable(readCoverage);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Optional<Reference> patient() {
    return Optional.ofNullable(patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence(
        newValue,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence(
        value,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withSpecimen(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        newValue,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withSpecimen(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        value,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MolecularSequence#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMolecularSequence withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        newValue,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#repository() repository} attribute.
   * @param value The value for repository
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withRepository(List<MolecularSequence_Repository> value) {
    @Nullable List<MolecularSequence_Repository> newValue = Objects.requireNonNull(value, "repository");
    if (this.repository == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        newValue,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#repository() repository} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repository
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withRepository(Optional<? extends List<MolecularSequence_Repository>> optional) {
    @Nullable List<MolecularSequence_Repository> value = optional.orElse(null);
    if (this.repository == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        value,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withDevice(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        newValue,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withDevice(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        value,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#quality() quality} attribute.
   * @param value The value for quality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withQuality(List<MolecularSequence_Quality> value) {
    @Nullable List<MolecularSequence_Quality> newValue = Objects.requireNonNull(value, "quality");
    if (this.quality == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        newValue,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#quality() quality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withQuality(Optional<? extends List<MolecularSequence_Quality>> optional) {
    @Nullable List<MolecularSequence_Quality> value = optional.orElse(null);
    if (this.quality == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        value,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        newValue,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        value,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        newValue,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        value,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#structureVariant() structureVariant} attribute.
   * @param value The value for structureVariant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withStructureVariant(List<MolecularSequence_StructureVariant> value) {
    @Nullable List<MolecularSequence_StructureVariant> newValue = Objects.requireNonNull(value, "structureVariant");
    if (this.structureVariant == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        newValue,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#structureVariant() structureVariant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structureVariant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withStructureVariant(Optional<? extends List<MolecularSequence_StructureVariant>> optional) {
    @Nullable List<MolecularSequence_StructureVariant> value = optional.orElse(null);
    if (this.structureVariant == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        value,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        newValue,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        value,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        newValue,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        value,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#referenceSeq() referenceSeq} attribute.
   * @param value The value for referenceSeq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withReferenceSeq(MolecularSequence_ReferenceSeq value) {
    @Nullable MolecularSequence_ReferenceSeq newValue = Objects.requireNonNull(value, "referenceSeq");
    if (this.referenceSeq == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        newValue,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#referenceSeq() referenceSeq} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceSeq
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withReferenceSeq(Optional<? extends MolecularSequence_ReferenceSeq> optional) {
    @Nullable MolecularSequence_ReferenceSeq value = optional.orElse(null);
    if (this.referenceSeq == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        value,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#pointer() pointer} attribute.
   * @param value The value for pointer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withPointer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "pointer");
    if (this.pointer == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        newValue,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#pointer() pointer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pointer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withPointer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.pointer == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        value,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#coordinateSystem() coordinateSystem} attribute.
   * @param value The value for coordinateSystem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withCoordinateSystem(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.coordinateSystem, newValue)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        newValue,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#coordinateSystem() coordinateSystem} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coordinateSystem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withCoordinateSystem(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.coordinateSystem, value)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        value,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        newValue,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        value,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        newValue,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        value,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withType(MolecularsequenceType value) {
    @Nullable MolecularsequenceType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        newValue,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withType(Optional<? extends MolecularsequenceType> optional) {
    @Nullable MolecularsequenceType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        value,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#variant() variant} attribute.
   * @param value The value for variant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withVariant(List<MolecularSequence_Variant> value) {
    @Nullable List<MolecularSequence_Variant> newValue = Objects.requireNonNull(value, "variant");
    if (this.variant == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        newValue,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#variant() variant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withVariant(Optional<? extends List<MolecularSequence_Variant>> optional) {
    @Nullable List<MolecularSequence_Variant> value = optional.orElse(null);
    if (this.variant == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        value,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#observedSeq() observedSeq} attribute.
   * @param value The value for observedSeq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withObservedSeq(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "observedSeq");
    if (Objects.equals(this.observedSeq, newValue)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        newValue,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#observedSeq() observedSeq} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observedSeq
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withObservedSeq(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.observedSeq, value)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        value,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        newValue,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        value,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        newValue,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        value,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        newValue,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        value,
        this.modifierExtension,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        newValue,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        value,
        this.readCoverage,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#readCoverage() readCoverage} attribute.
   * @param value The value for readCoverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withReadCoverage(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.readCoverage, newValue)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        newValue,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#readCoverage() readCoverage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readCoverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withReadCoverage(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.readCoverage, value)) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        value,
        this.patient);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence withPatient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence withPatient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableMolecularSequence(
        this.extension,
        this.specimen,
        this.resourceType,
        this.repository,
        this.device,
        this.quality,
        this.id,
        this.contained,
        this.structureVariant,
        this.identifier,
        this.quantity,
        this.referenceSeq,
        this.pointer,
        this.coordinateSystem,
        this.performer,
        this.language,
        this.type,
        this.variant,
        this.observedSeq,
        this.implicitRules,
        this.meta,
        this.text,
        this.modifierExtension,
        this.readCoverage,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence
        && equalTo((ImmutableMolecularSequence) another);
  }

  private boolean equalTo(ImmutableMolecularSequence another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(specimen, another.specimen)
        && resourceType.equals(another.resourceType)
        && Objects.equals(repository, another.repository)
        && Objects.equals(device, another.device)
        && Objects.equals(quality, another.quality)
        && Objects.equals(id, another.id)
        && Objects.equals(contained, another.contained)
        && Objects.equals(structureVariant, another.structureVariant)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(referenceSeq, another.referenceSeq)
        && Objects.equals(pointer, another.pointer)
        && Objects.equals(coordinateSystem, another.coordinateSystem)
        && Objects.equals(performer, another.performer)
        && Objects.equals(language, another.language)
        && Objects.equals(type, another.type)
        && Objects.equals(variant, another.variant)
        && Objects.equals(observedSeq, another.observedSeq)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(readCoverage, another.readCoverage)
        && Objects.equals(patient, another.patient);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code specimen}, {@code resourceType}, {@code repository}, {@code device}, {@code quality}, {@code id}, {@code contained}, {@code structureVariant}, {@code identifier}, {@code quantity}, {@code referenceSeq}, {@code pointer}, {@code coordinateSystem}, {@code performer}, {@code language}, {@code type}, {@code variant}, {@code observedSeq}, {@code implicitRules}, {@code meta}, {@code text}, {@code modifierExtension}, {@code readCoverage}, {@code patient}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(specimen);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(repository);
    h += (h << 5) + Objects.hashCode(device);
    h += (h << 5) + Objects.hashCode(quality);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(structureVariant);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(referenceSeq);
    h += (h << 5) + Objects.hashCode(pointer);
    h += (h << 5) + Objects.hashCode(coordinateSystem);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(variant);
    h += (h << 5) + Objects.hashCode(observedSeq);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(readCoverage);
    h += (h << 5) + Objects.hashCode(patient);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (specimen != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (repository != null) {
      builder.append(", ");
      builder.append("repository=").append(repository);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (quality != null) {
      builder.append(", ");
      builder.append("quality=").append(quality);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (structureVariant != null) {
      builder.append(", ");
      builder.append("structureVariant=").append(structureVariant);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (referenceSeq != null) {
      builder.append(", ");
      builder.append("referenceSeq=").append(referenceSeq);
    }
    if (pointer != null) {
      builder.append(", ");
      builder.append("pointer=").append(pointer);
    }
    if (coordinateSystem != null) {
      builder.append(", ");
      builder.append("coordinateSystem=").append(coordinateSystem);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (variant != null) {
      builder.append(", ");
      builder.append("variant=").append(variant);
    }
    if (observedSeq != null) {
      builder.append(", ");
      builder.append("observedSeq=").append(observedSeq);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (readCoverage != null) {
      builder.append(", ");
      builder.append("readCoverage=").append(readCoverage);
    }
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> specimen = Optional.empty();
    boolean specimenIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<MolecularSequence_Repository>> repository = Optional.empty();
    boolean repositoryIsSet;
    @Nullable Optional<Reference> device = Optional.empty();
    boolean deviceIsSet;
    @Nullable Optional<List<MolecularSequence_Quality>> quality = Optional.empty();
    boolean qualityIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<MolecularSequence_StructureVariant>> structureVariant = Optional.empty();
    boolean structureVariantIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<MolecularSequence_ReferenceSeq> referenceSeq = Optional.empty();
    boolean referenceSeqIsSet;
    @Nullable Optional<List<Reference>> pointer = Optional.empty();
    boolean pointerIsSet;
    @Nullable Optional<Integer> coordinateSystem = Optional.empty();
    boolean coordinateSystemIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<MolecularsequenceType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<MolecularSequence_Variant>> variant = Optional.empty();
    boolean variantIsSet;
    @Nullable Optional<String> observedSeq = Optional.empty();
    boolean observedSeqIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Integer> readCoverage = Optional.empty();
    boolean readCoverageIsSet;
    @Nullable Optional<Reference> patient = Optional.empty();
    boolean patientIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("specimen")
    public void setSpecimen(Optional<Reference> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("repository")
    public void setRepository(Optional<List<MolecularSequence_Repository>> repository) {
      this.repository = repository;
      this.repositoryIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Optional<Reference> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @JsonProperty("quality")
    public void setQuality(Optional<List<MolecularSequence_Quality>> quality) {
      this.quality = quality;
      this.qualityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("structureVariant")
    public void setStructureVariant(Optional<List<MolecularSequence_StructureVariant>> structureVariant) {
      this.structureVariant = structureVariant;
      this.structureVariantIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("referenceSeq")
    public void setReferenceSeq(Optional<MolecularSequence_ReferenceSeq> referenceSeq) {
      this.referenceSeq = referenceSeq;
      this.referenceSeqIsSet = true;
    }
    @JsonProperty("pointer")
    public void setPointer(Optional<List<Reference>> pointer) {
      this.pointer = pointer;
      this.pointerIsSet = true;
    }
    @JsonProperty("coordinateSystem")
    public void setCoordinateSystem(Optional<Integer> coordinateSystem) {
      this.coordinateSystem = coordinateSystem;
      this.coordinateSystemIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<MolecularsequenceType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("variant")
    public void setVariant(Optional<List<MolecularSequence_Variant>> variant) {
      this.variant = variant;
      this.variantIsSet = true;
    }
    @JsonProperty("observedSeq")
    public void setObservedSeq(Optional<String> observedSeq) {
      this.observedSeq = observedSeq;
      this.observedSeqIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("readCoverage")
    public void setReadCoverage(Optional<Integer> readCoverage) {
      this.readCoverage = readCoverage;
      this.readCoverageIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Optional<Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MolecularSequence_Repository>> repository() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MolecularSequence_Quality>> quality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MolecularSequence_StructureVariant>> structureVariant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MolecularSequence_ReferenceSeq> referenceSeq() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> pointer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> coordinateSystem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MolecularsequenceType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MolecularSequence_Variant>> variant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> observedSeq() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> readCoverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> patient() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence fromJson(Json json) {
    ImmutableMolecularSequence.Builder builder = ((ImmutableMolecularSequence.Builder) ImmutableMolecularSequence.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.repositoryIsSet) {
      builder.repository(json.repository);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.qualityIsSet) {
      builder.quality(json.quality);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.structureVariantIsSet) {
      builder.structureVariant(json.structureVariant);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.referenceSeqIsSet) {
      builder.referenceSeq(json.referenceSeq);
    }
    if (json.pointerIsSet) {
      builder.pointer(json.pointer);
    }
    if (json.coordinateSystemIsSet) {
      builder.coordinateSystem(json.coordinateSystem);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.variantIsSet) {
      builder.variant(json.variant);
    }
    if (json.observedSeqIsSet) {
      builder.observedSeq(json.observedSeq);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.readCoverageIsSet) {
      builder.readCoverage(json.readCoverage);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
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
        .extension(instance.extension())
        .specimen(instance.specimen())
        .resourceType(instance.resourceType())
        .repository(instance.repository())
        .device(instance.device())
        .quality(instance.quality())
        .id(instance.id())
        .contained(instance.contained())
        .structureVariant(instance.structureVariant())
        .identifier(instance.identifier())
        .quantity(instance.quantity())
        .referenceSeq(instance.referenceSeq())
        .pointer(instance.pointer())
        .coordinateSystem(instance.coordinateSystem())
        .performer(instance.performer())
        .language(instance.language())
        .type(instance.type())
        .variant(instance.variant())
        .observedSeq(instance.observedSeq())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .readCoverage(instance.readCoverage())
        .patient(instance.patient())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence MolecularSequence}.
   * <pre>
   * ImmutableMolecularSequence.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence#extension() extension}
   *    .specimen(com.fhir.types.fhir.Reference) // optional {@link MolecularSequence#specimen() specimen}
   *    .resourceType(String) // required {@link MolecularSequence#resourceType() resourceType}
   *    .repository(List&amp;lt;com.fhir.types.fhir.MolecularSequence_Repository&amp;gt;) // optional {@link MolecularSequence#repository() repository}
   *    .device(com.fhir.types.fhir.Reference) // optional {@link MolecularSequence#device() device}
   *    .quality(List&amp;lt;com.fhir.types.fhir.MolecularSequence_Quality&amp;gt;) // optional {@link MolecularSequence#quality() quality}
   *    .id(com.fhir.types.fhir.Id) // optional {@link MolecularSequence#id() id}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link MolecularSequence#contained() contained}
   *    .structureVariant(List&amp;lt;com.fhir.types.fhir.MolecularSequence_StructureVariant&amp;gt;) // optional {@link MolecularSequence#structureVariant() structureVariant}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link MolecularSequence#identifier() identifier}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link MolecularSequence#quantity() quantity}
   *    .referenceSeq(com.fhir.types.fhir.MolecularSequence_ReferenceSeq) // optional {@link MolecularSequence#referenceSeq() referenceSeq}
   *    .pointer(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MolecularSequence#pointer() pointer}
   *    .coordinateSystem(Integer) // optional {@link MolecularSequence#coordinateSystem() coordinateSystem}
   *    .performer(com.fhir.types.fhir.Reference) // optional {@link MolecularSequence#performer() performer}
   *    .language(com.fhir.types.fhir.Code) // optional {@link MolecularSequence#language() language}
   *    .type(com.fhir.types.fhir.MolecularsequenceType) // optional {@link MolecularSequence#type() type}
   *    .variant(List&amp;lt;com.fhir.types.fhir.MolecularSequence_Variant&amp;gt;) // optional {@link MolecularSequence#variant() variant}
   *    .observedSeq(String) // optional {@link MolecularSequence#observedSeq() observedSeq}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link MolecularSequence#implicitRules() implicitRules}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link MolecularSequence#meta() meta}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link MolecularSequence#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence#modifierExtension() modifierExtension}
   *    .readCoverage(Integer) // optional {@link MolecularSequence#readCoverage() readCoverage}
   *    .patient(com.fhir.types.fhir.Reference) // optional {@link MolecularSequence#patient() patient}
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
  @Generated(from = "MolecularSequence", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_SPECIMEN = 0x2L;
    private static final long OPT_BIT_REPOSITORY = 0x4L;
    private static final long OPT_BIT_DEVICE = 0x8L;
    private static final long OPT_BIT_QUALITY = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_STRUCTURE_VARIANT = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_QUANTITY = 0x200L;
    private static final long OPT_BIT_REFERENCE_SEQ = 0x400L;
    private static final long OPT_BIT_POINTER = 0x800L;
    private static final long OPT_BIT_COORDINATE_SYSTEM = 0x1000L;
    private static final long OPT_BIT_PERFORMER = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_TYPE = 0x8000L;
    private static final long OPT_BIT_VARIANT = 0x10000L;
    private static final long OPT_BIT_OBSERVED_SEQ = 0x20000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000L;
    private static final long OPT_BIT_READ_COVERAGE = 0x400000L;
    private static final long OPT_BIT_PATIENT = 0x800000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Reference specimen;
    private @Nullable String resourceType;
    private @Nullable List<MolecularSequence_Repository> repository;
    private @Nullable Reference device;
    private @Nullable List<MolecularSequence_Quality> quality;
    private @Nullable Id id;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<MolecularSequence_StructureVariant> structureVariant;
    private @Nullable List<Identifier> identifier;
    private @Nullable Quantity quantity;
    private @Nullable MolecularSequence_ReferenceSeq referenceSeq;
    private @Nullable List<Reference> pointer;
    private @Nullable Integer coordinateSystem;
    private @Nullable Reference performer;
    private @Nullable Code language;
    private @Nullable MolecularsequenceType type;
    private @Nullable List<MolecularSequence_Variant> variant;
    private @Nullable String observedSeq;
    private @Nullable Uri implicitRules;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Integer readCoverage;
    private @Nullable Reference patient;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(Reference specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimen")
    public final Builder specimen(Optional<? extends Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the value for the {@link MolecularSequence#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for chained invocation
     */
    public final Builder repository(List<MolecularSequence_Repository> repository) {
      checkNotIsSet(repositoryIsSet(), "repository");
      this.repository = Objects.requireNonNull(repository, "repository");
      optBits |= OPT_BIT_REPOSITORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repository")
    public final Builder repository(Optional<? extends List<MolecularSequence_Repository>> repository) {
      checkNotIsSet(repositoryIsSet(), "repository");
      this.repository = repository.orElse(null);
      optBits |= OPT_BIT_REPOSITORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("device")
    public final Builder device(Optional<? extends Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for chained invocation
     */
    public final Builder quality(List<MolecularSequence_Quality> quality) {
      checkNotIsSet(qualityIsSet(), "quality");
      this.quality = Objects.requireNonNull(quality, "quality");
      optBits |= OPT_BIT_QUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quality")
    public final Builder quality(Optional<? extends List<MolecularSequence_Quality>> quality) {
      checkNotIsSet(qualityIsSet(), "quality");
      this.quality = quality.orElse(null);
      optBits |= OPT_BIT_QUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
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
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
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
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for chained invocation
     */
    public final Builder structureVariant(List<MolecularSequence_StructureVariant> structureVariant) {
      checkNotIsSet(structureVariantIsSet(), "structureVariant");
      this.structureVariant = Objects.requireNonNull(structureVariant, "structureVariant");
      optBits |= OPT_BIT_STRUCTURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("structureVariant")
    public final Builder structureVariant(Optional<? extends List<MolecularSequence_StructureVariant>> structureVariant) {
      checkNotIsSet(structureVariantIsSet(), "structureVariant");
      this.structureVariant = structureVariant.orElse(null);
      optBits |= OPT_BIT_STRUCTURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceSeq(MolecularSequence_ReferenceSeq referenceSeq) {
      checkNotIsSet(referenceSeqIsSet(), "referenceSeq");
      this.referenceSeq = Objects.requireNonNull(referenceSeq, "referenceSeq");
      optBits |= OPT_BIT_REFERENCE_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceSeq")
    public final Builder referenceSeq(Optional<? extends MolecularSequence_ReferenceSeq> referenceSeq) {
      checkNotIsSet(referenceSeqIsSet(), "referenceSeq");
      this.referenceSeq = referenceSeq.orElse(null);
      optBits |= OPT_BIT_REFERENCE_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for chained invocation
     */
    public final Builder pointer(List<Reference> pointer) {
      checkNotIsSet(pointerIsSet(), "pointer");
      this.pointer = Objects.requireNonNull(pointer, "pointer");
      optBits |= OPT_BIT_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("pointer")
    public final Builder pointer(Optional<? extends List<Reference>> pointer) {
      checkNotIsSet(pointerIsSet(), "pointer");
      this.pointer = pointer.orElse(null);
      optBits |= OPT_BIT_POINTER;
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
    @JsonProperty("coordinateSystem")
    public final Builder coordinateSystem(Optional<Integer> coordinateSystem) {
      checkNotIsSet(coordinateSystemIsSet(), "coordinateSystem");
      this.coordinateSystem = coordinateSystem.orElse(null);
      optBits |= OPT_BIT_COORDINATE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
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
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
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
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(MolecularsequenceType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends MolecularsequenceType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for chained invocation
     */
    public final Builder variant(List<MolecularSequence_Variant> variant) {
      checkNotIsSet(variantIsSet(), "variant");
      this.variant = Objects.requireNonNull(variant, "variant");
      optBits |= OPT_BIT_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variant")
    public final Builder variant(Optional<? extends List<MolecularSequence_Variant>> variant) {
      checkNotIsSet(variantIsSet(), "variant");
      this.variant = variant.orElse(null);
      optBits |= OPT_BIT_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for chained invocation
     */
    public final Builder observedSeq(String observedSeq) {
      checkNotIsSet(observedSeqIsSet(), "observedSeq");
      this.observedSeq = Objects.requireNonNull(observedSeq, "observedSeq");
      optBits |= OPT_BIT_OBSERVED_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("observedSeq")
    public final Builder observedSeq(Optional<String> observedSeq) {
      checkNotIsSet(observedSeqIsSet(), "observedSeq");
      this.observedSeq = observedSeq.orElse(null);
      optBits |= OPT_BIT_OBSERVED_SEQ;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
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
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
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
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
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
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
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
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
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
    @JsonProperty("readCoverage")
    public final Builder readCoverage(Optional<Integer> readCoverage) {
      checkNotIsSet(readCoverageIsSet(), "readCoverage");
      this.readCoverage = readCoverage.orElse(null);
      optBits |= OPT_BIT_READ_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Optional<? extends Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Builds a new {@link MolecularSequence MolecularSequence}.
     * @return An immutable instance of MolecularSequence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence build() {
      checkRequiredAttributes();
      return new ImmutableMolecularSequence(
          extension,
          specimen,
          resourceType,
          repository,
          device,
          quality,
          id,
          contained,
          structureVariant,
          identifier,
          quantity,
          referenceSeq,
          pointer,
          coordinateSystem,
          performer,
          language,
          type,
          variant,
          observedSeq,
          implicitRules,
          meta,
          text,
          modifierExtension,
          readCoverage,
          patient);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean repositoryIsSet() {
      return (optBits & OPT_BIT_REPOSITORY) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean qualityIsSet() {
      return (optBits & OPT_BIT_QUALITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean structureVariantIsSet() {
      return (optBits & OPT_BIT_STRUCTURE_VARIANT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean referenceSeqIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ) != 0;
    }

    private boolean pointerIsSet() {
      return (optBits & OPT_BIT_POINTER) != 0;
    }

    private boolean coordinateSystemIsSet() {
      return (optBits & OPT_BIT_COORDINATE_SYSTEM) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean variantIsSet() {
      return (optBits & OPT_BIT_VARIANT) != 0;
    }

    private boolean observedSeqIsSet() {
      return (optBits & OPT_BIT_OBSERVED_SEQ) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean readCoverageIsSet() {
      return (optBits & OPT_BIT_READ_COVERAGE) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MolecularSequence, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MolecularSequence", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MolecularSequence#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MolecularSequence", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MolecularSequence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(Reference specimen);

    /**
     * Initializes the optional value {@link MolecularSequence#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(Optional<? extends Reference> specimen);

    /**
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for chained invocation
     */
    BuildFinal repository(List<MolecularSequence_Repository> repository);

    /**
     * Initializes the optional value {@link MolecularSequence#repository() repository} to repository.
     * @param repository The value for repository
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal repository(Optional<? extends List<MolecularSequence_Repository>> repository);

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(Reference device);

    /**
     * Initializes the optional value {@link MolecularSequence#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(Optional<? extends Reference> device);

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quality(List<MolecularSequence_Quality> quality);

    /**
     * Initializes the optional value {@link MolecularSequence#quality() quality} to quality.
     * @param quality The value for quality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quality(Optional<? extends List<MolecularSequence_Quality>> quality);

    /**
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MolecularSequence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MolecularSequence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal structureVariant(List<MolecularSequence_StructureVariant> structureVariant);

    /**
     * Initializes the optional value {@link MolecularSequence#structureVariant() structureVariant} to structureVariant.
     * @param structureVariant The value for structureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal structureVariant(Optional<? extends List<MolecularSequence_StructureVariant>> structureVariant);

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MolecularSequence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link MolecularSequence#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceSeq(MolecularSequence_ReferenceSeq referenceSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#referenceSeq() referenceSeq} to referenceSeq.
     * @param referenceSeq The value for referenceSeq
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceSeq(Optional<? extends MolecularSequence_ReferenceSeq> referenceSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal pointer(List<Reference> pointer);

    /**
     * Initializes the optional value {@link MolecularSequence#pointer() pointer} to pointer.
     * @param pointer The value for pointer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal pointer(Optional<? extends List<Reference>> pointer);

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
    BuildFinal coordinateSystem(Optional<Integer> coordinateSystem);

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(Reference performer);

    /**
     * Initializes the optional value {@link MolecularSequence#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends Reference> performer);

    /**
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MolecularSequence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(MolecularsequenceType type);

    /**
     * Initializes the optional value {@link MolecularSequence#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends MolecularsequenceType> type);

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal variant(List<MolecularSequence_Variant> variant);

    /**
     * Initializes the optional value {@link MolecularSequence#variant() variant} to variant.
     * @param variant The value for variant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal variant(Optional<? extends List<MolecularSequence_Variant>> variant);

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for chained invocation
     */
    BuildFinal observedSeq(String observedSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#observedSeq() observedSeq} to observedSeq.
     * @param observedSeq The value for observedSeq
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observedSeq(Optional<String> observedSeq);

    /**
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MolecularSequence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MolecularSequence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MolecularSequence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MolecularSequence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

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
    BuildFinal readCoverage(Optional<Integer> readCoverage);

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(Reference patient);

    /**
     * Initializes the optional value {@link MolecularSequence#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Optional<? extends Reference> patient);

    /**
     * Builds a new {@link MolecularSequence MolecularSequence}.
     * @return An immutable instance of MolecularSequence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MolecularSequence build();
  }
}
