//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Schedule}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSchedule.builder()}.
 */
@org.immutables.value.Generated(from = "Schedule", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSchedule implements com.fhir.Schedule {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Period planningHorizon;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory;
  private final java.util.List<com.fhir.Reference> actor;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable com.fhir.Meta meta;

  private ImmutableSchedule(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Period planningHorizon,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory,
      java.util.List<com.fhir.Reference> actor,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable com.fhir.Meta meta) {
    this.contained = contained;
    this.planningHorizon = planningHorizon;
    this.serviceCategory = serviceCategory;
    this.actor = actor;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.active = active;
    this.serviceType = serviceType;
    this.text = text;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.language = language;
    this.resourceType = resourceType;
    this.specialty = specialty;
    this.comment = comment;
    this.meta = meta;
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
   * @return The value of the {@code planningHorizon} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("planningHorizon")
  @Override
  public java.util.Optional<com.fhir.Period> planningHorizon() {
    return java.util.Optional.ofNullable(planningHorizon);
  }

  /**
   * @return The value of the {@code serviceCategory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory() {
    return java.util.Optional.ofNullable(serviceCategory);
  }

  /**
   * @return The value of the {@code actor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actor")
  @Override
  public java.util.List<com.fhir.Reference> actor() {
    return actor;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code serviceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType() {
    return java.util.Optional.ofNullable(serviceType);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code specialty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialty")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() {
    return java.util.Optional.ofNullable(specialty);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSchedule(
        newValue,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSchedule(
        value,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#planningHorizon() planningHorizon} attribute.
   * @param value The value for planningHorizon
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withPlanningHorizon(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "planningHorizon");
    if (this.planningHorizon == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        newValue,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#planningHorizon() planningHorizon} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for planningHorizon
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withPlanningHorizon(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.planningHorizon == value) return this;
    return new ImmutableSchedule(
        this.contained,
        value,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#serviceCategory() serviceCategory} attribute.
   * @param value The value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withServiceCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceCategory");
    if (this.serviceCategory == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        newValue,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#serviceCategory() serviceCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withServiceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceCategory == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        value,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Schedule#actor() actor}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActor(com.fhir.Reference... elements) {
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Schedule#actor() actor}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of actor elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActor(Iterable<? extends com.fhir.Reference> elements) {
    if (this.actor == elements) return this;
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        newValue,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        value,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        newValue,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        value,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        newValue,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        value,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withServiceType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        newValue,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withServiceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        value,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        newValue,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        value,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        newValue,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        value,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        newValue,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        value,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        value,
        this.resourceType,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Schedule#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchedule withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        newValue,
        this.specialty,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withSpecialty(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        newValue,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withSpecialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        value,
        this.comment,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Schedule#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSchedule withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Schedule#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSchedule withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSchedule(
        this.contained,
        this.planningHorizon,
        this.serviceCategory,
        this.actor,
        this.id,
        this.extension,
        this.modifierExtension,
        this.active,
        this.serviceType,
        this.text,
        this.identifier,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.specialty,
        this.comment,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSchedule} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSchedule
        && equalTo((ImmutableSchedule) another);
  }

  private boolean equalTo(ImmutableSchedule another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(planningHorizon, another.planningHorizon)
        && java.util.Objects.equals(serviceCategory, another.serviceCategory)
        && actor.equals(another.actor)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(serviceType, another.serviceType)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(specialty, another.specialty)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code planningHorizon}, {@code serviceCategory}, {@code actor}, {@code id}, {@code extension}, {@code modifierExtension}, {@code active}, {@code serviceType}, {@code text}, {@code identifier}, {@code implicitRules}, {@code language}, {@code resourceType}, {@code specialty}, {@code comment}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(planningHorizon);
    h += (h << 5) + java.util.Objects.hashCode(serviceCategory);
    h += (h << 5) + actor.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(serviceType);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(specialty);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code Schedule} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Schedule{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (planningHorizon != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("planningHorizon=").append(planningHorizon);
    }
    if (serviceCategory != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("serviceCategory=").append(serviceCategory);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("actor=").append(actor);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
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
  @org.immutables.value.Generated(from = "Schedule", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Schedule {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> planningHorizon = java.util.Optional.empty();
    boolean planningHorizonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory = java.util.Optional.empty();
    boolean serviceCategoryIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> actor = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType = java.util.Optional.empty();
    boolean serviceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty = java.util.Optional.empty();
    boolean specialtyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("planningHorizon")
    public void setPlanningHorizon(java.util.Optional<com.fhir.Period> planningHorizon) {
      this.planningHorizon = planningHorizon;
      this.planningHorizonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    public void setServiceCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory) {
      this.serviceCategory = serviceCategory;
      this.serviceCategoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actor")
    public void setActor(java.util.List<com.fhir.Reference> actor) {
      this.actor = actor;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public void setServiceType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public void setSpecialty(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> planningHorizon() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Reference> actor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSchedule fromJson(Json json) {
    ImmutableSchedule.Builder builder = ((ImmutableSchedule.Builder) ImmutableSchedule.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.planningHorizonIsSet) {
      builder.planningHorizon(json.planningHorizon);
    }
    if (json.serviceCategoryIsSet) {
      builder.serviceCategory(json.serviceCategory);
    }
    if (json.actor != null) {
      builder.addAllActor(json.actor);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
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
        .contained(instance.contained())
        .planningHorizon(instance.planningHorizon())
        .serviceCategory(instance.serviceCategory())
        .addAllActor(instance.actor())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .active(instance.active())
        .serviceType(instance.serviceType())
        .text(instance.text())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .specialty(instance.specialty())
        .comment(instance.comment())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link Schedule Schedule}.
   * <pre>
   * ImmutableSchedule.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Schedule#contained() contained}
   *    .planningHorizon(com.fhir.Period) // optional {@link Schedule#planningHorizon() planningHorizon}
   *    .serviceCategory(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Schedule#serviceCategory() serviceCategory}
   *    .addActor|addAllActor(com.fhir.Reference) // {@link Schedule#actor() actor} elements
   *    .id(com.fhir.id) // optional {@link Schedule#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Schedule#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Schedule#modifierExtension() modifierExtension}
   *    .active(Boolean) // optional {@link Schedule#active() active}
   *    .serviceType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Schedule#serviceType() serviceType}
   *    .text(com.fhir.Narrative) // optional {@link Schedule#text() text}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Schedule#identifier() identifier}
   *    .implicitRules(com.fhir.uri) // optional {@link Schedule#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link Schedule#language() language}
   *    .resourceType(String) // required {@link Schedule#resourceType() resourceType}
   *    .specialty(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Schedule#specialty() specialty}
   *    .comment(String) // optional {@link Schedule#comment() comment}
   *    .meta(com.fhir.Meta) // optional {@link Schedule#meta() meta}
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
  @org.immutables.value.Generated(from = "Schedule", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_PLANNING_HORIZON = 0x2L;
    private static final long OPT_BIT_SERVICE_CATEGORY = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_ACTIVE = 0x40L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_SPECIALTY = 0x1000L;
    private static final long OPT_BIT_COMMENT = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Period planningHorizon;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory;
    private final java.util.List<com.fhir.Reference> actor = new java.util.ArrayList<com.fhir.Reference>();
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable com.fhir.Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
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
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
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
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for chained invocation
     */
    public final Builder planningHorizon(com.fhir.Period planningHorizon) {
      checkNotIsSet(planningHorizonIsSet(), "planningHorizon");
      this.planningHorizon = java.util.Objects.requireNonNull(planningHorizon, "planningHorizon");
      optBits |= OPT_BIT_PLANNING_HORIZON;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planningHorizon")
    public final Builder planningHorizon(java.util.Optional<? extends com.fhir.Period> planningHorizon) {
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
    public final Builder serviceCategory(java.util.List<com.fhir.CodeableConcept> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = java.util.Objects.requireNonNull(serviceCategory, "serviceCategory");
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    public final Builder serviceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = serviceCategory.orElse(null);
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Adds one element to {@link Schedule#actor() actor} list.
     * @param element A actor element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addActor(com.fhir.Reference element) {
      this.actor.add(java.util.Objects.requireNonNull(element, "actor element"));
      return this;
    }

    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An array of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addActor(com.fhir.Reference... elements) {
      for (com.fhir.Reference element : elements) {
        this.actor.add(java.util.Objects.requireNonNull(element, "actor element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An iterable of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllActor(Iterable<? extends com.fhir.Reference> elements) {
      for (com.fhir.Reference element : elements) {
        this.actor.add(java.util.Objects.requireNonNull(element, "actor element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#id() id} to id.
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
     * Initializes the optional value {@link Schedule#id() id} to id.
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
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
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
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
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
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
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
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceType(java.util.List<com.fhir.CodeableConcept> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = java.util.Objects.requireNonNull(serviceType, "serviceType");
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public final Builder serviceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = serviceType.orElse(null);
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#text() text} to text.
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
     * Initializes the optional value {@link Schedule#text() text} to text.
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
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Schedule#language() language} to language.
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
     * Initializes the optional value {@link Schedule#language() language} to language.
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
     * Initializes the value for the {@link Schedule#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialty(java.util.List<com.fhir.CodeableConcept> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = java.util.Objects.requireNonNull(specialty, "specialty");
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public final Builder specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = specialty.orElse(null);
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
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
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
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
     * Builds a new {@link Schedule Schedule}.
     * @return An immutable instance of Schedule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Schedule build() {
      checkRequiredAttributes();
      return new ImmutableSchedule(
          contained,
          planningHorizon,
          serviceCategory,
          createUnmodifiableList(true, actor),
          id,
          extension,
          modifierExtension,
          active,
          serviceType,
          text,
          identifier,
          implicitRules,
          language,
          resourceType,
          specialty,
          comment,
          meta);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean planningHorizonIsSet() {
      return (optBits & OPT_BIT_PLANNING_HORIZON) != 0;
    }

    private boolean serviceCategoryIsSet() {
      return (optBits & OPT_BIT_SERVICE_CATEGORY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Schedule is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Schedule, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Schedule", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Schedule#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Schedule", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Schedule#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for chained invocation
     */
    BuildFinal planningHorizon(com.fhir.Period planningHorizon);

    /**
     * Initializes the optional value {@link Schedule#planningHorizon() planningHorizon} to planningHorizon.
     * @param planningHorizon The value for planningHorizon
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal planningHorizon(java.util.Optional<? extends com.fhir.Period> planningHorizon);

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceCategory(java.util.List<com.fhir.CodeableConcept> serviceCategory);

    /**
     * Initializes the optional value {@link Schedule#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceCategory);

    /**
     * Adds one element to {@link Schedule#actor() actor} list.
     * @param element A actor element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addActor(com.fhir.Reference element);

    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An array of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addActor(com.fhir.Reference... elements);

    /**
     * Adds elements to {@link Schedule#actor() actor} list.
     * @param elements An iterable of actor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllActor(Iterable<? extends com.fhir.Reference> elements);

    /**
     * Initializes the optional value {@link Schedule#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Schedule#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Schedule#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Schedule#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

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
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(java.util.List<com.fhir.CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Schedule#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceType);

    /**
     * Initializes the optional value {@link Schedule#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Schedule#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Schedule#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Schedule#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Schedule#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Schedule#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(java.util.List<com.fhir.CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link Schedule#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link Schedule#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Schedule#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Builds a new {@link Schedule Schedule}.
     * @return An immutable instance of Schedule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Schedule build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
