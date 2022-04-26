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
 * Immutable implementation of {@link Substance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstance.builder()}.
 */
@Generated(from = "Substance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstance implements Substance {
  private final @Nullable List<Substance_Ingredient> ingredient;
  private final @Nullable SubstanceStatus status;
  private final CodeableConcept code;
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Substance_Instance> instance;
  private final @Nullable Id id;
  private final @Nullable String description;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;

  private ImmutableSubstance(
      @Nullable List<Substance_Ingredient> ingredient,
      @Nullable SubstanceStatus status,
      CodeableConcept code,
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      @Nullable List<Substance_Instance> instance,
      @Nullable Id id,
      @Nullable String description,
      @Nullable List<Identifier> identifier,
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> category,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension,
      String resourceType) {
    this.ingredient = ingredient;
    this.status = status;
    this.code = code;
    this.text = text;
    this.contained = contained;
    this.instance = instance;
    this.id = id;
    this.description = description;
    this.identifier = identifier;
    this.meta = meta;
    this.extension = extension;
    this.category = category;
    this.implicitRules = implicitRules;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code ingredient} attribute
   */
  @JsonProperty("ingredient")
  @Override
  public Optional<List<Substance_Ingredient>> ingredient() {
    return Optional.ofNullable(ingredient);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<SubstanceStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
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
   * @return The value of the {@code instance} attribute
   */
  @JsonProperty("instance")
  @Override
  public Optional<List<Substance_Instance>> instance() {
    return Optional.ofNullable(instance);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withIngredient(List<Substance_Ingredient> value) {
    @Nullable List<Substance_Ingredient> newValue = Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableSubstance(
        newValue,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withIngredient(Optional<? extends List<Substance_Ingredient>> optional) {
    @Nullable List<Substance_Ingredient> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableSubstance(
        value,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withStatus(SubstanceStatus value) {
    @Nullable SubstanceStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        newValue,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withStatus(Optional<? extends SubstanceStatus> optional) {
    @Nullable SubstanceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        value,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Substance#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstance withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        newValue,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        newValue,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        value,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        newValue,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        value,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withInstance(List<Substance_Instance> value) {
    @Nullable List<Substance_Instance> newValue = Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        newValue,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withInstance(Optional<? extends List<Substance_Instance>> optional) {
    @Nullable List<Substance_Instance> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        value,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        newValue,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        value,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        newValue,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        value,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        newValue,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        value,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        newValue,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        value,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        newValue,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        value,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        newValue,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        value,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        newValue,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        value,
        this.language,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Substance#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstance withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstance(
        this.ingredient,
        this.status,
        this.code,
        this.text,
        this.contained,
        this.instance,
        this.id,
        this.description,
        this.identifier,
        this.meta,
        this.extension,
        this.category,
        this.implicitRules,
        this.language,
        this.modifierExtension,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstance
        && equalTo((ImmutableSubstance) another);
  }

  private boolean equalTo(ImmutableSubstance another) {
    return Objects.equals(ingredient, another.ingredient)
        && Objects.equals(status, another.status)
        && code.equals(another.code)
        && Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && Objects.equals(instance, another.instance)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(category, another.category)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code ingredient}, {@code status}, {@code code}, {@code text}, {@code contained}, {@code instance}, {@code id}, {@code description}, {@code identifier}, {@code meta}, {@code extension}, {@code category}, {@code implicitRules}, {@code language}, {@code modifierExtension}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(ingredient);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(instance);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Substance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Substance{");
    if (ingredient != null) {
      builder.append("ingredient=").append(ingredient);
    }
    if (status != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("code=").append(code);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (instance != null) {
      builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Substance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Substance {
    @Nullable Optional<List<Substance_Ingredient>> ingredient = Optional.empty();
    boolean ingredientIsSet;
    @Nullable Optional<SubstanceStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Substance_Instance>> instance = Optional.empty();
    boolean instanceIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @JsonProperty("ingredient")
    public void setIngredient(Optional<List<Substance_Ingredient>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SubstanceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
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
    @JsonProperty("instance")
    public void setInstance(Optional<List<Substance_Instance>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<List<Substance_Ingredient>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Substance_Instance>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstance fromJson(Json json) {
    ImmutableSubstance.Builder builder = ((ImmutableSubstance.Builder) ImmutableSubstance.builder());
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableSubstance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Substance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Substance instance
   */
  public static Substance copyOf(Substance instance) {
    if (instance instanceof ImmutableSubstance) {
      return (ImmutableSubstance) instance;
    }
    return ((ImmutableSubstance.Builder) ImmutableSubstance.builder())
        .ingredient(instance.ingredient())
        .status(instance.status())
        .code(instance.code())
        .text(instance.text())
        .contained(instance.contained())
        .instance(instance.instance())
        .id(instance.id())
        .description(instance.description())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .extension(instance.extension())
        .category(instance.category())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link Substance Substance}.
   * <pre>
   * ImmutableSubstance.builder()
   *    .ingredient(List&amp;lt;com.fhir.types.fhir.Substance_Ingredient&amp;gt;) // optional {@link Substance#ingredient() ingredient}
   *    .status(com.fhir.types.fhir.SubstanceStatus) // optional {@link Substance#status() status}
   *    .code(com.fhir.types.fhir.CodeableConcept) // required {@link Substance#code() code}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Substance#text() text}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Substance#contained() contained}
   *    .instance(List&amp;lt;com.fhir.types.fhir.Substance_Instance&amp;gt;) // optional {@link Substance#instance() instance}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Substance#id() id}
   *    .description(String) // optional {@link Substance#description() description}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Substance#identifier() identifier}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Substance#meta() meta}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Substance#extension() extension}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Substance#category() category}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Substance#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Substance#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Substance#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link Substance#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new Substance builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableSubstance.Builder();
  }

  /**
   * Builds instances of type {@link Substance Substance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Substance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_INGREDIENT = 0x1L;
    private static final long OPT_BIT_STATUS = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_INSTANCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_CATEGORY = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Substance_Ingredient> ingredient;
    private @Nullable SubstanceStatus status;
    private @Nullable CodeableConcept code;
    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Substance_Instance> instance;
    private @Nullable Id id;
    private @Nullable String description;
    private @Nullable List<Identifier> identifier;
    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> category;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Substance#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    public final Builder ingredient(List<Substance_Ingredient> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = Objects.requireNonNull(ingredient, "ingredient");
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ingredient")
    public final Builder ingredient(Optional<? extends List<Substance_Ingredient>> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = ingredient.orElse(null);
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SubstanceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SubstanceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link Substance#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#text() text} to text.
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
     * Initializes the optional value {@link Substance#text() text} to text.
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
     * Initializes the optional value {@link Substance#contained() contained} to contained.
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
     * Initializes the optional value {@link Substance#contained() contained} to contained.
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
     * Initializes the optional value {@link Substance#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(List<Substance_Instance> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instance")
    public final Builder instance(Optional<? extends List<Substance_Instance>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#id() id} to id.
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
     * Initializes the optional value {@link Substance#id() id} to id.
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
     * Initializes the optional value {@link Substance#description() description} to description.
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
     * Initializes the optional value {@link Substance#description() description} to description.
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
     * Initializes the optional value {@link Substance#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Substance#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Substance#meta() meta} to meta.
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
     * Initializes the optional value {@link Substance#meta() meta} to meta.
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
     * Initializes the optional value {@link Substance#extension() extension} to extension.
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
     * Initializes the optional value {@link Substance#extension() extension} to extension.
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
     * Initializes the optional value {@link Substance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Substance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Substance#language() language} to language.
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
     * Initializes the optional value {@link Substance#language() language} to language.
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
     * Initializes the optional value {@link Substance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Substance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Substance#resourceType() resourceType} attribute.
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
     * Builds a new {@link Substance Substance}.
     * @return An immutable instance of Substance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Substance build() {
      checkRequiredAttributes();
      return new ImmutableSubstance(
          ingredient,
          status,
          code,
          text,
          contained,
          instance,
          id,
          description,
          identifier,
          meta,
          extension,
          category,
          implicitRules,
          language,
          modifierExtension,
          resourceType);
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Substance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Substance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Substance", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link Substance#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage code(CodeableConcept code);
  }

  @Generated(from = "Substance", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Substance#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Substance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Substance#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(List<Substance_Ingredient> ingredient);

    /**
     * Initializes the optional value {@link Substance#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(Optional<? extends List<Substance_Ingredient>> ingredient);

    /**
     * Initializes the optional value {@link Substance#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SubstanceStatus status);

    /**
     * Initializes the optional value {@link Substance#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SubstanceStatus> status);

    /**
     * Initializes the optional value {@link Substance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Substance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Substance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Substance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Substance#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(List<Substance_Instance> instance);

    /**
     * Initializes the optional value {@link Substance#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(Optional<? extends List<Substance_Instance>> instance);

    /**
     * Initializes the optional value {@link Substance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Substance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Substance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Substance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link Substance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Substance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Substance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Substance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Substance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Substance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Substance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Substance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Substance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Substance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Substance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Substance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Substance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Substance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Substance Substance}.
     * @return An immutable instance of Substance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Substance build();
  }
}
