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
 * Immutable implementation of {@link BodyStructure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBodyStructure.builder()}.
 */
@Generated(from = "BodyStructure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBodyStructure implements BodyStructure {
  private final @Nullable List<Identifier> identifier;
  private final @Nullable CodeableConcept morphology;
  private final @Nullable List<CodeableConcept> locationQualifier;
  private final @Nullable String description;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Attachment> image;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean active;
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final Reference patient;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept location;
  private final @Nullable Id id;
  private final @Nullable Meta meta;

  private ImmutableBodyStructure(
      @Nullable List<Identifier> identifier,
      @Nullable CodeableConcept morphology,
      @Nullable List<CodeableConcept> locationQualifier,
      @Nullable String description,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Attachment> image,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Boolean active,
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      Reference patient,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept location,
      @Nullable Id id,
      @Nullable Meta meta) {
    this.identifier = identifier;
    this.morphology = morphology;
    this.locationQualifier = locationQualifier;
    this.description = description;
    this.implicitRules = implicitRules;
    this.language = language;
    this.image = image;
    this.resourceType = resourceType;
    this.extension = extension;
    this.active = active;
    this.text = text;
    this.contained = contained;
    this.patient = patient;
    this.modifierExtension = modifierExtension;
    this.location = location;
    this.id = id;
    this.meta = meta;
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
   * @return The value of the {@code morphology} attribute
   */
  @JsonProperty("morphology")
  @Override
  public Optional<CodeableConcept> morphology() {
    return Optional.ofNullable(morphology);
  }

  /**
   * @return The value of the {@code locationQualifier} attribute
   */
  @JsonProperty("locationQualifier")
  @Override
  public Optional<List<CodeableConcept>> locationQualifier() {
    return Optional.ofNullable(locationQualifier);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code image} attribute
   */
  @JsonProperty("image")
  @Override
  public Optional<List<Attachment>> image() {
    return Optional.ofNullable(image);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
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
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
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
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<CodeableConcept> location() {
    return Optional.ofNullable(location);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableBodyStructure(
        newValue,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableBodyStructure(
        value,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#morphology() morphology} attribute.
   * @param value The value for morphology
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withMorphology(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "morphology");
    if (this.morphology == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        newValue,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#morphology() morphology} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for morphology
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withMorphology(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.morphology == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        value,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#locationQualifier() locationQualifier} attribute.
   * @param value The value for locationQualifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withLocationQualifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "locationQualifier");
    if (this.locationQualifier == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        newValue,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#locationQualifier() locationQualifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationQualifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withLocationQualifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.locationQualifier == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        value,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        newValue,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        value,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        newValue,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        value,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        newValue,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        value,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#image() image} attribute.
   * @param value The value for image
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withImage(List<Attachment> value) {
    @Nullable List<Attachment> newValue = Objects.requireNonNull(value, "image");
    if (this.image == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        newValue,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#image() image} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for image
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withImage(Optional<? extends List<Attachment>> optional) {
    @Nullable List<Attachment> value = optional.orElse(null);
    if (this.image == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        value,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BodyStructure#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBodyStructure withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        newValue,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        newValue,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        value,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        newValue,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        value,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        newValue,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        value,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        newValue,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        value,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BodyStructure#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBodyStructure withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        newValue,
        this.modifierExtension,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        newValue,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        value,
        this.location,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withLocation(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        newValue,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withLocation(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        value,
        this.id,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BodyStructure#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBodyStructure withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BodyStructure#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBodyStructure withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBodyStructure(
        this.identifier,
        this.morphology,
        this.locationQualifier,
        this.description,
        this.implicitRules,
        this.language,
        this.image,
        this.resourceType,
        this.extension,
        this.active,
        this.text,
        this.contained,
        this.patient,
        this.modifierExtension,
        this.location,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBodyStructure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBodyStructure
        && equalTo((ImmutableBodyStructure) another);
  }

  private boolean equalTo(ImmutableBodyStructure another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(morphology, another.morphology)
        && Objects.equals(locationQualifier, another.locationQualifier)
        && Objects.equals(description, another.description)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(image, another.image)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(active, another.active)
        && Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && patient.equals(another.patient)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(location, another.location)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code morphology}, {@code locationQualifier}, {@code description}, {@code implicitRules}, {@code language}, {@code image}, {@code resourceType}, {@code extension}, {@code active}, {@code text}, {@code contained}, {@code patient}, {@code modifierExtension}, {@code location}, {@code id}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(morphology);
    h += (h << 5) + Objects.hashCode(locationQualifier);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(image);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code BodyStructure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("BodyStructure{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (morphology != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("morphology=").append(morphology);
    }
    if (locationQualifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("locationQualifier=").append(locationQualifier);
    }
    if (description != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (implicitRules != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (image != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("image=").append(image);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BodyStructure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BodyStructure {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> morphology = Optional.empty();
    boolean morphologyIsSet;
    @Nullable Optional<List<CodeableConcept>> locationQualifier = Optional.empty();
    boolean locationQualifierIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Attachment>> image = Optional.empty();
    boolean imageIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Reference patient;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("morphology")
    public void setMorphology(Optional<CodeableConcept> morphology) {
      this.morphology = morphology;
      this.morphologyIsSet = true;
    }
    @JsonProperty("locationQualifier")
    public void setLocationQualifier(Optional<List<CodeableConcept>> locationQualifier) {
      this.locationQualifier = locationQualifier;
      this.locationQualifierIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("image")
    public void setImage(Optional<List<Attachment>> image) {
      this.image = image;
      this.imageIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
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
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<CodeableConcept> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> morphology() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> locationQualifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Attachment>> image() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBodyStructure fromJson(Json json) {
    ImmutableBodyStructure.Builder builder = ((ImmutableBodyStructure.Builder) ImmutableBodyStructure.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.morphologyIsSet) {
      builder.morphology(json.morphology);
    }
    if (json.locationQualifierIsSet) {
      builder.locationQualifier(json.locationQualifier);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.imageIsSet) {
      builder.image(json.image);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
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
        .identifier(instance.identifier())
        .morphology(instance.morphology())
        .locationQualifier(instance.locationQualifier())
        .description(instance.description())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .image(instance.image())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .active(instance.active())
        .text(instance.text())
        .contained(instance.contained())
        .patient(instance.patient())
        .modifierExtension(instance.modifierExtension())
        .location(instance.location())
        .id(instance.id())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link BodyStructure BodyStructure}.
   * <pre>
   * ImmutableBodyStructure.builder()
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link BodyStructure#identifier() identifier}
   *    .morphology(com.fhir.types.fhir.CodeableConcept) // optional {@link BodyStructure#morphology() morphology}
   *    .locationQualifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link BodyStructure#locationQualifier() locationQualifier}
   *    .description(String) // optional {@link BodyStructure#description() description}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link BodyStructure#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link BodyStructure#language() language}
   *    .image(List&amp;lt;com.fhir.types.fhir.Attachment&amp;gt;) // optional {@link BodyStructure#image() image}
   *    .resourceType(String) // required {@link BodyStructure#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link BodyStructure#extension() extension}
   *    .active(Boolean) // optional {@link BodyStructure#active() active}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link BodyStructure#text() text}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link BodyStructure#contained() contained}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link BodyStructure#patient() patient}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link BodyStructure#modifierExtension() modifierExtension}
   *    .location(com.fhir.types.fhir.CodeableConcept) // optional {@link BodyStructure#location() location}
   *    .id(com.fhir.types.fhir.Id) // optional {@link BodyStructure#id() id}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link BodyStructure#meta() meta}
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
  @Generated(from = "BodyStructure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_MORPHOLOGY = 0x2L;
    private static final long OPT_BIT_LOCATION_QUALIFIER = 0x4L;
    private static final long OPT_BIT_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_IMAGE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ACTIVE = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_LOCATION = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable CodeableConcept morphology;
    private @Nullable List<CodeableConcept> locationQualifier;
    private @Nullable String description;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Attachment> image;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean active;
    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference patient;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept location;
    private @Nullable Id id;
    private @Nullable Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for chained invocation
     */
    public final Builder morphology(CodeableConcept morphology) {
      checkNotIsSet(morphologyIsSet(), "morphology");
      this.morphology = Objects.requireNonNull(morphology, "morphology");
      optBits |= OPT_BIT_MORPHOLOGY;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("morphology")
    public final Builder morphology(Optional<? extends CodeableConcept> morphology) {
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
    public final Builder locationQualifier(List<CodeableConcept> locationQualifier) {
      checkNotIsSet(locationQualifierIsSet(), "locationQualifier");
      this.locationQualifier = Objects.requireNonNull(locationQualifier, "locationQualifier");
      optBits |= OPT_BIT_LOCATION_QUALIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationQualifier")
    public final Builder locationQualifier(Optional<? extends List<CodeableConcept>> locationQualifier) {
      checkNotIsSet(locationQualifierIsSet(), "locationQualifier");
      this.locationQualifier = locationQualifier.orElse(null);
      optBits |= OPT_BIT_LOCATION_QUALIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link BodyStructure#language() language} to language.
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
     * Initializes the optional value {@link BodyStructure#language() language} to language.
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
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for chained invocation
     */
    public final Builder image(List<Attachment> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = Objects.requireNonNull(image, "image");
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("image")
    public final Builder image(Optional<? extends List<Attachment>> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = image.orElse(null);
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link BodyStructure#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
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
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#text() text} to text.
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
     * Initializes the optional value {@link BodyStructure#text() text} to text.
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
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
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
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
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
     * Initializes the value for the {@link BodyStructure#patient() patient} attribute.
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
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(CodeableConcept location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends CodeableConcept> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BodyStructure#id() id} to id.
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
     * Initializes the optional value {@link BodyStructure#id() id} to id.
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
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
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
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
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
     * Builds a new {@link BodyStructure BodyStructure}.
     * @return An immutable instance of BodyStructure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public BodyStructure build() {
      checkRequiredAttributes();
      return new ImmutableBodyStructure(
          identifier,
          morphology,
          locationQualifier,
          description,
          implicitRules,
          language,
          image,
          resourceType,
          extension,
          active,
          text,
          contained,
          patient,
          modifierExtension,
          location,
          id,
          meta);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean morphologyIsSet() {
      return (optBits & OPT_BIT_MORPHOLOGY) != 0;
    }

    private boolean locationQualifierIsSet() {
      return (optBits & OPT_BIT_LOCATION_QUALIFIER) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean imageIsSet() {
      return (optBits & OPT_BIT_IMAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of BodyStructure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build BodyStructure, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "BodyStructure", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link BodyStructure#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "BodyStructure", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link BodyStructure#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "BodyStructure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link BodyStructure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for chained invocation
     */
    BuildFinal morphology(CodeableConcept morphology);

    /**
     * Initializes the optional value {@link BodyStructure#morphology() morphology} to morphology.
     * @param morphology The value for morphology
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal morphology(Optional<? extends CodeableConcept> morphology);

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationQualifier(List<CodeableConcept> locationQualifier);

    /**
     * Initializes the optional value {@link BodyStructure#locationQualifier() locationQualifier} to locationQualifier.
     * @param locationQualifier The value for locationQualifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationQualifier(Optional<? extends List<CodeableConcept>> locationQualifier);

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link BodyStructure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link BodyStructure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link BodyStructure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link BodyStructure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for chained invocation
     */
    BuildFinal image(List<Attachment> image);

    /**
     * Initializes the optional value {@link BodyStructure#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal image(Optional<? extends List<Attachment>> image);

    /**
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link BodyStructure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link BodyStructure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link BodyStructure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link BodyStructure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link BodyStructure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(CodeableConcept location);

    /**
     * Initializes the optional value {@link BodyStructure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends CodeableConcept> location);

    /**
     * Initializes the optional value {@link BodyStructure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link BodyStructure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link BodyStructure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Builds a new {@link BodyStructure BodyStructure}.
     * @return An immutable instance of BodyStructure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    BodyStructure build();
  }
}
