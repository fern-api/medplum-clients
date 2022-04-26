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
 * Immutable implementation of {@link SubstanceProtein}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceProtein.builder()}.
 */
@Generated(from = "SubstanceProtein", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceProtein implements SubstanceProtein {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Integer numberOfSubunits;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept sequenceType;
  private final @Nullable List<String> disulfideLinkage;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<SubstanceProtein_Subunit> subunit;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable Id id;

  private ImmutableSubstanceProtein(
      @Nullable List<ResourceList> contained,
      @Nullable Integer numberOfSubunits,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept sequenceType,
      @Nullable List<String> disulfideLinkage,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable List<SubstanceProtein_Subunit> subunit,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable Id id) {
    this.contained = contained;
    this.numberOfSubunits = numberOfSubunits;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.sequenceType = sequenceType;
    this.disulfideLinkage = disulfideLinkage;
    this.resourceType = resourceType;
    this.extension = extension;
    this.subunit = subunit;
    this.language = language;
    this.text = text;
    this.id = id;
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
   * @return The value of the {@code numberOfSubunits} attribute
   */
  @JsonProperty("numberOfSubunits")
  @Override
  public Optional<Integer> numberOfSubunits() {
    return Optional.ofNullable(numberOfSubunits);
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
   * @return The value of the {@code sequenceType} attribute
   */
  @JsonProperty("sequenceType")
  @Override
  public Optional<CodeableConcept> sequenceType() {
    return Optional.ofNullable(sequenceType);
  }

  /**
   * @return The value of the {@code disulfideLinkage} attribute
   */
  @JsonProperty("disulfideLinkage")
  @Override
  public Optional<List<String>> disulfideLinkage() {
    return Optional.ofNullable(disulfideLinkage);
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
   * @return The value of the {@code subunit} attribute
   */
  @JsonProperty("subunit")
  @Override
  public Optional<List<SubstanceProtein_Subunit>> subunit() {
    return Optional.ofNullable(subunit);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceProtein(
        newValue,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceProtein(
        value,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#numberOfSubunits() numberOfSubunits} attribute.
   * @param value The value for numberOfSubunits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withNumberOfSubunits(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.numberOfSubunits, newValue)) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        newValue,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#numberOfSubunits() numberOfSubunits} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfSubunits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withNumberOfSubunits(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.numberOfSubunits, value)) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        value,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        newValue,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        value,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        newValue,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        value,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#sequenceType() sequenceType} attribute.
   * @param value The value for sequenceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withSequenceType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "sequenceType");
    if (this.sequenceType == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#sequenceType() sequenceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequenceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withSequenceType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.sequenceType == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#disulfideLinkage() disulfideLinkage} attribute.
   * @param value The value for disulfideLinkage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withDisulfideLinkage(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "disulfideLinkage");
    if (this.disulfideLinkage == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        newValue,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#disulfideLinkage() disulfideLinkage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disulfideLinkage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withDisulfideLinkage(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.disulfideLinkage == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        value,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceProtein#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceProtein withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        newValue,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        newValue,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        value,
        this.subunit,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#subunit() subunit} attribute.
   * @param value The value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withSubunit(List<SubstanceProtein_Subunit> value) {
    @Nullable List<SubstanceProtein_Subunit> newValue = Objects.requireNonNull(value, "subunit");
    if (this.subunit == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        newValue,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#subunit() subunit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subunit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withSubunit(Optional<? extends List<SubstanceProtein_Subunit>> optional) {
    @Nullable List<SubstanceProtein_Subunit> value = optional.orElse(null);
    if (this.subunit == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        value,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        newValue,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        value,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceProtein(
        this.contained,
        this.numberOfSubunits,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.sequenceType,
        this.disulfideLinkage,
        this.resourceType,
        this.extension,
        this.subunit,
        this.language,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceProtein} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceProtein
        && equalTo((ImmutableSubstanceProtein) another);
  }

  private boolean equalTo(ImmutableSubstanceProtein another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(numberOfSubunits, another.numberOfSubunits)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(sequenceType, another.sequenceType)
        && Objects.equals(disulfideLinkage, another.disulfideLinkage)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(subunit, another.subunit)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code numberOfSubunits}, {@code meta}, {@code modifierExtension}, {@code implicitRules}, {@code sequenceType}, {@code disulfideLinkage}, {@code resourceType}, {@code extension}, {@code subunit}, {@code language}, {@code text}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(numberOfSubunits);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(sequenceType);
    h += (h << 5) + Objects.hashCode(disulfideLinkage);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(subunit);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceProtein} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceProtein{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (numberOfSubunits != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("numberOfSubunits=").append(numberOfSubunits);
    }
    if (meta != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (sequenceType != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("sequenceType=").append(sequenceType);
    }
    if (disulfideLinkage != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("disulfideLinkage=").append(disulfideLinkage);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (subunit != null) {
      builder.append(", ");
      builder.append("subunit=").append(subunit);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
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
  @Generated(from = "SubstanceProtein", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceProtein {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Integer> numberOfSubunits = Optional.empty();
    boolean numberOfSubunitsIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> sequenceType = Optional.empty();
    boolean sequenceTypeIsSet;
    @Nullable Optional<List<String>> disulfideLinkage = Optional.empty();
    boolean disulfideLinkageIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<SubstanceProtein_Subunit>> subunit = Optional.empty();
    boolean subunitIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("numberOfSubunits")
    public void setNumberOfSubunits(Optional<Integer> numberOfSubunits) {
      this.numberOfSubunits = numberOfSubunits;
      this.numberOfSubunitsIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @JsonProperty("sequenceType")
    public void setSequenceType(Optional<CodeableConcept> sequenceType) {
      this.sequenceType = sequenceType;
      this.sequenceTypeIsSet = true;
    }
    @JsonProperty("disulfideLinkage")
    public void setDisulfideLinkage(Optional<List<String>> disulfideLinkage) {
      this.disulfideLinkage = disulfideLinkage;
      this.disulfideLinkageIsSet = true;
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
    @JsonProperty("subunit")
    public void setSubunit(Optional<List<SubstanceProtein_Subunit>> subunit) {
      this.subunit = subunit;
      this.subunitIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> numberOfSubunits() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> sequenceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> disulfideLinkage() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceProtein_Subunit>> subunit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceProtein fromJson(Json json) {
    ImmutableSubstanceProtein.Builder builder = ((ImmutableSubstanceProtein.Builder) ImmutableSubstanceProtein.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.numberOfSubunitsIsSet) {
      builder.numberOfSubunits(json.numberOfSubunits);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.sequenceTypeIsSet) {
      builder.sequenceType(json.sequenceType);
    }
    if (json.disulfideLinkageIsSet) {
      builder.disulfideLinkage(json.disulfideLinkage);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subunitIsSet) {
      builder.subunit(json.subunit);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableSubstanceProtein) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceProtein} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceProtein instance
   */
  public static SubstanceProtein copyOf(SubstanceProtein instance) {
    if (instance instanceof ImmutableSubstanceProtein) {
      return (ImmutableSubstanceProtein) instance;
    }
    return ((ImmutableSubstanceProtein.Builder) ImmutableSubstanceProtein.builder())
        .contained(instance.contained())
        .numberOfSubunits(instance.numberOfSubunits())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .sequenceType(instance.sequenceType())
        .disulfideLinkage(instance.disulfideLinkage())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .subunit(instance.subunit())
        .language(instance.language())
        .text(instance.text())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceProtein SubstanceProtein}.
   * <pre>
   * ImmutableSubstanceProtein.builder()
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link SubstanceProtein#contained() contained}
   *    .numberOfSubunits(Integer) // optional {@link SubstanceProtein#numberOfSubunits() numberOfSubunits}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link SubstanceProtein#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceProtein#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link SubstanceProtein#implicitRules() implicitRules}
   *    .sequenceType(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceProtein#sequenceType() sequenceType}
   *    .disulfideLinkage(List&amp;lt;String&amp;gt;) // optional {@link SubstanceProtein#disulfideLinkage() disulfideLinkage}
   *    .resourceType(String) // required {@link SubstanceProtein#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceProtein#extension() extension}
   *    .subunit(List&amp;lt;com.fhir.types.fhir.SubstanceProtein_Subunit&amp;gt;) // optional {@link SubstanceProtein#subunit() subunit}
   *    .language(com.fhir.types.fhir.Code) // optional {@link SubstanceProtein#language() language}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link SubstanceProtein#text() text}
   *    .id(com.fhir.types.fhir.Id) // optional {@link SubstanceProtein#id() id}
   *    .build();
   * </pre>
   * @return A new SubstanceProtein builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstanceProtein.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceProtein SubstanceProtein}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceProtein", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_NUMBER_OF_SUBUNITS = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_SEQUENCE_TYPE = 0x20L;
    private static final long OPT_BIT_DISULFIDE_LINKAGE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_SUBUNIT = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable Integer numberOfSubunits;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept sequenceType;
    private @Nullable List<String> disulfideLinkage;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable List<SubstanceProtein_Subunit> subunit;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable Id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceProtein#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceProtein#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfSubunits(int numberOfSubunits) {
      checkNotIsSet(numberOfSubunitsIsSet(), "numberOfSubunits");
      this.numberOfSubunits = numberOfSubunits;
      optBits |= OPT_BIT_NUMBER_OF_SUBUNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfSubunits")
    public final Builder numberOfSubunits(Optional<Integer> numberOfSubunits) {
      checkNotIsSet(numberOfSubunitsIsSet(), "numberOfSubunits");
      this.numberOfSubunits = numberOfSubunits.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_SUBUNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceProtein#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceProtein#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceProtein#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceProtein#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceProtein#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceProtein#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequenceType(CodeableConcept sequenceType) {
      checkNotIsSet(sequenceTypeIsSet(), "sequenceType");
      this.sequenceType = Objects.requireNonNull(sequenceType, "sequenceType");
      optBits |= OPT_BIT_SEQUENCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequenceType")
    public final Builder sequenceType(Optional<? extends CodeableConcept> sequenceType) {
      checkNotIsSet(sequenceTypeIsSet(), "sequenceType");
      this.sequenceType = sequenceType.orElse(null);
      optBits |= OPT_BIT_SEQUENCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#disulfideLinkage() disulfideLinkage} to disulfideLinkage.
     * @param disulfideLinkage The value for disulfideLinkage
     * @return {@code this} builder for chained invocation
     */
    public final Builder disulfideLinkage(List<String> disulfideLinkage) {
      checkNotIsSet(disulfideLinkageIsSet(), "disulfideLinkage");
      this.disulfideLinkage = Objects.requireNonNull(disulfideLinkage, "disulfideLinkage");
      optBits |= OPT_BIT_DISULFIDE_LINKAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#disulfideLinkage() disulfideLinkage} to disulfideLinkage.
     * @param disulfideLinkage The value for disulfideLinkage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("disulfideLinkage")
    public final Builder disulfideLinkage(Optional<? extends List<String>> disulfideLinkage) {
      checkNotIsSet(disulfideLinkageIsSet(), "disulfideLinkage");
      this.disulfideLinkage = disulfideLinkage.orElse(null);
      optBits |= OPT_BIT_DISULFIDE_LINKAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstanceProtein#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstanceProtein#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceProtein#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceProtein#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    public final Builder subunit(List<SubstanceProtein_Subunit> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = Objects.requireNonNull(subunit, "subunit");
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subunit")
    public final Builder subunit(Optional<? extends List<SubstanceProtein_Subunit>> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit.orElse(null);
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein#language() language} to language.
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
     * Initializes the optional value {@link SubstanceProtein#language() language} to language.
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
     * Initializes the optional value {@link SubstanceProtein#text() text} to text.
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
     * Initializes the optional value {@link SubstanceProtein#text() text} to text.
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
     * Initializes the optional value {@link SubstanceProtein#id() id} to id.
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
     * Initializes the optional value {@link SubstanceProtein#id() id} to id.
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
     * Builds a new {@link SubstanceProtein SubstanceProtein}.
     * @return An immutable instance of SubstanceProtein
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceProtein build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceProtein(
          contained,
          numberOfSubunits,
          meta,
          modifierExtension,
          implicitRules,
          sequenceType,
          disulfideLinkage,
          resourceType,
          extension,
          subunit,
          language,
          text,
          id);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean numberOfSubunitsIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_SUBUNITS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean sequenceTypeIsSet() {
      return (optBits & OPT_BIT_SEQUENCE_TYPE) != 0;
    }

    private boolean disulfideLinkageIsSet() {
      return (optBits & OPT_BIT_DISULFIDE_LINKAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subunitIsSet() {
      return (optBits & OPT_BIT_SUBUNIT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceProtein is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceProtein, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SubstanceProtein", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceProtein#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SubstanceProtein", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceProtein#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceProtein#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceProtein#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfSubunits(int numberOfSubunits);

    /**
     * Initializes the optional value {@link SubstanceProtein#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfSubunits(Optional<Integer> numberOfSubunits);

    /**
     * Initializes the optional value {@link SubstanceProtein#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SubstanceProtein#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceProtein#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceProtein#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceProtein#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceProtein#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceProtein#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequenceType(CodeableConcept sequenceType);

    /**
     * Initializes the optional value {@link SubstanceProtein#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequenceType(Optional<? extends CodeableConcept> sequenceType);

    /**
     * Initializes the optional value {@link SubstanceProtein#disulfideLinkage() disulfideLinkage} to disulfideLinkage.
     * @param disulfideLinkage The value for disulfideLinkage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disulfideLinkage(List<String> disulfideLinkage);

    /**
     * Initializes the optional value {@link SubstanceProtein#disulfideLinkage() disulfideLinkage} to disulfideLinkage.
     * @param disulfideLinkage The value for disulfideLinkage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disulfideLinkage(Optional<? extends List<String>> disulfideLinkage);

    /**
     * Initializes the optional value {@link SubstanceProtein#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceProtein#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceProtein#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subunit(List<SubstanceProtein_Subunit> subunit);

    /**
     * Initializes the optional value {@link SubstanceProtein#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subunit(Optional<? extends List<SubstanceProtein_Subunit>> subunit);

    /**
     * Initializes the optional value {@link SubstanceProtein#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SubstanceProtein#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SubstanceProtein#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SubstanceProtein#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceProtein#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SubstanceProtein#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link SubstanceProtein SubstanceProtein}.
     * @return An immutable instance of SubstanceProtein
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceProtein build();
  }
}
