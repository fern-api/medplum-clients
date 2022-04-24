//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Flag}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlag.builder()}.
 */
@org.immutables.value.Generated(from = "Flag", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableFlag implements com.fhir.Flag {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.FlagStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;

  private ImmutableFlag(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.FlagStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Period period,
      com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Reference author,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference encounter) {
    this.contained = contained;
    this.status = status;
    this.extension = extension;
    this.implicitRules = implicitRules;
    this.period = period;
    this.code = code;
    this.author = author;
    this.identifier = identifier;
    this.subject = subject;
    this.id = id;
    this.text = text;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.meta = meta;
    this.language = language;
    this.encounter = encounter;
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.FlagStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public com.fhir.CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableFlag(
        newValue,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableFlag(
        value,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withStatus(com.fhir.FlagStatus value) {
    @javax.annotation.Nullable com.fhir.FlagStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        newValue,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withStatus(java.util.Optional<? extends com.fhir.FlagStatus> optional) {
    @javax.annotation.Nullable com.fhir.FlagStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableFlag(
        this.contained,
        value,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        newValue,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        value,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        newValue,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        value,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        newValue,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        value,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Flag#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlag withCode(com.fhir.CodeableConcept value) {
    if (this.code == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        newValue,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        newValue,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        value,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        newValue,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        value,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Flag#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlag withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        newValue,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        newValue,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        value,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        newValue,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        value,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        value,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        newValue,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        value,
        this.resourceType,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Flag#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlag withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        newValue,
        this.meta,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        value,
        this.language,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        newValue,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        value,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Flag#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlag withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Flag#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFlag withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableFlag(
        this.contained,
        this.status,
        this.extension,
        this.implicitRules,
        this.period,
        this.code,
        this.author,
        this.identifier,
        this.subject,
        this.id,
        this.text,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.meta,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlag} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlag
        && equalTo((ImmutableFlag) another);
  }

  private boolean equalTo(ImmutableFlag another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(period, another.period)
        && code.equals(another.code)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(identifier, another.identifier)
        && subject.equals(another.subject)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(encounter, another.encounter);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code status}, {@code extension}, {@code implicitRules}, {@code period}, {@code code}, {@code author}, {@code identifier}, {@code subject}, {@code id}, {@code text}, {@code category}, {@code modifierExtension}, {@code resourceType}, {@code meta}, {@code language}, {@code encounter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    return h;
  }

  /**
   * Prints the immutable value {@code Flag} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Flag{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (extension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (implicitRules != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (period != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("code=").append(code);
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Flag", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Flag {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.FlagStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept code;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.FlagStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(com.fhir.CodeableConcept code) {
      this.code = code;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.FlagStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableFlag fromJson(Json json) {
    ImmutableFlag.Builder builder = ((ImmutableFlag.Builder) ImmutableFlag.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
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
        .contained(instance.contained())
        .status(instance.status())
        .extension(instance.extension())
        .implicitRules(instance.implicitRules())
        .period(instance.period())
        .code(instance.code())
        .author(instance.author())
        .identifier(instance.identifier())
        .subject(instance.subject())
        .id(instance.id())
        .text(instance.text())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .language(instance.language())
        .encounter(instance.encounter())
        .build();
  }

  /**
   * Creates a builder for {@link Flag Flag}.
   * <pre>
   * ImmutableFlag.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Flag#contained() contained}
   *    .status(com.fhir.FlagStatus) // optional {@link Flag#status() status}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Flag#extension() extension}
   *    .implicitRules(com.fhir.uri) // optional {@link Flag#implicitRules() implicitRules}
   *    .period(com.fhir.Period) // optional {@link Flag#period() period}
   *    .code(com.fhir.CodeableConcept) // required {@link Flag#code() code}
   *    .author(com.fhir.Reference) // optional {@link Flag#author() author}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Flag#identifier() identifier}
   *    .subject(com.fhir.Reference) // required {@link Flag#subject() subject}
   *    .id(com.fhir.id) // optional {@link Flag#id() id}
   *    .text(com.fhir.Narrative) // optional {@link Flag#text() text}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Flag#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Flag#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link Flag#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link Flag#meta() meta}
   *    .language(com.fhir.code) // optional {@link Flag#language() language}
   *    .encounter(com.fhir.Reference) // optional {@link Flag#encounter() encounter}
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
  @org.immutables.value.Generated(from = "Flag", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CodeBuildStage, SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_STATUS = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_PERIOD = 0x10L;
    private static final long OPT_BIT_AUTHOR = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_CATEGORY = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_ENCOUNTER = 0x2000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.FlagStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference encounter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Flag#contained() contained} to contained.
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
     * Initializes the optional value {@link Flag#contained() contained} to contained.
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
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.FlagStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.FlagStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#extension() extension} to extension.
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
     * Initializes the optional value {@link Flag#extension() extension} to extension.
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
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the value for the {@link Flag#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link Flag#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#id() id} to id.
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
     * Initializes the optional value {@link Flag#id() id} to id.
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
     * Initializes the optional value {@link Flag#text() text} to text.
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
     * Initializes the optional value {@link Flag#text() text} to text.
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
     * Initializes the optional value {@link Flag#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Flag#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Flag#meta() meta} to meta.
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
     * Initializes the optional value {@link Flag#meta() meta} to meta.
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
     * Initializes the optional value {@link Flag#language() language} to language.
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
     * Initializes the optional value {@link Flag#language() language} to language.
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
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Builds a new {@link Flag Flag}.
     * @return An immutable instance of Flag
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Flag build() {
      checkRequiredAttributes();
      return new ImmutableFlag(
          contained,
          status,
          extension,
          implicitRules,
          period,
          code,
          author,
          identifier,
          subject,
          id,
          text,
          category,
          modifierExtension,
          resourceType,
          meta,
          language,
          encounter);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
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
      if (isSet) throw new java.lang.IllegalStateException("Builder of Flag is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Flag, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Flag", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link Flag#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage code(com.fhir.CodeableConcept code);
  }

  @org.immutables.value.Generated(from = "Flag", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Flag#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "Flag", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Flag#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Flag", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Flag#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Flag#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.FlagStatus status);

    /**
     * Initializes the optional value {@link Flag#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.FlagStatus> status);

    /**
     * Initializes the optional value {@link Flag#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Flag#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Flag#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link Flag#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link Flag#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Flag#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Flag#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Flag#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Flag#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Flag#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Flag#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Flag#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Flag#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Flag#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Flag#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Flag#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Flag#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Flag#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Builds a new {@link Flag Flag}.
     * @return An immutable instance of Flag
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Flag build();
  }
}
