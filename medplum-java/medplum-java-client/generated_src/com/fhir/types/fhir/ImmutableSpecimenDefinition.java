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
 * Immutable implementation of {@link SpecimenDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimenDefinition.builder()}.
 */
@Generated(from = "SpecimenDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimenDefinition implements SpecimenDefinition {
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String timeAspect;
  private final @Nullable Narrative text;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept typeCollected;
  private final @Nullable List<CodeableConcept> collection;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier identifier;
  private final @Nullable List<CodeableConcept> patientPreparation;
  private final String resourceType;
  private final @Nullable List<SpecimenDefinition_TypeTested> typeTested;

  private ImmutableSpecimenDefinition(
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable String timeAspect,
      @Nullable Narrative text,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept typeCollected,
      @Nullable List<CodeableConcept> collection,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable Identifier identifier,
      @Nullable List<CodeableConcept> patientPreparation,
      String resourceType,
      @Nullable List<SpecimenDefinition_TypeTested> typeTested) {
    this.language = language;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.timeAspect = timeAspect;
    this.text = text;
    this.implicitRules = implicitRules;
    this.typeCollected = typeCollected;
    this.collection = collection;
    this.id = id;
    this.meta = meta;
    this.extension = extension;
    this.identifier = identifier;
    this.patientPreparation = patientPreparation;
    this.resourceType = resourceType;
    this.typeTested = typeTested;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code timeAspect} attribute
   */
  @JsonProperty("timeAspect")
  @Override
  public Optional<String> timeAspect() {
    return Optional.ofNullable(timeAspect);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code typeCollected} attribute
   */
  @JsonProperty("typeCollected")
  @Override
  public Optional<CodeableConcept> typeCollected() {
    return Optional.ofNullable(typeCollected);
  }

  /**
   * @return The value of the {@code collection} attribute
   */
  @JsonProperty("collection")
  @Override
  public Optional<List<CodeableConcept>> collection() {
    return Optional.ofNullable(collection);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code patientPreparation} attribute
   */
  @JsonProperty("patientPreparation")
  @Override
  public Optional<List<CodeableConcept>> patientPreparation() {
    return Optional.ofNullable(patientPreparation);
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
   * @return The value of the {@code typeTested} attribute
   */
  @JsonProperty("typeTested")
  @Override
  public Optional<List<SpecimenDefinition_TypeTested>> typeTested() {
    return Optional.ofNullable(typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSpecimenDefinition(
        newValue,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSpecimenDefinition(
        value,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        newValue,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        value,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        newValue,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        value,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#timeAspect() timeAspect} attribute.
   * @param value The value for timeAspect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTimeAspect(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timeAspect");
    if (Objects.equals(this.timeAspect, newValue)) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        newValue,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#timeAspect() timeAspect} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeAspect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTimeAspect(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timeAspect, value)) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        value,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        newValue,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        value,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        newValue,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        value,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#typeCollected() typeCollected} attribute.
   * @param value The value for typeCollected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTypeCollected(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "typeCollected");
    if (this.typeCollected == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        newValue,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#typeCollected() typeCollected} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeCollected
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withTypeCollected(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.typeCollected == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        value,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#collection() collection} attribute.
   * @param value The value for collection
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withCollection(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "collection");
    if (this.collection == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        newValue,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#collection() collection} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collection
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withCollection(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.collection == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        value,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        newValue,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        value,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        newValue,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        value,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        newValue,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        value,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        newValue,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        value,
        this.patientPreparation,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#patientPreparation() patientPreparation} attribute.
   * @param value The value for patientPreparation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withPatientPreparation(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "patientPreparation");
    if (this.patientPreparation == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        newValue,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#patientPreparation() patientPreparation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientPreparation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withPatientPreparation(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.patientPreparation == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        value,
        this.resourceType,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecimenDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecimenDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        newValue,
        this.typeTested);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition#typeTested() typeTested} attribute.
   * @param value The value for typeTested
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition withTypeTested(List<SpecimenDefinition_TypeTested> value) {
    @Nullable List<SpecimenDefinition_TypeTested> newValue = Objects.requireNonNull(value, "typeTested");
    if (this.typeTested == newValue) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition#typeTested() typeTested} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeTested
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition withTypeTested(Optional<? extends List<SpecimenDefinition_TypeTested>> optional) {
    @Nullable List<SpecimenDefinition_TypeTested> value = optional.orElse(null);
    if (this.typeTested == value) return this;
    return new ImmutableSpecimenDefinition(
        this.language,
        this.contained,
        this.modifierExtension,
        this.timeAspect,
        this.text,
        this.implicitRules,
        this.typeCollected,
        this.collection,
        this.id,
        this.meta,
        this.extension,
        this.identifier,
        this.patientPreparation,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimenDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimenDefinition
        && equalTo((ImmutableSpecimenDefinition) another);
  }

  private boolean equalTo(ImmutableSpecimenDefinition another) {
    return Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(timeAspect, another.timeAspect)
        && Objects.equals(text, another.text)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(typeCollected, another.typeCollected)
        && Objects.equals(collection, another.collection)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(patientPreparation, another.patientPreparation)
        && resourceType.equals(another.resourceType)
        && Objects.equals(typeTested, another.typeTested);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code contained}, {@code modifierExtension}, {@code timeAspect}, {@code text}, {@code implicitRules}, {@code typeCollected}, {@code collection}, {@code id}, {@code meta}, {@code extension}, {@code identifier}, {@code patientPreparation}, {@code resourceType}, {@code typeTested}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(timeAspect);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(typeCollected);
    h += (h << 5) + Objects.hashCode(collection);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(patientPreparation);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(typeTested);
    return h;
  }

  /**
   * Prints the immutable value {@code SpecimenDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SpecimenDefinition{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (timeAspect != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timeAspect=").append(timeAspect);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (typeCollected != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("typeCollected=").append(typeCollected);
    }
    if (collection != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (patientPreparation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("patientPreparation=").append(patientPreparation);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (typeTested != null) {
      builder.append(", ");
      builder.append("typeTested=").append(typeTested);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SpecimenDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SpecimenDefinition {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> timeAspect = Optional.empty();
    boolean timeAspectIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> typeCollected = Optional.empty();
    boolean typeCollectedIsSet;
    @Nullable Optional<List<CodeableConcept>> collection = Optional.empty();
    boolean collectionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<CodeableConcept>> patientPreparation = Optional.empty();
    boolean patientPreparationIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<SpecimenDefinition_TypeTested>> typeTested = Optional.empty();
    boolean typeTestedIsSet;
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("timeAspect")
    public void setTimeAspect(Optional<String> timeAspect) {
      this.timeAspect = timeAspect;
      this.timeAspectIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("typeCollected")
    public void setTypeCollected(Optional<CodeableConcept> typeCollected) {
      this.typeCollected = typeCollected;
      this.typeCollectedIsSet = true;
    }
    @JsonProperty("collection")
    public void setCollection(Optional<List<CodeableConcept>> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("patientPreparation")
    public void setPatientPreparation(Optional<List<CodeableConcept>> patientPreparation) {
      this.patientPreparation = patientPreparation;
      this.patientPreparationIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("typeTested")
    public void setTypeTested(Optional<List<SpecimenDefinition_TypeTested>> typeTested) {
      this.typeTested = typeTested;
      this.typeTestedIsSet = true;
    }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timeAspect() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> typeCollected() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> collection() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> patientPreparation() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SpecimenDefinition_TypeTested>> typeTested() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimenDefinition fromJson(Json json) {
    ImmutableSpecimenDefinition.Builder builder = ((ImmutableSpecimenDefinition.Builder) ImmutableSpecimenDefinition.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.timeAspectIsSet) {
      builder.timeAspect(json.timeAspect);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.typeCollectedIsSet) {
      builder.typeCollected(json.typeCollected);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.patientPreparationIsSet) {
      builder.patientPreparation(json.patientPreparation);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.typeTestedIsSet) {
      builder.typeTested(json.typeTested);
    }
    return (ImmutableSpecimenDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SpecimenDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecimenDefinition instance
   */
  public static SpecimenDefinition copyOf(SpecimenDefinition instance) {
    if (instance instanceof ImmutableSpecimenDefinition) {
      return (ImmutableSpecimenDefinition) instance;
    }
    return ((ImmutableSpecimenDefinition.Builder) ImmutableSpecimenDefinition.builder())
        .language(instance.language())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .timeAspect(instance.timeAspect())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .typeCollected(instance.typeCollected())
        .collection(instance.collection())
        .id(instance.id())
        .meta(instance.meta())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .patientPreparation(instance.patientPreparation())
        .resourceType(instance.resourceType())
        .typeTested(instance.typeTested())
        .build();
  }

  /**
   * Creates a builder for {@link SpecimenDefinition SpecimenDefinition}.
   * <pre>
   * ImmutableSpecimenDefinition.builder()
   *    .language(com.fhir.types.fhir.Code) // optional {@link SpecimenDefinition#language() language}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link SpecimenDefinition#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition#modifierExtension() modifierExtension}
   *    .timeAspect(String) // optional {@link SpecimenDefinition#timeAspect() timeAspect}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link SpecimenDefinition#text() text}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link SpecimenDefinition#implicitRules() implicitRules}
   *    .typeCollected(com.fhir.types.fhir.CodeableConcept) // optional {@link SpecimenDefinition#typeCollected() typeCollected}
   *    .collection(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link SpecimenDefinition#collection() collection}
   *    .id(com.fhir.types.fhir.Id) // optional {@link SpecimenDefinition#id() id}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link SpecimenDefinition#meta() meta}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition#extension() extension}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link SpecimenDefinition#identifier() identifier}
   *    .patientPreparation(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link SpecimenDefinition#patientPreparation() patientPreparation}
   *    .resourceType(String) // required {@link SpecimenDefinition#resourceType() resourceType}
   *    .typeTested(List&amp;lt;com.fhir.types.fhir.SpecimenDefinition_TypeTested&amp;gt;) // optional {@link SpecimenDefinition#typeTested() typeTested}
   *    .build();
   * </pre>
   * @return A new SpecimenDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSpecimenDefinition.Builder();
  }

  /**
   * Builds instances of type {@link SpecimenDefinition SpecimenDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SpecimenDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_TIME_ASPECT = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_TYPE_COLLECTED = 0x40L;
    private static final long OPT_BIT_COLLECTION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_PATIENT_PREPARATION = 0x1000L;
    private static final long OPT_BIT_TYPE_TESTED = 0x2000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String timeAspect;
    private @Nullable Narrative text;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept typeCollected;
    private @Nullable List<CodeableConcept> collection;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier identifier;
    private @Nullable List<CodeableConcept> patientPreparation;
    private @Nullable String resourceType;
    private @Nullable List<SpecimenDefinition_TypeTested> typeTested;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
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
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
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
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeAspect(String timeAspect) {
      checkNotIsSet(timeAspectIsSet(), "timeAspect");
      this.timeAspect = Objects.requireNonNull(timeAspect, "timeAspect");
      optBits |= OPT_BIT_TIME_ASPECT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timeAspect")
    public final Builder timeAspect(Optional<String> timeAspect) {
      checkNotIsSet(timeAspectIsSet(), "timeAspect");
      this.timeAspect = timeAspect.orElse(null);
      optBits |= OPT_BIT_TIME_ASPECT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
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
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
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
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeCollected(CodeableConcept typeCollected) {
      checkNotIsSet(typeCollectedIsSet(), "typeCollected");
      this.typeCollected = Objects.requireNonNull(typeCollected, "typeCollected");
      optBits |= OPT_BIT_TYPE_COLLECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("typeCollected")
    public final Builder typeCollected(Optional<? extends CodeableConcept> typeCollected) {
      checkNotIsSet(typeCollectedIsSet(), "typeCollected");
      this.typeCollected = typeCollected.orElse(null);
      optBits |= OPT_BIT_TYPE_COLLECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    public final Builder collection(List<CodeableConcept> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = Objects.requireNonNull(collection, "collection");
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collection")
    public final Builder collection(Optional<? extends List<CodeableConcept>> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = collection.orElse(null);
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientPreparation(List<CodeableConcept> patientPreparation) {
      checkNotIsSet(patientPreparationIsSet(), "patientPreparation");
      this.patientPreparation = Objects.requireNonNull(patientPreparation, "patientPreparation");
      optBits |= OPT_BIT_PATIENT_PREPARATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patientPreparation")
    public final Builder patientPreparation(Optional<? extends List<CodeableConcept>> patientPreparation) {
      checkNotIsSet(patientPreparationIsSet(), "patientPreparation");
      this.patientPreparation = patientPreparation.orElse(null);
      optBits |= OPT_BIT_PATIENT_PREPARATION;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecimenDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeTested(List<SpecimenDefinition_TypeTested> typeTested) {
      checkNotIsSet(typeTestedIsSet(), "typeTested");
      this.typeTested = Objects.requireNonNull(typeTested, "typeTested");
      optBits |= OPT_BIT_TYPE_TESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("typeTested")
    public final Builder typeTested(Optional<? extends List<SpecimenDefinition_TypeTested>> typeTested) {
      checkNotIsSet(typeTestedIsSet(), "typeTested");
      this.typeTested = typeTested.orElse(null);
      optBits |= OPT_BIT_TYPE_TESTED;
      return this;
    }

    /**
     * Builds a new {@link SpecimenDefinition SpecimenDefinition}.
     * @return An immutable instance of SpecimenDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SpecimenDefinition build() {
      checkRequiredAttributes();
      return new ImmutableSpecimenDefinition(
          language,
          contained,
          modifierExtension,
          timeAspect,
          text,
          implicitRules,
          typeCollected,
          collection,
          id,
          meta,
          extension,
          identifier,
          patientPreparation,
          resourceType,
          typeTested);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean timeAspectIsSet() {
      return (optBits & OPT_BIT_TIME_ASPECT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean typeCollectedIsSet() {
      return (optBits & OPT_BIT_TYPE_COLLECTED) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean patientPreparationIsSet() {
      return (optBits & OPT_BIT_PATIENT_PREPARATION) != 0;
    }

    private boolean typeTestedIsSet() {
      return (optBits & OPT_BIT_TYPE_TESTED) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SpecimenDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SpecimenDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SpecimenDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SpecimenDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SpecimenDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SpecimenDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SpecimenDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timeAspect(String timeAspect);

    /**
     * Initializes the optional value {@link SpecimenDefinition#timeAspect() timeAspect} to timeAspect.
     * @param timeAspect The value for timeAspect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timeAspect(Optional<String> timeAspect);

    /**
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SpecimenDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SpecimenDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for chained invocation
     */
    BuildFinal typeCollected(CodeableConcept typeCollected);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeCollected() typeCollected} to typeCollected.
     * @param typeCollected The value for typeCollected
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal typeCollected(Optional<? extends CodeableConcept> typeCollected);

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    BuildFinal collection(List<CodeableConcept> collection);

    /**
     * Initializes the optional value {@link SpecimenDefinition#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal collection(Optional<? extends List<CodeableConcept>> collection);

    /**
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SpecimenDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SpecimenDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link SpecimenDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patientPreparation(List<CodeableConcept> patientPreparation);

    /**
     * Initializes the optional value {@link SpecimenDefinition#patientPreparation() patientPreparation} to patientPreparation.
     * @param patientPreparation The value for patientPreparation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patientPreparation(Optional<? extends List<CodeableConcept>> patientPreparation);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for chained invocation
     */
    BuildFinal typeTested(List<SpecimenDefinition_TypeTested> typeTested);

    /**
     * Initializes the optional value {@link SpecimenDefinition#typeTested() typeTested} to typeTested.
     * @param typeTested The value for typeTested
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal typeTested(Optional<? extends List<SpecimenDefinition_TypeTested>> typeTested);

    /**
     * Builds a new {@link SpecimenDefinition SpecimenDefinition}.
     * @return An immutable instance of SpecimenDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SpecimenDefinition build();
  }
}
