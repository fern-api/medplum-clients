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
 * Immutable implementation of {@link Medication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedication.builder()}.
 */
@Generated(from = "Medication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedication implements Medication {
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept form;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Medication_Ingredient> ingredient;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code status;
  private final @Nullable Uri implicitRules;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable Ratio amount;
  private final @Nullable Reference manufacturer;
  private final @Nullable Code language;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Medication_Batch batch;
  private final @Nullable List<ResourceList> contained;
  private final String resourceType;

  private ImmutableMedication(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept form,
      @Nullable CodeableConcept code,
      @Nullable List<Medication_Ingredient> ingredient,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code status,
      @Nullable Uri implicitRules,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable Ratio amount,
      @Nullable Reference manufacturer,
      @Nullable Code language,
      @Nullable List<Identifier> identifier,
      @Nullable Medication_Batch batch,
      @Nullable List<ResourceList> contained,
      String resourceType) {
    this.extension = extension;
    this.form = form;
    this.code = code;
    this.ingredient = ingredient;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.implicitRules = implicitRules;
    this.id = id;
    this.text = text;
    this.amount = amount;
    this.manufacturer = manufacturer;
    this.language = language;
    this.identifier = identifier;
    this.batch = batch;
    this.contained = contained;
    this.resourceType = resourceType;
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
   * @return The value of the {@code form} attribute
   */
  @JsonProperty("form")
  @Override
  public Optional<CodeableConcept> form() {
    return Optional.ofNullable(form);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code ingredient} attribute
   */
  @JsonProperty("ingredient")
  @Override
  public Optional<List<Medication_Ingredient>> ingredient() {
    return Optional.ofNullable(ingredient);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<Ratio> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<Reference> manufacturer() {
    return Optional.ofNullable(manufacturer);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code batch} attribute
   */
  @JsonProperty("batch")
  @Override
  public Optional<Medication_Batch> batch() {
    return Optional.ofNullable(batch);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedication(
        newValue,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedication(
        value,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withForm(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        newValue,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withForm(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableMedication(
        this.extension,
        value,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        newValue,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        value,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#ingredient() ingredient} attribute.
   * @param value The value for ingredient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withIngredient(List<Medication_Ingredient> value) {
    @Nullable List<Medication_Ingredient> newValue = Objects.requireNonNull(value, "ingredient");
    if (this.ingredient == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        newValue,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#ingredient() ingredient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ingredient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withIngredient(Optional<? extends List<Medication_Ingredient>> optional) {
    @Nullable List<Medication_Ingredient> value = optional.orElse(null);
    if (this.ingredient == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        value,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        newValue,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        value,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        newValue,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        value,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        newValue,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        value,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        newValue,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        value,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        newValue,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        value,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withAmount(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        newValue,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withAmount(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        value,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withManufacturer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        newValue,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withManufacturer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        value,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        newValue,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        value,
        this.identifier,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        newValue,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        value,
        this.batch,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#batch() batch} attribute.
   * @param value The value for batch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withBatch(Medication_Batch value) {
    @Nullable Medication_Batch newValue = Objects.requireNonNull(value, "batch");
    if (this.batch == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        newValue,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#batch() batch} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for batch
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withBatch(Optional<? extends Medication_Batch> optional) {
    @Nullable Medication_Batch value = optional.orElse(null);
    if (this.batch == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        value,
        this.contained,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Medication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedication withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedication(
        this.extension,
        this.form,
        this.code,
        this.ingredient,
        this.meta,
        this.modifierExtension,
        this.status,
        this.implicitRules,
        this.id,
        this.text,
        this.amount,
        this.manufacturer,
        this.language,
        this.identifier,
        this.batch,
        this.contained,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedication
        && equalTo((ImmutableMedication) another);
  }

  private boolean equalTo(ImmutableMedication another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(form, another.form)
        && Objects.equals(code, another.code)
        && Objects.equals(ingredient, another.ingredient)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(amount, another.amount)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(language, another.language)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(batch, another.batch)
        && Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code form}, {@code code}, {@code ingredient}, {@code meta}, {@code modifierExtension}, {@code status}, {@code implicitRules}, {@code id}, {@code text}, {@code amount}, {@code manufacturer}, {@code language}, {@code identifier}, {@code batch}, {@code contained}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(form);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(ingredient);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(batch);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Medication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Medication{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (form != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("form=").append(form);
    }
    if (code != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (ingredient != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("ingredient=").append(ingredient);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (amount != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (manufacturer != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (batch != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("batch=").append(batch);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Medication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Medication {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> form = Optional.empty();
    boolean formIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Medication_Ingredient>> ingredient = Optional.empty();
    boolean ingredientIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Ratio> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<Reference> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Medication_Batch> batch = Optional.empty();
    boolean batchIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable String resourceType;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("form")
    public void setForm(Optional<CodeableConcept> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("ingredient")
    public void setIngredient(Optional<List<Medication_Ingredient>> ingredient) {
      this.ingredient = ingredient;
      this.ingredientIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<Ratio> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<Reference> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("batch")
    public void setBatch(Optional<Medication_Batch> batch) {
      this.batch = batch;
      this.batchIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> form() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Medication_Ingredient>> ingredient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Medication_Batch> batch() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedication fromJson(Json json) {
    ImmutableMedication.Builder builder = ((ImmutableMedication.Builder) ImmutableMedication.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.ingredientIsSet) {
      builder.ingredient(json.ingredient);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.batchIsSet) {
      builder.batch(json.batch);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableMedication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Medication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Medication instance
   */
  public static Medication copyOf(Medication instance) {
    if (instance instanceof ImmutableMedication) {
      return (ImmutableMedication) instance;
    }
    return ((ImmutableMedication.Builder) ImmutableMedication.builder())
        .extension(instance.extension())
        .form(instance.form())
        .code(instance.code())
        .ingredient(instance.ingredient())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .text(instance.text())
        .amount(instance.amount())
        .manufacturer(instance.manufacturer())
        .language(instance.language())
        .identifier(instance.identifier())
        .batch(instance.batch())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link Medication Medication}.
   * <pre>
   * ImmutableMedication.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Medication#extension() extension}
   *    .form(com.fhir.types.fhir.CodeableConcept) // optional {@link Medication#form() form}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Medication#code() code}
   *    .ingredient(List&amp;lt;com.fhir.types.fhir.Medication_Ingredient&amp;gt;) // optional {@link Medication#ingredient() ingredient}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Medication#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Medication#modifierExtension() modifierExtension}
   *    .status(com.fhir.types.fhir.Code) // optional {@link Medication#status() status}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Medication#implicitRules() implicitRules}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Medication#id() id}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Medication#text() text}
   *    .amount(com.fhir.types.fhir.Ratio) // optional {@link Medication#amount() amount}
   *    .manufacturer(com.fhir.types.fhir.Reference) // optional {@link Medication#manufacturer() manufacturer}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Medication#language() language}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Medication#identifier() identifier}
   *    .batch(com.fhir.types.fhir.Medication_Batch) // optional {@link Medication#batch() batch}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Medication#contained() contained}
   *    .resourceType(String) // required {@link Medication#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new Medication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedication.Builder();
  }

  /**
   * Builds instances of type {@link Medication Medication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Medication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_FORM = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_INGREDIENT = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_AMOUNT = 0x400L;
    private static final long OPT_BIT_MANUFACTURER = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_BATCH = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept form;
    private @Nullable CodeableConcept code;
    private @Nullable List<Medication_Ingredient> ingredient;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code status;
    private @Nullable Uri implicitRules;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable Ratio amount;
    private @Nullable Reference manufacturer;
    private @Nullable Code language;
    private @Nullable List<Identifier> identifier;
    private @Nullable Medication_Batch batch;
    private @Nullable List<ResourceList> contained;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Medication#extension() extension} to extension.
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
     * Initializes the optional value {@link Medication#extension() extension} to extension.
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
     * Initializes the optional value {@link Medication#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    public final Builder form(CodeableConcept form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = Objects.requireNonNull(form, "form");
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("form")
    public final Builder form(Optional<? extends CodeableConcept> form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = form.orElse(null);
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    public final Builder ingredient(List<Medication_Ingredient> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = Objects.requireNonNull(ingredient, "ingredient");
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ingredient")
    public final Builder ingredient(Optional<? extends List<Medication_Ingredient>> ingredient) {
      checkNotIsSet(ingredientIsSet(), "ingredient");
      this.ingredient = ingredient.orElse(null);
      optBits |= OPT_BIT_INGREDIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#meta() meta} to meta.
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
     * Initializes the optional value {@link Medication#meta() meta} to meta.
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
     * Initializes the optional value {@link Medication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Medication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Medication#status() status} to status.
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
     * Initializes the optional value {@link Medication#status() status} to status.
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
     * Initializes the optional value {@link Medication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Medication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Medication#id() id} to id.
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
     * Initializes the optional value {@link Medication#id() id} to id.
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
     * Initializes the optional value {@link Medication#text() text} to text.
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
     * Initializes the optional value {@link Medication#text() text} to text.
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
     * Initializes the optional value {@link Medication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(Ratio amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends Ratio> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(Reference manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<? extends Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#language() language} to language.
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
     * Initializes the optional value {@link Medication#language() language} to language.
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
     * Initializes the optional value {@link Medication#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Medication#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Medication#batch() batch} to batch.
     * @param batch The value for batch
     * @return {@code this} builder for chained invocation
     */
    public final Builder batch(Medication_Batch batch) {
      checkNotIsSet(batchIsSet(), "batch");
      this.batch = Objects.requireNonNull(batch, "batch");
      optBits |= OPT_BIT_BATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#batch() batch} to batch.
     * @param batch The value for batch
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("batch")
    public final Builder batch(Optional<? extends Medication_Batch> batch) {
      checkNotIsSet(batchIsSet(), "batch");
      this.batch = batch.orElse(null);
      optBits |= OPT_BIT_BATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication#contained() contained} to contained.
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
     * Initializes the optional value {@link Medication#contained() contained} to contained.
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
     * Initializes the value for the {@link Medication#resourceType() resourceType} attribute.
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
     * Builds a new {@link Medication Medication}.
     * @return An immutable instance of Medication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Medication build() {
      checkRequiredAttributes();
      return new ImmutableMedication(
          extension,
          form,
          code,
          ingredient,
          meta,
          modifierExtension,
          status,
          implicitRules,
          id,
          text,
          amount,
          manufacturer,
          language,
          identifier,
          batch,
          contained,
          resourceType);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean ingredientIsSet() {
      return (optBits & OPT_BIT_INGREDIENT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean batchIsSet() {
      return (optBits & OPT_BIT_BATCH) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Medication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Medication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Medication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Medication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Medication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Medication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Medication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Medication#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(CodeableConcept form);

    /**
     * Initializes the optional value {@link Medication#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(Optional<? extends CodeableConcept> form);

    /**
     * Initializes the optional value {@link Medication#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Medication#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Medication#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ingredient(List<Medication_Ingredient> ingredient);

    /**
     * Initializes the optional value {@link Medication#ingredient() ingredient} to ingredient.
     * @param ingredient The value for ingredient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ingredient(Optional<? extends List<Medication_Ingredient>> ingredient);

    /**
     * Initializes the optional value {@link Medication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Medication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Medication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Medication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Medication#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Medication#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Medication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Medication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Medication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Medication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Medication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Medication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Medication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(Ratio amount);

    /**
     * Initializes the optional value {@link Medication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(Optional<? extends Ratio> amount);

    /**
     * Initializes the optional value {@link Medication#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(Reference manufacturer);

    /**
     * Initializes the optional value {@link Medication#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends Reference> manufacturer);

    /**
     * Initializes the optional value {@link Medication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Medication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Medication#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Medication#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Medication#batch() batch} to batch.
     * @param batch The value for batch
     * @return {@code this} builder for chained invocation
     */
    BuildFinal batch(Medication_Batch batch);

    /**
     * Initializes the optional value {@link Medication#batch() batch} to batch.
     * @param batch The value for batch
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal batch(Optional<? extends Medication_Batch> batch);

    /**
     * Initializes the optional value {@link Medication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Medication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Builds a new {@link Medication Medication}.
     * @return An immutable instance of Medication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Medication build();
  }
}
