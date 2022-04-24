//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductInteraction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductInteraction.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductInteraction", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductInteraction implements com.fhir.MedicinalProductInteraction {
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductInteraction_Interactant> interactant;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept effect;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept incidence;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept management;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;

  private ImmutableMedicinalProductInteraction(
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductInteraction_Interactant> interactant,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.CodeableConcept effect,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept incidence,
      @javax.annotation.Nullable com.fhir.CodeableConcept management,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject,
      @javax.annotation.Nullable com.fhir.CodeableConcept type) {
    this.description = description;
    this.interactant = interactant;
    this.resourceType = resourceType;
    this.id = id;
    this.effect = effect;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.meta = meta;
    this.extension = extension;
    this.text = text;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.incidence = incidence;
    this.management = management;
    this.subject = subject;
    this.type = type;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code interactant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interactant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> interactant() {
    return java.util.Optional.ofNullable(interactant);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code effect} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effect")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> effect() {
    return java.util.Optional.ofNullable(effect);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code incidence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("incidence")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> incidence() {
    return java.util.Optional.ofNullable(incidence);
  }

  /**
   * @return The value of the {@code management} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("management")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> management() {
    return java.util.Optional.ofNullable(management);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableMedicinalProductInteraction(
        newValue,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableMedicinalProductInteraction(
        value,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#interactant() interactant} attribute.
   * @param value The value for interactant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withInteractant(java.util.List<com.fhir.MedicinalProductInteraction_Interactant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductInteraction_Interactant> newValue = java.util.Objects.requireNonNull(value, "interactant");
    if (this.interactant == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        newValue,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#interactant() interactant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interactant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withInteractant(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductInteraction_Interactant> value = optional.orElse(null);
    if (this.interactant == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        value,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductInteraction#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        newValue,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        newValue,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        value,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#effect() effect} attribute.
   * @param value The value for effect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withEffect(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "effect");
    if (this.effect == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        newValue,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#effect() effect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withEffect(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.effect == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        value,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        newValue,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        value,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        newValue,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        value,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        newValue,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        value,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        newValue,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        value,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        newValue,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        value,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        newValue,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        value,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        newValue,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        value,
        this.incidence,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#incidence() incidence} attribute.
   * @param value The value for incidence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withIncidence(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "incidence");
    if (this.incidence == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        newValue,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#incidence() incidence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for incidence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withIncidence(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.incidence == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        value,
        this.management,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#management() management} attribute.
   * @param value The value for management
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withManagement(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "management");
    if (this.management == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        newValue,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#management() management} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for management
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withManagement(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.management == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        value,
        this.subject,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.description,
        this.interactant,
        this.resourceType,
        this.id,
        this.effect,
        this.modifierExtension,
        this.language,
        this.meta,
        this.extension,
        this.text,
        this.implicitRules,
        this.contained,
        this.incidence,
        this.management,
        this.subject,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductInteraction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductInteraction
        && equalTo((ImmutableMedicinalProductInteraction) another);
  }

  private boolean equalTo(ImmutableMedicinalProductInteraction another) {
    return java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(interactant, another.interactant)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(effect, another.effect)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(incidence, another.incidence)
        && java.util.Objects.equals(management, another.management)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code interactant}, {@code resourceType}, {@code id}, {@code effect}, {@code modifierExtension}, {@code language}, {@code meta}, {@code extension}, {@code text}, {@code implicitRules}, {@code contained}, {@code incidence}, {@code management}, {@code subject}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(interactant);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(effect);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(incidence);
    h += (h << 5) + java.util.Objects.hashCode(management);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductInteraction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductInteraction{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (interactant != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("interactant=").append(interactant);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (effect != null) {
      builder.append(", ");
      builder.append("effect=").append(effect);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (incidence != null) {
      builder.append(", ");
      builder.append("incidence=").append(incidence);
    }
    if (management != null) {
      builder.append(", ");
      builder.append("management=").append(management);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductInteraction {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> interactant = java.util.Optional.empty();
    boolean interactantIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> effect = java.util.Optional.empty();
    boolean effectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> incidence = java.util.Optional.empty();
    boolean incidenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> management = java.util.Optional.empty();
    boolean managementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("interactant")
    public void setInteractant(java.util.Optional<java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> interactant) {
      this.interactant = interactant;
      this.interactantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effect")
    public void setEffect(java.util.Optional<com.fhir.CodeableConcept> effect) {
      this.effect = effect;
      this.effectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("incidence")
    public void setIncidence(java.util.Optional<com.fhir.CodeableConcept> incidence) {
      this.incidence = incidence;
      this.incidenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("management")
    public void setManagement(java.util.Optional<com.fhir.CodeableConcept> management) {
      this.management = management;
      this.managementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> interactant() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> effect() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> incidence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> management() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductInteraction fromJson(Json json) {
    ImmutableMedicinalProductInteraction.Builder builder = ((ImmutableMedicinalProductInteraction.Builder) ImmutableMedicinalProductInteraction.builder());
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.interactantIsSet) {
      builder.interactant(json.interactant);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.effectIsSet) {
      builder.effect(json.effect);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.incidenceIsSet) {
      builder.incidence(json.incidence);
    }
    if (json.managementIsSet) {
      builder.management(json.management);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableMedicinalProductInteraction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductInteraction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductInteraction instance
   */
  public static MedicinalProductInteraction copyOf(MedicinalProductInteraction instance) {
    if (instance instanceof ImmutableMedicinalProductInteraction) {
      return (ImmutableMedicinalProductInteraction) instance;
    }
    return ((ImmutableMedicinalProductInteraction.Builder) ImmutableMedicinalProductInteraction.builder())
        .description(instance.description())
        .interactant(instance.interactant())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .effect(instance.effect())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .meta(instance.meta())
        .extension(instance.extension())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .incidence(instance.incidence())
        .management(instance.management())
        .subject(instance.subject())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductInteraction MedicinalProductInteraction}.
   * <pre>
   * ImmutableMedicinalProductInteraction.builder()
   *    .description(String) // optional {@link MedicinalProductInteraction#description() description}
   *    .interactant(List&amp;lt;com.fhir.MedicinalProductInteraction_Interactant&amp;gt;) // optional {@link MedicinalProductInteraction#interactant() interactant}
   *    .resourceType(String) // required {@link MedicinalProductInteraction#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link MedicinalProductInteraction#id() id}
   *    .effect(com.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#effect() effect}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductInteraction#modifierExtension() modifierExtension}
   *    .language(com.fhir.code) // optional {@link MedicinalProductInteraction#language() language}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductInteraction#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductInteraction#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductInteraction#text() text}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductInteraction#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductInteraction#contained() contained}
   *    .incidence(com.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#incidence() incidence}
   *    .management(com.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#management() management}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductInteraction#subject() subject}
   *    .type(com.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#type() type}
   *    .build();
   * </pre>
   * @return A new MedicinalProductInteraction builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductInteraction.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductInteraction MedicinalProductInteraction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_INTERACTANT = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EFFECT = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_INCIDENCE = 0x800L;
    private static final long OPT_BIT_MANAGEMENT = 0x1000L;
    private static final long OPT_BIT_SUBJECT = 0x2000L;
    private static final long OPT_BIT_TYPE = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductInteraction_Interactant> interactant;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept effect;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept incidence;
    private @javax.annotation.Nullable com.fhir.CodeableConcept management;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for chained invocation
     */
    public final Builder interactant(java.util.List<com.fhir.MedicinalProductInteraction_Interactant> interactant) {
      checkNotIsSet(interactantIsSet(), "interactant");
      this.interactant = java.util.Objects.requireNonNull(interactant, "interactant");
      optBits |= OPT_BIT_INTERACTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interactant")
    public final Builder interactant(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> interactant) {
      checkNotIsSet(interactantIsSet(), "interactant");
      this.interactant = interactant.orElse(null);
      optBits |= OPT_BIT_INTERACTANT;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductInteraction#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for chained invocation
     */
    public final Builder effect(com.fhir.CodeableConcept effect) {
      checkNotIsSet(effectIsSet(), "effect");
      this.effect = java.util.Objects.requireNonNull(effect, "effect");
      optBits |= OPT_BIT_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effect")
    public final Builder effect(java.util.Optional<? extends com.fhir.CodeableConcept> effect) {
      checkNotIsSet(effectIsSet(), "effect");
      this.effect = effect.orElse(null);
      optBits |= OPT_BIT_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for chained invocation
     */
    public final Builder incidence(com.fhir.CodeableConcept incidence) {
      checkNotIsSet(incidenceIsSet(), "incidence");
      this.incidence = java.util.Objects.requireNonNull(incidence, "incidence");
      optBits |= OPT_BIT_INCIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incidence")
    public final Builder incidence(java.util.Optional<? extends com.fhir.CodeableConcept> incidence) {
      checkNotIsSet(incidenceIsSet(), "incidence");
      this.incidence = incidence.orElse(null);
      optBits |= OPT_BIT_INCIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for chained invocation
     */
    public final Builder management(com.fhir.CodeableConcept management) {
      checkNotIsSet(managementIsSet(), "management");
      this.management = java.util.Objects.requireNonNull(management, "management");
      optBits |= OPT_BIT_MANAGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("management")
    public final Builder management(java.util.Optional<? extends com.fhir.CodeableConcept> management) {
      checkNotIsSet(managementIsSet(), "management");
      this.management = management.orElse(null);
      optBits |= OPT_BIT_MANAGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(java.util.List<com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductInteraction MedicinalProductInteraction}.
     * @return An immutable instance of MedicinalProductInteraction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductInteraction build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductInteraction(
          description,
          interactant,
          resourceType,
          id,
          effect,
          modifierExtension,
          language,
          meta,
          extension,
          text,
          implicitRules,
          contained,
          incidence,
          management,
          subject,
          type);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean interactantIsSet() {
      return (optBits & OPT_BIT_INTERACTANT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean effectIsSet() {
      return (optBits & OPT_BIT_EFFECT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean incidenceIsSet() {
      return (optBits & OPT_BIT_INCIDENCE) != 0;
    }

    private boolean managementIsSet() {
      return (optBits & OPT_BIT_MANAGEMENT) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductInteraction is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductInteraction, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductInteraction#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interactant(java.util.List<com.fhir.MedicinalProductInteraction_Interactant> interactant);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interactant(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductInteraction_Interactant>> interactant);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effect(com.fhir.CodeableConcept effect);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effect(java.util.Optional<? extends com.fhir.CodeableConcept> effect);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal incidence(com.fhir.CodeableConcept incidence);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal incidence(java.util.Optional<? extends com.fhir.CodeableConcept> incidence);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for chained invocation
     */
    BuildFinal management(com.fhir.CodeableConcept management);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal management(java.util.Optional<? extends com.fhir.CodeableConcept> management);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Builds a new {@link MedicinalProductInteraction MedicinalProductInteraction}.
     * @return An immutable instance of MedicinalProductInteraction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductInteraction build();
  }
}
