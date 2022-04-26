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
 * Immutable implementation of {@link Flag}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlag.builder()}.
 */
@Generated(from = "Flag", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableFlag implements Flag {
  private final @Nullable List<Extension> extension;
  private final CodeableConcept code;
  private final @Nullable Narrative text;
  private final @Nullable Reference encounter;
  private final @Nullable FlagStatus status;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final Reference subject;
  private final @Nullable Code language;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference author;
  private final @Nullable Meta meta;
  private final String resourceType;
  private final @Nullable Period period;

  private ImmutableFlag(
      @Nullable List<Extension> extension,
      CodeableConcept code,
      @Nullable Narrative text,
      @Nullable Reference encounter,
      @Nullable FlagStatus status,
      @Nullable List<CodeableConcept> category,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      Reference subject,
      @Nullable Code language,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable Reference author,
      @Nullable Meta meta,
      String resourceType,
      @Nullable Period period) {
    this.extension = extension;
    this.code = code;
    this.text = text;
    this.encounter = encounter;
    this.status = status;
    this.category = category;
    this.identifier = identifier;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.subject = subject;
    this.language = language;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.author = author;
    this.meta = meta;
    this.resourceType = resourceType;
    this.period = period;
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<FlagStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableFlag(
        newValue,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableFlag(
        value,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Flag#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlag withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableFlag(
        this.extension,
        newValue,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        newValue,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        value,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        newValue,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        value,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withStatus(FlagStatus value) {
    @Nullable FlagStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        newValue,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withStatus(Optional<? extends FlagStatus> optional) {
    @Nullable FlagStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        value,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        newValue,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        value,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        newValue,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        value,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        value,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        newValue,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        value,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Flag#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlag withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        newValue,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        newValue,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        value,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        newValue,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        value,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        newValue,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        value,
        this.author,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        newValue,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        value,
        this.meta,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        newValue,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        value,
        this.resourceType,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Flag#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlag withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableFlag(
        this.extension,
        this.code,
        this.text,
        this.encounter,
        this.status,
        this.category,
        this.identifier,
        this.id,
        this.modifierExtension,
        this.subject,
        this.language,
        this.implicitRules,
        this.contained,
        this.author,
        this.meta,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlag} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlag
        && equalTo((ImmutableFlag) another);
  }

  private boolean equalTo(ImmutableFlag another) {
    return Objects.equals(extension, another.extension)
        && code.equals(another.code)
        && Objects.equals(text, another.text)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(status, another.status)
        && Objects.equals(category, another.category)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && subject.equals(another.subject)
        && Objects.equals(language, another.language)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(author, another.author)
        && Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code code}, {@code text}, {@code encounter}, {@code status}, {@code category}, {@code identifier}, {@code id}, {@code modifierExtension}, {@code subject}, {@code language}, {@code implicitRules}, {@code contained}, {@code author}, {@code meta}, {@code resourceType}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code Flag} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Flag{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("code=").append(code);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Flag", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Flag {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<FlagStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<FlagStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<FlagStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFlag fromJson(Json json) {
    ImmutableFlag.Builder builder = ((ImmutableFlag.Builder) ImmutableFlag.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    return (ImmutableFlag) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Flag} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Flag instance
   */
  public static Flag copyOf(Flag instance) {
    if (instance instanceof ImmutableFlag) {
      return (ImmutableFlag) instance;
    }
    return ((ImmutableFlag.Builder) ImmutableFlag.builder())
        .extension(instance.extension())
        .code(instance.code())
        .text(instance.text())
        .encounter(instance.encounter())
        .status(instance.status())
        .category(instance.category())
        .identifier(instance.identifier())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .subject(instance.subject())
        .language(instance.language())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .author(instance.author())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link Flag Flag}.
   * <pre>
   * ImmutableFlag.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Flag#extension() extension}
   *    .code(com.fhir.types.fhir.CodeableConcept) // required {@link Flag#code() code}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Flag#text() text}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link Flag#encounter() encounter}
   *    .status(com.fhir.types.fhir.FlagStatus) // optional {@link Flag#status() status}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Flag#category() category}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Flag#identifier() identifier}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Flag#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Flag#modifierExtension() modifierExtension}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link Flag#subject() subject}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Flag#language() language}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Flag#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Flag#contained() contained}
   *    .author(com.fhir.types.fhir.Reference) // optional {@link Flag#author() author}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Flag#meta() meta}
   *    .resourceType(String) // required {@link Flag#resourceType() resourceType}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Flag#period() period}
   *    .build();
   * </pre>
   * @return A new Flag builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableFlag.Builder();
  }

  /**
   * Builds instances of type {@link Flag Flag}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Flag", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_ENCOUNTER = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_CATEGORY = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_AUTHOR = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_PERIOD = 0x2000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept code;
    private @Nullable Narrative text;
    private @Nullable Reference encounter;
    private @Nullable FlagStatus status;
    private @Nullable List<CodeableConcept> category;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference subject;
    private @Nullable Code language;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference author;
    private @Nullable Meta meta;
    private @Nullable String resourceType;
    private @Nullable Period period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Flag#extension() extension} to extension.
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
     * Initializes the optional value {@link Flag#extension() extension} to extension.
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
     * Initializes the value for the {@link Flag#code() code} attribute.
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
     * Initializes the optional value {@link Flag#text() text} to text.
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
     * Initializes the optional value {@link Flag#text() text} to text.
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
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(FlagStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends FlagStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#category() category} to category.
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
     * Initializes the optional value {@link Flag#category() category} to category.
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
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Flag#id() id} to id.
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
     * Initializes the optional value {@link Flag#id() id} to id.
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
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Flag#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#language() language} to language.
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
     * Initializes the optional value {@link Flag#language() language} to language.
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
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Flag#contained() contained} to contained.
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
     * Initializes the optional value {@link Flag#contained() contained} to contained.
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
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#meta() meta} to meta.
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
     * Initializes the optional value {@link Flag#meta() meta} to meta.
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
     * Initializes the value for the {@link Flag#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link Flag Flag}.
     * @return An immutable instance of Flag
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Flag build() {
      checkRequiredAttributes();
      return new ImmutableFlag(
          extension,
          code,
          text,
          encounter,
          status,
          category,
          identifier,
          id,
          modifierExtension,
          subject,
          language,
          implicitRules,
          contained,
          author,
          meta,
          resourceType,
          period);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Flag is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Flag, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Flag", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link Flag#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage code(CodeableConcept code);
  }

  @Generated(from = "Flag", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Flag#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "Flag", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Flag#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Flag", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Flag#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Flag#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Flag#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Flag#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(FlagStatus status);

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends FlagStatus> status);

    /**
     * Initializes the optional value {@link Flag#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Flag#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Flag#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Flag#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Flag#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Flag#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Flag#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Flag#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link Flag#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Flag#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Builds a new {@link Flag Flag}.
     * @return An immutable instance of Flag
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Flag build();
  }
}
