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
 * Immutable implementation of {@link Schedule}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSchedule.builder()}.
 */
@Generated(from = "Schedule", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSchedule implements Schedule {
  private final @Nullable List<Extension> modifierExtension;
  private final List<Reference> actor;
  private final @Nullable List<CodeableConcept> serviceType;
  private final @Nullable List<CodeableConcept> specialty;
  private final @Nullable List<Extension> extension;
  private final @Nullable String comment;
  private final String resourceType;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable Period planningHorizon;
  private final @Nullable List<CodeableConcept> serviceCategory;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Uri implicitRules;
  private final @Nullable Boolean active;
  private final @Nullable Code language;

  private ImmutableSchedule(
      @Nullable List<Extension> modifierExtension,
      List<Reference> actor,
      @Nullable List<CodeableConcept> serviceType,
      @Nullable List<CodeableConcept> specialty,
      @Nullable List<Extension> extension,
      @Nullable String comment,
      String resourceType,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable Period planningHorizon,
      @Nullable List<CodeableConcept> serviceCategory,
      @Nullable List<ResourceList> contained,
      @Nullable Uri implicitRules,
      @Nullable Boolean active,
      @Nullable Code language) {
    this.modifierExtension = modifierExtension;
    this.actor = actor;
    this.serviceType = serviceType;
    this.specialty = specialty;
    this.extension = extension;
    this.comment = comment;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.id = id;
    this.meta = meta;
    this.text = text;
    this.planningHorizon = planningHorizon;
    this.serviceCategory = serviceCategory;
    this.contained = contained;
    this.implicitRules = implicitRules;
    this.active = active;
    this.language = language;
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
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public List<Reference> actor() {
    return actor;
  }

  /**
   * @return The value of the {@code serviceType} attribute
   */
  @JsonProperty("serviceType")
  @Override
  public Optional<List<CodeableConcept>> serviceType() {
    return Optional.ofNullable(serviceType);
  }

  /**
   * @return The value of the {@code specialty} attribute
   */
  @JsonProperty("specialty")
  @Override
  public Optional<List<CodeableConcept>> specialty() {
    return Optional.ofNullable(specialty);
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
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
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
   * @return The value of the {@code planningHorizon} attribute
   */
  @JsonProperty("planningHorizon")
  @Override
  public Optional<Period> planningHorizon() {
    return Optional.ofNullable(planningHorizon);
  }

  /**
   * @return The value of the {@code serviceCategory} attribute
   */
  @JsonProperty("serviceCategory")
  @Override
  public Optional<List<CodeableConcept>> serviceCategory() {
    return Optional.ofNullable(serviceCategory);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSchedule(
        newValue,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSchedule(
        value,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Schedule#actor() actor}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActor(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSchedule(
        this.modifierExtension,
        newValue,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Schedule#actor() actor}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of actor elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActor(Iterable<? extends Reference> elements) {
    if (this.actor == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSchedule(
        this.modifierExtension,
        newValue,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withServiceType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        newValue,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withServiceType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        value,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withSpecialty(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        newValue,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withSpecialty(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        value,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        newValue,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        value,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        newValue,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        value,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Schedule#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchedule withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        newValue,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        newValue,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        value,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        newValue,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        value,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        newValue,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        value,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        newValue,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        value,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#planningHorizon() planningHorizon} attribute.
   * @param value The value for planningHorizon
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withPlanningHorizon(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "planningHorizon");
    if (this.planningHorizon == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        newValue,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#planningHorizon() planningHorizon} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for planningHorizon
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withPlanningHorizon(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.planningHorizon == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        value,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#serviceCategory() serviceCategory} attribute.
   * @param value The value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withServiceCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceCategory");
    if (this.serviceCategory == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        newValue,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#serviceCategory() serviceCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withServiceCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceCategory == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        value,
        this.contained,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        newValue,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        value,
        this.implicitRules,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        newValue,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        value,
        this.active,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSchedule(
        this.modifierExtension,
        this.actor,
        this.serviceType,
        this.specialty,
        this.extension,
        this.comment,
        this.resourceType,
        this.identifier,
        this.id,
        this.meta,
        this.text,
        this.planningHorizon,
        this.serviceCategory,
        this.contained,
        this.implicitRules,
        this.active,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSchedule} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSchedule
        && equalTo((ImmutableSchedule) another);
  }

  private boolean equalTo(ImmutableSchedule another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && actor.equals(another.actor)
        && Objects.equals(serviceType, another.serviceType)
        && Objects.equals(specialty, another.specialty)
        && Objects.equals(extension, another.extension)
        && Objects.equals(comment, another.comment)
        && resourceType.equals(another.resourceType)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(planningHorizon, another.planningHorizon)
        && Objects.equals(serviceCategory, another.serviceCategory)
        && Objects.equals(contained, another.contained)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(active, another.active)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code actor}, {@code serviceType}, {@code specialty}, {@code extension}, {@code comment}, {@code resourceType}, {@code identifier}, {@code id}, {@code meta}, {@code text}, {@code planningHorizon}, {@code serviceCategory}, {@code contained}, {@code implicitRules}, {@code active}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + actor.hashCode();
    h += (h << 5) + Objects.hashCode(serviceType);
    h += (h << 5) + Objects.hashCode(specialty);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(planningHorizon);
    h += (h << 5) + Objects.hashCode(serviceCategory);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code Schedule} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Schedule{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("actor=").append(actor);
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (planningHorizon != null) {
      builder.append(", ");
      builder.append("planningHorizon=").append(planningHorizon);
    }
    if (serviceCategory != null) {
      builder.append(", ");
      builder.append("serviceCategory=").append(serviceCategory);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
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
  @Generated(from = "Schedule", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Schedule {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<Reference> actor = Collections.emptyList();
    @Nullable Optional<List<CodeableConcept>> serviceType = Optional.empty();
    boolean serviceTypeIsSet;
    @Nullable Optional<List<CodeableConcept>> specialty = Optional.empty();
    boolean specialtyIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Period> planningHorizon = Optional.empty();
    boolean planningHorizonIsSet;
    @Nullable Optional<List<CodeableConcept>> serviceCategory = Optional.empty();
    boolean serviceCategoryIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("actor")
    public void setActor(List<Reference> actor) {
      this.actor = actor;
    }
    @JsonProperty("serviceType")
    public void setServiceType(Optional<List<CodeableConcept>> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @JsonProperty("specialty")
    public void setSpecialty(Optional<List<CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("planningHorizon")
    public void setPlanningHorizon(Optional<Period> planningHorizon) {
      this.planningHorizon = planningHorizon;
      this.planningHorizonIsSet = true;
    }
    @JsonProperty("serviceCategory")
    public void setServiceCategory(Optional<List<CodeableConcept>> serviceCategory) {
      this.serviceCategory = serviceCategory;
      this.serviceCategoryIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> actor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> planningHorizon() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceCategory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
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
  static ImmutableSchedule fromJson(Json json) {
    ImmutableSchedule.Builder builder = ((ImmutableSchedule.Builder) ImmutableSchedule.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.actor != null) {
      builder.addAllActor(json.actor);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.planningHorizonIsSet) {
      builder.planningHorizon(json.planningHorizon);
    }
    if (json.serviceCategoryIsSet) {
      builder.serviceCategory(json.serviceCategory);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableSchedule) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Schedule} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Schedule instance
   */
  public static Schedule copyOf(Schedule instance) {
    if (instance instanceof ImmutableSchedule) {
      return (ImmutableSchedule) instance;
    }
    return ((ImmutableSchedule.Builder) ImmutableSchedule.builder())
        .modifierExtension(instance.modifierExtension())
        .addAllActor(instance.actor())
        .serviceType(instance.serviceType())
        .specialty(instance.specialty())
        .extension(instance.extension())
        .comment(instance.comment())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .id(instance.id())
        .meta(instance.meta())
        .text(instance.text())
        .planningHorizon(instance.planningHorizon())
        .serviceCategory(instance.serviceCategory())
        .contained(instance.contained())
        .implicitRules(instance.implicitRules())
        .active(instance.active())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link Schedule Schedule}.
   * <pre>
   * ImmutableSchedule.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Schedule#modifierExtension() modifierExtension}
   *    .addActor|addAllActor(com.medplum.types.fhir.Reference) // {@link Schedule#actor() actor} elements
   *    .serviceType(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Schedule#serviceType() serviceType}
   *    .specialty(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Schedule#specialty() specialty}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Schedule#extension() extension}
   *    .comment(String) // optional {@link Schedule#comment() comment}
   *    .resourceType(String) // required {@link Schedule#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Schedule#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Schedule#id() id}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Schedule#meta() meta}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Schedule#text() text}
   *    .planningHorizon(com.medplum.types.fhir.Period) // optional {@link Schedule#planningHorizon() planningHorizon}
   *    .serviceCategory(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Schedule#serviceCategory() serviceCategory}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Schedule#contained() contained}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Schedule#implicitRules() implicitRules}
   *    .active(Boolean) // optional {@link Schedule#active() active}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Schedule#language() language}
   *    .build();
   * </pre>
   * @return A new Schedule builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSchedule.Builder();
  }

  /**
   * Builds instances of type {@link Schedule Schedule}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Schedule", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x2L;
    private static final long OPT_BIT_SPECIALTY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_COMMENT = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_PLANNING_HORIZON = 0x200L;
    private static final long OPT_BIT_SERVICE_CATEGORY = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_ACTIVE = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private final List<Reference> actor = new ArrayList<Reference>();
    private @Nullable List<CodeableConcept> serviceType;
    private @Nullable List<CodeableConcept> specialty;
    private @Nullable List<Extension> extension;
    private @Nullable String comment;
    private @Nullable String resourceType;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable Period planningHorizon;
    private @Nullable List<CodeableConcept> serviceCategory;
    private @Nullable List<ResourceList> contained;
    private @Nullable Uri implicitRules;
    private @Nullable Boolean active;
    private @Nullable Code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link Schedule#actor() actor} list.
     * @param element A actor element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addActor(Reference element) {
      this.actor.add(Objects.requireNonNull(element, "actor element"));
      return this;
    }

    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An array of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addActor(Reference... elements) {
      for (Reference element : elements) {
        this.actor.add(Objects.requireNonNull(element, "actor element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An iterable of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllActor(Iterable<? extends Reference> elements) {
      for (Reference element : elements) {
        this.actor.add(Objects.requireNonNull(element, "actor element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceType(List<CodeableConcept> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = Objects.requireNonNull(serviceType, "serviceType");
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceType")
    public final Builder serviceType(Optional<? extends List<CodeableConcept>> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = serviceType.orElse(null);
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialty(List<CodeableConcept> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = Objects.requireNonNull(specialty, "specialty");
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialty")
    public final Builder specialty(Optional<? extends List<CodeableConcept>> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = specialty.orElse(null);
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
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
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
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
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link Schedule#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Schedule#id() id} to id.
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
     * Initializes the optional value {@link Schedule#id() id} to id.
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
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
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
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
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
     * Initializes the optional value {@link Schedule#text() text} to text.
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
     * Initializes the optional value {@link Schedule#text() text} to text.
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
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for chained invocation
     */
    public final Builder planningHorizon(Period planningHorizon) {
      checkNotIsSet(planningHorizonIsSet(), "planningHorizon");
      this.planningHorizon = Objects.requireNonNull(planningHorizon, "planningHorizon");
      optBits |= OPT_BIT_PLANNING_HORIZON;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("planningHorizon")
    public final Builder planningHorizon(Optional<? extends Period> planningHorizon) {
      checkNotIsSet(planningHorizonIsSet(), "planningHorizon");
      this.planningHorizon = planningHorizon.orElse(null);
      optBits |= OPT_BIT_PLANNING_HORIZON;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceCategory(List<CodeableConcept> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = Objects.requireNonNull(serviceCategory, "serviceCategory");
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceCategory")
    public final Builder serviceCategory(Optional<? extends List<CodeableConcept>> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = serviceCategory.orElse(null);
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
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
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
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
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Schedule#active() active} to active.
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
     * Initializes the optional value {@link Schedule#active() active} to active.
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
     * Initializes the optional value {@link Schedule#language() language} to language.
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
     * Initializes the optional value {@link Schedule#language() language} to language.
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
     * Builds a new {@link Schedule Schedule}.
     * @return An immutable instance of Schedule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Schedule build() {
      checkRequiredAttributes();
      return new ImmutableSchedule(
          modifierExtension,
          createUnmodifiableList(true, actor),
          serviceType,
          specialty,
          extension,
          comment,
          resourceType,
          identifier,
          id,
          meta,
          text,
          planningHorizon,
          serviceCategory,
          contained,
          implicitRules,
          active,
          language);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean planningHorizonIsSet() {
      return (optBits & OPT_BIT_PLANNING_HORIZON) != 0;
    }

    private boolean serviceCategoryIsSet() {
      return (optBits & OPT_BIT_SERVICE_CATEGORY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Schedule is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Schedule, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Schedule", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Schedule#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Schedule", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Adds one element to {@link Schedule#actor() actor} list.
     * @param element A actor element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addActor(Reference element);

    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An array of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addActor(Reference... elements);

    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An iterable of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllActor(Iterable<? extends Reference> elements);

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(List<CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(Optional<? extends List<CodeableConcept>> serviceType);

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(List<CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(Optional<? extends List<CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Schedule#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Schedule#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Schedule#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Schedule#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for chained invocation
     */
    BuildFinal planningHorizon(Period planningHorizon);

    /**
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal planningHorizon(Optional<? extends Period> planningHorizon);

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceCategory(List<CodeableConcept> serviceCategory);

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceCategory(Optional<? extends List<CodeableConcept>> serviceCategory);

    /**
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Schedule#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Schedule#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Schedule#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Schedule#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Builds a new {@link Schedule Schedule}.
     * @return An immutable instance of Schedule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Schedule build();
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
