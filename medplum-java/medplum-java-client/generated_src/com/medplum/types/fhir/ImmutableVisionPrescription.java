package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link VisionPrescription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVisionPrescription.builder()}.
 */
@Generated(from = "VisionPrescription", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVisionPrescription implements VisionPrescription {
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference encounter;
  private final @Nullable Meta meta;
  private final @Nullable List<Identifier> identifier;
  private final Reference prescriber;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri implicitRules;
  private final @Nullable DateTime created;
  private final String resourceType;
  private final @Nullable Id id;
  private final Reference patient;
  private final @Nullable Code status;
  private final List<VisionPrescription_LensSpecification> lensSpecification;
  private final @Nullable DateTime dateWritten;
  private final @Nullable Code language;

  private ImmutableVisionPrescription(
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      @Nullable Reference encounter,
      @Nullable Meta meta,
      @Nullable List<Identifier> identifier,
      Reference prescriber,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri implicitRules,
      @Nullable DateTime created,
      String resourceType,
      @Nullable Id id,
      Reference patient,
      @Nullable Code status,
      List<VisionPrescription_LensSpecification> lensSpecification,
      @Nullable DateTime dateWritten,
      @Nullable Code language) {
    this.text = text;
    this.contained = contained;
    this.encounter = encounter;
    this.meta = meta;
    this.identifier = identifier;
    this.prescriber = prescriber;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.created = created;
    this.resourceType = resourceType;
    this.id = id;
    this.patient = patient;
    this.status = status;
    this.lensSpecification = lensSpecification;
    this.dateWritten = dateWritten;
    this.language = language;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code prescriber} attribute
   */
  @JsonProperty("prescriber")
  @Override
  public Reference prescriber() {
    return prescriber;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code lensSpecification} attribute
   */
  @JsonProperty("lensSpecification")
  @Override
  public List<VisionPrescription_LensSpecification> lensSpecification() {
    return lensSpecification;
  }

  /**
   * @return The value of the {@code dateWritten} attribute
   */
  @JsonProperty("dateWritten")
  @Override
  public Optional<DateTime> dateWritten() {
    return Optional.ofNullable(dateWritten);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableVisionPrescription(
        newValue,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableVisionPrescription(
        value,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        newValue,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        value,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        newValue,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        value,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        newValue,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        value,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        newValue,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        value,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription#prescriber() prescriber} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for prescriber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription withPrescriber(Reference value) {
    if (this.prescriber == value) return this;
    Reference newValue = Objects.requireNonNull(value, "prescriber");
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        newValue,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        newValue,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        value,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        newValue,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        value,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        newValue,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        newValue,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        value,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        newValue,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        newValue,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        value,
        this.lensSpecification,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link VisionPrescription#lensSpecification() lensSpecification}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withLensSpecification(VisionPrescription_LensSpecification... elements) {
    List<VisionPrescription_LensSpecification> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        newValue,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link VisionPrescription#lensSpecification() lensSpecification}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of lensSpecification elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withLensSpecification(Iterable<? extends VisionPrescription_LensSpecification> elements) {
    if (this.lensSpecification == elements) return this;
    List<VisionPrescription_LensSpecification> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        newValue,
        this.dateWritten,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#dateWritten() dateWritten} attribute.
   * @param value The value for dateWritten
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withDateWritten(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "dateWritten");
    if (this.dateWritten == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#dateWritten() dateWritten} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateWritten
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withDateWritten(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.dateWritten == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableVisionPrescription(
        this.text,
        this.contained,
        this.encounter,
        this.meta,
        this.identifier,
        this.prescriber,
        this.extension,
        this.modifierExtension,
        this.implicitRules,
        this.created,
        this.resourceType,
        this.id,
        this.patient,
        this.status,
        this.lensSpecification,
        this.dateWritten,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVisionPrescription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVisionPrescription
        && equalTo((ImmutableVisionPrescription) another);
  }

  private boolean equalTo(ImmutableVisionPrescription another) {
    return Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(meta, another.meta)
        && Objects.equals(identifier, another.identifier)
        && prescriber.equals(another.prescriber)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(created, another.created)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && patient.equals(another.patient)
        && Objects.equals(status, another.status)
        && lensSpecification.equals(another.lensSpecification)
        && Objects.equals(dateWritten, another.dateWritten)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code contained}, {@code encounter}, {@code meta}, {@code identifier}, {@code prescriber}, {@code extension}, {@code modifierExtension}, {@code implicitRules}, {@code created}, {@code resourceType}, {@code id}, {@code patient}, {@code status}, {@code lensSpecification}, {@code dateWritten}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + prescriber.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + lensSpecification.hashCode();
    h += (h << 5) + Objects.hashCode(dateWritten);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code VisionPrescription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VisionPrescription{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (encounter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("prescriber=").append(prescriber);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    builder.append(", ");
    builder.append("lensSpecification=").append(lensSpecification);
    if (dateWritten != null) {
      builder.append(", ");
      builder.append("dateWritten=").append(dateWritten);
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
  @Generated(from = "VisionPrescription", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VisionPrescription {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Reference prescriber;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference patient;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable List<VisionPrescription_LensSpecification> lensSpecification = Collections.emptyList();
    @Nullable Optional<DateTime> dateWritten = Optional.empty();
    boolean dateWrittenIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("prescriber")
    public void setPrescriber(Reference prescriber) {
      this.prescriber = prescriber;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("lensSpecification")
    public void setLensSpecification(List<VisionPrescription_LensSpecification> lensSpecification) {
      this.lensSpecification = lensSpecification;
    }
    @JsonProperty("dateWritten")
    public void setDateWritten(Optional<DateTime> dateWritten) {
      this.dateWritten = dateWritten;
      this.dateWrittenIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Reference prescriber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public List<VisionPrescription_LensSpecification> lensSpecification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> dateWritten() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVisionPrescription fromJson(Json json) {
    ImmutableVisionPrescription.Builder builder = ((ImmutableVisionPrescription.Builder) ImmutableVisionPrescription.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.prescriber != null) {
      builder.prescriber(json.prescriber);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.lensSpecification != null) {
      builder.addAllLensSpecification(json.lensSpecification);
    }
    if (json.dateWrittenIsSet) {
      builder.dateWritten(json.dateWritten);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
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
        .text(instance.text())
        .contained(instance.contained())
        .encounter(instance.encounter())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .prescriber(instance.prescriber())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .created(instance.created())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .patient(instance.patient())
        .status(instance.status())
        .addAllLensSpecification(instance.lensSpecification())
        .dateWritten(instance.dateWritten())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link VisionPrescription VisionPrescription}.
   * <pre>
   * ImmutableVisionPrescription.builder()
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link VisionPrescription#text() text}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link VisionPrescription#contained() contained}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link VisionPrescription#encounter() encounter}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link VisionPrescription#meta() meta}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link VisionPrescription#identifier() identifier}
   *    .prescriber(com.medplum.types.fhir.Reference) // required {@link VisionPrescription#prescriber() prescriber}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VisionPrescription#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VisionPrescription#modifierExtension() modifierExtension}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link VisionPrescription#implicitRules() implicitRules}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link VisionPrescription#created() created}
   *    .resourceType(String) // required {@link VisionPrescription#resourceType() resourceType}
   *    .id(com.medplum.types.fhir.Id) // optional {@link VisionPrescription#id() id}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link VisionPrescription#patient() patient}
   *    .status(com.medplum.types.fhir.Code) // optional {@link VisionPrescription#status() status}
   *    .addLensSpecification|addAllLensSpecification(com.medplum.types.fhir.VisionPrescription_LensSpecification) // {@link VisionPrescription#lensSpecification() lensSpecification} elements
   *    .dateWritten(com.medplum.types.fhir.DateTime) // optional {@link VisionPrescription#dateWritten() dateWritten}
   *    .language(com.medplum.types.fhir.Code) // optional {@link VisionPrescription#language() language}
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
  @Generated(from = "VisionPrescription", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PrescriberBuildStage, ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_PRESCRIBER = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_ENCOUNTER = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_CREATED = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_DATE_WRITTEN = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference encounter;
    private @Nullable Meta meta;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference prescriber;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri implicitRules;
    private @Nullable DateTime created;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable Reference patient;
    private @Nullable Code status;
    private final List<VisionPrescription_LensSpecification> lensSpecification = new ArrayList<VisionPrescription_LensSpecification>();
    private @Nullable DateTime dateWritten;
    private @Nullable Code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
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
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
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
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
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
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
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
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
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
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
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
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link VisionPrescription#prescriber() prescriber} attribute.
     * @param prescriber The value for prescriber 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prescriber")
    public final Builder prescriber(Reference prescriber) {
      checkNotIsSet(prescriberIsSet(), "prescriber");
      this.prescriber = Objects.requireNonNull(prescriber, "prescriber");
      initBits &= ~INIT_BIT_PRESCRIBER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the value for the {@link VisionPrescription#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
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
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
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
     * Initializes the value for the {@link VisionPrescription#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Adds one element to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param element A lensSpecification element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLensSpecification(VisionPrescription_LensSpecification element) {
      this.lensSpecification.add(Objects.requireNonNull(element, "lensSpecification element"));
      return this;
    }

    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An array of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLensSpecification(VisionPrescription_LensSpecification... elements) {
      for (VisionPrescription_LensSpecification element : elements) {
        this.lensSpecification.add(Objects.requireNonNull(element, "lensSpecification element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An iterable of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllLensSpecification(Iterable<? extends VisionPrescription_LensSpecification> elements) {
      for (VisionPrescription_LensSpecification element : elements) {
        this.lensSpecification.add(Objects.requireNonNull(element, "lensSpecification element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateWritten(DateTime dateWritten) {
      checkNotIsSet(dateWrittenIsSet(), "dateWritten");
      this.dateWritten = Objects.requireNonNull(dateWritten, "dateWritten");
      optBits |= OPT_BIT_DATE_WRITTEN;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateWritten")
    public final Builder dateWritten(Optional<? extends DateTime> dateWritten) {
      checkNotIsSet(dateWrittenIsSet(), "dateWritten");
      this.dateWritten = dateWritten.orElse(null);
      optBits |= OPT_BIT_DATE_WRITTEN;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
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
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
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
     * Builds a new {@link VisionPrescription VisionPrescription}.
     * @return An immutable instance of VisionPrescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VisionPrescription build() {
      checkRequiredAttributes();
      return new ImmutableVisionPrescription(
          text,
          contained,
          encounter,
          meta,
          identifier,
          prescriber,
          extension,
          modifierExtension,
          implicitRules,
          created,
          resourceType,
          id,
          patient,
          status,
          createUnmodifiableList(true, lensSpecification),
          dateWritten,
          language);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean dateWrittenIsSet() {
      return (optBits & OPT_BIT_DATE_WRITTEN) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
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
      if (isSet) throw new IllegalStateException("Builder of VisionPrescription is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!prescriberIsSet()) attributes.add("prescriber");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build VisionPrescription, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "VisionPrescription", generator = "Immutables")
  public interface PrescriberBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription#prescriber() prescriber} attribute.
     * @param prescriber The value for prescriber 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage prescriber(Reference prescriber);
  }

  @Generated(from = "VisionPrescription", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "VisionPrescription", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "VisionPrescription", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link VisionPrescription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link VisionPrescription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link VisionPrescription#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link VisionPrescription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link VisionPrescription#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link VisionPrescription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link VisionPrescription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link VisionPrescription#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link VisionPrescription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link VisionPrescription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Adds one element to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param element A lensSpecification element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addLensSpecification(VisionPrescription_LensSpecification element);

    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An array of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addLensSpecification(VisionPrescription_LensSpecification... elements);

    /**
     * Adds elements to {@link VisionPrescription#lensSpecification() lensSpecification} list.
     * @param elements An iterable of lensSpecification elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllLensSpecification(Iterable<? extends VisionPrescription_LensSpecification> elements);

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateWritten(DateTime dateWritten);

    /**
     * Initializes the optional value {@link VisionPrescription#dateWritten() dateWritten} to dateWritten.
     * @param dateWritten The value for dateWritten
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateWritten(Optional<? extends DateTime> dateWritten);

    /**
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link VisionPrescription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Builds a new {@link VisionPrescription VisionPrescription}.
     * @return An immutable instance of VisionPrescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VisionPrescription build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
