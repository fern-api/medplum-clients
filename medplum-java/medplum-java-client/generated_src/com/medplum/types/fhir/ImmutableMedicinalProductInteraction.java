package com.medplum.types.fhir;

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
 * Immutable implementation of {@link MedicinalProductInteraction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductInteraction.builder()}.
 */
@Generated(from = "MedicinalProductInteraction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductInteraction
    implements MedicinalProductInteraction {
  private final @Nullable List<Reference> subject;
  private final @Nullable String description;
  private final @Nullable Id id;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept incidence;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept type;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept effect;
  private final @Nullable Narrative text;
  private final String resourceType;
  private final @Nullable CodeableConcept management;
  private final @Nullable List<MedicinalProductInteraction_Interactant> interactant;
  private final @Nullable List<Extension> extension;

  private ImmutableMedicinalProductInteraction(
      @Nullable List<Reference> subject,
      @Nullable String description,
      @Nullable Id id,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable CodeableConcept incidence,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept type,
      @Nullable Meta meta,
      @Nullable CodeableConcept effect,
      @Nullable Narrative text,
      String resourceType,
      @Nullable CodeableConcept management,
      @Nullable List<MedicinalProductInteraction_Interactant> interactant,
      @Nullable List<Extension> extension) {
    this.subject = subject;
    this.description = description;
    this.id = id;
    this.implicitRules = implicitRules;
    this.language = language;
    this.incidence = incidence;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.meta = meta;
    this.effect = effect;
    this.text = text;
    this.resourceType = resourceType;
    this.management = management;
    this.interactant = interactant;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<List<Reference>> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code incidence} attribute
   */
  @JsonProperty("incidence")
  @Override
  public Optional<CodeableConcept> incidence() {
    return Optional.ofNullable(incidence);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code effect} attribute
   */
  @JsonProperty("effect")
  @Override
  public Optional<CodeableConcept> effect() {
    return Optional.ofNullable(effect);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code management} attribute
   */
  @JsonProperty("management")
  @Override
  public Optional<CodeableConcept> management() {
    return Optional.ofNullable(management);
  }

  /**
   * @return The value of the {@code interactant} attribute
   */
  @JsonProperty("interactant")
  @Override
  public Optional<List<MedicinalProductInteraction_Interactant>> interactant() {
    return Optional.ofNullable(interactant);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        newValue,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductInteraction(
        value,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        newValue,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        value,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        newValue,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        value,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        newValue,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        value,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        newValue,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        value,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#incidence() incidence} attribute.
   * @param value The value for incidence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withIncidence(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "incidence");
    if (this.incidence == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        newValue,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#incidence() incidence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for incidence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withIncidence(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.incidence == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        value,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        newValue,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        value,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        newValue,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        value,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        newValue,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        value,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        newValue,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        value,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#effect() effect} attribute.
   * @param value The value for effect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withEffect(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "effect");
    if (this.effect == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        newValue,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#effect() effect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withEffect(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.effect == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        value,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        newValue,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        value,
        this.resourceType,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductInteraction#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        newValue,
        this.management,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#management() management} attribute.
   * @param value The value for management
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withManagement(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "management");
    if (this.management == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        newValue,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#management() management} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for management
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withManagement(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.management == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        value,
        this.interactant,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#interactant() interactant} attribute.
   * @param value The value for interactant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withInteractant(List<MedicinalProductInteraction_Interactant> value) {
    @Nullable List<MedicinalProductInteraction_Interactant> newValue = Objects.requireNonNull(value, "interactant");
    if (this.interactant == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#interactant() interactant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interactant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withInteractant(Optional<? extends List<MedicinalProductInteraction_Interactant>> optional) {
    @Nullable List<MedicinalProductInteraction_Interactant> value = optional.orElse(null);
    if (this.interactant == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductInteraction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductInteraction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductInteraction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductInteraction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductInteraction(
        this.subject,
        this.description,
        this.id,
        this.implicitRules,
        this.language,
        this.incidence,
        this.contained,
        this.modifierExtension,
        this.type,
        this.meta,
        this.effect,
        this.text,
        this.resourceType,
        this.management,
        this.interactant,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductInteraction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductInteraction
        && equalTo((ImmutableMedicinalProductInteraction) another);
  }

  private boolean equalTo(ImmutableMedicinalProductInteraction another) {
    return Objects.equals(subject, another.subject)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(incidence, another.incidence)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(meta, another.meta)
        && Objects.equals(effect, another.effect)
        && Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && Objects.equals(management, another.management)
        && Objects.equals(interactant, another.interactant)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code subject}, {@code description}, {@code id}, {@code implicitRules}, {@code language}, {@code incidence}, {@code contained}, {@code modifierExtension}, {@code type}, {@code meta}, {@code effect}, {@code text}, {@code resourceType}, {@code management}, {@code interactant}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(incidence);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(effect);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(management);
    h += (h << 5) + Objects.hashCode(interactant);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductInteraction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductInteraction{");
    if (subject != null) {
      builder.append("subject=").append(subject);
    }
    if (description != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (incidence != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("incidence=").append(incidence);
    }
    if (contained != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (meta != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (effect != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("effect=").append(effect);
    }
    if (text != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (management != null) {
      builder.append(", ");
      builder.append("management=").append(management);
    }
    if (interactant != null) {
      builder.append(", ");
      builder.append("interactant=").append(interactant);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductInteraction {
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> incidence = Optional.empty();
    boolean incidenceIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> effect = Optional.empty();
    boolean effectIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable String resourceType;
    @Nullable Optional<CodeableConcept> management = Optional.empty();
    boolean managementIsSet;
    @Nullable Optional<List<MedicinalProductInteraction_Interactant>> interactant = Optional.empty();
    boolean interactantIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("incidence")
    public void setIncidence(Optional<CodeableConcept> incidence) {
      this.incidence = incidence;
      this.incidenceIsSet = true;
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
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("effect")
    public void setEffect(Optional<CodeableConcept> effect) {
      this.effect = effect;
      this.effectIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("management")
    public void setManagement(Optional<CodeableConcept> management) {
      this.management = management;
      this.managementIsSet = true;
    }
    @JsonProperty("interactant")
    public void setInteractant(Optional<List<MedicinalProductInteraction_Interactant>> interactant) {
      this.interactant = interactant;
      this.interactantIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> incidence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> effect() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> management() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductInteraction_Interactant>> interactant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductInteraction fromJson(Json json) {
    ImmutableMedicinalProductInteraction.Builder builder = ((ImmutableMedicinalProductInteraction.Builder) ImmutableMedicinalProductInteraction.builder());
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.incidenceIsSet) {
      builder.incidence(json.incidence);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.effectIsSet) {
      builder.effect(json.effect);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.managementIsSet) {
      builder.management(json.management);
    }
    if (json.interactantIsSet) {
      builder.interactant(json.interactant);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .subject(instance.subject())
        .description(instance.description())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .incidence(instance.incidence())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .meta(instance.meta())
        .effect(instance.effect())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .management(instance.management())
        .interactant(instance.interactant())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductInteraction MedicinalProductInteraction}.
   * <pre>
   * ImmutableMedicinalProductInteraction.builder()
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductInteraction#subject() subject}
   *    .description(String) // optional {@link MedicinalProductInteraction#description() description}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductInteraction#id() id}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductInteraction#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductInteraction#language() language}
   *    .incidence(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#incidence() incidence}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductInteraction#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductInteraction#modifierExtension() modifierExtension}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#type() type}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductInteraction#meta() meta}
   *    .effect(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#effect() effect}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductInteraction#text() text}
   *    .resourceType(String) // required {@link MedicinalProductInteraction#resourceType() resourceType}
   *    .management(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductInteraction#management() management}
   *    .interactant(List&amp;lt;com.medplum.types.fhir.MedicinalProductInteraction_Interactant&amp;gt;) // optional {@link MedicinalProductInteraction#interactant() interactant}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductInteraction#extension() extension}
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
  @Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SUBJECT = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_INCIDENCE = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_EFFECT = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_MANAGEMENT = 0x1000L;
    private static final long OPT_BIT_INTERACTANT = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Reference> subject;
    private @Nullable String description;
    private @Nullable Id id;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable CodeableConcept incidence;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept type;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept effect;
    private @Nullable Narrative text;
    private @Nullable String resourceType;
    private @Nullable CodeableConcept management;
    private @Nullable List<MedicinalProductInteraction_Interactant> interactant;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(List<Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends List<Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
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
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
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
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for chained invocation
     */
    public final Builder incidence(CodeableConcept incidence) {
      checkNotIsSet(incidenceIsSet(), "incidence");
      this.incidence = Objects.requireNonNull(incidence, "incidence");
      optBits |= OPT_BIT_INCIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("incidence")
    public final Builder incidence(Optional<? extends CodeableConcept> incidence) {
      checkNotIsSet(incidenceIsSet(), "incidence");
      this.incidence = incidence.orElse(null);
      optBits |= OPT_BIT_INCIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for chained invocation
     */
    public final Builder effect(CodeableConcept effect) {
      checkNotIsSet(effectIsSet(), "effect");
      this.effect = Objects.requireNonNull(effect, "effect");
      optBits |= OPT_BIT_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effect")
    public final Builder effect(Optional<? extends CodeableConcept> effect) {
      checkNotIsSet(effectIsSet(), "effect");
      this.effect = effect.orElse(null);
      optBits |= OPT_BIT_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
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
     * Initializes the value for the {@link MedicinalProductInteraction#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for chained invocation
     */
    public final Builder management(CodeableConcept management) {
      checkNotIsSet(managementIsSet(), "management");
      this.management = Objects.requireNonNull(management, "management");
      optBits |= OPT_BIT_MANAGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("management")
    public final Builder management(Optional<? extends CodeableConcept> management) {
      checkNotIsSet(managementIsSet(), "management");
      this.management = management.orElse(null);
      optBits |= OPT_BIT_MANAGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for chained invocation
     */
    public final Builder interactant(List<MedicinalProductInteraction_Interactant> interactant) {
      checkNotIsSet(interactantIsSet(), "interactant");
      this.interactant = Objects.requireNonNull(interactant, "interactant");
      optBits |= OPT_BIT_INTERACTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interactant")
    public final Builder interactant(Optional<? extends List<MedicinalProductInteraction_Interactant>> interactant) {
      checkNotIsSet(interactantIsSet(), "interactant");
      this.interactant = interactant.orElse(null);
      optBits |= OPT_BIT_INTERACTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
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
     * Builds a new {@link MedicinalProductInteraction MedicinalProductInteraction}.
     * @return An immutable instance of MedicinalProductInteraction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductInteraction build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductInteraction(
          subject,
          description,
          id,
          implicitRules,
          language,
          incidence,
          contained,
          modifierExtension,
          type,
          meta,
          effect,
          text,
          resourceType,
          management,
          interactant,
          extension);
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
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

    private boolean incidenceIsSet() {
      return (optBits & OPT_BIT_INCIDENCE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean effectIsSet() {
      return (optBits & OPT_BIT_EFFECT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean managementIsSet() {
      return (optBits & OPT_BIT_MANAGEMENT) != 0;
    }

    private boolean interactantIsSet() {
      return (optBits & OPT_BIT_INTERACTANT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductInteraction is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductInteraction, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductInteraction#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductInteraction", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal incidence(CodeableConcept incidence);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#incidence() incidence} to incidence.
     * @param incidence The value for incidence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal incidence(Optional<? extends CodeableConcept> incidence);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effect(CodeableConcept effect);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#effect() effect} to effect.
     * @param effect The value for effect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effect(Optional<? extends CodeableConcept> effect);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for chained invocation
     */
    BuildFinal management(CodeableConcept management);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#management() management} to management.
     * @param management The value for management
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal management(Optional<? extends CodeableConcept> management);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interactant(List<MedicinalProductInteraction_Interactant> interactant);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#interactant() interactant} to interactant.
     * @param interactant The value for interactant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interactant(Optional<? extends List<MedicinalProductInteraction_Interactant>> interactant);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductInteraction#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link MedicinalProductInteraction MedicinalProductInteraction}.
     * @return An immutable instance of MedicinalProductInteraction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductInteraction build();
  }
}
