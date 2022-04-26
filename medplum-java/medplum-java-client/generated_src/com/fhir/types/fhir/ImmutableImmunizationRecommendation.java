package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ImmunizationRecommendation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunizationRecommendation.builder()}.
 */
@Generated(from = "ImmunizationRecommendation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunizationRecommendation
    implements ImmunizationRecommendation {
  private final @Nullable DateTime date;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable Meta meta;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final List<ImmunizationRecommendation_Recommendation> recommendation;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final Reference patient;
  private final @Nullable Reference authority;

  private ImmutableImmunizationRecommendation(
      @Nullable DateTime date,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable Meta meta,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      List<ImmunizationRecommendation_Recommendation> recommendation,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      Reference patient,
      @Nullable Reference authority) {
    this.date = date;
    this.contained = contained;
    this.extension = extension;
    this.meta = meta;
    this.identifier = identifier;
    this.id = id;
    this.recommendation = recommendation;
    this.implicitRules = implicitRules;
    this.language = language;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.patient = patient;
    this.authority = authority;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code recommendation} attribute
   */
  @JsonProperty("recommendation")
  @Override
  public List<ImmunizationRecommendation_Recommendation> recommendation() {
    return recommendation;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<Reference> authority() {
    return Optional.ofNullable(authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        newValue,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableImmunizationRecommendation(
        value,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        newValue,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        value,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        newValue,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        value,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        newValue,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        value,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        newValue,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        value,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        newValue,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        value,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImmunizationRecommendation#recommendation() recommendation}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withRecommendation(ImmunizationRecommendation_Recommendation... elements) {
    List<ImmunizationRecommendation_Recommendation> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        newValue,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImmunizationRecommendation#recommendation() recommendation}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of recommendation elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withRecommendation(Iterable<? extends ImmunizationRecommendation_Recommendation> elements) {
    if (this.recommendation == elements) return this;
    List<ImmunizationRecommendation_Recommendation> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        newValue,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        newValue,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        value,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        newValue,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        value,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        value,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        newValue,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        value,
        this.resourceType,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationRecommendation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationRecommendation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        newValue,
        this.patient,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationRecommendation#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationRecommendation withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation withAuthority(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation withAuthority(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableImmunizationRecommendation(
        this.date,
        this.contained,
        this.extension,
        this.meta,
        this.identifier,
        this.id,
        this.recommendation,
        this.implicitRules,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.patient,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunizationRecommendation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunizationRecommendation
        && equalTo((ImmutableImmunizationRecommendation) another);
  }

  private boolean equalTo(ImmutableImmunizationRecommendation another) {
    return Objects.equals(date, another.date)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && recommendation.equals(another.recommendation)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && patient.equals(another.patient)
        && Objects.equals(authority, another.authority);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code contained}, {@code extension}, {@code meta}, {@code identifier}, {@code id}, {@code recommendation}, {@code implicitRules}, {@code language}, {@code text}, {@code modifierExtension}, {@code resourceType}, {@code patient}, {@code authority}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + recommendation.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(authority);
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationRecommendation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImmunizationRecommendation{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (contained != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("recommendation=").append(recommendation);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (authority != null) {
      builder.append(", ");
      builder.append("authority=").append(authority);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImmunizationRecommendation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImmunizationRecommendation {
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable List<ImmunizationRecommendation_Recommendation> recommendation = Collections.emptyList();
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Reference patient;
    @Nullable Optional<Reference> authority = Optional.empty();
    boolean authorityIsSet;
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("recommendation")
    public void setRecommendation(List<ImmunizationRecommendation_Recommendation> recommendation) {
      this.recommendation = recommendation;
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
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("authority")
    public void setAuthority(Optional<Reference> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public List<ImmunizationRecommendation_Recommendation> recommendation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> authority() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunizationRecommendation fromJson(Json json) {
    ImmutableImmunizationRecommendation.Builder builder = ((ImmutableImmunizationRecommendation.Builder) ImmutableImmunizationRecommendation.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.recommendation != null) {
      builder.addAllRecommendation(json.recommendation);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    return (ImmutableImmunizationRecommendation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImmunizationRecommendation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImmunizationRecommendation instance
   */
  public static ImmunizationRecommendation copyOf(ImmunizationRecommendation instance) {
    if (instance instanceof ImmutableImmunizationRecommendation) {
      return (ImmutableImmunizationRecommendation) instance;
    }
    return ((ImmutableImmunizationRecommendation.Builder) ImmutableImmunizationRecommendation.builder())
        .date(instance.date())
        .contained(instance.contained())
        .extension(instance.extension())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .id(instance.id())
        .addAllRecommendation(instance.recommendation())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .patient(instance.patient())
        .authority(instance.authority())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationRecommendation ImmunizationRecommendation}.
   * <pre>
   * ImmutableImmunizationRecommendation.builder()
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link ImmunizationRecommendation#date() date}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link ImmunizationRecommendation#contained() contained}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation#extension() extension}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link ImmunizationRecommendation#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link ImmunizationRecommendation#identifier() identifier}
   *    .id(com.fhir.types.fhir.Id) // optional {@link ImmunizationRecommendation#id() id}
   *    .addRecommendation|addAllRecommendation(com.fhir.types.fhir.ImmunizationRecommendation_Recommendation) // {@link ImmunizationRecommendation#recommendation() recommendation} elements
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link ImmunizationRecommendation#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link ImmunizationRecommendation#language() language}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link ImmunizationRecommendation#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link ImmunizationRecommendation#resourceType() resourceType}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link ImmunizationRecommendation#patient() patient}
   *    .authority(com.fhir.types.fhir.Reference) // optional {@link ImmunizationRecommendation#authority() authority}
   *    .build();
   * </pre>
   * @return A new ImmunizationRecommendation builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableImmunizationRecommendation.Builder();
  }

  /**
   * Builds instances of type {@link ImmunizationRecommendation ImmunizationRecommendation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImmunizationRecommendation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_AUTHORITY = 0x400L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable DateTime date;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable Meta meta;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private final List<ImmunizationRecommendation_Recommendation> recommendation = new ArrayList<ImmunizationRecommendation_Recommendation>();
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable Reference patient;
    private @Nullable Reference authority;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#contained() contained} to contained.
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
     * Initializes the optional value {@link ImmunizationRecommendation#contained() contained} to contained.
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
     * Initializes the optional value {@link ImmunizationRecommendation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationRecommendation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationRecommendation#meta() meta} to meta.
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
     * Initializes the optional value {@link ImmunizationRecommendation#meta() meta} to meta.
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
     * Initializes the optional value {@link ImmunizationRecommendation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImmunizationRecommendation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImmunizationRecommendation#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationRecommendation#id() id} to id.
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
     * Adds one element to {@link ImmunizationRecommendation#recommendation() recommendation} list.
     * @param element A recommendation element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRecommendation(ImmunizationRecommendation_Recommendation element) {
      this.recommendation.add(Objects.requireNonNull(element, "recommendation element"));
      return this;
    }

    /**
     * Adds elements to {@link ImmunizationRecommendation#recommendation() recommendation} list.
     * @param elements An array of recommendation elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRecommendation(ImmunizationRecommendation_Recommendation... elements) {
      for (ImmunizationRecommendation_Recommendation element : elements) {
        this.recommendation.add(Objects.requireNonNull(element, "recommendation element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ImmunizationRecommendation#recommendation() recommendation} list.
     * @param elements An iterable of recommendation elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRecommendation(Iterable<? extends ImmunizationRecommendation_Recommendation> elements) {
      for (ImmunizationRecommendation_Recommendation element : elements) {
        this.recommendation.add(Objects.requireNonNull(element, "recommendation element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImmunizationRecommendation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImmunizationRecommendation#language() language} to language.
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
     * Initializes the optional value {@link ImmunizationRecommendation#language() language} to language.
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
     * Initializes the optional value {@link ImmunizationRecommendation#text() text} to text.
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
     * Initializes the optional value {@link ImmunizationRecommendation#text() text} to text.
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
     * Initializes the optional value {@link ImmunizationRecommendation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationRecommendation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ImmunizationRecommendation#resourceType() resourceType} attribute.
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
     * Initializes the value for the {@link ImmunizationRecommendation#patient() patient} attribute.
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
     * Initializes the optional value {@link ImmunizationRecommendation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(Reference authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authority")
    public final Builder authority(Optional<? extends Reference> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Builds a new {@link ImmunizationRecommendation ImmunizationRecommendation}.
     * @return An immutable instance of ImmunizationRecommendation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmunizationRecommendation build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationRecommendation(
          date,
          contained,
          extension,
          meta,
          identifier,
          id,
          createUnmodifiableList(true, recommendation),
          implicitRules,
          language,
          text,
          modifierExtension,
          resourceType,
          patient,
          authority);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImmunizationRecommendation is strict, attribute is already set: ".concat(name));
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
      return "Cannot build ImmunizationRecommendation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImmunizationRecommendation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationRecommendation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ImmunizationRecommendation", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationRecommendation#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "ImmunizationRecommendation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Adds one element to {@link ImmunizationRecommendation#recommendation() recommendation} list.
     * @param element A recommendation element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addRecommendation(ImmunizationRecommendation_Recommendation element);

    /**
     * Adds elements to {@link ImmunizationRecommendation#recommendation() recommendation} list.
     * @param elements An array of recommendation elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addRecommendation(ImmunizationRecommendation_Recommendation... elements);

    /**
     * Adds elements to {@link ImmunizationRecommendation#recommendation() recommendation} list.
     * @param elements An iterable of recommendation elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllRecommendation(Iterable<? extends ImmunizationRecommendation_Recommendation> elements);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authority(Reference authority);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authority(Optional<? extends Reference> authority);

    /**
     * Builds a new {@link ImmunizationRecommendation ImmunizationRecommendation}.
     * @return An immutable instance of ImmunizationRecommendation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationRecommendation build();
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
